package org.mang.demo.rocketmq.quickstart;

import java.io.UnsupportedEncodingException;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;
import org.apache.rocketmq.remoting.exception.RemotingException;

public class Producer {

	public static void main(String[] args) {
		String groupName="mnGroup";
		String nameservAddr="10.4.120.64:9876" ;
		try {
			DefaultMQProducer producer = new DefaultMQProducer(groupName);
			producer.setNamesrvAddr(nameservAddr);
			producer.start();
			
			//TODO producer 设置超时
			
			
			for(int i=0;i<5;i++){
				Message msg=new Message("mn-topic", "mn-tag", "KEY"+i, "HelloManing".getBytes(RemotingHelper.DEFAULT_CHARSET));
				SendResult sendResult = producer.send(msg);
				System.out.println(sendResult);
			}
			
		} catch (MQClientException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (RemotingException e) {
			e.printStackTrace();
		} catch (MQBrokerException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
