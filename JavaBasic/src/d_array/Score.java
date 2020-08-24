package d_array;

import java.util.Arrays;

public class Score {
	public static void main(String[] args){
		/*
		 * 우리반 모두의 java,oracle,html, css, jquery, jsp 점수를 50~100까지
		 * 랜덤으로 생성시켜 주시고 
		 * 석차순으로 석차, 이름, 과목별 점수, 총점, 평균을 출력해주세용
		 * 석차 이름 	java oracle html css jquery jsp  총점           평균
		 *  1  홍길동	 80		50   100  60	54  65   409	68.16
		 */
		
		//학생수 = 20, 과목수 =6
		//배열을 생성
		//랜덤으로 값을 입력
		
		String[] name ={"강현철","김우경","김종완","김준우","김철희","김태유","남아름","박기완",
						"박선정","박정민","박혜진","송효진","심주영","연지은","이제경","이혁진",
						"임수진","전다희","정영수","정주환","홍종욱"};
		String[] subject = {"java","oracle","html","css","jquery","jsp"};
		int[][] score = new int[name.length][subject.length]; //학생수와 과목수에 맞춰 배열을 생성
		int[] hap = new int[score.length];
		double[] avg = new double[score.length]; //총점과 평균을 저장할 배열을 생성
		int[] rank = new int[avg.length];//순위를 저장할 배열

		
		for(int i = 0; i<score.length;i++)
		{
			for(int j = 0; j<score[i].length;j++)
			{
				score[i][j] = (int)(Math.random()*51)+50;
			}
			System.out.print(name[i]+"\t");
			System.out.println(Arrays.toString(score[i]));
			
		}
		
		for(int i = 0; i<score.length;i++)
		{
			for(int j = 0; j< score[i].length;j++)
			{
				hap[i] += score[i][j];
			}
			System.out.print(name[i]+"\t");
			avg[i] = (double)hap[i]/score[i].length;
			System.out.println("점수 합계 > "+ hap[i]+" / 평균 > "+avg[i]);
		}
		
		for(int i = 0; i <rank.length;i++)
		{
			rank[i]=1;
		}
		
		//선택정렬을 이용한 성적 정리
		for(int i = 0;i<hap.length-1;i++)
		{
			for(int j =i+1; j<hap.length;j++)
			{
				if (hap[i] < hap[j])
				{
					int tmp = rank[i];
					rank[i] = rank[j];
					rank[j] = tmp;
					
					tmp = hap[i];
					hap[i] = hap[j];
					hap[j] = tmp;
					
					double tmp2 = avg[i];
					avg[i] = avg[j];
					avg[j] = tmp2;
					for (int k = 0; k < score[i].length; k++) 
					{
						int temp = score[i][k];
						score[i][k] = score[j][k];
						score[i][k] = temp;
					}
					
				}			
			}
		}
		System.out.println("성적순 석차" + Arrays.toString(rank));
		
		//등수에 전부 1을 넣어준다.
		//총합을 비교하여 등수를 부여한다.
		for(int i = 0; i < avg.length;i++)
		{
			for(int j = 0; j<avg.length;j++)
			{
				if(avg[i] < avg[j])
				{
					rank[i]++;
				}
			}
		}
		System.out.println("석차" + Arrays.toString(rank));
		
		System.out.println("============================================================================");
		System.out.println("석차 \t이름 \tjava\toracle\thtml\tcss\tjquery\tjsp\t총점\t평균");
		System.out.println("============================================================================");
		
		for(int i = 0;i<score.length;i++)
		{
			System.out.print(rank[i]+"\t"+name[i]+"\t"); //석차와 이름을 따로 먼저 출력
			for(int j =0; j<score[i].length;j++)
			{
				System.out.print(score[i][j]+"\t"); //모든 과목의 점수를 출력
			}
			System.out.println(+hap[i]+"\t"+avg[i]); //총점과 평균을 출력
		}

		
	}

}
