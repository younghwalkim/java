package chapter04;

public class Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 레퍼런스 호출
		Q ref = new Q();
		
		// 사칙연산 if~case 사용 메소드 호출
		ref.q41_if();
		ref.q41_switch();
		
		// 구구단 for 사용 - if 사용, 홀수단 제외 메소드 호출
		ref.q42();

		// 구구단 for 사용 - if 사용, 수> 단 제외 메소드 출력		
		ref.q43();			

		// 별 출력 메소드
		ref.q44();		
		ref.q45();		
	}

	public void q45() {

		int lineCount = 9; 	// 라인 수
		int spaceCount = lineCount / 2 + 1; 	// 라인 앞 뒤 여백 수
		int starCount = 1;	// 1 라인 별 갯수

		// 라인
		for (int i = 0; i < lineCount; i++) {
			
			// 라인 앞 여백
			for (int j = 0; j < spaceCount; j++) {
				System.out.print(' ');
			}
			
			// 라인 별 
			for (int j = 0; j < starCount; j++) {
				System.out.print('*');
			}
			
			// 라인 뒤 여백
			for (int j = 0; j < spaceCount; j++) {
				System.out.print(' ');
			}

			// 라인의 반에서는 증감의 조건이 바뀜
			if (i < lineCount / 2) {
				spaceCount -= 1;		// 라인별 여백 수 감수 
				starCount += 2;		// 라인별 별 갯수 증가
			} else {
				spaceCount += 1;	// 라인별 여백 수 증가 
				starCount -= 2;		// 라인별 별 갯수 감소
			}
			
			System.out.println();
		}

	}
	
	public void q44() {

			int lineCount = 3;  	// 총 라인수
			int spaceCount = lineCount/2 + 1; // 라인 앞, 뒤 여백 갯수
			int starCount = 1;	// 1라인 별 갯수
			
			// 라인
			for(int i = 0; i<lineCount; i++) {
				
				// 라인의 앞 여백
				for(int j = 0; j<spaceCount; j++) {
					System.out.print(" ");
				}
				
				// 라인의 별
				for(int j=0; j<starCount; j++) {
					System.out.print('*');
				}
				
				// 라인의 뒷 여백
				for(int j = 0; j<spaceCount; j++) {
						System.out.print(" ");
				}
								
				spaceCount-=1;	// 라인별 여백 수 감수 
				starCount+=2;	// 라인별 별 갯수 증가
				
				System.out.println();
			}

	}	
	
	public void q43() {

		int dan;
		int times;

		// 단
		for (dan = 2; dan <= 9; dan++) {
			
			// 숫자
			for (times = 1; times <= 9; times++) {
				
				// 조건 : 수 > 단 제외
				if (times > dan)
					break;
				System.out.println(dan + "X" + times + "=" + dan * times);
			}
			System.out.println();
		}
	}

	public void q42() {

		int dan;
		int times;

		// 단
		for (dan = 2; dan <= 9; dan++) {

			// 홀수단 제외
			if (dan % 2 != 0)
				continue;

			// 숫자
			for (times = 1; times <= 9; times++) {
				System.out.println(dan + "X" + times + "=" + dan * times);
			}
			System.out.println();
		}

	}

	public void q41_if() {

		int num1 = 10;
		int num2 = 2;
		char operator = '+';

		int result = 0;

		if (operator=='+') 			result = num1 + num2;
		else if (operator=='-')		result = num1 - num2;
		else if (operator=='*')		result = num1 * num2;
		else if (operator=='/')		result = num1 / num2;
		else {
			System.out.println("연산자 오류입니다. ");
			return;
		}
		
		System.out.println("결과 값은 "+ result +"입니다. ");
	}

	public void q41_switch() {

		int num1 = 10;
		int num2 = 2;
		char operator = '*';
		int result = 0;

		switch (operator) {
		case '+': 	result = num1 + num2; 	break;
		case '-': 		result = num1 - num2;	break;
		case '*':		result = num1 * num2;	break;
		case '/':		result = num1 / num2;		break;
		default:
			System.out.println("연산자 오류입니다");
			return;
		}
		System.out.println("결과 값은 " + result + "입니다");
	}
}
