package mang.test;

import java.util.Properties;

import mang.util.PropertyUtil;

public class PropertyTest {

	public static void main(String[] args) {
		System.out.println("配置文件放在和类同一路径下");
		Properties ps = PropertyUtil.getProperties(PropertyTest.class,"demo3.properties");
		System.out.println(ps.getProperty("test"));
		System.out.println(ps.getProperty("test2"));
		System.out.println(ps.getProperty("TEST"));
		
		
		System.out.println("配置文件放在根路径下");
		Properties ps2 = PropertyUtil.getProperties("/demo_resources2.properties");
		System.out.println(ps2.getProperty("test"));
		System.out.println(ps2.getProperty("test2"));
		System.out.println(ps2.getProperty("TEST"));
		

	}

}
