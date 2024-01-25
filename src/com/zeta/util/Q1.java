package com.zeta.util;

import java.util.*;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String x=sc.next();
		ArrayList ch=new ArrayList();
		ArrayList spl=new ArrayList();
		for(int i=0;i<x.length();)
		{
			char c=x.charAt(i);
			if(Character.isAlphabetic(c))
			{
				ch.add(c);
				i++;
			}
			else if(!Character.isAlphabetic(c) && !Character.isDigit(c))
			{
				spl.add(c);
				i++;
			}
			else
			{
				if((i+1<x.length() && Character.isDigit(x.charAt(i+1)) && (x.charAt(i)-'0')-(x.charAt(i+1)-'0')==-1))
				{
					if((i+2<x.length() && Character.isDigit(x.charAt(i+2)) && (x.charAt(i+1)-'0')-(x.charAt(i+2)-'0')==-1))
					{
						int j=i+1;
						ch.add(x.charAt(i));
						while(j<x.length() && Character.isDigit(x.charAt(j)) && (x.charAt(j)-'0')-(x.charAt(i)-'0')==j-i)
						{
							ch.add(x.charAt(j));
							j++;
						}
						i=j;
					}
					else
					{
						ch.add('&');
						ch.add('&');
						i+=2;
					}
				}
			}
		}
		System.out.println(ch);
		System.out.println(spl);
	}

}
