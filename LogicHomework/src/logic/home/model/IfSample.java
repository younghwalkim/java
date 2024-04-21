package logic.home.model;

import java.util.Scanner;

public class IfSample {
	Scanner sc = new Scanner(System.in);

	public void maxNumber() {
		int num1, num2;

		System.out.print("정수1 입력 : ");
		num1 = sc.nextInt();

		System.out.print("정수2 입력 : ");
		num2 = sc.nextInt();

		if (num1 < num2)
			num1 = num2;
		System.out.println("두 수중 큰 수는 " + num1 + "입니다.");
	}

	public void minNumber() {
		int num1, num2;

		System.out.print("정수1 입력 : ");
		num1 = sc.nextInt();

		System.out.print("정수2 입력 : ");
		num2 = sc.nextInt();

		if (num1 > num2)
			num1 = num2;
		System.out.println("두 수중 작은 수는 " + num1 + "입니다.");
	}

	public void threeMaxMin() {
		int num1, num2, num3, max, min;

		System.out.print("정수1 입력 : ");
		num1 = sc.nextInt();

		System.out.print("정수2 입력 : ");
		num2 = sc.nextInt();

		System.out.print("정수3 입력 : ");
		num3 = sc.nextInt();

		if (num1 > num2) {
			max = num1 > num3 ? num1 : num3;
			min = num2 > num3 ? num3 : num2;
		} else {
			max = num2 > num3 ? num2 : num3;
			min = num1 > num3 ? num3 : num1;
		}
		System.out.println("가장 큰 수는 " + max + "입니다.");
		System.out.println("가장 작은 수는 " + min + "입니다.");
	}

	public void checkEven() {
		int num;

		System.out.print("정수를 입력하세요 : ");
		num = sc.nextInt();

		if (num % 2 == 0)
			System.out.println("짝수 입니다.");
		else
			System.out.println("홀수 입니다.");
	}

	public void isPassFail() {
		int ko, en, ma;

		System.out.println("점수를 입력하세요");

		System.out.print("국어 : ");
		ko = sc.nextInt();

		System.out.print("영어 : ");
		en = sc.nextInt();

		System.out.print("수학 : ");
		ma = sc.nextInt();

		if (ko >= 40 && en >= 40 && ma >= 40 && ((ko + en + ma) / 3) >= 60)
			System.out.println("합격입니다.");
		else
			System.out.println("불합격입니다.");
	}

	public void scoreGrade() {
		int num;
		char ch;
		System.out.print("점수를 입력하세요 : ");
		num = sc.nextInt();

		if (num >= 90)
			ch = 'A';
		else if (num >= 80)
			ch = 'B';
		else if (num >= 70)
			ch = 'C';
		else if (num >= 60)
			ch = 'D';
		else
			ch = 'F';

		System.out.println("학점은 " + ch + " 입니다.");
	}

	public void checkPlusMinusZero() {
		int num;

		System.out.print("정수를 입력하세요 : ");
		num = sc.nextInt();

		if (num > 0)
			System.out.println("양수 입니다.");
		else if (num < 0)
			System.out.println("음수 입니다.");
		else
			System.out.println("0입니다.");
	}

	public void whatCaracter() {
		char ch;

		System.out.print("문자를 입력하세요 : ");
		ch = sc.next().charAt(0);

		if (ch >= 'A' && ch <= 'Z')
			System.out.println("대문자 입니다.");
		else if (ch >= 'a' && ch <= 'z')
			System.out.println("소문자 입니다.");
		else
			System.out.println("기타문자 입니다.");
	}
}
