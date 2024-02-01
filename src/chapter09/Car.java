package chapter09;

public abstract class Car {
	
	// 필드
	public abstract void start();		// 시동 온  	> 메소드 작성 필요
	public abstract void drive();		// 주행  			> 메소드 작성 필요
	public abstract void stop();		// 정지  			> 메소드 작성 필요
	public abstract void turnOff();	// 시동 오프  	> 메소드 작성 필요
	
	// 세차 메소드
	public void washCar()
	{
		System.out.println("세차를 합니다.");
	}

	// 운행 메소드
	public void run()
	{
		start();
		drive();
		stop();
		turnOff();
		washCar();
	}
	
}

