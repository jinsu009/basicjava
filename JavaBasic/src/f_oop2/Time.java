package f_oop2;

public class Time {

	private int hour;
	private int minute;
	private int second;

	// source -> generat~~-> selectall -> 변수 하나당 get과 set이 생성된다.

	// 변수에 private를 붙여서 접근을 못하게 했지만 다시 메소드를생성해서 접근할수있도록 설정했다
	// 굳이 이렇게 한 이유가 뭘까
	// 사용자가 어떠한 값을 입려하면 파라미터에 사용자가 입력한 값을 저장할 것이다 . 
	// 그때 사용자가 엉뚱한 값을 입력하지 못하게 메소드안에 제한 하는 로직을 만들기 위해 메소드를 설정한다.
	public int getHour() {

		return hour;
	} // 변수의 값을 읽을때는 get

	public void setHour(int hour) {
		if(hour < 0)
		{
			this.hour =0;
		}
		else if(hour > 24)
		{
			this.hour = hour%24;
		}
	
		
	
	} // 변수의 값을 저장할때는 set

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
			
		if(minute < 0)
		{
			this.minute =0;
		}
		else if(minute > 24)
		{
			this.minute=0;
		}
		setHour(this.hour+minute/60);
		this.minute = minute%60;
		
		//메소드 호출 
	
		
	}

	public int getSecond() {
		return second;
	}
	public void setSecond(int second) 
	{
		if(second < 0)
		{
			this.second =0;
		}
			setMinute(this.minute+second/60);
			this.second = second%60;
		
	}

	@Override
	// objedt클래스한테 상속받은 메소드 -> 오버라이딩
	public String toString() {
		return hour + " : " + minute + " : " + second;
	}

}
