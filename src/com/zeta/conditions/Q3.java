package com.zeta.conditions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q1
		String s1="Zeta Sodexo Zeta Sodexo Zeta Sodexo Zeta Sodexo";
		System.out.println(s1.replaceAll(" ", ""));
		System.out.println();
		
		//Q2
		String s2="lenovo";
		String ans="";
		for(int i=0;i<s2.length();i++)
		{
			char c=s2.charAt(i);
			if(i%2==0)
			{
				c=Character.toUpperCase(c);
				ans=ans+c;
			}
			else
			{
				c=Character.toLowerCase(c);
				ans=ans+c;
			}
		}
		System.out.println(ans);
		System.out.println();
		
		//Q3
		int n=s1.length();
		String x=s1.replace("a","");
		System.out.println("Number of a's: "+(n-x.length()));
		
		String y=s1.replace("S","");
		System.out.println("Number of S's: "+(n-y.length()));
		
		System.out.println("Number of Chars: "+(n));
		System.out.println();
		
		//Q4
		String t1="Zeta",t2="Infy";
		Matcher matcher=Pattern.compile("(.)").matcher(t1);
		String str1="",str2="",str3="";
		if(matcher.find())
		{
			str1=matcher.group(1);
		}
		matcher=Pattern.compile("(.)$").matcher(t1);
		if(matcher.find())
		{
			str2=matcher.group(1);
		}
		matcher=Pattern.compile("(..)").matcher(t2);
		if(matcher.find())
		{
			str3=matcher.group(1);
		}
		System.out.println(str1+str2+str3);
	}

}
