package com.java.extendsClass;

import bogang.Minus;

public class IntMinus2 extends Minus {
	
	@Override
	public Object minus(Object o) {
		// TODO Auto-generated method stub
		
		Object target = getSum().sum(2000);
		
		if(o instanceof Integer && target instanceof Integer)
		{
			return (Integer)target-(Integer)o;
		}
		
		return null;
	}

}
