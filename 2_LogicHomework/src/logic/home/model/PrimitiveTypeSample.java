package logic.home.model;

public class PrimitiveTypeSample {
	//기본자료형(Primitive Type) 8개 : 
	//boolean, byte, short, int, long, float, double, char
	//java.lang 에 기본자료형에 대한 클래스들이 제공됨 : 래퍼(Wrapper) 클래스라고 함
	//Boolean, Byte, Short, Integer, Long, Float, Double, Character
	//기본자료형의 메모리 할당크기, 비트수, 최대값, 최소값 등을 상수필드(public static final)로 제공함
	//기본자료형 값 => 객체로 바꿀 때(boxing), 객체 => 기본자료형 값으로 되돌릴 때(unboxing) 사용함
	
	public void typeSize() {
		// 기본자료형 메모리 할당크기 확인하기
		System.out.println("boolean : 1 byte");
		System.out.println("char : " + Character.BYTES);
		System.out.println("byte : " + Byte.BYTES);
		System.out.println("short : " + Short.BYTES);
		System.out.println("int : " + Integer.BYTES);
		System.out.println("long : " + Long.BYTES);
		System.out.println("float : " + Float.BYTES);
		System.out.println("double : " + Double.BYTES);
	}

	public void minMaxValue() {
		// 기본자료형 값의 최소값, 최대값 출력하기
		System.out.println("char 자료형 최대값: " + Character.MAX_CODE_POINT);
		System.out.println("char 자료형 최소값: " + Character.MIN_CODE_POINT);
		System.out.println("byte 자료형 최대값: " + Byte.MAX_VALUE);
		System.out.println("byte 자료형 최소값:" + Byte.MIN_VALUE);
		System.out.println("short 자료형 최대값: " + Short.MAX_VALUE);
		System.out.println("short 자료형 최소값:" + Short.MIN_VALUE);
		System.out.println("int 자료형 최대값: " + Integer.MAX_VALUE);
		System.out.println("int 자료형 최소값:" + Integer.MIN_VALUE);
		System.out.println("long 자료형 최대값: " + Long.MAX_VALUE);
		System.out.println("long 자료형 최소값:" + Long.MIN_VALUE);
		System.out.println("float 자료형 최대값: " + Float.MAX_VALUE);
		System.out.println("float 자료형 최소값:" + Float.MIN_VALUE);
		System.out.println("double 자료형 최대값: " + Double.MAX_VALUE);
		System.out.println("double 자료형 최소값:" + Double.MIN_VALUE);
	}

	public void bitSize() {
		// 기본자료형 비트갯수 확인하기
		System.out.println("char 비트갯수: " + Character.SIZE);
		System.out.println("byte 비트갯수: " + Byte.SIZE);
		System.out.println("short 비트갯수: " + Short.SIZE);
		System.out.println("int 비트갯수: " + Integer.SIZE);
		System.out.println("long 비트갯수: " + Long.SIZE);
		System.out.println("float 비트갯수: " + Float.SIZE);
		System.out.println("double 비트갯수: " + Double.SIZE);
	}

}
