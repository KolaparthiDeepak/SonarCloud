package com.zeta.conditions;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(0+" ");
		for(int i=1;i<=26;i++)
		{
			System.out.print(i);
			char c=(char)(65+(26-i));
			System.out.print(c+" ");
		}
		System.out.println();
		for(int i=1;i<=10;i++)
		{
			System.out.println(2+"*"+i+"="+2*i);
			
		}
		System.out.println();
		System.out.print(0+" ");
		int i=26;
		do{
			System.out.print(i);
			char c=(char)(65+(i-1));
			System.out.print(c+" ");
			i--;
		}
		while(i>0);
	}

}
