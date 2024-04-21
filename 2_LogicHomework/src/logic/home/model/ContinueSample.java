package logic.home.model;

public class ContinueSample {
	
	public void sumJumpThree() {
		int sum = 0;

		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0)
				continue;
			sum += i;
		}

		System.out.println("1부터 100까지 3의 배수를 뺀 합은 : " + sum);
	}
	
	//과제13 - 2
	public void rowColJump() {
		for(int row = 1; row <= 3; row++) {  //행에 대한 반복 처리
			//각 행별 열에 대한 반복 처리
			for(int col = 1; col <= 5; col++) {
				if(row == 1 && col > 2) {
					continue;  //아래쪽 구문을 실행하지 말고, 증감식으로 가라
				}
				//System.out.print(Math.random() + "  ");
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
