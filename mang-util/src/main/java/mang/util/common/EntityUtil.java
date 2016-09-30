package mang.util.common;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * 实体类工具类.
 * */
public class EntityUtil {

	/**
	 * 获取两个实例相同的属性名.
	 * @return 返回两个实例相同的属性名组成的字符串数组
	 * */
	public static String[] getSameProperty(Object src,Object target){
		Field[] srcFields=src.getClass().getDeclaredFields();
		
		Field[] targetFields=target.getClass().getDeclaredFields();
		
		List<String> samePropertyList=new ArrayList<String>();
		for(Field field1:srcFields){
			for(Field field2:targetFields){
				if(field1.getName().equals(field2.getName())){
					samePropertyList.add(field1.getName());
					break;
				}
			}
		}
		
		//如下将List<String> 转换成array 至于为什么要加一个newString[0] 我也不明白 反正加了就不报错了
		String[] samePropertyArray=(String[])samePropertyList.toArray(new String[0]);
		return samePropertyArray;
		
	}
}
