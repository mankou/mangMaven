package mang.demo.maven.assembly_withDependeyncy;

import java.sql.Timestamp;

import mang.util.common.TimeUtil;

public class TestMavenUtil {
	public static void main( String[] args )
    {
		Timestamp now = TimeUtil.getCurrentTime();
        System.out.println( "Hello World!"+now);
    }
}
