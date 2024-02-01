package chapter06.q5;

public class StarCoffee {
	// 필드
	int money;
	
	// 메소드
	public String brewing(int money) {
	
		this.money += money;
		if(money == Menu.STARAMERICANO) {			// 3. Menu.java
			return "별 다방 아메리카노를 구입했습니다";
		}
		else if(money == Menu.STARLATTE) {				// 3. Menu.java
			return "별 다방 라떼를 구입했습니다";
		}
		else {
			return null;
		}
	}
}