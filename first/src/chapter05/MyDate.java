package chapter05;

import java.util.Calendar;

public class MyDate {

	// 필드
	private int day;
	private int month;
	private int year;
	private boolean isValid = true;
	
	// 생성자
	public MyDate(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}

	// getter & setter
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:	// 31일까지 있는 달
				if (day <0 || day >31)		isValid = false;
				else 								this.day = day;				
				break;
			case 4: case 6: case 9: case 11:	// 30일까지 있는 달
				if (day <0 || day >30)		isValid = false;
				else 								this.day = day;
				break;
			case 2:
				if (( ( year % 4 ==0 &&  year % 100 !=0 ) || year % 400 ==0))  // 2월
					if (day <0 || day >29) 		isValid = false;
					else 								this.day = day;				
				else 
					if (day <0 || day >28) 		isValid = false;					 
					else 								this.day = day;				
				break;
			default:
				isValid = false;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if( month <1 || month >12) {
			// 월 유효성 검사
			isValid = false;
		}
		else {
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		// System.out.println(year +", "+ Calendar.getInstance().get(Calendar.YEAR) );
		if ( year > Calendar.getInstance().get(Calendar.YEAR) ) {
			// 년도 검사 - 현재기준 미래는 유효하지 않도록 처리
			isValid = false;
		}
		else {
			this.year = year;
		}
	}
	
	//  메소드
	public String isValid() {
		
		if(isValid) {
			return "유효한 날짜입니다.";
		}
		else {
			return "유효하지 않은 날짜입니다.";
		}
	}
}