package logic.home.model;

import java.util.Scanner;

public class DoWhileSample {
	Scanner sc = new Scanner(System.in);

	public void addDashToken() {
		String str;
		char ch;
		int i = 0;

		System.out.print("문자열을 입력하세요 : ");
		str = sc.next();

		do {
			System.out.print(str.charAt(i) + "-");
			i++;
		} while (i < (str.length() - 1));
		System.out.println(str.charAt(i));
	}

	public void burgerKingMenu() {
		String str = "";
		int num, select, sum = 0;
		do {
			System.out.println("*** 버거킹 메뉴 ***\n");
			System.out.println("1. 불고기 버거 : 5400");
			System.out.println("2. 치즈 버거 : 6000");
			System.out.println("3. 프렌치 프라이 : 1600");
			System.out.println("4. 어니언 링 : 2000");
			System.out.println("5. 콜라 : 1700");
			System.out.println("6. 킹아메리카노 : 1000");

			System.out.println("메뉴를 선택하세요(종료시 0) : ");
			select = sc.nextInt();

			if (select == 0)
				break;

			System.out.println("개수를 입력하세요 : ");
			num = sc.nextInt();

			switch (select) {
			case 1:
				str += "불고기 버거 " + num + "개 \t" + "가격 : " + (num * 5400) + "원\n";
				sum += num * 5400;
				break;
			case 2:
				str += "치즈 버거 " + num + "개 \t" + "가격 : " + (num * 6000) + "원\n";
				sum += num * 6000;
				break;
			case 3:
				str += "프렌치 프라이 " + num + "개 \t" + "가격 : " + (num * 1600) + "원\n";
				sum += num * 1600;
				break;
			case 4:
				str += "어니언 링 " + num + "개 \t" + "가격 : " + (num * 1200) + "원\n";
				sum += num * 1200;
				break;
			case 5:
				str += "콜라 " + num + "개 \t" + "가격 : " + (num * 1700) + "원\n";
				sum += num * 1700;
				break;
			case 6:
				str += "킹아메리카노 " + num + "개 \t" + "가격 : " + (num * 1000) + "원\n";
				sum += num * 1000;
				break;
			default:
				System.out.println("잘못 입력 하셨습니다.");
			}

		} while (true);

		System.out.println("주문 내역 \n " + str + "총 가격 : " + sum);
	}

	public void isStringAlphabet() {
		String str;
		char ch;
		int i = 0;

		System.out.print("문자열 입력 : ");
		str = sc.next();

		do {
			ch = str.charAt(i);
			if (!(Character.toLowerCase(ch) >= 'a' && Character.toLowerCase(ch) <= 'z')) {
				System.out.println("모든 글자가 영문자 아니다.");
				break;
			}
			i++;
		} while (i < str.length());

		if (i == str.length())
			System.out.println("모든 글자가 영문자다");
	}
}

