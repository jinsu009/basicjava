package e_oop;

import java.util.Scanner;

public class TV {

	/*
	 * 기능에 해당하는 번호를 입력하기 1. 전원 2. 채널 + 3. 채널 - 4. 음량 + 5. 음량 - 0. 종료
	 * 
	 * 사용자가 1~5를 입력하면 전원 on/off , 채널 +/- , 음량 +/- 를 할수있도록
	 */

	boolean power;
	int ch;
	int vol;

	TV() {
		power = true;
		ch = 12;
		vol = 23;
	}

	void power() {
		power = !power;
	}

	void chUp() {
		if (power && ch < 120) {
			ch++;
		}
	}

	void chDown() {
		if (power && ch > 1) {
			ch--;
		}
	}

	void volUp() {
		if (power && vol < 80) {
			vol++;
		}
	}

	void volDown() {
		if (power && vol > 20) {
			vol--;
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		TV tv = new TV();

		do {
			System.out
					.println("수행할 옵션을 선택 하세요 > 1.전원 2.채널+ 3.채널- 4.음량+ 5.음량- 0.종료");
			String input = s.nextLine();

			if (input.equals("1")) {
				tv.power();
				System.out.println("전원 ON");
			}
			if (input.equals("2")) {
				tv.chUp();
				System.out.println(" chUp > " + tv.ch);

			}
			if (input.equals("3")) {
				tv.chDown();
				System.out.println(" chDown > " + tv.ch);

			}
			if (input.equals("4")) {
				tv.volUp();
				System.out.println(" volUp > " + tv.vol);

			}
			if (input.equals("5")) {
				tv.volDown();
				System.out.println(" volDown > " + tv.vol);

			}
			if (input.equals("0")) {
				tv.power = true;
				System.out.println("전원 OFF");
				break;
			}

		} while (true);

	}

}
