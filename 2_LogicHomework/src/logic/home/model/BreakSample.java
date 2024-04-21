package logic.home.model;

import java.util.Scanner;

public class BreakSample {
	Scanner sc = new Scanner(System.in);

	public void sumBreak() {
		int i = 1, sum = 0;
		while (true) {
			if (i == 101)
				break;
			sum += i++;
		}
		System.out.println("1부터 100까지의 합은 : " + sum);
	}

	public void guguDanBreak() {
		for (int i = 1; i < 10; i++) {
			name: for (int j = 1; j < 10; j++) {
				if (j == 5)
					break name;
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println();
		}
	}
}
