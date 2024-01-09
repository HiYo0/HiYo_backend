package day6;

import java.util.Scanner;

public class Step6 {//class start

    public static void main(String[] args) {//main start
        // 3. 전화번호부 만들기
        /*
            [1.조건]
                - 하나의 문자열만 이용하여 여러명으 이름과 전화번호를 관리하시오.
                String 전화번호부 = "";

            [2.기능구현]
                1. 전화번호 등록
                    - 이름과 전화번호 를 입력받아 저장.
                2. 전화번호 삭제
                    - 출력된 전화번호 목록을 보고 순번을 입력받아 해당 순번의 전화번호 삭제
                3. 전화번호 출력
                    - String 전화번호부 에 저장된 데이터를 아래 그림과 같이 출력

            [3.실행화면]
                ============ 전화번호부 ============
                순번     이름       전화번호
                1       김현수     010-3913-2072
                2       유재석     010-1234-1234
                3       강호동     010-7777-7777
        */
        Scanner scanner = new Scanner(System.in);
        String 전화번호부 = "";


        while (true){//반벅문시작
            String 이름 = "";
            String 전화번호 = "";
            String 출력용 = "";
            int 삭제순번 =0;
            String[] 임시 = 전화번호부.split("\n");
            // System.out.println(임시[0]);
            // 출력하기
            System.out.println("============ 전화번호부 ============");
            System.out.println("순번\t\t이름\t\t\t전화번호");
            System.out.println(전화번호부);
            

            System.out.print("기능을 입력해주세요 (등록/삭제/종료) : "); String 기능선택 = scanner.nextLine();
            //System.out.println(기능선택);
            if (기능선택.equals("등록")||기능선택.equals("emdfhr")){
                System.out.print("이름을 등록해주세요 : "); 이름 = scanner.nextLine();
                System.out.print("전화번호를 등록해주세요 : "); 전화번호 = scanner.nextLine();
                for(int i = 0; i<임시.length;i++){

                }
                출력용=" "+(임시.length)+"\t\t"+이름+"\t\t"+전화번호+"  \n";
                전화번호부 += 출력용;

            } else if(기능선택.equals("삭제")||기능선택.equals("tkrwp")){
                System.out.print("삭제를 희망하는 순번을 입력해주세요 : "); 삭제순번 = scanner.nextInt();

                임시[삭제순번-1]="\n";

                전화번호부 = "";//전화번호부 공백으로 다시시작
                for (int a=0; a<임시.length; a++){ // 다시 전화번호부에 등록
                    if(임시[a].equals("")){
                        전화번호부 += "";
                    }
                    else {전화번호부 += 임시[a];}
                }scanner.nextLine();



            }else if(기능선택.equals("종료")||기능선택.equals("whdfy")){
                System.out.println("\n프로그램 종료\n");
                break;
            }
            ///// 모르겟다ㅂㄷㅂㄷ;;


            
        }//main while End

    }//main end
}//class end
