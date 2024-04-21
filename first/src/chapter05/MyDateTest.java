package chapter05;

public class MyDateTest {

	public static void main(String[] args) {		
		
		// 레퍼런스 생성
		MyDate date1 = new MyDate(30, 2, 2025);
		System.out.println(date1.isValid()); 	// 메소드 호출 및 결과 출력
		
		// 레퍼런스 생성
		MyDate date2 = new MyDate(2, 10, 2006);
		System.out.println(date2.isValid());	// 메소드 호출 및 결과 출력
	}
}