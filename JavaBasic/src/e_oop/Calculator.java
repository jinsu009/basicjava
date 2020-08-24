package e_oop;

public class Calculator {
	//계산기를 만들어보쟈아아
	
	//산술연산  : 덧셈(+,add), 뺄셈(-,sub), 곱셈(*,mul), 나누기(/,div), 나머지(%,rest)
	//피연산자 두개를 파라미터로 받는다.
	
	
	double add(double a,double b)
	{
		return a+b;
	}
	
	double sub(double a, double b)
	{
		return a-b;
	}
	
	double mul(double a, double b)
	{
		return a*b;
	}
	
	double div(double a, double b)
	{
		return a/b;
	}
	
	double rest(double a, double b)
	{
		return a%b;
	}

}
