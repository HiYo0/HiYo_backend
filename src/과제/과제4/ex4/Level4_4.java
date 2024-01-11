package 과제.과제4.ex4;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level4_4 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level4_4 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);

		String[] X_AXIS = new String[5];
		int x = 0;
		X_AXIS[ x ] = "★";

		while ( true ) {
			/* 문제풀이 위치 */
			for (int i = 0; i < X_AXIS.length; i++) { // 출력하기
				System.out.print(X_AXIS[i]+"  ");
			}//for end
			System.out.println("");
			System.out.print("1.전진 2.후진 3.종료 선택> ");String a= scanner.nextLine();
			if (a.equals("1")){//전진
				x++; // 이거슨 별의위치
				if(x<X_AXIS.length) {
					for (int i = 0; i < X_AXIS.length; i++) {
						if (X_AXIS[i] != null) {
							X_AXIS[i] = null;
						}//null 아닌친구를 null로 바꿈
					}//for end
				}else {
					x--;
					System.out.println("\n별이 최대치로 이동됨\n");
				}
				X_AXIS[x]="★";

			} else if (a.equals("2")) {//후진
				x--;
				if(x>=0){// 0 보다 크거나 같으면 실행
					for (int i = 0; i < X_AXIS.length; i++) {
						if (X_AXIS[i] != null) {
							X_AXIS[i] = null;
						}//null 아닌친구를 null로 바꿈
					}//for end
					
				}else {
					x++;
					System.out.println("\n별이 최소치로 이동됨\n");
				}
				X_AXIS[x]="★";


			} else if (a.equals("3")) {
				System.out.println("\n프로그램 종료.\n");
				break;
			}else {
				System.out.println("\n잘못 입력하셧습니다.\n");
			}
			
			/* ----------- */
		}
	}
}
/* 
	[문제]
		1. String[] X_AXIS = new String[5]; : 문자열 배열 입니다.

		2. 기능선택
			1 입력시 별이 왼쪽으로 이동
			2 입력시 별이 오른쪽으로 이동
			- 만일 배열의 길이보다 벗어나면 최소 또는 최대 위치로 지정하시오.

		3. 그림과 배열의 항목/요소 들을 모두 출력하시오.

		4. 아래 변수들을 활용하시오.
			String[] X_AXIS = new String[5];
			int x = 0;
			X_AXIS[ x ] = "★";
*/
