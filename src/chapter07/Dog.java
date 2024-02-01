package chapter07;

public class Dog {
	// 필드
	private String name;
	private String type;
	
	// 생성자
	public Dog(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	// setter & getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	// 출력
	public String showDogInfo() {
		return name + ", " + type;
	}
}