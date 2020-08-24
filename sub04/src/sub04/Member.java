package sub04;

public class Member {
	
	//VO(VALUABLE OBJECT)
	//연관된 값을 묶어 옮기기 위해 만든 클래스 
	
	//DAO(DATA ACCESS OBJECT)
	//DTO(DOMAIN TARGET OBJECT) DOMAIN:데이터의 정의 (예. 교수의 정보)//(!=ENTATY)(예. 학과의정보 (교수,학생,과목,...))
	private String id;
	private String pwd;
	
	public Member(String id, String pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", pwd=" + pwd + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Member)
		{
			Member other = (Member)obj;
			if(this.id.equals(other.getId()))
			{
				return true;
			}
			}
		return false;
	}
	
	
	
	

}
