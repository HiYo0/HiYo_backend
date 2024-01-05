package day04;

import java.util.Scanner;

public class Step3_while {// class start

    public static void main(String[] args) { // main tart

        // 입력객체 생성 : import java.util.Scanner;
        Scanner scanner = new Scanner(System.in);

        boolean run = true; // 무한루프의 상태를 저장하고 있는 변수 [ on / off ]

        int speed = 0;

        while ( run ){ // 무한루프 시작
            // ================= 무한 반복 출력 ================= //
            System.out.println("-----------------------");
            System.out.println("1. 증속(speed증가) | 2. 감속(speed감소) | 3. 중지(무한루프중지) ");   // 메뉴판.!!!
            System.out.println("-----------------------");
            System.out.print("선택 : ");
            // ================= ================= ================= //
            String strNum = scanner.nextLine(); // 엔터를 입력할때까지 console이 '대기'상태로 됨.
            // ================= ================= ================= //
            // ================= 입력값에 따른 경우의수 판단 ================= //
            if( strNum.equals("1")){ // 만약 입력받은 값(문자열) 문자 1이면 [ 문자 비교시에는 equals() ]
                speed++;
            } else if (strNum.equals("2")) { // 막약에 입력받은 값이 문자 2이면 [감소]
                speed--;
            } else if (strNum.equals("3")) { // 막약에 입력받은 값이 문자 3이면 [중지]
                // 1. while문으로 다시 이동해서 조건비교 -> 반복문 끝으로 이동함
                run=false;

                // 2. 가장 가까운 반복문 {  } 나가기 -> 반복문 끝으로
                // break; // 가장 가까운 반복문 탈출 키워드;

                // 3. 함수 {  } 나가기 -> main end 이후로 나감
                // return; // 현재 함수 종료.

            }// if end
            System.out.println("현재 속도 = "+speed);
        }// 무한루프 끝


    }// main end

}// class end
/*
    무한루프 = 무한반복
        1.
            while( true ){ }
        2.
            boolean run = true;
            while (run){  }
*/