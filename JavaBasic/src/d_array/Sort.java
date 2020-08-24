package d_array;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args){
		/*
		 * <<정렬>>
		 * - 선택정렬 : 첫번째 숫자부터 그 뒤의 모든 숫자들과 비교해서 작은 수와 자리 바꾸기를 반복해 앞에서부터 작은수를 채워나가는 방식
		 * - 버블정렬 : 첫번째 숫자부터 바로 뒷숫자와 비교해서 작은수와 자리바꾸기를 반복해 뒤에서부터 큰수를 채워나가는 방식
		 * - 삽입정렬 : 두번째 숫자부터 그 앞의 모든 숫자들과 비교해서 큰 수들을 뒤로 밀고 중간에 삽입하는 방식 
		 *
		 *<<석차구하기>>
		 * - 모든 점수가 1등으로 시작해서 다른 점수들과 비교해 자신의 점수가 작으면 1씩 증가시키는 방식
		 */
		
		int[] numbers = new int[10];
		
		for(int i = 0; i<numbers.length;i++)
		{
			numbers[i] = i +1;
		}
		
		 shuffle(numbers); 
		 //shuffle에 커서를 두고 ctrl+1을 누르면 도움말이 나온다.
		 //shuffle의 메소드를 생성
		 
		 System.out.println("랜덤");
		 System.out.println(Arrays.toString(numbers));
		 System.out.println();
		 //클래스.클래스에 속한 메소드
		 
//		 printRank(numbers); //석차구하기
//		 selectSort(numbers); //선택정렬
//		 bubbleSort(numbers); //버블정렬
		 insertSort(numbers); //삽입정렬
		 
	}

	private static void insertSort(int[] numbers) {
		//삽입정렬 *****
		//배열[n+1]부터 임시로보관을한다.
		//임시로 저장된 곳 temp = 배열[n+1]의 값과 배열[n]의값을 비교
		//둘의 값을 비교했을때 더 큰값을  배열[n+1]에 저장시키고 배열[n]에는 temp의 값을 저장시킨다.
		
//		for(int i = 1; i < numbers.length ; i++)
//		{
//			int temp = numbers[i];
//			int j = 0;
//			for(j= i-1; j>=0; j--)
//			{
//					if(temp < numbers[j])
//					{
//						numbers[j+1] = numbers[j];						
//					}
//					else
//					{
//						break;
//					}
//				System.out.println(Arrays.toString(numbers));
//			}
//			numbers[j+1] = temp;
//		}
//		System.out.println();
//		System.out.println("삽입정렬");
//		System.out.println(Arrays.toString(numbers));
		
		
		//선생님
//		for(int i=1; i<numbers.length;i++)
//		{
//			int temp = numbers[i];
		//임시로 생성한 변수에 비교할 값을 넣어준다.
//			System.out.println("비교값 : " +temp);
//			int j=0;
//			for(j=i-1;j>=0;j--)
		//비교할 배열은 비교값이 저장된i보다 한칸 작게 설정하며 뒤에서부터 차례로 비교한다.
		//배열[0]일때는 비교를 하지않는다.
		//만약 배열[4]일때는 배열[0]~배열[3]까지 비교를 할수있도록 설정한다.
//			{
//				if(temp < numbers[j])
//				{
//					numbers[j+1] = numbers[j];
//				}
		//temp와 num[i-1]의 값을 비교하여 temp가 더 작을경우 
		//numbers[i-1+1]에 numbers[i-1]의 값을 저장한다.
//				else
//				{
//					break;
//				}				
//			}
//			numbers[j+1] = temp;			
//			System.out.println(Arrays.toString(numbers));
//		}
//		System.out.println();
//		System.out.println("삽입정렬");
//		System.out.println(Arrays.toString(numbers));
	}

	private static void bubbleSort(int[] numbers) {
		//버블정렬
		//배열크기가 10일경우
		//배열[n]과 배열[n+1]를 비교
		//한번 for문을 돌때마다 배열크기 -1을 해준다. 
		//한번도 수행되지 않으면 break
		
//		for(int i = numbers.length -1 ; i >=0; i--)
//		{
//			for(int j = 0; j < i; j++)
//			{
//				if(numbers[j] > numbers[j+1])
//				{
//					int temp = numbers[j];
//					numbers[j] = numbers[j+1];
//					numbers[j+1] = temp;
//				}
//				System.out.println(Arrays.toString(numbers));
//			}
//		}
//		System.out.println("버블정렬");
//		System.out.println(Arrays.toString(numbers));
		
		for(int i=0;i<numbers.length-1;i++)
		{
			boolean changed = false;
			for(int j = 0; j<numbers.length-i-1;j++)
			{
				if(numbers[j] > numbers[j+1])
				{
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
					changed = true;
				}
				System.out.println(Arrays.toString(numbers));
			}
			if(!changed)
			{
				break; //한번도 값이 바뀌지 않을경우
			}
		}
		System.out.println("버블정렬");
		System.out.println(Arrays.toString(numbers));
		
	}

	private static void selectSort(int[] numbers) {
		//선택정렬
		//배열[n]과 배열[n+1]를 비교해서 작은수면 값을 바꿔준다. *****
		//총 배열의 크기가 10일경우 9까지만 비교를 한다. *****
		//작은수 부터 차례로 정렬된다.
		for(int i = 0; i < numbers.length-1;i++)
		{
			for(int j = i+1; j < numbers.length; j++) //j의 초기값지정 유의
			{
				if(numbers[i] < numbers[j])
				{
					int temp = numbers[i];
					//임시로 저장될 temp는 배열이면 안된다.
					//배열안에 있는 값들은 int형 값이기 때문에 임시로 저장될 공간인 temp도 int로 지정해준다.
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
				System.out.println(Arrays.toString(numbers));
			}
		}
		System.out.println("선택정렬");
		System.out.println(Arrays.toString(numbers));
		
		//선생님
//		for(int i = 0; i<numbers.length-1;i++)
//		{
//			for(int j = i+1;j<numbers.length;j++)
//			{
//				if(numbers[i] < numbers[j])
//			
//				{
//				int temp = numbers[i];
//				//임시로 저장될 temp는 배열이면 안된다.
//				//배열안에 있는 값들은 int형 값이기 때문에 임시로 저장될 공간인 temp도 int로 지정해준다.
//				numbers[i] = numbers[j];
//				numbers[j] = temp;
//				}
//			}
//		}
//		System.out.println("선택정렬");
//		System.out.println(Arrays.toString(numbers));
	}

	private static void printRank(int[] numbers) {
		
		int[] rank = new int[]{1,1,1,1,1,1,1,1,1,1}; //석차를 저장시키는 배열 생성 ,,비교하기 전에는 모두 1등이다.
		
		for(int i = 0; i < numbers.length; i++)
		{
			for(int j = 0; j < numbers.length;j++) //numbers와 numbers를 비교 하는 for문을 만든다.
			{			
				if(numbers[j] < numbers[i])	
				{
					rank[j] +=1;
				} 
			}					
		}
		System.out.println("석차");
		System.out.println(Arrays.toString(rank));
		
		//선생님
//		int[] rank = new int[numbers.length];
//		
//		for(int i = 0;i<rank.length; i++)
//		{
//			rank[i] =1;
//		}
//		
//		
//		for(int i=0;i<numbers.length;i++)
//		{
//			for(int j = 0; j<numbers.length;j++)
//			{
//				if(numbers[i]<numbers[j])
//				{
//					rank[i]++;
//				}
//			}
//		}
//		System.out.println("석차");
//		System.out.println(Arrays.toString(rank));
		
		
		
		
		
	}

	private static void shuffle(int[] numbers) {
		for(int i = 0; i<numbers.length *10;i++) //shuffle횟수를 늘려준다.
		{
			int random = (int)(Math.random()*numbers.length);
			
			int temp = numbers[0];
			numbers[0] = numbers[random];
			numbers[random] = temp;
		}
		
	}
}
