package com.zeta.conditions;

import java.net.InetAddress;
import java.net.NetworkInterface;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try 
		 { 
			 	
	        InetAddress id = InetAddress.getLocalHost();  
	        System.out.println( id.getHostName());
	        System.out.println( id.getHostAddress());  
	        NetworkInterface network = NetworkInterface.getByInetAddress(id);
			
			byte[] mac = network.getHardwareAddress();
				
			System.out.print("Current MAC address : ");
				
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < mac.length; i++) {
				sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));		
			}
			System.out.println(sb.toString());
	     } 
		 catch (Exception e) 
		 {  
			 
		 }  

	}

}
