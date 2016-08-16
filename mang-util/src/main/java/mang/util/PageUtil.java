package mang.util;

/**
 * 处理页数的工具类.
 * @author mang
 * @version 
 * create:2015-10-9 17:13:53 
 * modify:2015-10-9 17:18:26
 * 
 * */
public class PageUtil {
	
	/**
	 * 计算总页数.
	 * <p>如果总记录数842330 每页10000条 则总计85页 如果总记录数840000  则总计84页<br>
	 * 
	 * */
	public static int computeTotalPage(int totalCount,int pageSize){
		int totalPageNumber=totalCount/pageSize;
		if(totalCount%pageSize!=0){
			totalPageNumber++;
		}
		
		return totalPageNumber;
	}
}
