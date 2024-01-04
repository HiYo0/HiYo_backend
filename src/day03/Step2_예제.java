package day03;

import java.util.Scanner;

public class Step2_예제 {
    public static void main(String[] args) {
        // 객체 사용이유 : 미리 설계(Scanner입력관련)된 메소드를 쓸려고.
        Scanner scanner = new Scanner(System.in);

        /*
        // 예제1 : 작성자 , 내용 , 날짜 3가지를 입력받아 출력
            // 1. 입력 , 변수
        System.out.print("작성자 : ");       String writer = scanner.next();
        System.out.print("내용 : ");         String event = scanner.next();
        System.out.print("날짜 : ");         String date = scanner.next();

            // 2-1. 입력받은 데이터 출력
        System.out.printf("============================ 방목록 ============================\n");
        System.out.printf("%4s %10s %20s %10s","번호","작성자","내용","날짜"+"\n");
        System.out.printf("%5s %10s %20s %10s", 1 , writer , event , date+"\n");

            // 2-2. 입력받은 데이터 출력
        System.out.println("============================ 방목록 ============================");
        System.out.println("번호 | 작성자 \t\t| 내용 \t\t | 날짜");
        System.out.println(01+" | "+writer+"\t\t"+event+"\t\t|"+date);
*/

        // 예제2 : 기본급 과 수당 정수로 입력받아 실수령액 계산해서 출력
            // 실수령액 : 기본급 + 수당 - 세금[기본급10%]
            // 1. 입력
        System.out.println("기본급 : "); int 기본급 = scanner.nextInt();
        System.out.println("수당 : ");    int 수당 = scanner.nextInt();
            // 2. 처리
        int 실수령액 = 기본급 + 수당 - (int)(기본급*0.1);    // % : 나머지 연산자
            // 오류가 나는 이유 : 값이 double이기때문
                // 0.1 double형 이므로 int * double 의 결과는 double
                // 그래서 double을 int 에 대입할수 없다-> 강제 캐스팅. (int)

            // 3. 출력
        System.out.println("실수령액 = "+실수령액);



    }
}
