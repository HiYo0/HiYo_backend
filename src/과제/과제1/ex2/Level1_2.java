package 과제.과제1.ex2;

import java.time.LocalDateTime;

public class Level1_2 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_2 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		System.out.printf("%-10s   %15s   %30s\n" , "type" , "value" , "range" );
		System.out.println("-------------------------------------------------------------");
		/* 문제풀이 위치 */
		boolean boolean1 = true;
		System.out.printf("%-10s   %15s   %30s\n" , "boolean" , boolean1 , "true or false");

		byte byte1 = 10;
		System.out.printf("%-10s   %15s   %30s\n" , "byte1" , byte1 , "-128 ~ 127");

		char char1 = 'A';
		System.out.printf("%-10s   %15s   %30s\n" , "char" , char1 , "0~65535[ character 1 ]");

		short short1 = 30000;
		System.out.printf("%-10s   %15s   %30s\n" , "short" , short1 , "-32768 ~ 32767");

		int int1 = 2000000000;
		System.out.printf("%-10s   %15s   %30s\n" , "int" , int1 , "-+2000 million");

		long long1 = 40000000000L;
		System.out.printf("%-10s   %15s   %30s\n" , "long" , long1 , "-+2000 million Excess");

		float float1 = 3.1231232F;
		System.out.printf("%-10s   %15s   %30s\n" , "float" , float1 , "8 decimal places");

		double double1 = 3.123123123;
		System.out.printf("%-10s   %15s   %30s\n" , "double" , double1 , "17 decimal places");
		/* ----------- */
	}
}
/* 
	[문제] 그림과 같이 기본자료형을 이용하여 변수 8개 선언하고 임의값을 대입하여 출력하시오.
	[조건] 
		1. 모든 기본자료형 8개 사용
		2. printf() 메소드 사용
*/
