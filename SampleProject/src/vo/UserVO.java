package vo;

public class UserVO {
	//user테이블
	
	private String id;
	private String pw;
	private String name;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
		//이름이 같으니까 this string s였으면 this를 사용하지않아도 좋다. 
		/*sum(int a){
			a + 3;
		}*///this와 같은 의미
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
