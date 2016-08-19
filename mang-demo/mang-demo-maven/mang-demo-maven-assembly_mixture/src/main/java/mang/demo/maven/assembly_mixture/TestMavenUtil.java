package mang.demo.maven.assembly_mixture;

import java.sql.Timestamp;

import mang.util.TimeUtil;

public class TestMavenUtil {
	public static void main( String[] args )
    {
		Timestamp now = TimeUtil.getCurrentTime();
        System.out.println( "Hello World!"+now);
    }
}
