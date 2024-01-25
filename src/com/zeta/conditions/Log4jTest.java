package com.zeta.conditions;

import org.apache.log4j.Logger;


public class Log4jTest {
	
	public static void main(String[] args) {
		Logger lg = Logger.getLogger(Q1.class);
		lg.info("First Message");
		
	}

}
