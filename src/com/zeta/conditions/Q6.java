package com.zeta.conditions;


public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email = "vasu34@gmail.in";
		email = email.trim();
		StringBuffer sb=new StringBuffer(20);
		for(int i=0;i<email.length();i++){
			sb.append(email.charAt(i));
		}
		boolean atTheRate = false;
		boolean lastOk = false;
		boolean len = (sb.length()<=18);
		if(sb.indexOf("@")!=-1)
		{
			atTheRate=true;
			int ind=sb.indexOf(".");
			String sub=sb.substring(ind+1);
			if(sub.equals("mil") || sub.equals("milt") || sub.equals("biz") || sub.equals("com") || sub.equals("in"))
			{
				lastOk=true;
			}
		}
		if(atTheRate && lastOk && len)
		{
			System.out.println("Valid");
		}
		else
		{
			if(!len)
			{
				System.out.println("Length > 18");
			}
			else if(!atTheRate)
			{
				System.out.println("No '@'");
			}
			else if(!lastOk)
			{
				System.out.println("No '.' or No domain");
			}
		}

	}

}
