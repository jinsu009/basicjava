package com.java.extendsClass;

import bogang.Divide;

public class IntDivide extends Divide {

	@Override
	public Object divide(Object o) {
		// TODO Auto-generated method stub
		
		Object target = getMulti().multi(100);
		
		if(o instanceof Integer && target instanceof Integer && (Integer)o != 0)
		{
			return (Integer)target / (Integer)o;
		}
		
		return null;
	}

}
