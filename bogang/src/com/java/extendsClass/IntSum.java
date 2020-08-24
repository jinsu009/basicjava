package com.java.extendsClass;

import bogang.Sum;

public class IntSum extends Sum {

	@Override
	public Object sum(Object o) {
		// TODO Auto-generated method stub
		
		//정수값이 들어온다. 
		
		Object target = getInput().input();
		
		if(o instanceof Integer && target instanceof Integer)
		{
			//넘겨받은 값이 integer인지 확인
			return (Integer)o+(Integer)target;
		}
		
		return null;
	}

}
