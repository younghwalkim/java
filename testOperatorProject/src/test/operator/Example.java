package test.operator;

import java.util.Scanner;

public class Example {
	//문제 1
	public void sample1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int mat = sc.nextInt();
		
		int total = kor + eng + mat;
		double avg = total / 3.0;
		
		String result = (kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60)? "합격" : "불합격";
		
		System.out.println("결과 : " + result);
	}
	
	//문제 2
	public void sample2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학년 : ");
		int year = sc.nextInt();
		System.out.print("반 : ");
		int ban = sc.nextInt();
		System.out.print("번호 : ");
		int no = sc.nextInt();
		System.out.print("성별[M/F] : ");
		char gender = sc.next().charAt(0);
		System.out.print("성적[소숫점 둘째자리까지] : ");
		double score = sc.nextDouble();
		
		System.out.println(year + "학년 " 	+ ban + "반 " + no + "번 "
				+ (gender == 'M'? "남" : "여") + "학생의 성적은 " + score + "이다.");
	}
	
	//문제 3
	public void sample3() {
		System.out.print("정수 하나 입력 : ");
		int num = new Scanner(System.in).nextInt();
		
		System.out.println(num + "은 " + (num > 0? "양수다.": "양수가 아니다."));
	}
	
	//문제 4
	public void sample4() {
		System.out.print("정수 하나 입력 : ");
		int num = new Scanner(System.in).nextInt();
		
		String result = (num % 2 == 0)? "짝수다.": "홀수다.";
		System.out.println(num + "은 " + result);
	}
	
	//문제 5
	public void sample5() {
		/* java.lang.Double 참조
		 * double 자료형의 최대값, 최소값, 비트수, 바이트
		 * 그외 상수필드의 값 모두 출력 조회함
		 * */
		System.out.println("double 자료형 정보");
		System.out.println("최대값 : " + Double.MAX_VALUE);
		System.out.println("최소값 : " + Double.MIN_VALUE);
		System.out.println("할당크기 : " + Double.BYTES);
		System.out.println("비트수 : " + Double.SIZE);
		System.out.println("최대 : " + Double.MAX_EXPONENT);
		System.out.println("최소 : " + Double.MIN_EXPONENT);
		System.out.println("일반 : " + Double.MIN_NORMAL);
	}
	
	//문제 6
	public void sample6() {
		//고객이름(customerName), 나이(age), 성별(gender, 남/여), 전화번호(phone), 
		//포인트점수(point, 소숫점아래 둘째자리까지 입력받음), 특이사항(etc)을 입력받아 출력 처리함
		//특이사항 입력 예 : 보라색을 좋아하고 무스크향을 즐겨 사용함
		Scanner input = new Scanner(System.in);
		
		System.out.print("고객이름 : ");
		String customerName = input.next();  //공백이 없는 문자열 
		System.out.print("나이 : ");
		int age = input.nextInt();
		System.out.print("성별 : ");
		char gender = input.next().charAt(0);
		System.out.print("전화번호 : ");
		String phone = input.next();
		System.out.print("포인트점수(소숫점 둘째자리까지) : ");
		double point = input.nextDouble();
		System.out.print("특이사항 : ");
		input.nextLine();	//입력버퍼에 남은 엔터키 제거처리
		String etc = input.nextLine();  //공백이 포함된 문자열 (엔터키도 값으로 읽음)
		
		System.out.println("고객명 : " + customerName);
		System.out.println("나이 : " + age + "세");
		System.out.println("성별 : " + gender + "자");
		System.out.println("전화번호 : " + phone);
		System.out.println("포인트점수 : " + point);
		System.out.println("특이사항 : " + etc);
	}
	
}












