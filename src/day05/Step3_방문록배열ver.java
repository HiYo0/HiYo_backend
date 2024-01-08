package day05;

import java.util.Scanner;

public class Step3_방문록배열ver {//class start

    public static void main(String[] args) {//main start
        // *입력객체
        Scanner scanner = new Scanner(System.in);
        // 5 저장할 (배열)변수 선언
        String[] 내용배열 = new String[3];
        String[] 작성자배열 = new String[3];
        int[] 비밀번호배열 = new int[3];
        
        // 1. 무한루프
        while (true) {//while start
            // 2. 출력
            System.out.println("========== 방문록 ==========");
            for(int i = 0 ; i< 내용배열.length; i++) {//for start
                // null 비교시에는 비교연산자 사용.
                if( 내용배열[i]!=null ){
                System.out.printf("%2d \t %-5s \t %-20s\n", i+1, 작성자배열[i], 내용배열[i]);}
            }//for end

            System.out.println("1.방문록 작성 2.방문록 삭제 3.종료");
            // 3. 입력
            System.out.print("희망하는 작업 번호를 입력해주세요( 1~3 ) : "); int 작업번호 = scanner.nextInt();
            // 4. 입력된 경우의수 판단
            if (작업번호==1){
                // 6-1 방문록 작성할 위치(인덱스) 입력받는다.
                System.out.print("방문록 작성 위치를 정해주세요( 1~3 ) : "); int 작성위치 = scanner.nextInt();
                // 6-2 입력 : 내용 , 작성자 , 비밀번호
                scanner.nextLine();
                System.out.print("내용 : ")     ;String content = scanner.nextLine();
                System.out.print("작성자 : ")    ;String writer = scanner.next();
                System.out.print("비밀번호 : ")   ;int password = scanner.nextInt();

                // 6-3 배열에 각각 대입하기.
                내용배열[작성위치-1] = content;
                작성자배열[작성위치-1] = writer;
                비밀번호배열[작성위치-1] = password;

            } else if (작업번호==2) {
                // 8-1 입력 : 삭제할 방문록의 위치를 (인덱스) 입력
                System.out.print("방문록 삭제 위치를 정해주세요( 1~3 ) : "); int 작성위치 = scanner.nextInt();
                // 8-2 입력 : 유효성검사를 위한 비밀번호 입력받기
                System.out.print("비밀번호를 입력해주세요 : "); int 입력비밀번호 = scanner.nextInt();
                if(작성위치 >= 1 && 작성위치 <=내용배열.length) {
                    // 8-3 만약에 선택한 방문록의 패스워드와 방금 입력한 패스워드가 같으면.
                    if (비밀번호배열[작성위치 - 1] == 입력비밀번호) {
                        내용배열[작성위치 - 1] = null;
                        작성자배열[작성위치 - 1] = null;
                        비밀번호배열[작성위치 - 1] = 0;
                    } else {
                        System.out.println("\n비밀번호를 확인해주세요\n");
                    }
                }else {
                    System.out.println("\n올바른 작성번호인지 확인해주세요\n");
                }

            } else if (작업번호==3) {
                System.out.println("\n프로그램 종료.\n");
                break;
            }else { System.out.println("\n잘못된 작업번호를 입력하셧습니다.\n"); }


        }//while End

        }//main end
}//class end
