package logic.home.model;

import java.util.Scanner;

public class ForSample {
	Scanner sc = new Scanner(System.in);

	public void sum1To10() {
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합은 : " + sum);
	}

	public void sumEven1To100() {
		int sum = 0;

		for (int i = 2; i < 101; i += 2) {
			sum += i;
		}
		System.out.println("1부터 100사이 짝수들의 합은 : " + sum);
	}

	public void oneGugudan() {
		int num;

		System.out.print("단을 입력하세요 : ");
		num = sc.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}
	}

	public void sumMinToMax() {
		int num1, num2, temp, sum = 0;

		System.out.print("정수를 하나 입력하세요 : ");
		num1 = sc.nextInt();

		System.out.print("정수를 하나 입력하세요 : ");
		num2 = sc.nextInt();

		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}

		for (int i = num1; i <= num2; i++) {
			sum += i;
		}
		System.out.println(num1 + "부터 " + num2 + "까지의 합은 : " + sum);
	}

	public void printStar() {
		int num1, num2;

		System.out.print("줄 수 입력 : ");
		num1 = sc.nextInt();

		System.out.print("칸 수 입력 : ");
		num2 = sc.nextInt();

		for (int i = 1; i <= num1; i++) {
			for (int j = 1; j <= num2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void printNumberStar() {
		for (int i = 1; i < 8; i++) {
			for (int j = 1; j < 8; j++) {
				if (i == j)
					System.out.print(i);
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}

	public void printTriangleStar() {
		int num1;

		System.out.print("줄수를 입력하세요 : ");
		num1 = sc.nextInt();

		if (num1 > 0) {
			for (int i = 1; i <= num1; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else if (num1 < 0) {
			num1 = -num1;

			for (int i = 1; i <= num1; i++) {
				for (int j = 1; j <= num1; j++) {
					if (j < i)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				System.out.println();
			}
		} else {
			System.out.println("잘못 입력 하셨습니다.");
		}
	}

	public void guguDan() {
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println();
		}
	}
}

