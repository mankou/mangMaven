package mang.util.common;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * json 工具类.
 * 
 * */
public class JsonUtil {
	// TODO 定义一些默认的转换方式 如太阳辐射图等
	public static Map obj2Map(Object obj, List<String> listProperty, List<String> mapProperty) {
		Map<String,Object> map = new HashMap<String,Object>();

		try {
			
			for (int i=0;i<listProperty.size();i++) {
				String sourceFiledName = listProperty.get(i);
				String mapFiledName = mapProperty.get(i);
				// 根据属性名从source中取出值
				
				Class clazz = obj.getClass();  
		        PropertyDescriptor pd = new PropertyDescriptor(sourceFiledName, clazz);  
		        Method getMethod = pd.getReadMethod();//获得get方法  
		        
		        if (pd != null) {  
		            Object o = getMethod.invoke(obj);//执行get方法返回一个Object  
		            map.put(mapFiledName, o);
		        }  

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return map;
	}
	
	
	public static List<Map> list2Map(List lis, List<String> listProperty, List<String> mapProperty){
		
		List<Map> mapList = new ArrayList<Map>();
		for(int i=0;i<lis.size();i++){
			Object obj = lis.get(i);
			Map m = JsonUtil.obj2Map(obj, listProperty, mapProperty);
			mapList.add(m);
		}
		return mapList;
	}
	
	
	
}
