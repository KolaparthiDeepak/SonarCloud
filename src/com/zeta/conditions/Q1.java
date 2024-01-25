package com.zeta.conditions;

import org.apache.log4j.Logger;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger lg = Logger.getLogger(Q1.class);
		
//		System.out.println(args[0]);
		int curr=args[0].charAt(0)-'0';
		if((int)curr>=0 && (int)curr<=9)
		{
			lg.info("Integer");
//			System.out.println("Integer");
		}
		else
		{
			lg.info("Character");
//			System.out.println("Character");
		}

	}

}
