package chapter15.serialization;

import java.io.*;

@SuppressWarnings("serial")
class Dog implements Serializable{

	String name;
	
	public Dog() {}	
	
	public String toString() {
		return name;
	}
}

public class Externalizable {

	public static void main(String[] args) {

		// 레퍼런스 생성 및 객체 초기화
		Dog myDog = new Dog();
		
		// 객체생성
		myDog.name = "심쿵";
		
		try (ObjectOutputStream objOut 
					= new ObjectOutputStream( new FileOutputStream("external.out") ); 
				ObjectInputStream objIn 
					= new ObjectInputStream( new FileInputStream("external.out") );) {
			
			// 파일에 저장
			objOut.writeObject(myDog);
			
			// 파일로부터 읽어오기
			Dog dog = (Dog)objIn.readObject();
			
			// 출력
			System.out.println(dog);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}