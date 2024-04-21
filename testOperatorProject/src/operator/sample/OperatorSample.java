package operator.sample;

import java.util.Scanner;

public class OperatorSample {

	public void 괄호연산자테스트() {
//		int num1 = 12;
//		int num2 = 33;
		int num1 = 12, num2 = 33;  //나열 연산자
		
		System.out.println("계산1 : " + (num1 + 5 * num2));  //177
		System.out.println("계산2 : " + ((num1 + 5) * num2)); //561
	}
	
	public void 부호연산자테스트() {
		int num = -25;
		System.out.println("num : " + +num);  //+1 * -25 => -25
		System.out.println("num : " + -num);  //-1 * -25 => 25
	}
	
	public void 증감연산자테스트() {
		//++ : 1증가, -- : 1감소
		int num = 10;
		System.out.println("num : " + num);  //num : 10
		
		num++;  //num = num + 1;
		System.out.println("num : " + num);  //num : 11
		++num;  //num = num + 1;
		System.out.println("num : " + num);  //num : 12

		num--;  //num = num - 1;
		System.out.println("num : " + num);  //num : 11
		--num;  //num = num - 1;
		System.out.println("num : " + num);  //num : 10
		//증감연산자가 변수와 함께 단독 사용시에는 변수 앞/뒤 구분 안 함 : 결과는 동일함
		
		//증감연산자가 변수와 함께 다른 문장 또는 계산식의 일부로 사용될 경우
		//변수 앞/뒤 구분해야 함 : 계산 결과가 달라짐
		int result = num++;  //처리후 증가를 의미함
		//result = num;   num++;
		System.out.println("result : " + result);  //10
		System.out.println("num : " + num);  //11
		
		int result2 = ++result;  //선증가 후처리를 의미함
		//++result;   >  result2 = result;
		System.out.println("result : " + result);  //11
		System.out.println("result2 : " + result2);  //11
		
		System.out.println("result2++ : " + result2++); //11
		System.out.println("result2 : " + result2);  //12
		
		System.out.println("++result2 : " + ++result2);  //13
	}
	
	public void 형변환_연산자테스트() {
		byte b1 = Byte.MAX_VALUE;    //127
		short s1 = Short.MAX_VALUE;  //32767
		
		int result = b1 + s1;  //byte 와 short 의 연산 결과형은 int 다.
		short result2 = (short)(b1 + s1);  //overflow
		
		System.out.println("result : " + result);
		System.out.println("result2 : " + result2);
	}
	
	public void 비교연산자테스트() {
		int first = 100, second = 123;
		
		System.out.println("first > second : " + (first > second));  //false
		System.out.println("first < second : " + (first < second));  //true
		System.out.println("first > 0 : " + (first > 0));  //양수냐 : true
		System.out.println("first >= 100 : " + (first >= 100));  //100이상이냐(> or ==) : true
		System.out.println("second <= 200 : " + (first <= 200));  //200이하냐(< or ==) : true
		System.out.println("first == 100 : " + (first == 100));  //100이냐 : true
		System.out.println("first != 100 : " + (first != 100));  //100이 아니냐 : false
	}
	
	public void 일반논리연산자테스트() {
		//논리값(true, false)을 계산에 사용하는 연산자
		//&& : 11순위, || : 12순위
		System.out.println(true && true);  //true
		System.out.println(true && false);  //false
		System.out.println(false && true);  //false
		System.out.println(false && false);  //false
		
		System.out.println(true || true);  //true
		System.out.println(true || false);  //true
		System.out.println(false || true);  //true
		System.out.println(false || false);  //false
	}
	
	public void 일반논리연산자연습() {
		//&& : 제시한 모든 조건이 다 맞는지(true) 확인할 때
		//값의 범위를 확인하는 용도로 많이 쓰임
		
		//예 : 키보드로 정수를 하나 입력받아,
		//입력된 정수가 1부터 100사이의 값인지 확인 출력 처리함
		//1 <= 정수 <= 100
		//Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		//int num = sc.nextInt();
		int num = new Scanner(System.in).nextInt();
		
		System.out.println("값이 1~100사이의 값이냐 : " + 
		                        (num >= 1 && num <= 100));
	}
	
	public void isPositiveNumber() {
		//연습1 : 키보드로 정수를 하나 입력받아, 양수인지 확인하는 출력 구문 작성
		System.out.print("정수 하나 입력 : ");
		int num = new Scanner(System.in).nextInt();
		
		System.out.println(num + "은 양수냐? " + (num > 0));
	}
	
	public void isUppercase() {
		//연습2 : 
		//키보드로 문자 하나를 입력받아, 영문대문자인지 확인 출력
		//'A' <= 문자 <= 'Z' 또는 65 <= 문자 <= 91
		System.out.println("문자 하나 입력 : ");
		/* String value = new Scanner(System.in).next();
		 * char ch = value.charAt(0);
		 */
		char ch = new Scanner(System.in).next().charAt(0);
		
		System.out.println(ch + " is uppercase? " + (ch >= 'A' && ch <= 'Z'));
		System.out.println(ch + " is uppercase? " + (ch >= 65 && ch <= 91));
	}
	
	public void isYes() {
		//연습3 : 
		//문자 하나를 입력받아, 'Y' 또는 'y' 이냐에 대한 결과 출력
		System.out.println("문자 하나 입력 : ");
		char ch = new Scanner(System.in).next().charAt(0);
		
		System.out.println("yes or no? " + (ch == 'Y' || ch == 'y'));
	}
	
	public void isPass() {
		//연습4 : 
		//국어(kor), 영어(eng), 수학(mat) 3과목의 점수를 정수로 입력받아
		//총점(tot)과 평균(avg)을 계산하고
		//3과목의 점수가 각각 40점이상이고, 평균이 60점 이상이면 true,
		//아니면 false 가 출력되게 처리
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		int mat = sc.nextInt();
		
		int tot = kor + eng + mat;
		int avg = tot / 3;
		
		System.out.println("합격 ? " + (kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60));
	}
	
	//&&, || 연산자의 특징 확인
	//&& 는 앞이 거짓이면 뒤를 실행 안 함
	// true && true => true
	// true && false, false && true, false && false => false
	//|| 는 앞이 참이면 뒤를 실행 안 함
	// true || true, true || false, false || true => true
	// false || false => false
	public void 일반논리연산자특징확인() {
		int num = 10;
		
		System.out.println(false && ++num > 0);  //false
		System.out.println("num : " + num);  //10
		System.out.println(true || ++num > 0);  //true
		System.out.println("num : " + num);  //10
		
		System.out.println(false & ++num > 0);  //false
		System.out.println("num : " + num);  //11
		System.out.println(true | ++num > 0);  //true
		System.out.println("num : " + num);  //12
	}
	
	public void 삼항연산자테스트() {
		//첫번째 ? 두번째 : 세번째
		//첫번째는 조건식을 사용함 : 반드시 참 또는 거짓의 결과가 나오게 작성함
		//(조건식) ? 참일 때 사용할 값 : 거짓일 때 사용할 값
		
		//연습 : 정수를 하나 입력받아
		//     짝수이면 "짝수다" 라고 출력하고, 짝수가 아니면 "홀수다" 라고 출력 처리
		//짝수의 조건 : 2로 나눈 나머지가 0인 정수
		System.out.print("정수 하나 입력 : ");
		int num = new Scanner(System.in).nextInt();
		
		String result = (num % 2 == 0)? "짝수다" : "홀수다";
		System.out.println(num + "은 " + result);
		
		System.out.println(num + "은 " + ((num % 2 == 0)? "짝수다" : "홀수다"));
		
	}
	
	//삼항연산자 중첩 사용
	// 조건1 ? 값1 : (조건2 ? 값2 : (조건 3 ? 값3: 값4))
	public void 삼항연산자중첩사용() {
		//예 : 정수를 하나 입력받아, 양수이면 "양수다.", 0이면 "0이다", 둘 다 아니면 "음수다" 출력
		System.out.print("정수 하나 입력 : ");
		int num = new Scanner(System.in).nextInt();
		
		String result = (num > 0)? "양수다." : ((num == 0)? "0이다." : "음수다.");
		System.out.println(num + "은 " + result);
	}
	
	public void 삼항연산자중첩사용2() {
		//연습 : 
		//문자를 하나 입력받아서
		//영어대문자이면 "upper", 소문자이면 "lower", 숫자문자이면 "digit", 그외 문자는 "etc" 출력
		System.out.print("문자 하나 입력 : ");
		char ch = new Scanner(System.in).next().charAt(0);
		
		String result = (ch >= 'A' && ch <= 'Z')? "upper" : 
					 ((ch >= 'a' && ch <= 'z')? "lower" : 
						 ((ch >= '0' && ch <= '9')? "digit" : "etc"));
		System.out.println(ch + " is a " + result);
	}
	
	public void printScoreGrade() {
		//연습 : 
		//점수(score : int)를 입력받아
		//점수가 90점 이상이면 'A', 80점이상 90점 미만이면 'B', 70점이상 80점 미만이면 'C',
		//60점 이상 70점 미만이면 'D', 60점 미만이면 'F' 를 문자변수(grade : char)에 기록하고
		//점수와 등급을 출력 처리함
		System.out.print("점수 : ");
		int score = new Scanner(System.in).nextInt();
		
		char grade = (score >= 90)? 'A': 
					((score >= 80 /*&& score < 90*/)? 'B': 
					((score >= 70 /*&& score < 80*/)? 'C': 
					((score >= 60 /*&& score < 70*/)? 'D': 'F')));
		
		System.out.println("점수 : " + score + ", 등급 : " + grade);
	}
	
	public void isPass2() {
		//연습 : 
		//국어(kor), 영어(eng), 수학(mat) 3과목의 점수를 정수로 입력받아
		//총점(tot)과 평균(avg)을 계산하고
		//3과목의 점수가 각각 40점이상이고, 평균이 60점 이상이면 "합격" 출력,
		//아니면 "불합격" 출력되게 처리
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		int mat = sc.nextInt();
		
		int tot = kor + eng + mat;
		int avg = tot / 3;
		
		String result = (kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60)? "합격" : "불합격";
		System.out.println("결과 : " + result);
	}
	
	public void printGender() {
		//연습 : 
		//키보드로 주민등록번호를 입력받아, 8번째 자리 문자를 추출해서
		//'1' 또는 '3' 이면 "남자", '2' 또는 '4' 이면 "여자" 로 출력
		//'5' 이면 "해외교포(남)", '6'이면 "해외교포(여)" 라고 출력
		//그 외 다른 값이면 "잘못된 주민번호입니다." 출력
		//입력 예 : 
		//주민등록번호 : 771225-1234567
		//출력 예 : 당신은 남자입니다.
		System.out.print("주민등록번호 : ");
		String personID = new Scanner(System.in).next();
		
		char no = personID.charAt(7);
		String result = (no == '1' || no == '3')? "남자" : 
					 ((no == '2' || no == '4')? "여자" : 
					 ((no == '5')? "해외교포(남자)" : 
					 ((no == '6')? "해외교포(여자)" : "잘못된 주민번호")));
		
		System.out.println("당신은 " + result + "입니다.");
	}
}
















