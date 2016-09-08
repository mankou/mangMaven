package mang.util;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * 读取property配置文件的工具类.
 * @author man003@163.com
 * @version
 * create:2016-09-8 10:06:37
 * modify:2016-09-8 10:06:45
 *
 * */
public class PropertyUtil {
	
	/**
	 * 从工程根路径找配置文件 注意path必须以/开头 表示从工程根路径找配置文件.
	 * 
	 * <p>使用方法:从工程根路径开始寻找配置文件
	 * <font color="red">
	 * <br>Properties ps2 = PropertyUtil.getProperties("/demo_resources2.properties");
	 * <br>System.out.println(ps.getProperty("test"));
	 * </font>
	 * </p>
	 * */
	public static Properties getProperties(String path){
		return getProperties(PropertyUtil.class,path);
	}
	
	/**
	 * 根据类所在路径和文件路径找配置文件.
	 * 
	 * <p>使用方法:如下是在PropertyTest类的方法中取得配置文件的代码片断 其从PropertyTest.class所在路径找配置文件demo3.properties
	 * <strong><br>注path不能加绝对路径/ 否则其自动从工程根路径找配置文件而不是从指定的类路径找</strong>
	 * <font color="red">
	 * <br>Properties ps = PropertyUtil.getProperties(PropertyTest.class,"demo3.properties");
	 * <br>System.out.println(ps.getProperty("test"));
	 * </font>
	 * </p>
	 * */
	public static Properties getProperties(Class mclass,String path){
		Properties property = null;
		try {
			property = new Properties();
			InputStreamReader sr = new InputStreamReader(mclass.getResourceAsStream(path),"utf-8"); 
			property.load(sr);
		}catch (IOException e){
			e.printStackTrace();
			return null;
		}
		return property;
		
	}
}
