package com.zeta.util;

import java.util.*;
import java.util.stream.Stream;

import com.zeta.helper.Help;

public class SetAnta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l=new ArrayList();
		l.add(55);
		l.add(55);
		l.add(65);
		l.add(5);
		LinkedHashSet st=new LinkedHashSet();
		st.addAll(l);
		Help.helpLogger(SetAnta.class).info(st);
		TreeSet t=new TreeSet();
		t.addAll(l);
		l.clear();
		l.addAll(st);
		Help.helpLogger(SetAnta.class).info(l);
		l.clear();
		l.addAll(t);
		Help.helpLogger(SetAnta.class).info(l);
	}

}
