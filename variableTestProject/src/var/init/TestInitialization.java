package var.init;

public class TestInitialization {

	public static void main(String[] args) {
		TestInitialization test = new TestInitialization();
		//test.testFinal();
		test.testFinal2();
		
		System.out.println("VALUE : " + test.VALUE);

	}
	
	//final 키워드 사용 테스트
	public void testFinal() {
		//지역변수 만들 때 자료형 앞에 final 표기할 수 있음
		final double pi = 3.14159;
		//pi 변수의 초기값 변경 불가능이 됨
		System.out.println("pi : " + pi);
		//pi = 7.654321; //final 지역변수는 값 변경 불가능임
		System.out.println("pi : " + pi);
	}
	
	//Field (멤버변수) : 클래스 영역에서 선언된 변수
	//접근제한자 [예약어] 자료형 변수명 [= 초기값];
	private final int VALUE = 100;	//상수(constant) 필드라고 함
	//자바에서는 상수 필드명은 반드시 대문자로 지정함
	
	public void testFinal2() {
		//지역변수 만들 때 자료형 앞에 final 표기할 수 있음
		//반드시 초기화 선언해야 함
		final double pi;
		pi = 3.14159;	//딱 한번만 별도로 초기화할 수 있음
		
		System.out.println("pi : " + pi);
		//pi = 3.14159;  //이후 값 변경 불가능
		
	}

}
