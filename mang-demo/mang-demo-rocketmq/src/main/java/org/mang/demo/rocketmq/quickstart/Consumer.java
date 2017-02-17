package org.mang.demo.rocketmq.quickstart;

import java.util.List;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.consumer.ConsumeFromWhere;
import org.apache.rocketmq.common.message.MessageExt;

public class Consumer {

	public static void main(String[] args) {
		String groupName="mnGroup";
		String nameservAddr="10.4.120.64:9876" ;
		String topic="mn-topic";
		
		
		try {
			DefaultMQPushConsumer consumer=new DefaultMQPushConsumer(groupName);
			consumer.setNamesrvAddr(nameservAddr);
			consumer.subscribe(topic, "*");
			consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);
			consumer.registerMessageListener(new MessageListenerConcurrently(){
				@Override
				public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs,
						ConsumeConcurrentlyContext context) {
					  System.out.printf(Thread.currentThread().getName() + " Receive New Messages: " + msgs + "%n");
		                for(MessageExt msg:msgs){
		                	System.out.println(msg.getMsgId()+":"+msg.getKeys()+"msg:"+new String(msg.getBody()));
		                }
		                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
				}
				
			});
			consumer.start();
		} catch (MQClientException e) {
			e.printStackTrace();
		}
	}

}
