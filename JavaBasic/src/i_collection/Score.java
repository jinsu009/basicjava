package i_collection;
import java.util.*;

public class Score {
	
	public static void main (String[] args)
	{
		double sum = 0;
		double avg = 0;
		
		//입력
		ArrayList<String> name = new ArrayList<String>();   
		name.add("강현철");
		name.add("김우경");
		name.add("김종완");
		name.add("김준우");
		name.add("김철희");
		name.add("김태유");
		name.add("남아름");
		name.add("박기완");
		name.add("박선정");
		name.add("박정민");
		name.add("박혜진");
		name.add("송효진");
		name.add("심주영");
		name.add("연지은");
		name.add("이제경");
		name.add("이혁진");
		name.add("임수진");
		name.add("전다희");
		name.add("정영수");
		name.add("정주환");
		name.add("홍종욱");
		
		ArrayList<String> subject = new ArrayList<String>();
		subject.add("java");
		subject.add("oracle");
		subject.add("html");
		subject.add("css");
		subject.add("jquery");
		subject.add("jsp");
		

		//이차원배열 score 생성
		ArrayList<ArrayList<Double>> score = new ArrayList<>();
		
		
		//순위 초기화 , 랜덤으로 점수를 입력
		for(int i = 0 ; i<name.size();i++)
		{
			ArrayList<Double> list = new ArrayList<>();
			list.add(1.0); //순위
					
			sum = 0;		
			
			for(int j = 0; j<subject.size();j++)
			{
				list.add((int)(Math.random()*51)+50.0);
				
			    sum += list.get(j+1);
			       
			}			
						
			list.add(sum); //총점을 누적			
		
			list.add((int)((sum/subject.size()*10)+0.5)/10d);
			score.add(list);				
		}
		
		
		//석차부여 
		for(int i = 0; i<score.size();i++)
		{
			double rank = 1;
			for(int j = 0; j<score.size();j++)
			{
				if(score.get(i).get(subject.size()+1)<score.get(j).get(subject.size()+1))
					{
						rank++;
					}
				score.get(i).set(0,rank);
			}
		}
		
		
		//sort		
		for(int i = 0; i < score.size()-1;i++)
		{
			for(int j = i+1; j<score.size();j++ )
			{
				ArrayList<Double> a; //**** 임시로 저장할 배열 !
				String b; //**** 이름을 임시로 저장할 공간!
				 if(score.get(i).get(0) > score.get(j).get(0)){
		                a = score.get(i);
		                score.set(i, score.get(j));
		                score.set(j, a);
		                
		                b = name.get(i);
		                name.set(i, name.get(j));
		                name.set(j, b);
		            }
			}
		}
		
		
		System.out.print("이름"+"     석차 " );
		
		for(String a : subject)
		{
			System.out.print(a + "\t");
		}


		System.out.println("  총점" + "\t" + "평균");
		
		for(int i = 0; i<name.size();i++)
		{	
			
			System.out.print(name.get(i));
			System.out.print(score.get(i));
			System.out.println();			
		}
		System.out.println();
			}

}
