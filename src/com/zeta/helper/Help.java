package com.zeta.helper;
import org.apache.log4j.Logger;

public class Help {
//	static public Logger lg = Logger.getLogger(Help.class);
	public static Logger helpLogger(Class c)
	{
		Logger lg = Logger.getLogger(c);
		return lg;
	}
}