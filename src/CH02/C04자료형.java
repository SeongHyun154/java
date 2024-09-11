package CH02;

public class C04자료형 {

	public static void main(String[] args) {
		
		// 정수 int - 4byte 정수 부호o
		
//		int n1 = 0b10101101; //2진수
//		int n2 = 173;  // 10진정수값
//		int n3 = 0255; // 8진수
//		int n4 = 0xad; // 16진수
//		System.out.printf("%d %d %d %d\n", n1,n2,n3,n4);
		
		// 정수 byte - 1byte 정수 부호 o
		
//		byte n5 = (byte)-129;
//		byte n6 = -30;
//		byte n7 = 30;
//		byte n8 = 127;
//		//byte n9 = 129;  // int -> byte 로 넣어서 컴파일 오류
//		System.out.printf("%d\n", n5);
//		System.out.println(0b10101101);
//		System.out.println(Integer.toBinaryString(-129));
		
		//정수 short-2byte정수 부호o | char-2byte정수 부호x(양수만)
		
//		char n1 = 65535; //(0~2^16-1) (0~65,535)
//		short n2 = 32767; // (-2^15 ~ +2^15-1)(-32,768 ~ + 32,767)
//		
//		char n3 = 60000;
//		short n4 = n3; // 
//		
//		System.out.printf("%d\n",n4);
		
		//정수 long-8byte 정수 부호o
//		long n1 = 10;
//		long n2 = 20; //L,1 (리터럴 접미사) : long 자료형 사용하여 값 저장
//		
//		long n3 = 10000000000L;
//		long n4 = 10000000000L;
		
		
		//실수 
		//유리수와 무리수의 통칭
		//소수점 이하값을 가지는 수 123.456
		//float : 4byte 실수(6-9자리) -> 작업 시, 올림처리
		//double : 8byte 실수(15-18자리), 기본 자료형
		
		//정밀도 확인
		
//		float n1 = 0.123456789123456789F; //f,F: float형 접미사 
//		double n2 = 0.123456789123456789;
//		
//		System.out.println(n1);
//		System.out.println(n2);
		
		//단일문자 char 2byte 정수
		
//		char ch1 = 'a';
//		System.out.println(ch1);
//		System.out.println((int)ch1); //011000001
//		
//		char ch2 = 98;
//		System.out.println(ch2);
//		System.out.println((int)ch2); //011000010
//		
//		char ch3 = 'b'+1;
//		System.out.println(ch3);
//		System.out.println((int)ch3); //011000011
//		
//		int ch4 = 'c'+2;
//		System.out.println((char)ch4);
//		System.out.println(ch4); // 011000011
//		
//		
//		char ch5 = 0xac00;
//		char ch6 = 44065;
//		System.out.println(ch5);
//		System.out.println(ch6);
//		System.out.println((char)0b00001111);
//		
//		System.out.printf("%c \n",'\uac00');
		
		//boolean : 논리형(true/false 저장)
		
//		boolean flag = (10>11);  //참(긍정
//		if(flag) 
//		{
//			System.out.println("참인경우 실행");
//		}else 
//		{
//			System.out.println("거짓인경우 실행");
//		}
//		System.out.println();
		
		//문자열 String
		//클래스 자료형
		//클래스 자료형으로 만든변수는 '참조변수'라고 하고
		//참조변수는 데이터가 저장된 위치정보(메모리주소값)이 저장된다.
		int n1 = 10;
		
		
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		}
	}


