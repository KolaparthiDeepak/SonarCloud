package com.zeta.conditions;
import com.zeta.helper.*;

class A{
	static int x=0;
	void incrementX(){
		x++;
		Help.helpLogger(A.class).info(x);
	}
	void printA(){
		Help.helpLogger(A.class).info("This is A Bro...");
	}
}
class B extends A{
	static int y=0;
	void incrementY(){
		y++;
		Help.helpLogger(B.class).info(y);
	}
	void printB(){
		Help.helpLogger(B.class).info("This is B Bro...");
	}
}
class C extends B{
	static int z=0;
	void incrementZ(){
		z++;
		Help.helpLogger(C.class).info(z);
	}
	void printC(){
		Help.helpLogger(C.class).info("This is C Bro...");
	}
}

public class Q9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.printA();
		B b=new B();
		b.printA();

	}

}
