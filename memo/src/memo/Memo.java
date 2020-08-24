package memo;

public class Memo {
	

		
		public static void main(String[] args) {
			
			for(int i=1;i<100;i++){
				System.out.println("주민번호 뒷자리 6 >> "+(int)(Math.random()*999999)+000001);
			}
			for(int i=1;i<100;i++){
				System.out.println("핸드폰 번호 >>  "+(int)(Math.random()*9999999)+0000001);
			}
		}



}
