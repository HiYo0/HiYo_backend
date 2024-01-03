package 과제.과제1.ex3;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level1_3 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_3 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);
		/* 문제풀이 위치 */
		System.out.print("input boolean : ");
		boolean bool = scanner.nextBoolean();

		System.out.print("input byte : ");
		byte b = scanner.nextByte();

		System.out.print("input char : ");
		char c = scanner.next().charAt(0);/* 인댁스 */

		System.out.print("input short : ");
		short s = scanner.nextShort();

		System.out.print("input int : ");
		int i = scanner.nextInt();

		System.out.print("input long : ");
		long l = scanner.nextLong();

		System.out.print("input float : ");
		float f = scanner.nextFloat();

		System.out.print("input double : ");
		double d = scanner.nextDouble();

//		System.out.println("boolean : " + bool);
//		System.out.println("byte : " + b);
//		System.out.println("char : " + c);
//		System.out.println("short : " + s);
//		System.out.println("int : " + i);
//		System.out.println("long : " + l);
//		System.out.println("float : " + f);
//		System.out.println("double : " + d);





		System.out.print("output boolean : " + bool + "\n");
		System.out.print("output boolean : " + b + "\n");
		System.out.print("output boolean : " + c + "\n");
		System.out.print("output boolean : " + s + "\n");
		System.out.print("output boolean : " + i + "\n");
		System.out.print("output boolean : " + l + "\n");
		System.out.print("output boolean : " + f + "\n");
		System.out.print("output boolean : " + d + "\n");



		/* ----------- */
	}
}
/* 
	[문제] 그림과 같이 기본자료형을 이용하여 변수 8개를 출력하시오.
	[조건] 
		1. 모든 기본자료형 8개 사용
		2. print() 메소드 사용
		3. scanner 객체 사용하여 입력받기
*/
