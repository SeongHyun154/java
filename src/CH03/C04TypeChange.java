package CH03;

public class C04TypeChange {

	public static void main(String[] args) {
//		//정수 연산식 (int 보다 작은 변수자료형(short, char, byte)
//		//
//		byte x =10; 
//		byte y =20;
//		short z = 30;
//		char u = 40;
//		int result1 = x + y;
//		
////		int result = x + y;
//		System.out.println(result1);
		
		//정수 연산식(int 보다 큰 변수자료형(long))
		
//		byte var1 = 10;
//		int var2 = 100;
//		long var3 = 1000L;
//		long result = var1 +var2 + var3;
//		
//		long result2 = var1 + var2+ var3;
//		System.out.println(result2);
		
		//실수 연산식
		//큰 타입으로 자동 형 변환
		int intvar =10;
		float flvar = 3.3F;
		double dbvar = 5.5;
		double result3 = intvar + flvar + dbvar;
		double result4 = intvar + flvar + dbvar;
		System.out.println(result3);

	}

}
