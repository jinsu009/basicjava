package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		/*
		 * <<배열>>
		 * - int[] number = new int[5]; //기본값으로 초기화된다. //->int[5] 5개의 값을 저장할수있다.
		 * 대괄호는 타입,변수 뒷쪽에 넣어주면된다. 
		 * - int[] number = new int[]{10, 20, 30, 40, 50};
		 * ','로 지정을 해줄경우 값을 넣은 만큼이 배열의 크기가 지정된다.
		 * - int[] number = {10, 20, 30, 40, 50};
		 * 배열의 크기는 한번 지정이 되면 변경할수없다.
		 */
		
		//배열은 참조형 타입이다.
		int[] array; //배열의 주소를 저장할 공간이 만들어진다.
		array = new int[5]; //배열이 생성되고 그 주소가 저장된다.
		//new : 새로운 저장공간 생성 및 주소 반환
		//int[5] : int를 저장할 수 있는 5개의 공간 , int타입의 기본값 '0'이 5개 들어가 있다. ={0,0,0,0,0}
		//배열 초기화시 기본값이 저장된다.
		
		System.out.println(array); //주소가 출력된다.
		
		System.out.println(array[0]); //실제값에 접근하기 위해서는 index를 지정해줘야한다. , array[index] ->0번 index-> 첫번째값 
		//index에는 int만 사용할수 있다. (리터럴, 변수, 상수, 연산 등) -> 결과는 int여야만 한다.
		//배열의 최대 크기는 int의 최대값(약 20억)이다.
//		System.out.println(array[1]);
		
		String arrayStr = Arrays.toString(array);
		//Arrays 클래스 안에 toString라는 메소드가 저장되어 있다.
		System.out.println(arrayStr);
		
		int[] iArray1 = new int[]{1, 2, 3}; //값의 개수로 배열의 길이가 정해진다.
		int[] iArray2 = {1, 2, 3}; //선언과 초기화를 반드시 동시에 해야한다.
		
//		int[] iArray3;
//		iArray3 = {1,2,3}; //컴파일 에러 발생
		
		array[0] = 10; //인덱스는 0부터 시작한다.
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50; //마지막 인덱스는 "배열의 길이 - 1" 이다.
		
		
		
		//정수를 저장할 수 있는 길이가 10인 배열을 생성 및 초기화 해주세요 .
//		int[] arr;
//		arr = new int[10];
		
		int[] arr = new int[10];
		
//		int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 12};
		//크기를 넣던가 값을 넣던가 둘중 하나만 진행해야 한다. 
		
		//모든 인덱스에 있는 값을 변경해주세요
		
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 1;
		arr[3] = 1;
		arr[4] = 1;
		arr[5] = 1;
		arr[6] = 1;
		arr[7] = 1;
		arr[8] = 1;
		arr[9] = 1;

		//모든 인덱스에 있는 값을 더해주세요.
//		int sum = 0;
//		sum += arr[0];
//		sum  += arr[1];
//		sum  += arr[2];
//		sum  += arr[3];
//		sum  += arr[4];
//		sum  += arr[5];
//		sum  += arr[6];
//		sum  += arr[7];
//		sum += arr[8];
//		sum += arr[9];
//		System.out.println(sum);
		
		int sum = 0;
		for(int i = 0;i<arr.length;i++)
		{
			sum += arr[i];
		}
		System.out.println();
		System.out.println("arr의 합 = " + sum);
		System.out.println();
		
		
		//for문을 사용해보자
		//index는 1씩 증가하는 규칙이 있어서 for문과 함께 사용하기 좋다.
		for(int i = 0;i<array.length; i++) //***** i가 배열의 크기보다 작을때까지 반복 
			//현재 array의 길이를 이미 알고있기때문에 array의 크기인 5를 넣어주어도 되지만 별로 좋은 방법은 아니니 .length를 사용하도록 하자 
		{
			System.out.println(array[i]);
		}
		
		//배열의 길이를 알고있다고 숫자를 사용하는것을 하드 코딩이라고 한다.
		//길이를 알더라도 .length를 사용하는 것이 더 좋은 코드이다.
		
		
		//for문을 사용해서 배열의 값을 저장해보자
		for(int i = 0;i<array.length;i++)
		{
			array[i] = i + 1;
		}
		System.out.println(Arrays.toString(array));
		
		
		
		//배열에 숫자를 담고 합계와 평균을 구해보자 
		
		//크기가 10인 배열을 생성한다.
		int[] numbers = new int[10];
		
		//배열에 1부터 100까지 랜덤한 수를 넣어준다.
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] =(int)(Math.random()*100)+1;
		}
		System.out.println();
		System.out.println(Arrays.toString(numbers));
		
		int hap=0; //합
		double avg = 0; //평균
		
		for(int i = 0; i< numbers.length; i++)
		{
			hap += numbers[i];
		}
		avg = (double)hap / numbers.length; //소수점을 발생시키기위해 최소한 둘중 하나는 double타입으로 변경시켜준다.
		//.length는 변수 
		System.out.println("합 : " + hap + " / 평균 : " + avg);
		System.out.println();
		
		//향상된 for문
//		for(int number : numbers) //타입에 맞는 변수를 앞에 선언해주어야 한다. //배열에 있는 값을 차례대로 변수에 넣는다.
//			//index를 사용할수없다.
//			//오직 배열의 값을 읽을때만 사용한다.
//		{			
//			System.out.println(number);
//		}
		
		
		//배열에 저장된 숫자들 중 최소값과 최대값을 찾아주세요
		//numbers에 저장된 값중에서 
		//최대값과 최소값을 저장시킬 변수를 먼저 만들어주고 
		//최소값에는 0번인덱스에 들어가 있는 값을 넣어주고 그 값을 다른 인덱스와 비교를 하고 0번인덱스보다 작은 값이 있다면 그 작은값을 최소값을 저장할 변수에 저장시켜준다.
		int min = 100;
		//최소값을 구할때는 랜덤으로 나올수있는 수 중 가장 큰수를 넣어주어야 한다.
		int max = 0;
		for (int i = 0; i < numbers.length; i++)
		{
			if (min >= numbers[i])
			{
				min = numbers[i];
			}

			if (max <= numbers[i])
			{
				max = numbers[i];
			}
		}
		System.out.println("최소값 : " + min + " 최대값 : " + max);
		
		/*
		 * int min = numbers[0];
		 * int max = numbers[0]; //배열의 첫번째값을 저장한다.
		 * for(int i = 0; i <numbers.length; i++)
		 * {
		 * 		if(numbers[i] < min)
		 * 			{
		 * 				min = numbers[i];
		 * 			}
		 * 		if(max < numbers[i])
		 * 			{
		 * 				max = numbers[i];
		 * 			}
		 * }
		 * 
		 */
		
		//배열에 순서대로 저장되어 있는 값을 섞어보자
		//0~29까지 랜덤한 수를 발생시키고 첫번째 배열에 있는 값과 랜덤으로 뽑힌 배열의 값을 서로 바꾸어 준다......
		int[] shuffle = new int[30];

		for(int i = 0; i < shuffle.length; i++)
		{
			shuffle[i] = i+1;
		}
		System.out.println();
		System.out.println(Arrays.toString(shuffle));
		
		for(int i = 0; i <shuffle.length*10;i++){//반복한 횟수 곱해준 것
		int rad = (int)(Math.random()*29)+1;
//		System.out.println("random : " + rad);
	//랜덤한 값을 발생시킨다.
	//랜덤한 값과 첫번째 배열에 있는 값을 바꾸어준다 --for문을 사용해서 랜덤한 값으로 발생된 모든 인덱스를 서로서로 바꾸어준다. 
		int temp = shuffle[0];
		shuffle[0] = shuffle[rad];
		shuffle[rad] = temp;
		}
	
		System.out.println(Arrays.toString(shuffle));
		
		//여러번 바꿔주기 --선생님 for문 사용
//		for(int i = 0; i <shuffle.length*10;i++)
//		 {
//			  int random = (int)(Math.random()*shuffle.length);
//			  int temp = shuffle[0];
//			  shuffle[0] = shuffle[random];
//			  shuffle[random] = temp;
//		  }
//		System.out.println(Arrays.toString(shuffle));
		
		//------------------------------------------------
		
		//1~10사이의 난수(랜덤한 수)를 500번 생성하고*** , 각 숫자가 생성된 횟수를 출력해주세요  .. 
		//교재 204페이지 참고
		//난수를 500번 생성 
	
//		System.out.println();
//		int[] rannum = new int[500];
//		int[] rannum2 = new int[500];
//						
//		for(int i = 0; i < 500; i++)
//		{
//			rannum[i] = (int)(Math.random()*10)+1;
//			rannum2[rannum[i]-1]++;
//		}		
//		for(int i = 0; i<10; i++)
//		{
//		System.out.println(i+ " 출력횟수 :" +rannum2[i]);
//		}
		
		//효진이거 보고 도움받은것
		System.out.println();
		int[] rannum = new int[10];
							
		for(int i = 0; i < 500; i++)
		{
			int rad = (int)(Math.random()*10)+1;
			rannum[rad-1]++;
		}		
//		System.out.println("0:" + rannum[0] + " 1:" +rannum[1] + " 2:" + rannum[2] + " 3:" + rannum[3] + " 4:"+ rannum[4] + " 5:" + rannum[5] + " 6:" +rannum[6] + " 7:" +rannum[7] + " 8:" +rannum[8] + " 9:" +rannum[9]);
		System.out.println(Arrays.toString(rannum));
		
		//효진
//		int arr1[] = new int[10];
//		for(int i=0; i<500; i++){
//			int ran = (int)(Math.random()*10)+1;
//			arr1[ran-1] += 1;
//		}
//		System.out.println(Arrays.toString(arr1));
		
		//선생님
		int[] count9 = new int[10]; //횟수를 저장할 배열을 생성
		
		for(int i = 0; i<500; i++)
		{
			int ra9 = (int)(Math.random()*10)+1; //1~10까지 랜덤수를 발생
			count9[ra9-1]++; //규칙을 찾아 저장 횟수를 저장할 배열에 저장
			//1 2 3 4 5 6 7 8 9 10 --이 숫자가 발생이 될때
			//0 1 2 3 4 5 6 7 8 9  --횟수가 저장될 배열의 값은 숫자보다 1작다
		}
		for(int i = 0; i <count9.length;i++)
		{
			System.out.println(i+1+":"+count9[i]);
		}
		
		
		
		
		//Arrays.toString(배열명) -- 배열의 모든 값을 출력해준다.
		
		//문제점 : 반복문의값이 전부 출력되어진다. 중복이 심하다. ㅠ 
		
		
		//위 문제의 최소값, 최대값, 반복횟수를 입력받아 각 숫자가 생성된 횟수를 출력해주세요.
		//1~10사의 난수를 500번 입력 받아서...??
		//1~10 사이의 난수를 내가 입력해서 ?
		System.out.println();
		
		//선생님
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("최소값: ");
		int minNum = Integer.parseInt(s.nextLine());
		System.out.println("최대값: ");
		int maxNum = Integer.parseInt(s.nextLine());
		System.out.println("반복횟수: ");
		int repeat = Integer.parseInt(s.nextLine());
		
		count9 = new int[maxNum - minNum +1];
		//상단에서 count9배열을 10으로 만들었기 때문에 반복횟수는 10이하로 잡는다.
		
		for(int i =0;i< repeat; i++)
		{
			int ra9 = (int)(Math.random()* (maxNum - minNum +1)) + minNum;
					count9[ra9 - minNum]++;
		}
		
		for(int i = 0; i<count9.length; i++)
		{
			System.out.println(i + 1 + ":" + count9[i]);
		}
		
	}
	

}














