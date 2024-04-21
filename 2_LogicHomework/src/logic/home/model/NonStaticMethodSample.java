package logic.home.model;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class NonStaticMethodSample {
	
	public void testScanner() {
		boolean b;
		char ch;
		byte bnum;
		short snum;
		int inum;
		long lnum;
		float fnum;
		double dnum;

		Scanner sc = new Scanner(System.in);

		System.out.print("boolean 값 입력 : ");
		b = sc.nextBoolean();

		System.out.print("char 값 입력 : ");
		ch = sc.next().charAt(0);

		System.out.print("byte 값 입력 : ");
		bnum = sc.nextByte();

		System.out.print("short 값 입력 : ");
		snum = sc.nextShort();

		System.out.print("int 값 입력 : ");
		inum = sc.nextInt();

		System.out.print("long 값 입력 : ");
		lnum = sc.nextLong();

		System.out.print("float 값 입력 : ");
		fnum = sc.nextFloat();

		System.out.print("double 값 입력 : ");
		dnum = sc.nextDouble();

		System.out.println("boolean : " + b);
		System.out.println("char : " + ch);
		System.out.println("byte : " + bnum);
		System.out.println("short : " + snum);
		System.out.println("int : " + inum);
		System.out.println("long : " + lnum);
		System.out.println("float : " + fnum);
		System.out.println("double : " + dnum);

	}
	
	//과제 15 - 2
	public void testDate() {
		Date today = new Date();
		System.out.println(today);		
	}
	
	//과제 15 - 3
	public void testRandom() {
		Random r = new Random();
		System.out.println("정수의 난수 : " + r.nextInt());
		System.out.println("실수의 난수 : " + r.nextDouble());
	}
}
