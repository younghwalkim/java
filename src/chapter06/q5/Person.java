package chapter06.q5;

public class Person {
	// 필드
	String name;
	int money;
	
	// 생성자
	Person(String name, int money ){
		this.name = name;
		this.money = money;
	}
	
	// 메소드
	public void buyStarCoffee(StarCoffee sCoffee, int money) {		// 	2-1. StarCoffee.java
		
		String message = sCoffee.brewing(4000);		
		if(message != null) {
			this.money -= money;
			System.out.println(name + "님 금액 " + money +"원 "  + message);
		}
	}
	
	// 메소드
	public void buyBeanCoffee(BeanCoffee bCoffee, int money) {	// 2-1.  BeanCoffee.java
		String message = bCoffee.brewing(4500);
		if(message != null) {
			this.money -= money;
			System.out.println(name + "님 금액 " + money +"원 "  + message);
		}
	}
}