package mang.test;

import java.sql.Timestamp;

import mang.util.TimeUtil;

public class TestVi {
	public static void main( String[] args )
    {
		Timestamp now = TimeUtil.getCurrentTime();
        System.out.println( "Hello World!"+now);
    }
}
