package chapter01;

public class Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 레퍼런스 생성
		Q ref = new Q();
		
		// 출력 메소드 호출
		ref.q16();
		
		// 사칙연산 메소드 호출
		ref.q24();
		
		// 유티코드 출력 메소드 호출
		ref.q25();
		
		// 논리자료형 출력 메소드 호출
		ref.q31();	
		
		// 변수 선언, 연산, 출력 메소드 호출
		ref.q32();
		
		// 증감연산식 메서드 호출
		ref.q33();
		
		// 논리연산 메서드 호출
		ref.q34();
		
		// 비트연산 메서드 호출
		ref.q35();	
		
		// 복합대입연산자 메서드 호출
		ref.q36();
		
		// 삼항연산자 메서드 호출
		ref.q37();
		
	}

	public void q37() {

			int num1 = 10;
			int num2 = 20;
			
			int result = (num1 >= 10) ? num2 +10: num2 - 10;	// T : num2 +10 = 30						   
			System.out.println(result);
	}	
	
	public void q36() {

		int num = 8;

		System.out.println(num += 10); 	// num = num(8) + 10 = 18
		System.out.println(num -= 10);		// num = num(18) - 10 = 8 
		System.out.println(num >>= 2);	// num = num(8 = 2**3) >> 10(2**3 +2) =   : 시트프 연산  
														// >>  방향으로 비트 이동
	}

	public void q35() {

		int num1 = 2; // 0000 0001 0010
		int num2 = 10; // 0000 0001 0010 0011 0100 / 0101 0110 0111 1000 1001 / 1010 1011 1100 1101

		// 비트연산 후 출력
		System.out.println(num1 & num2); // 0010 & 1010 = 0010 = 2 : 두 값이 모두 1일 때 1
		System.out.println(num1 | num2); // 0010 | 1010 = 1010 = 10 : 두 값이 모두 0일 때 0
		System.out.println(num1 ^ num2); // 0010 ^ 1010 = 1000 = 8 : 두 값이 같을 때 0, 다를 때 1
		System.out.println(~num1); 		// ~ 0010 = 1101 = -3 : 1이면 0으로, 0이면 1로 변환
													// -111(-1), -110(-2), -101(-3)
	}

	public void q34() {

		int num1 = 10;
		int num2 = 20;

		boolean result;

		// 논리 연산 후 결과 출력
		result = ((num1 > 10) && (num2 > 10)); // F T > F
		System.out.println(result);

		result = ((num1 > 10) || (num2 > 10)); // F T > T
		System.out.println(result);

		// 논리 결과에 반대값 처리
		System.out.println(!result); // F

	}

	public void q33() {

		int num = 10;

		System.out.println(num); // 10
		System.out.println(num++); // 10 출력 후 1 증가
		System.out.println(num); // 11
		System.out.println(--num); // 1 감소 후 출력
	}

	public void q32() {
		int num;
		num = -5 + 3 * 10 / 2;
		System.out.println(num);
	}

	public void q31() {
		int myAge = 23;
		int teacherAge = 38;

		// 변수선언 및 논리결과 대입, 출력
		boolean value = (myAge > 25);
		System.out.println(value);

		// 논리결과 출력
		System.out.println(myAge <= 25);
		System.out.println(myAge == teacherAge);

		// 변수 선언, 삼항연산자 대입, 출력
		char ch;
		ch = (myAge > teacherAge) ? 'T' : 'F';
		System.out.println(ch);
	}

	public void q25() {
		char ch = '\uAE00';
		System.out.println(ch);
	}

	public void q16() {
		System.out.println("안녕하세요.");
	}

	public void q24() {
		int i = 10;
		double j = 2.0;

		System.out.println("합 : " + (int) (i + j));
		System.out.println("차 : " + (int) (i - j));
		System.out.println("곱 : " + (int) (i * j));
		System.out.println("나누기 : " + (int) (i / j));
	}

}

