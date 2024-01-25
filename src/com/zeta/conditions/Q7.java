package com.zeta.conditions;
import com.zeta.helper.*;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z;
		try{
			z=1/0;
		}
		catch(Exception e){

			Help.helpLogger(Q7.class).error(e);
		}

	}

}
