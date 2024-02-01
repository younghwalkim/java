package chapter15.serialization;

import java.io.*;

@SuppressWarnings("serial")
class Person2 implements Serializable {	
	// 필드
	String name;
	String job;
	transient String passwd;	
	
	// 생성자
	public Person2() {}

	public Person2(String name, String job, String passwd) {
		this.name = name;
		this.job = job;
		this.job = passwd;		
	}
	
	// 출력
	public String toString()
	{
		return name + ", " + job + ", " + passwd ;
	}
}

public class SerializationTest {

	public static void main(String[] args) {
		
		new SerializationTest().saveFile();
		new SerializationTest().readFile();
		
	}
	
	public void saveFile() {

		Person2 personLee = new Person2("안재용", "회장님","pw1234");
		Person2 personAhn = new Person2("김철수", "대표이사", "pw1111");
		
		// 파일에 내용 저장
		try (	ObjectOutputStream objOut 
					= new ObjectOutputStream( new FileOutputStream("serial.out") ); ) {
			
			objOut.writeObject(personLee);
			objOut.writeObject(personAhn);
			
		} catch (Exception e) {
			e.printStackTrace();
		} 

	}
	
	public void readFile() {
 		
		// 파일내용 가져오기
		try( ObjectInputStream objIn 
					= new ObjectInputStream( new FileInputStream("serial.out") ); )  {

			Person2 p1 = (Person2)objIn.readObject();
			Person2 p2 = (Person2)objIn.readObject();
			
			System.out.println(p1);
			System.out.println(p2);

		} catch (FileNotFoundException e) {
			System.err.println( e.getMessage() );
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}