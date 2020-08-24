import com.java.extendsClass.IntDivide;
import com.java.extendsClass.IntInput;
import com.java.extendsClass.IntMinus;
import com.java.extendsClass.IntMinus2;
import com.java.extendsClass.IntMulti;
import com.java.extendsClass.IntOutput;
import com.java.extendsClass.IntSum;

import bogang.Divide;
import bogang.Input;
import bogang.Minus;
import bogang.Multi;
import bogang.Output;
import bogang.Sum;


public class Main {
	
	private Input input;
	private Output output;
	private Sum sum;
	private Minus minus;
	private Multi multi;
	private Divide divide;
	// 인스턴스 초기화
	
	private Main(){
		
		//인스턴스 할당
		//생성
		input = new IntInput();
		sum = new IntSum();
//		minus = new IntMinus();
		minus = new IntMinus2();
		multi = new IntMulti();
		divide = new IntDivide();
		output = new IntOutput();
		
		//조립
		((IntOutput)output).setDivide(divide);
		
		divide.setMulti(multi);
		multi.setMinus(minus);
		minus.setSum(sum);
		sum.setInput(input);
		
		
	}
	
	public static void main(String[] args)
	{
		Main main = new Main();
		
		main.output.output(2);
	}

}
