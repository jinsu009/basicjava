package h_useful;

public class ObjectClass {
	//20-01-10
	public static void main(String[] args)
	{
		//toString() : 객체에 대한 정보를 문자열로 제공한다.
		ObjectClass oc = new ObjectClass();
		System.out.println(oc); 
		System.out.println(oc.toString());
		//주소가 출력된다. -> 오버라이딩을 하면 리턴한 문자열을 출력한다. 
		
		//ObjectClass는 모든 메소드가 포함되어 있다 그렇지만 많이 사용되지는 않는다.
	}

	@Override
	public String toString() {
		return "toString() 메소드 호출";
	}
	

}
