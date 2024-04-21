package var.practice;

public class TestExample1 {
	//연습문제
	
	public void example(){
		String name;  	//이름
		int age;			//나이
		double height;		//키(소수점 아래 첫째자리까지)
		double weight;	//몸무게(소수점 아래 첫째자리까지)
		char gender;		//성별(남 : M, 여 : F)
		String phone;		//전화번호
		String email;		//이메일
		
		name = "홍길동";  //문자나열값은 반드시 큰따옴표(double quotation)으로 묶어야 함
		age = 27;
		height = 185.5;
		weight = 78.8;
		gender = 'M';
		phone = "010-134-5678";
		email = "hong77@test.org";
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("셩별 : " + gender);
		System.out.println("전화번호 : " + phone);
		System.out.println("이메일 : " + email);
	}
	
	public void example2(){
		//변수 선언시 바로 값 기록할 수 있다. => 변수 초기화 라고 함
		//초기값 : 변수방 만들고 첫번째로 기록되는 값을 말함
		//자료형 변수명 = 초기값;
		
		String name = "홍길동";   	//이름
		int age = 27;				//나이
		double height = 185.5;		//키(소수점 아래 첫째자리까지)
		double weight = 78.8;		//몸무게(소수점 아래 첫째자리까지)
		char gender = 'M';			//성별(남 : M, 여 : F)
		String phone = "010-134-5678";		//전화번호
		String email = "hong77@test.org";	//이메일		
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("셩별 : " + gender);
		System.out.println("전화번호 : " + phone);
		System.out.println("이메일 : " + email);
	}

	public static void main(String[] args) {
		TestExample1 test = new TestExample1();
		test.example();
		System.out.println();  //빈 줄 추가
		test.example2();

	}

}
