package chapter09;

import java.util.ArrayList;

public class CarTest {

	public static void main(String[] args) {

		// 배열 생성 - import java.util.ArrayList; 활용
		ArrayList<Car> carList = new ArrayList<Car>();
		
		// 객체 생성
		carList.add(new Sonata());			
		carList.add(new Grandeur());
		carList.add(new Avante());
		carList.add(new Genesis());
		
		// 출력
		for(Car car : carList) {
			car.run();
			System.out.println("======================");
		}
		
	}
}