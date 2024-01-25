package com.zeta.util;

import java.util.*;
import java.util.Arrays;

import com.zeta.helper.*;

public class ArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add(new Integer(6));
		a.add(new Integer(12));
		a.add(new Integer(1));
		a.add(new Integer(6));
		a.add(new String("zeta"));
		Help.helpLogger(ArrList.class).info(a);
		Help.helpLogger(ArrList.class).info(a.size());

		Help.helpLogger(ArrList.class).info(a.removeAll(Arrays.asList("zeta",6)));

		Help.helpLogger(ArrList.class).info(a);
//		Help.helpLogger(ArrList.class).info(a.get(3));
		
		Vector v=new Vector(10,2);
		v.add(new Integer(21));
		v.add(new Integer(2));
		v.add(new Integer(5));
		v.add(new Integer(12));
		v.add(new Integer(12));
		v.add(null);
		v.add("");
		
//		v.replaceAll(x);
//		Help.helpLogger(ArrList.class).info(v.retainAll(a));
		Help.helpLogger(ArrList.class).info(v.get(6)+"345");
//		v.set(5,0);
		Help.helpLogger(ArrList.class).info(v.get(5));
		LinkedList<Integer> l=new LinkedList();
//		l.offer("zeta");
		l.add(23);
		l.offer(58);
//		l.offer("zeta");
//		l.add("hdfc");
		Help.helpLogger(ArrList.class).info(l);
//		Collections.shuffle(l);
		l.spliterator();
//		Help.helpLogger(ArrList.class).info(l);

		Help.helpLogger(ArrList.class).info(l);
	}

}
