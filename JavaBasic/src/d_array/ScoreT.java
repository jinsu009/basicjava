package d_array;

public class ScoreT {
	public static void main(String[] args){
		
		String[] students = {"ㄱ","ㄴ","ㄷ"};
		String[] subjects = {"국어","수학","영어"};
		double[][] scores = new double[students.length][subjects.length+3];
		//배열의 일차원은 학생수.과목수+3(석차,총점,평균을 저장하기 위해서)
		//하드코딩을 하지 않았으므로 학생이나 과목을 추가/삭제해도 전체적인 코딩을 하는데는 문제가없다. 
		
		//점수를 입력
		for(int i = 0; i < scores.length;i++)
		{
			scores[i][0]=1;
			//0번인덱스에 석차를 1을 넣는다.
			for(int j = 0; j < subjects.length;j++)
//		    for(int j = 1; j <= subjects.length;j++)
			{
				scores[i][j+1] = (int)(Math.random()*51)+50;
				//0번인덱스는 석차가 저장되어있기때문에 j+1을 해준다.
			}
		}
		
		//총점과 평균 구하기
		for(int i = 0; i<scores.length;i++)
		{
			for(int j = 0; j<subjects.length;j++)
			{
				//총점을 저장할공간-2시킨다 
				
				scores[i][scores[i].length-2] += scores[i][j+1];
				
			}
			//평균
			scores[i][scores[i].length-1]
						=(int)((double)scores[i][scores[i].length-2]/subjects.length*100+0.5)/100.0;
			//총점을 과목의 길이만큼나누고 소수점을 출력하도록함
		}
		
		//석차를 구한다.
		//모든사람의 평균을 비교해 석차를 구한다.
		for(int i = 0; i<scores.length;i++)
		{
			for(int j = 0; j<scores.length;j++)
			{
				if(scores[i][scores[i].length-1]<scores[j][scores[j].length-1])
					//*****
				{
					scores[i][0]++;
				}
			}
		}
		
		//석차순으로 정렬
		//선택정렬사용(오름차순)
		for(int i = 0; i<scores.length;i++)
		{
			for(int j = i+1; j<scores.length;j++)
			{
				if(scores[i][0]>scores[j][0])
				{
					//한줄전체를 바꾸어야 하기 때문에 점수가 이동할때 이름도 같이 이동시키도록 한다.
					double[] temp = scores[1];
					scores[i] = scores[j];
					scores[j] = temp;
					
					String tempName = students[i];
					students[i] = students[j];
					students[j] = tempName;
				}
			}
		}
		
		//출력
		System.out.print("석차\t 이름");
		for(int i = 0; i<subjects.length;i++)
		{
			System.out.print("\t"+subjects[i]);
		}
		System.out.println("\t총점\t 평균 ");
		for(int i = 0; i<scores.length;i++)
		{
			System.out.print((int)scores[i][0]+"\t"+students[i]);
			for(int j = 1; j<scores[i].length;j++)
			{
				if(j==scores[i].length-1)
				{
					System.out.print("\t" + scores[i][j]);
				}
				else
				{
					System.out.print("\t" + (int)scores[i][j]);
				}
			}
			System.out.println();
		}
	}

}
