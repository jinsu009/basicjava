package 내꺼;

import java.util.*;


public class Main {
	
	List<Student> students = new ArrayList<Student>();
	
	
	public static void main(String[] args) {
		
		Main main = new Main();
		
		// 입력
		
		String[] nameArr ={"강현철","김우경","김종완","김준우","김철희","김태유","남아름","박기완",
				"박선정","박정민","박혜진","송효진","심주영","연지은","이제경","이혁진",
				"임수진","전다희","정영수","정주환","홍종욱"};
		
		
		String[] subject = {"java","oracle","html","css","jquery","jsp"};
		int[] score=new int[6];	
		
		
		//학생 List (main.students)				
		
		for(String name : nameArr){			
			for(int i=0;i<score.length;i++){
				score[i]= (int)(Math.random()*51)+50;
			}
			Student stu = new Student(name,score,subject);			
			
			main.students.add(stu);
		}		
		
		Collections.sort(main.students);
		
		
		
		//출력		
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n","석차", "이름",subject[0],subject[1],subject[2],subject[3],subject[4],subject[5],"총점","평균");
		
		int rank=0;
		for(Student stu : main.students){
			rank++;
			System.out.printf("%d\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%d\t%f\n", rank,stu.getName(),
					stu.getScore().get(0),
					stu.getScore().get(1),
					stu.getScore().get(2),
					stu.getScore().get(3),
					stu.getScore().get(4),
					stu.getScore().get(5),
					stu.getTotal(),
					stu.getAvg());
		}


	}
	
	
	

}
