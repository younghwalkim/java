package logic.home.model;

import java.util.Scanner;

public class VariableSample {
	
	//클래스 안에 생성자가 존재하지 않으면, java virtual machine(jvm)이 컴파일할 때
	//기본생성자를 (public 클래스명(){}) 클래스에 자동 추가하면서 컴파일함

	public void myProfile() {
		// 내 신상정보 변수에 담아 출력하기
		String name = "홍길동";
		int age = 27;
		double height = 185.5;
		double weight = 78.5;
		char gender = '남';
		String phone = "010-1234-5678";
		String email = "hong77@test.org";
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");
		System.out.println("키 : " + height + "cm");
		System.out.println("몸무게 : " + weight + "kg");
		System.out.println("성별 : " + gender + "자");
		System.out.println("전화번호 : " + phone);
		System.out.println("이메일 : " + email);
	}

	public void empInformation() {
		// 사원정보를 키보드로 입력받아 출력하기
		//키보드 입력을 위한 객체 선언 및 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사번 : ");
		String empId = sc.next();
		System.out.print("이름 : ");
		String empName = sc.next();
		System.out.print("주민등록번호 : ");
		String empNo = sc.next();
		System.out.print("소속부서 : ");
		String deptName = sc.next();
		System.out.print("직급 : ");
		String jobTitle = sc.next();
		System.out.print("급여 : ");
		int salary = sc.nextInt();
		System.out.print("보너스포인트(소숫점아래 둘째자리까지) : ");
		double bonusPoint = sc.nextDouble();
		
		System.out.println("직원정보 : [" + empId + ", " + empName + ", " + empNo + ", "
				+ deptName + ", " + jobTitle + ", " + salary + ", " + bonusPoint + "]");
	}

	public void defaultValue() {
		// 기본 자료형 변수의 초기값 확인하기
		// 변수 초기화 : 변수 방 만들면서 바로 초기값을 기록시킴
		// 초기값 : 변수 방에 첫번째로 기록되는 값
		// 작성 : 자료형 변수명 = 초기값;
		boolean flag = false;
		char ch = '\u0000';
		byte bnum = 0;
		short snum = 0;
		int inum = 0;
		long lnum = 0L;
		float fnum = 0.0f;
		double dnum = 0.0;
		
		System.out.println("flag : " + flag);
		System.out.println("ch : " + ch);
		System.out.println("bnum : " + bnum);
		System.out.println("snum : " + snum);
		System.out.println("inum : " + inum);
		System.out.println("lnum : " + lnum);
		System.out.println("fnum : " + fnum);
		System.out.println("dnum : " + dnum);
	}

}









