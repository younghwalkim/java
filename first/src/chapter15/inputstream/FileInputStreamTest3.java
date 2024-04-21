package chapter15.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		 		
		try (FileInputStream fileInputSt = new FileInputStream("input2.txt")){
			
			// char, int, String 배열을 안됨
			byte[] bs = new byte[10];
			
			int readStr;
			
			// 배열에 담아 출력
//			while ( (readStr = fileInputSt.read(bs)) != -1){
//				for(int k= 0; k< readStr ; k++){
//					System.out.print(bs[k] + ", ");					
//					System.out.print( (char)bs[k] + " | ");				
//				}
//				System.out.println(" : " + readStr + "개씩 담김" );		
//			}			
//			System.out.println("end");			
//			System.out.println();

			// 배열에 담기를 통제함
			while ( (readStr = fileInputSt.read(bs, 0, 10)) != -1){

				for(int k= 0; k<readStr; k++){
					System.out.print(bs[k] + ", ");					
					System.out.print( (char)bs[k] + " | ");	
				}
				System.out.println(" : " + readStr + "개씩 담김" );
			}
			System.out.println("end");			
			System.out.println();			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}