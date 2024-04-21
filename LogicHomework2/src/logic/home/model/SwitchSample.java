package logic.home.model;

import java.util.Scanner;

public class SwitchSample {
	Scanner sc = new Scanner(System.in);

	public void calculator() {
		int num1, num2;
		char ch;

		System.out.print("정수 1 입력 : ");
		num1 = sc.nextInt();

		System.out.print("정수 2 입력 : ");
		num2 = sc.nextInt();

		System.out.print("연산문자 입력 : ");
		ch = sc.next().charAt(0);

		if (Character.toLowerCase(ch) == 'x')
			ch = '*';

		switch (ch) {
		case '+':
			System.out.println(num1 + " " + ch + " " + num2 + " = " + (num1 + num2));
			break;
		case '-':
			System.out.println(num1 + " " + ch + " " + num2 + " = " + (num1 - num2));
			break;
		case '*':
			System.out.println(num1 + " X " + num2 + " = " + (num1 * num2));
			break;
		case '/':
			System.out.println(num1 + " " + ch + " " + num2 + " = " + (num1 / num2));
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
	}

	public void fruitPrice() {
		String str;

		System.out.print("과일 이름 입력(사과, 배, 딸기, 바나나) : ");
		str = sc.next();

		switch (str) {
		case "사과":
			System.out.println("사과의 가격은 1000원 입니다.");
			break;
		case "배":
			System.out.println("배의 가격은 1200원 입니다.");
			break;
		case "딸기":
			System.out.println("딸기의 가격은 500원 입니다.");
			break;
		case "바나나":
			System.out.println("바나나의 가격은 1500원 입니다.");
			break;
		default:
			System.out.println("잘못 입력 하셨습니다.");
		}
	}

}
