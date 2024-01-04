package day03;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Step5_문제7개 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


/*

        // 문제1 : 점수를 입력받아 점수가 90점 이상이면 '합격' 아니면 '불합격' 출력 하시오.
        System.out.print("점수를 적어주세요 : ");
        int a = scanner.nextInt();

        if(a >= 90){System.out.println("합격");}else {System.out.println("불합격");}

        // 문제2 : 점수를 입력받아 점수가 90점 이상이면 'A등급', 80점 이상이면 'B등급', 70점 이상이면 'C등급', 그외 '재시험' 으로 출력 하시오.
        int b = scanner.nextInt();
        if(b>=90){System.out.println("A등급");
        }else if(b>=80){System.out.println("B등급");
        }else if (b>=70) {System.out.println("C등급");
        }else {System.out.println("재시험");}


        // 문제3 : 임의의 정수 3개 를 입력받아서 오름차순 으로 3개의 변수를 출력하시오.
        System.out.print("문제3 정수1 : "); int c1 = scanner.nextInt();
        System.out.print("문제3 정수2 : "); int c2 = scanner.nextInt();
        System.out.print("문제3 정수3 : "); int c3 = scanner.nextInt();

        // 방법1
        int c_1 = 0;    // 가장 큰 수
        int c_2 = 0;    // 2번째 수
        int c_3 = 0;    // 3번쨰 수

        // c_1 값 구하기 (가장큰 친구로)
        if(c1>=c2 && c1>=c3){ c_1=c1; }
        else if(c2>=c3){c_1=c2;}
        else{c_1=c3;}

        // c_3 구할꺼
        if(c1<=c2 && c1<=c3){c_3=c1;}
        else if(c2<=c3){c_3=c2;}
        else{c_3=c3;}

        // c_2 구하기
        if(c1 == c_1 || c1 == c_3){
            if(c2 == c_1 || c2 == c_3){c_2=c3;}
            else{c_2=c2;}
        }
        System.out.printf("1번째 : %d // 2번째 : %d // 3번째 : %d",c_3,c_2,c_1);


        // 방법 2
        int temp =0;
        //[처리]
        if( c1 > c2 ){ temp = c1;   c1 = c2;    c2 = temp;}
        // 만약 c1 이 c2보다 크다면  temp는 c1  c1은c2  c2=temp ( 더 큰수를 temp에 대입 )
        // temp를 이용해서 더 큰수를 1단계 위로 올림
        // 큰수를 c2 에 넣음
        if( c1 > c3 ){ temp = c1;   c1 = c3;    c3 = temp;}
        // 만약 c1이 c2보다 크다면
        if( c2 > c3 ){ temp = c2;   c2 = c3;    c3 = temp; }

        System.out.printf("1번째 : %d // 2번째 : %d // 3번째 : %d",c1,c2,c3);
*/



//        문제4 : 가위바위보 게임 구현하기.
//                - 가위가 '0' 이고 바위가 '1' 이고 보가 '2' 일때 플레이어1와 플레이어2 가 있습니다.
//                - 승리자 판단과 무승부 경우의수를 출력하시오.
//       [입력 조건] 플레이어1 과 플레이어2 에게 각각 입력을 받습니다.
//       [출력 조건] 플레이어1 이기면 ' 플레이어1 승리 ', 플레이어2 이기면 ' 플레이어2 승리 ' 무승부 이면 '무승부' 출력 하시오.


//        문제5 : 윤년/평년 판단하기
//        [ 입력조건 ] 하나의 연도를 입력 받습니다.
//        [ 윤년/평년 조건 ]
//            -연수가 4로 나누어 떨어지는 해는 윤년으로 한다.
//            -연수가 4, 100으로 나누어 떨어지는 해는 평년으로 한다.
//            -연수가 4, 100, 400으로 나누어 떨어지는 해는 윤년으로 둔다.
//        [ 출력조건] '입력한OOOO년 은' 윤년 입니다.  혹은 평년 입니다 로 출력하시오.
        System.out.print("하나의 연도를 입력해주세요 :"); int year = scanner.nextInt();
        String 입력값 = "";
        if(year%4==0){입력값 ="윤년입니다.";}
        else if (year%100==0) {입력값 = "평년입니다.";}

        System.out.printf("'입력한%d년 은' %s 입니다.",year,입력값);
        

//        문제6 : 주차 사용요금 계산하기
//            [ 선언 변수 조건 ] 입차시간이 14시30분 입니다. int 시 = 14;  int 분 = 30;
//            [ 입력 조건 ] 현재시간의 시 와 분을 입력받아 각 변수에 저장하시오. *단 입차 시간 이전 으로 입력 할 경우에는 '현재시간오류' 출력하시오.
//            [ 처리출력 조건 ] 1분당 1000원으로 계산하여 사용요금' 0000원' 을 출력하시오,



//        문제7 : 로그인 처리
//        [입력 조건] 아이디[문자열] 와 비밀번호[문자열] 를 입력받기
//        [처리출력 조건]
//            1. 아이디가 'admin' 이고 비밀번호가 '1234' 모두 동일하면 '로그인성공'
//            2. 아이디가 다르면 '아이디 정보가 일치하지 않습니다.'
//            3. 아이디는 일치하고 비밀번호가 다르면 '비밀번호 정보가 일치하지 않습니다'

//        문제8 : 당첨번호 개수  찾기
//            [ 선언 변수 조건 ] int 공1 = 14 ; int 공2 = 21 ; int 공3 = 9;
//            [ 입력 조건 ] 세개의 정수를 입력받아 각 변수에 저장하시오.
//            [ 출력 조건 ] 입력받은 세 정수 중에서 공1~공3 까지 동일한 번호 가 몇개 인지 출력하시오.




    } // main End
}// class End

