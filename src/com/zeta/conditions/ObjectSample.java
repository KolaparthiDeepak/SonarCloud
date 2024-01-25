package com.zeta.conditions;
import com.zeta.Zetapojo.*;
import com.zeta.helper.*;


public class ObjectSample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pojocls cls=new Pojocls();
		cls.setName("Deepak");
		Help.helpLogger(ObjectSample.class).info(cls.getName());
		
		
	}

}
