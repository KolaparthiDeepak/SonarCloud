package com.zeta.conditions;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args[0]);
		int n=0;
		for(int i=0;i<args[0].length();i++)
		{
			int x=(int)(args[0].charAt(i)-'0');
			n=n*10+x;
		}
		if((n%400==0) || (n%4==0 && n%100!=0))
		{
			System.out.println("Leap");
		}
		else
		{
			System.out.println("Not Leap");
		}
	}

}
