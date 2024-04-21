package chapter15.writer_reader;

import java.io.*;

public class FileReaderTest {

	public static void main(String[] args) {

		// FileWriter 로 파일 writer.txt 생성 : write, output
		new FileReaderTest().fileWriter();
		
		// 파일로 읽어오고, 출력 : read. input
		new FileReaderTest().fileReader();		
	}
	
	public void fileWriter() {
		// FileWriter 로 파일 writer.txt 생성	
		try( FileWriter fileWrite = new FileWriter("writer.txt");)	
		{

			char[] buf = new char[]{'B','C','D','E','F','G'};	
			
			// fileWrite
			fileWrite.write(buf); 			//문자 배열 출력			
			fileWrite.write(buf, 1, 2); 	//문자 배열의 일부 출력			
			fileWrite.write('A');    		// 문자 하나 			
			fileWrite.write("안녕하세요. 잘 써지네요"); //String 출력			
			fileWrite.write("65");  		//숫자를 그대로 출력	
			System.out.println("writer.txt 파일 생성되었습니다.");	
			System.out.println();			

		}catch (Exception e) {
			e.printStackTrace();
		}	

	}
	
	public void fileReader() {
		// 1. FileReader : 1자씩 읽어들임, 한글정상
		// 2. FileInputStream : 1자씩 읽어들임, 한글깨짐	
		// 3. (보조스트림 활용) InputStreamReader + FileInputStream : 1자씩 읽어들임, 한글정상
		// 4. (보조스트림 활용) BufferedInputStream+ FileInputStream : 1자씩 읽어들임, 한글깨짐
		// 5. (보조스트림 활용) DataInputStream & DataInputStream + FileInputStream & FileInputStream 
		//	  :  셋트로 이용, 같은 자료형태로 data.txt 쓰고 data.txt 읽고 출력.
		try( FileReader fileRead = new FileReader("writer.txt");
				FileInputStream fileInputSt =  new FileInputStream("writer.txt");
					InputStreamReader  inputStRead = new InputStreamReader(new FileInputStream("writer.txt") );
						BufferedInputStream bufferInputSt = new BufferedInputStream( new FileInputStream("writer.txt") );		
							DataOutputStream dataOut = new DataOutputStream( new FileOutputStream("data.txt") );
							DataInputStream dataIn = new DataInputStream( new FileInputStream("data.txt") );	 )
		{
			
			// 경과시간 
			long millisecond = 0;
			millisecond = System.currentTimeMillis();
			
 			int readStr;
 			
			// FileReader
			while( (readStr = fileRead.read()) != -1){
				System.out.print( readStr + ", ");
				System.out.print( (char)readStr + " | ");
			}
			System.out.println("end");			
			System.out.println();
			
			// FileInputStream
			while ( (readStr = fileInputSt.read()) != -1){
				System.out.print( readStr + ", ");
				System.out.print( (char)readStr + " | " );				
			}
			System.out.println("end");			
			System.out.println();
			
			// InputStreamReader
			while ( (readStr = inputStRead.read()) != -1){
				System.out.print( readStr + ", ");
				System.out.print( (char)readStr + " | " );				
			}
			System.out.println("end");			
			System.out.println();
			
			// BufferedInputStream
			while( ( readStr = bufferInputSt.read()) != -1){
				System.out.print( readStr + ", ");
				System.out.print( (char)readStr + " | " );				
			}
			System.out.println("end");			
			System.out.println();			
			
			// DataInputStream & DataInputStream - 같은 자료형태로 data.txt 쓰고 data.txt 읽고 출력.
			// 파일에 쓰기(저장)
			dataOut.writeByte(100);
			dataOut.writeChar('A');
			dataOut.writeInt(10);
			dataOut.writeFloat(3.14f);
			dataOut.writeUTF("Test");

			// 파일로 부터 읽기
			System.out.println("writeByte : "+ dataIn.readByte());
			System.out.println("writeChar : "+ dataIn.readChar());
			System.out.println("writeInt : "+ dataIn.readInt());
			System.out.println("writeFloat : "+ dataIn.readFloat());
			System.out.println("writeUTF : "+ dataIn.readUTF());	
			System.out.println("end");			
			System.out.println();	
			
			// 경과시간 구하기
			millisecond = System.currentTimeMillis() - millisecond;
			
			// 경과시간 출력
			System.out.println("처리하는데 " + millisecond + " milliseconds 소요되었습니다.");						
			
		}catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}catch (Exception e) {
			e.printStackTrace();
		}	
	}	
}
