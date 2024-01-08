package day05;  // 패키지 : 클래스가 위치한 폴더경로

import java.util.Scanner;

public class Step1_방문록변수ver {//class Start 클래스 : 모든 자바 코드는 클래스 안에서 작성
    public static void main(String[] args) {//main start 메인함수 : 자바 코드 진입점( 스레드를 포함 )
        // 스레드 = 어떠한 프로그램 내에서, 특히 프로세스 내에서 실행되는 흐름의 단위
        
        // 3-1. 입력객체생성 [ scanner 객체가 필요한 이유???? 입력 관련 메소드/함수 제공. ]
        // 객체 = 미리 설계된 클래스의 인스턴스 나 배열
        Scanner scanner = new Scanner(System.in);

        // 4-1 초기변수. : 방문록 1개당 ( 내용 , 작성자 , 비밀번호 포함 ) 방문록 3개이면 변수 9개
        String 내용1 = "";    String 작성자1 ="";        int 비밀번호1 = 0;
        String 내용2 = "";    String 작성자2 ="";        int 비밀번호2 = 0;
        String 내용3 = "";    String 작성자3 ="";        int 비밀번호3 = 0;


        while (true) {
            // 1. 출력
            System.out.println("========== 방문록 ==========");
                // 6. 현재 변수 현황 출력
            System.out.printf("%2d \t %-5s \t %-20s\n", 1 , 작성자1,내용1);
            System.out.printf("%2d \t %-5s \t %-20s\n", 2 , 작성자2,내용2);
            System.out.printf("%2d \t %-5s \t %-20s\n", 3 , 작성자3,내용3);

            System.out.println("1.방문록 작성 2.방문록 삭제 3.종료");


            // 3-2. 입력객체 이용한 키보드로부터 입력값 호출 하고 변수에 저장
            System.out.print("실행할 번호를 입력해주세요 : "); int 실행번호 = scanner.nextInt();
            
            // 5-1 사용자가 입력( 선택 )한 경우의수 에 따라 기능처리
            if(실행번호==1){
                System.out.print("방문록 작성위치를 정해주세요( 1~3 ) : "); int 작성위치 = scanner.nextInt();

                scanner.nextLine();
                System.out.print("내용을 입력해주세요 : "); String content = scanner.nextLine();
                System.out.print("작성자 : "); String writer = scanner.next();
                System.out.print("비밀번호 : "); int password = scanner.nextInt();

                if(작성위치==1){ 내용1 = content;  작성자1 = writer;  비밀번호1 = password; }
                else if (작성위치 == 2) { 내용2 = content;  작성자2 = writer;  비밀번호2 = password; }
                else if (작성위치 == 3) { 내용3 = content;  작성자3 = writer;  비밀번호3 = password; }
                else { System.out.println("[ 경고 ] 알수없는 위치입니다."); }

            } else if (실행번호 == 2) {
                // 입력 : 삭제할 방문록의 위치 입력
                System.out.print("방문록 삭제위치를 정해주세요( 1~3 ) : "); int 작성위치 = scanner.nextInt();

                // 입력[ 비밀번호 ]
                // 삭제할 방문록의 비밀번호 입력
                System.out.print("비밀번호를 작성해주세요 : "); int password = scanner.nextInt();
                
                // [ if 중첩 ]
                // 초기화 : 위치와 비밀번호 일치에 따른 각 변수를 처음값으로 대입
                if(작성위치==1 && 비밀번호1 == password){ 내용1 = "";  작성자1 = "";  비밀번호1 = 0; }
                else if (작성위치 == 2 && 비밀번호2 == password) { 내용2 = "";  작성자2 = "";  비밀번호2 = 0; }
                else if (작성위치 == 3 && 비밀번호3 == password) { 내용3 = "";  작성자3 = "";  비밀번호3 = 0; }
                else if (작성위치>=1 && 작성위치 <=3) {System.out.println("\n[ 경고 ] 비밀번호가 다릅니다.\n");}
                else { System.out.println("\n[ 경고 ] 알수없는 위치입니다.\n"); }

            } else if (실행번호 == 3) {
                System.out.println("\n프로그램 종료\n");
                break;
            }else {System.out.println("알수없는 입력입니다.");}

        }//while End
        
    }//main End
}//class End

/*
    비회원제 방문록 프로그램.[ JAVA ]
        1. 방문록 작성 / 삭제 기능 구현 / 종료기능 / 출력기능
            [ 초기메뉴 ]
            1. 초기메뉴가 반복적으로 실행되어야 한다.
                - 특정 조건에 따라 종료.
            2. 초기메뉴에 번호에 대해 선택(입력) 받는다. scanner.nextInt();

        2. 방문록 에는 '내용' , '작성자' , '비밀번호'
            - 내용(문자열) , 작성자(문자열) , 비밀번호(정수)
            - 선언해야 할 변수 개수 : 9개
        
        3. 기능구현
            [  ] 현재 방문록 현황 출력
                1. 초기메뉴에서 9개의 변수를 형식맞춰 모두 출력.
            
            [ 1번 선택시 ] 방문록 작성
                1. ( 1~3 ) 중 몇번째 방문록에 작성할껀지 선택받기.
                2. 내용 , 작성자 , 비밀번호( 숫자/4자리 ) 입력받기.
                3. 선택한 방문록 자리에 입력받은 각 데이터 대입.
            [ 2번 선택시 ] 방문록 삭제
            [ 3번 선택시 ] 종료
*/