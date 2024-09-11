package CH01;

public class C01SystemOut {

	public static void main(String[] args) {
		//System : OS
		//System.out : OS가 관리하는 표준 출력 스트림
		
		//System.out.print()
		//ESCAPE 문자: 
		// \n : 줄바꿈
		// \b : 백스페이스
		// \t : 탭길이(기본 8칸) 만큼 이동
		
//		System.out.print("HELLO WORLD\n");
//		System.out.print("HELLO WORLD\n");
//		System.out.print("HELLO WORLD\n");
//		System.out.print("HELLO\t WORLD\n");
		
		//서식문자 
		System.out.printf("%d %d %d \n", 10, 20, 30);
		System.out.printf("%f %f %f \n", 10.1, 20.1, 30.1);
		System.out.printf("%c %c %c \n", 'A', 'B', 'C');
		System.out.printf("%s %s %s \n", "This is", "String", "Test");
		System.out.printf("%d. %s : %d\n", 1, " 국어" , 100);
		
		System.out.println("HELLO WORLD");
		System.out.println("HELLO WORLD");
		System.out.println("HELLO WORLD");
		System.out.println("HELLO WORLD");
		
		
		// '' : 단일문자 / "" : 문자열
		//문자열 앞에 특수기호 넣을시 앞에 \ 입력
		System.out.println("I SAY \"HELLO\"");
	}

}
