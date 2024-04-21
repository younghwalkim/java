package cast.practice;

import java.util.Scanner;

public class CastingSample {
	//실습1
	public void printUniCode(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 입력 : ");
		char ch = sc.next().charAt(0);
		
		System.out.println(ch + " is unicode " + (int)ch);
	}
	
	//실습2
	public void calculatorScore(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double kor = sc.nextDouble();
		System.out.print("영어 : ");
		double eng = sc.nextDouble();
		System.out.print("수학 : ");
		double mat = sc.nextDouble();
		
		int total = (int)(kor + eng + mat);
		int avg = total / 3;
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
	}
	
	//실습3
	public void printBitCount(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int value = sc.nextInt();
		
		System.out.println(value + "의 2진수에 포함된 비트 1의 갯수는 " + 
								Integer.bitCount(value) + "개 입니다.");
		//static 이 붙은 메소드는 클래스명.메소드명() 으로 사용함
		
	}
}






