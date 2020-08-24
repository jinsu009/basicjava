package self;

import java.util.Arrays;

public class Array1226 {
	public static void main(String[] args){
//		int[] ex = new int[]{1,2,3,4,5,6,7,8,9,0};
//		System.out.println(ex.length); //배열의 길이가 출력된다.
//		
////		for(int i = 0; i<ex.length;i++)
////		{
////			System.out.print(ex[i]);
////		} //반복문을 사용해서 배열안에 저장된값을 전부 출력할수 있다.
//		
//		System.out.print(Arrays.toString(ex));
//		//반복문을 사용하지 않고도 배열에 입력된 값들을 전부 출력할수있다. *****
//		
//		//배열에 있는 값들을 복사해보자 (자바의 정석 194p)
//		int[] arr = new int[5];
//		for(int i = 0;i<arr.length;i++)
//		{
//			arr[i] = i+1;
//		}
//		
//		System.out.println("변경전");
//		System.out.println("arr.length:" + arr.length);
//		
//		for(int i = 0; i<arr.length; i++)
//		{
//			System.out.println("arr["+i+"]:"+arr[i]);
//		}
//		int [] tmp = new int[arr.length*2]; //값을 옮길 배열은 기존의 배열보다 2배 크게 만든다.
//		
//		for(int i =0; i<arr.length;i++)
//		{
//			tmp[i] = arr[i];
//		}
//		arr=tmp;
//		
//		System.out.println("변경후");
//		System.out.println("arr.length:" + arr.length);
//		for(int i = 0; i<arr.length;i++)
//		{
//			System.out.println("arr["+i+"]:"+arr[i]);
//		}
		
		//배열의 총합과 평균을 구하시오
//		int sum = 0;
//		float avg = 0f;
//		
//		int[] score = {100,55,46,78,54};
//		
//		for(int i = 0; i<score.length;i++)
//		{
//			sum += score[i];
//		}
//		avg = sum/(float)score.length;
//		
//		System.out.println(sum);
//		System.out.println(avg);
		
		//배열의 최대값 최소값
//		int[] gap = {98,23,52,13,43};
//		
//		int max = gap[0];
//		int min = gap[0];
//		
//		for(int i = 0; i<gap.length;i++)
//		{
//			if(max < gap[i])
//			{
//				max = gap[i];
//			}
//			else
//			{
//				min = gap[i];
//			}
//			
//		}
//		System.out.println(max);
//		System.out.println(min);
	
		//배열에 저장된 0~9까지의 값을 출력하고
		//그배열에 있는 값을 랜덤으로 배치시켜서 출력해보자
		
//		int[] ran1 = new int[10];
//		for(int i = 0; i<ran1.length;i++)
//		{
//			ran1[i] =i;
//			System.out.print(ran1[i]);
//		}
//		System.out.println();
//		for(int i = 0; i<100;i++)
//		{
//			int n = (int)(Math.random()*10);
//			int temp2 = ran1[0];
//			ran1[0] = ran1[n];
//			ran1[n] = temp2;
//		}
//		for(int i=0 ; i<ran1.length;i++)
//		{
//			System.out.print(ran1[i]);
//		}
		
		//위의 예제를 이용하여 1~45까지의 랜덤값을 저장하고 
		//그 배열에서 랜덤으로 값을 출력해보자
		//[5-8] "로또번호생성"
		//교재 참고
		int[] lotto = new int[45];
		for(int i =0 ; i<lotto.length;i++)
		{
			lotto[i] = i+1;
		}		
		int temp3 = 0;
		int j = 0;
		for(int i = 0; i<6; i++)
		{
			j = (int)(Math.random()*45)+1;
			temp3 = lotto[i];
			lotto[i] = lotto[j];
			lotto[j] = temp3;
		}
		System.out.println();
		for(int i = 0; i<6;i++)
		{
			System.out.println("당첨 번호: " + lotto[i]);
		}
//		
//		//내가 해본 것
//		//랜덤으로 생성된값을 저장할 배열을 선언한다.
		int[] bok = new int[45];
		//배열에 1~45까지의 값을 랜덤으로 저장시킨다.
		for(int i = 0; i<bok.length;i++)
		{
			bok[i] = (int)(Math.random()*45)+1;
		}
		System.out.println();
		for(int i = 0; i<6;i++)
		{			
			System.out.println("당첨번호" + bok[i]);
		}
		
		
		//버블정렬 (교재 201p)
		//랜덤한 값을 배열길이 만큼 생성하여 그 값을 정렬시키기
//		int[] bubble = new int[10];
//		for(int i = 0; i<bubble.length;i++)
//		{
//			System.out.print(bubble[i] = (int)(Math.random()*10));
//		}
//		System.out.println(); //버블 배열에 랜덤한 값을 넣어준다.중복된값허용
//		
//		for(int i = 0; i<bubble.length-1;i++)//맨마지막은 비교를 안해도 되기 때문에 길이값을 1빼준다.
//		{
//			boolean changed= false; //숫자가 정렬되어 나올수 있으므로 값이 전혀 변하지 않았을 경우를 대비한다.
//			for(int a = 0; a<bubble.length-1-i;a++)
//			{
//				if(bubble[a] > bubble[a+1])
//					//배열 a의 값과 배열 a+1의값을 비교한다.
//					//만약 배열 a의 값이더 클경우 뒤로 보내줘야 하므로 임시변수를 사용해 자리를 바꿔준다.
//				{
//					int temp4 = bubble[a];
//					bubble[a] = bubble[a+1];
//					bubble[a+1] = temp4;
//					changed = true;
//				}
//				
//			}
//		
//			if (!changed) break;//한번도 교체되지않았을경우 break문으로 탈출한다.
//			
//			for(int b = 0; b<bubble.length;b++)
//			{
//				System.out.print(bubble[b]);
//			}System.out.println();
//			//정렬된 결과를 출력한다.
//			
//		}
		
//		int[] bub = new int[10];
//		System.out.println();
//		System.out.println("\n랜덤값: ");
//		
//		for(int i = 0; i <bub.length;i++)
//		{
//			System.out.print(bub[i] = (int)(Math.random()*10));
//		}		
//		System.out.println();
//		for(int i = 0; i<bub.length-1; i++)
//		{
//			boolean change = false; //boolean의 기본값은 false이다.
//			
//			for(int k = 0 ; k < bub.length-1-i;k++)
//			{
//				if(bub[k] > bub[k+1])
//				{
//					int im = bub[k];
//					bub[k] = bub[k+1];
//					bub[k+1] = im;
//					change = true;
//				}			
//			}
//			if(!change)
//				break;
//			
//			for(int l = 0; l<bub.length;l++)
//			{
//				System.out.print(bub[l]);
//			}
//			System.out.println();
//		}
		
		//[5-11]1~10까지 임의의 수를 배열에 저장하고 각 값들이 몇번 나왔는지 출력해보자 
		
		/*int[] num = new int[10];
		int[] count = new int[10];
		
		for(int i = 0; i<num.length;i++)
		{
			num[i] = (int)(Math.random()*10);
			System.out.print(num[i]);
		}System.out.println();
		//배열에 0~9까지 랜덤하게 저장시킨다.
		
		for(int a = 0; a<num.length;a++)
		{
			count[num[a]]++;
		}
		//만약 num[0]=6이라면 count[6]의 값을 1증가시킨다.
		for(int b = 0; b<num.length;b++)
		{
			System.out.println(b + "의 갯수 > " +count[b]);
		}*/
		
		
		//배열복사 함수를 이용해 배열을 복사해보자
		//[교재195페이지,, 코딩 인터넷 참고]
		/*
		 * System.arraycopy(num,0,newNum,num.length);
		 * num[0]에서 newNum[0]으로 num.length개의 데이터를 복사
		 */		
//		char arra[] ={'1','2','3','4','5'};
//		char arrb[] ={'a','b','c','d','e'};
//		char arrc[] ={'ㄱ','ㄴ','ㄷ','ㄹ','ㅁ'};
		
//		System.out.print("arra> ");
//		for(int i = 0; i<arra.length;i++)
//		{
//			System.out.print(arra[i]+" ");
//		}
//		System.out.println();
//		
//		System.out.print("arrb> ");
//		for(int i = 0; i<arrb.length;i++)
//		{
//			System.out.print(arrb[i]+" ");
//		}
//		System.out.println();
//		
//		System.arraycopy(arra, 0, arrb, 0, arra.length);
//		//arra의 0번 값을 arrb의 0번째로 1의 길이만큼 복사
//		
//		System.out.print("모든 arrb를 숫자로 변경" + "\n"+"arra 배열 값: ");
//		for(int i = 0; i < arra.length;i++)
//		{
//			System.out.print(arra[i]+" ");
//		}
//		System.out.println();
//		
//		System.out.print("arrb 배열 값: ");
//		for(int i = 0; i < arrb.length;i++)
//		{
//			System.out.print(arrb[i]+" ");
//		}
//		System.out.println();
		
//		System.out.print("arrc의 배열 값 > ");
//		for(int i = 0;i<arrc.length;i++)
//		{
//			System.out.print(arrc[i]+" ");
//		}
		
		
//		System.arraycopy(arra, 0, arrc, 2, 2);
		//현재 arrc에는 데이터가 0,1,2,3,4 이러한 값들이 입력되어있는데
		//arra[0]에서 arrc[2]로 2개의 데이터를 복사하므로
		//0,1,2,3,4 의 2,3부분의 데이터가 복사가 된다. 
		
//		System.arraycopy(arra, 0, arrc, 2, 3);
		
//		System.out.print("\n"+"arrc의 3,4 번째만 숫자로 변경"+"\n"+"arra 배열 값: ");
//		for(int i =0;i<arra.length;i++)
//		{
//			System.out.print(arra[i]+" ");
//		}
//		System.out.println();
//		
//		System.out.print("arrc 배열 값: ");
//		for(int i = 0; i<arrc.length;i++)
//		{
//			System.out.print(arrc[i]+" ");
//		}
		
		
		/*
		 * {0,0,0,0,1}
		 * {0,0,0,2,3}
		 * {0,0,4,5,6}
		 * {0,7,8,9,10}
		 * {11,12,13,14,15}
		 */
		
		//[5][5]크기의 2차원배열을 선언
		//2차원배열에 들어갈 값의 갯수를 count
		
		/*int[][] sam = new int[5][5];
		
		int count = 0;
		int tmp = 4;
	
		for(int i = 0; i<=4;i++)
		{
			for(int j = tmp; j<=4;j++)
			{
				sam[i][j] = ++count;
			}
			tmp--;
		}
		for(int i = 0; i<sam.length;i++)
		{
			for(int j = 0; j<sam.length;j++)
			{
				System.out.print(sam[i][j]+",");
			}System.out.println();
		}
		
		
		 * {1,2,3,4,5}
		 * {0,6,7,8,9}
		 * {0,0,10,11,12}
		 * {0,0,0,13,14}
		 * {0,0,0,0,15}
		 
		
		int[][] sam2 = new int[5][5];
		
		int count2 = 0;
		int tmp2 = 0;
		
		for(int i =0; i<=4;i++)
		{
			for(int j = tmp2; j<=4;j++)
			{
				sam2[i][j] = ++count2;
			}
			tmp2++;
		}
		System.out.println();
		for(int i = 0; i<sam2.length;i++)
		{
			for(int j = 0; j<sam2.length;j++)
			{
				System.out.print(sam2[i][j]+",");
			}System.out.println();
		}
		
		
		 * {1,2,3,4,5}
		 * {6,7,8,9,0}
		 * {10,11,12,0,0}
		 * {13,14,0,0,0}
		 * {15,0,0,0,0}
		 
		int[][] sam3 = new int[5][5];
		
		int count3 = 0;
		int tmp3 = 4;
		
		for(int i =0; i<=4;i++)
		{
			for(int j =0 ; j<=tmp3;j++)
			{
				sam3[i][j] = ++count3;
			}
			tmp3--;
		}
		System.out.println();
		for(int i = 0; i<sam3.length;i++)
		{
			for(int j = 0; j<sam3.length;j++)
			{
				System.out.print(sam3[i][j]+",");
			}System.out.println();
		}
		
		
		 *{1,2,3,4,5}
		 *{0,6,7,8,9}
		 *{0,0,10,11,12}
		 *{0,0,0,13,14}
		 *{0,0,0,0,15} 
		 
		
		int[][] sam4 = new int[5][5];
		
		int count4 = 0;
		int tmp4 = 0;
		
		for(int i =0; i<=4;i++)
		{
			for(int j =tmp4 ; j<=4; j++)
			{
				sam4[i][j] = ++count4;
			}
			tmp4++;
		}
		System.out.println();
		for(int i = 0; i<sam4.length;i++)
		{
			for(int j = 0; j<sam4.length;j++)
			{
				System.out.print(sam4[i][j]+",");
			}System.out.println();
		}
		
		
		
		 *{1,0,0,0,0}
		 *{2,3,0,0,0}
		 *{4,5,6,0,0}
		 *{7,8,9,10,0}
		 *{11,12,13,14,15} 
		 
		
		int[][] sam5 = new int[5][5];
		
		int count5 = 0;
		int tmp5 = 0;
		
		for(int i =0; i<=4;i++)
		{
			for(int j = 0 ; j<=tmp5; j++)
			{
				sam5[i][j] = ++count5;
			}
			tmp5++;
		}
		System.out.println();
		for(int i = 0; i<sam5.length;i++)
		{
			for(int j = 0; j<sam5.length;j++)
			{
				System.out.print(sam5[i][j]+",");
			}System.out.println();
		}*/
		
		/*'ㄹ' 자 출력
		 * {1,2,3,4,5}
		 * {10,9,8,7,6}
		 * {11,12,13,14,15}
		 * {20,19,18,17,16}
		 * {21,22,23,24,25}
		 */
		
	
	}

}
