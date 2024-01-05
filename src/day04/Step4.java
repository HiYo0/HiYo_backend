package day04;

import java.awt.*;
import java.util.Scanner;

public class Step4 {//class start

    public static void main(String[] args) {//main start
        Scanner scanner = new Scanner(System.in);
        int 입력금액 = 0;
        int 금액 = 0;
        while (true){// while start
            System.out.println("------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("------------------------------");
            System.out.print("번호를 입력해주세요 : ");
            int 입력값 = scanner.nextInt();

            if(입력값 == 1){
                System.out.print("예금하실 금액을 입력해주세요 : ");입력금액 = scanner.nextInt();
                금액 += 입력금액;
                System.out.println("잔액은 "+금액+" 원 입니다."+"\n");
            } else if (입력값 == 2) {
                System.out.print("출금하실 금액을 입력해주세요 : ");입력금액 = scanner.nextInt();
                금액 -= 입력금액;
                System.out.println("잔액은 "+금액+" 원 입니다."+"\n");
            } else if (입력값==3) {
                System.out.println("잔액은 "+금액+" 원 입니다."+"\n");
            } else if (입력값==4) {
                System.out.println("프로그램 종료");
                break;
            }

        } // while end

    }//main end
}//class end
/*
    은행 프로그램 규현
        [ 요구사항 설계 ]
        1. 반복적으로 가능 사용 [ 단x 종료 가능 선택시 종료 ]
        2. 기능 : 예금 , 출금 , 잔고 , 종료
            예금 : 더하기 작업
                금액 에서 예금액을 입력받아 금액에 더한다
            출금 : 빼기 작업
                금액 에서 출금액을 입력받아 금액에서 빼기한다
            잔고 : 확인 작업
                금액의 값을 출력한다
            종료 : 프로그램을 끝내는 작업
                무한루프를 탈출한다. 1.스위치변수 2.break 3.return

        3. 데이터 설계
            금액 : 예금 , 출금 했을때 누적으로 저장.
        [ 구현순서 ]
*/