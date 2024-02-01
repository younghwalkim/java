package chapter06.q5;

public class CoffeeTest {

	public static void main(String[] args) {

		// 레퍼런스 생성
		Person kim = new Person("Kim", 10000);		// 1. Person.java 
		StarCoffee starCoffee = new StarCoffee();		// 2-1. StarCoffee.java
		BeanCoffee beanCoffee = new BeanCoffee(); 	// 2-2. BeanCoffee.java
		
		// 객체 생성
		kim.buyStarCoffee(starCoffee, 4000);  	//  1. Person.java 
		kim.buyBeanCoffee(beanCoffee, 4500);
		
		// StarCoffee  -> Person(buyStarCoffee) 
		// -> Menu  -> 

	}
}