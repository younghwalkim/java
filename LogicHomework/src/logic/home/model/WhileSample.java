package logic.home.model;

import java.util.Scanner;

public class WhileSample {
	//Field
	private Scanner sc = new Scanner(System.in);

	public void printUniCode() {
		// 문자 하나 입력받아, 그 문자의 유니코드 출력 반복('0' 입력되면 반복종료)
		char ch = ' ';

		while (true) {
			System.out.print("문자를 입력하세요 : ");
			ch = sc.next().charAt(0);

			if (ch == '0') {
				System.out.println("종료합니다.");
				break;
			}
			System.out.println(ch + "의 유니코드는 : " + (int) ch);
		}
	}

	public void sum1To100() {
		// 1~100까지 정수들의 합계 출력하기(while 문으로 작성)
		int sum = 0, i = 1;

		while (i < 101) {
			sum += i;
			i++;
		}
		System.out.println("1부터 100까지의 합 : " + sum);
	}

	public void numberGame() {
		//1~100사이의 임의의 정수를 발생시켜, 숫자 알아맞추기
		int value = (int)(Math.random() * 100) + 1;
		
		System.out.println("\n숫자 알아맞추기 게임 시작!");
		int count = 1;
		while(true) {
			System.out.print("숫자는? ");
			int num = sc.nextInt();
			
			if(value > num) {
				System.out.println("큰 값입니다.");
			}
			
			if(value < num) {
				System.out.println("작은 값입니다.");
			}

			if(value == num) {
				System.out.println("축하합니다. " + count + "번째로 맞췄습니다.");
				break;
			}
			count++;
		} //while
		
	}

	public void countCharacter() {
		// 문자열을 입력받아, 글자 갯수 알아내어 출력하기
		System.out.print("문자열 입력 : ");
		String str = sc.next();

		int i = 0;
		while (i < str.length()) {
			//System.out.println((i + 1) + "번째 문자 : " + str.charAt(i));
			i++;
		}
		
		System.out.println("글자갯수 : " + i);
	}

	public void countInChar() {
		// 문자열값과 문자 하나를 입력받아, 문자열에 문자가 몇 개 있는지 확인하기

		System.out.print("문자열 입력 : ");
		String str = sc.next();

		System.out.print("찾을 문자 : ");
		char ch = sc.next().charAt(0);

		int i = 0, count = 0;
		while (i < str.length()) {
			if (ch == str.charAt(i))
				count++;
			i++;
		}

		System.out.println(str + "의 " + ch + "문자는 " + count + "개");
	}

}
