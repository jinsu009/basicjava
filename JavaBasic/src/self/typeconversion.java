
package self;

public class typeconversion {
	public static void main(String[] args){
		/*
		 * <<형변환>>
		 * - 자동형변환의 원칙 : 표현범위가 좁은 데이터 -> 넓은 데이터 타입으로 변환만 허용
		 * - byte(1) -> short/char(2) -> int(4) -> long(8) -> 실수 : float(4) -> 실수 : double(8)
		 * 
		 */
		int a = 3;
		float b = 1.0F;
		double c = a + b;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		/*
		 * - 명시적 : 자동형변환이 적용되지 않는경우 수동으로 변환
		 * 
		 */
		
		//float a1 = 100.0;
		//int b1 = 100.0F;
		//위의 코딩은 오류가 발생된다. 
		
		float a1 = (float)100.0;
		int b1 = (int)100.0F;
		
		System.out.println();
		System.out.println(a1);
		System.out.println(b1);
		
		/*
		 * 데이터타입이 다른 데이터를 계산해보자 
		 */
		
		int d = 10, e = 3;
		float f = 10.0F, g = 3.0F;
		
		System.out.println();
		System.out.println(d/e); //3은 나머지의 몫이고 나머지는 버려졌다. 정수는 소수점을 표현할수없으므로 정수만 표시
		System.out.println(f/g);
		System.out.println(d/g); //정수에서 실수를 나눈것, 암시적으로 형변환이 일어나서 정수가 실수가 된다. 
			
		int i = 3;
		
		i++;
		System.out.println();
		System.out.println(i);
		++i;
		System.out.println();
		System.out.println(i);
		
		System.out.println();
		System.out.println(++i); //전위진행값 6
		System.out.println(i++); //전단계에서 진행된 값 6이 출력후 +1이진행
		System.out.println(i); //6이 출력된후 +1이 된 7의 값을 출력
		
		
		/*
		 * <<변수>>
		 * 
		 */
		//타입에 변수 선언
		//타입에 맞는 값을 저장해준다. 
		byte _byte = 127;
		short _short = 30000;
		char _char = '가'; //한 글자만 입력이 가능하다. 
		int _int = 20;
		long _long = 900L; //LONG타입 사용시 접미사 L 사용
		float _float = 0;
		double _double;
		boolean _boolean = true;
		
		_float = 3.14f;
		_double = 3.14d; //접미사 d는 생략가능
		
		
		System.out.println();
		System.out.println(_byte);
		System.out.println(_char);
		System.out.println(_short);
		System.out.println(_int);
		System.out.println(_long);
		System.out.println(_float);
		System.out.println(_double);
		System.out.println(_boolean);
		System.out.println();
		
		/*
		 * <<삼항연산자>>
		 */
		//x가 y보다 작으면 true출력
		int x = 90, y = 100;
		System.out.println();
		System.out.println( x < y ? "true" :"flase" );
		
		//3) 변수에 저장된 주민등록번호 뒷자리의 첫번째 숫자가 1이나 3이면 남자를 2나 4면 여자를 출력해주세요 
		//그외의 숫자는 '확인불가'를 출력해 주세요 
		int idnum = 5;
		System.out.println();
		System.out.println( idnum == 1 || idnum == 3 ? "남자" : (idnum == 2 || idnum == 4 ? "여자" : "확인불가"));
		
//		3. 아래는 변수 num의 값에 따라 ‘양수’, ‘음수’, ‘0’을 출력하는 코드이다. 삼항 연산
//		자를 이용해서 (1)에 알맞은 코드를 넣으시오.
//		[Hint] 삼항 연산자를 두 번 사용하라.
		int num = -100;
		System.out.println();
		System.out.println(num < 0 ? "음수" : (num == 0 ? "0" : "양수"));
		
//		9.다음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만 변수 b
//		의 값이 true가 되도록 하는 코드이다. (1)에 알맞은 코드를 넣으시오.
		int ch = 'S';
		System.out.println();
		System.out.println(('a' <= ch && 'z' >=ch) || ('A' <= ch && 'Z' >= ch ) || (0 <= ch && 0 > ch));
		
		
		
		int[][] arr = { { 5, 5, 5, 5, 5 }, 
					{ 10, 10, 10, 10, 10 },
					{ 20, 20, 20, 20, 20 }, 
					{ 30, 30, 30, 30, 30 } };

		int total = 0;
		float avg = 0;
		for(int i1 = 0; i1<arr.length;i1++)
		{
			for(int j=0;j<arr[i1].length;j++)
			{
				total += arr[i1][j];
			}
		}
		avg = (float)total/(arr.length*arr[0].length);
		System.out.println("total : " + total);
		System.out.println("avg : " + avg);
	}

}
