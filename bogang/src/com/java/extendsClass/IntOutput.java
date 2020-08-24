package com.java.extendsClass;

import bogang.Divide;
import bogang.Output;

public class IntOutput implements Output {

	private Divide divide;
	public void setDivide(Divide divide){
		this.divide=divide;
	}

	@Override
	public void output(Object o) {
		// TODO Auto-generated method stub
		System.out.println("계산 결과 : "+ (Integer)divide.divide(o));	
	}

	
}
