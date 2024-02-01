package chapter07;

import java.util.ArrayList;

public class CharArray {

	public static void main(String[] args) {

		// 레퍼런스 생성
		CharArray ref = new CharArray();
		
		// 대문자를 배열에 담고 소문자로 변환해서 출력하는 메소드 호출
		ref.ArrayTest1();
		System.out.println();
		
		// 2~10 사의 짝수를 배열에 담고 합계를 출력하는 메소드 호출
		ref.ArrayTest2();		
		System.out.println();
		
		// 배열 메소드 호출
		ref.DogTest();
		System.out.println();
		
		ref.DogTestArrayList();
		System.out.println();
	}

	public void DogTestArrayList() {

		// 배열생성 - import java.util.ArrayList;  활용
		ArrayList<Dog> list = new ArrayList<Dog>();
		
		// 객체 생성
		list.add(new Dog("멍멍이", "치아와"));
		list.add(new Dog("뽀삐", "진돗개"));
		list.add(new Dog("순심이", "삽살개"));
		list.add(new Dog("철이", "마르티스"));
		list.add(new Dog("삐쭈", "푸들"));

		// for 문 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).showDogInfo());
		}
		System.out.println();
		
		// for ~ each 문 출력
		for (Dog item : list) {
			System.out.println(item.showDogInfo());
		}
		
	}
	
	public void DogTest() {

		// 배열 생성
		Dog[] dogArray = new Dog[5];
		
		// 객체 생성
		dogArray[0] = new Dog("멍멍이", "치아와");
		dogArray[1] = new Dog("뽀삐", "진돗개");
		dogArray[2] = new Dog("순심이", "삽살개");
		dogArray[3] = new Dog("철이", "마르티스");
		dogArray[4] = new Dog("삐쭈", "푸들");

		// for 문 출력
		for (int i = 0; i < dogArray.length; i++) {
			System.out.println(dogArray[i].showDogInfo());
		}
		System.out.println();
		
		// for ~ each 문 출력
		for (Dog item : dogArray) {
			System.out.println(item.showDogInfo());
		}
	}

	public void ArrayTest2() {

		// 배열선언
		int[] number = new int[] {2,4,6,8,10};
		
		int total = 0;
		
		// 합계구하기
		for(int i=0; i<number.length; i++){
			total += number[i];
		}
		
		System.out.println("2부터 10까지 짝수의 합은 " + total + "입니다");

	}	
	
	public void ArrayTest1() {
		
		// 배열 선언
		char[] alpahabetsArr = new char[26];
		
		char ch = 'A';
		
		// i , ch 증가시키면서 배열에 저장 (대문자 A ~ Z까지 26자리)
		for(int i=0 ; i<alpahabetsArr.length; i++, ch++){
			alpahabetsArr[i] = ch;
		}

		// 출력
		for(int i=0 ; i<alpahabetsArr.length; i++, ch++){
			System.out.print(alpahabetsArr[i] + " ");
		}
		System.out.println();
		
		// 배열에 저장한 값에 32 더하기  (대문자를 소문자로 변환)		
		for(int i=0; i<alpahabetsArr.length; i++){
			alpahabetsArr[i] = (char)( alpahabetsArr[i] + 32);
		}
		
		// 출력
		for(int i=0 ; i<alpahabetsArr.length; i++, ch++){
			System.out.print(alpahabetsArr[i] + " ");
		}	
		System.out.println();
		
	}
	
}
