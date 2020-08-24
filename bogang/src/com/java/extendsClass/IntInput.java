package com.java.extendsClass;

import java.util.Scanner;

import bogang.Input;

public class IntInput implements Input{

	@Override
	public Object input() {
		// TODO Auto-generated method stub
		
		System.out.println("정수를 입력하시오 ");
		Scanner s = new Scanner(System.in);
		
		int input = Integer.parseInt(s.nextLine().trim());
		
		return input;
	}

}
