package 내꺼;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student implements Comparable{
	private String name;
	private List<Integer> score=new ArrayList<Integer>();
	private List<String> subject=new ArrayList<String>();
	private int total;
	private float avg;
	
	
	public Student(){}
	public Student(String name, List<Integer> score, List<String> subject) {
		super();
		this.name = name;
		this.score = score;
		this.subject = subject;
		
		calcAVG();
	};
	
	public Student(String name, int[] scoreArr, String[] subjectArr) {
		this.name=name;
		
		for(int index=0;index<scoreArr.length;index++ ){
			score.add(scoreArr[index]);
		}		
		
		subject=Arrays.asList(subjectArr);
		
		calcAVG();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Integer> getScore() {
		return score;
	}
	public void setScore(List<Integer> score) {
		this.score = score;
		
		calcAVG();
	}
	public List<String> getSubject() {
		return subject;
	}
	public void setSubject(List<String> subject) {
		this.subject = subject;
	}
	
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	
	private void calcAVG(){		
		for(int sc : score){
			this.total+=sc;			
		}
		avg=total/(float)subject.size();
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + ", subject="
				+ subject + ", total=" + total + ", avg=" + avg + "]";
	}
	@Override
	public int compareTo(Object o) {
		if(o instanceof Student ){
			Student stu = (Student)o;
			return stu.getTotal()-this.total; 
			//내림차순
		}
		return -1;
	}
	
	
	
	
	
}
