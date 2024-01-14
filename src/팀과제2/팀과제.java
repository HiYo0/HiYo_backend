package 팀과제2;

import java.util.Scanner;

public class 팀과제 {//class start

    public static void main(String[] args) {// main start
        서비스형태 Basic = new 서비스형태("Basic","1TB","2",10000);
        서비스형태 Standard = new 서비스형태("Standard","2TB","2",11000);
        서비스형태 Premiunm = new 서비스형태("Premiunm","3TB","2",12000);

        서비스형태[] 서비스형태배열 = new 서비스형태[]{Basic,Standard,Premiunm};


        Client[] 회원명단 = new Client[100];
        Scanner scanner = new Scanner(System.in);

//            Client 임시객체 = new Client("","",0,"");
//            회원명단[0]=임시객체;

        System.out.println("OOO솔루션 구독 및 판매시스템");
        while (true){//while start
            System.out.println("-------------------");
            System.out.println("1.회원가입 | 2.로그인");
            System.out.println("-------------------");
//            for (int i = 0; i < 회원명단.length; i++) {//ID등록된거 확인하려고 만들어 둔거
//                if (회원명단[i]!=null) {
//                    System.out.println(회원명단[i].id);
//                }
//            }

            System.out.print("기능을 선택해주세요 ( 1~2 ) : "); String 선택한번호 = scanner.nextLine();


            if (선택한번호.equals("1")) {//회원가입
                while (true) {
                    System.out.println("회원가입 실행");
                    System.out.print("희망하는 ID를 입력해주세요 : ");
                    String id = scanner.nextLine();
                    System.out.print("희망하는 Password 를 입력해주세요 : ");
                    String pw = scanner.nextLine();
                    Client client = new Client(id, pw, 0, "");

                    int 저장한배열위치 = 0;
                    for (int j = 0; j < 회원명단.length; j++) {
                        if (회원명단[j] == null) {
                            회원명단[j] = client;
                            저장한배열위치 = j;
                            break;
                        }
                    }// 빈 배열에 일단 입력받은 값 넣기

                    int 존재하는배열수 = 0;
                    for (int i = 0; i < 회원명단.length; i++) {
                        if (회원명단[i] == null) {
                            존재하는배열수 = i;
                            break;
                        }
                    }// 존재하고있는 배열수 구하는 for문 종료

                    boolean 중복여부 = true;//true= 중복없음 | false= 중복있음
                    for (int i = 0; i < 존재하는배열수; i++) {//중복검사 for문
                        if (회원명단[i].id.equals(client.id)) {
                            if(회원명단[i]==회원명단[저장한배열위치]){
                                System.out.println("회원가입 완료2");
                            }else {
                                System.out.println("\n이미있는 ID 입니다.\n");
                                회원명단[저장한배열위치] = null;
                                중복여부 = false;
                                break;
                            }
                        }
                    } // for end 중복검사

                    if (중복여부 == false) {
                        System.out.print("1.다시쓸래 | 2.처음으로");
                        String 선택한기능 = scanner.nextLine();
                        if (선택한기능.equals("1")){
                            System.out.println("다시입력하세요");
                        } else if (선택한기능.equals("2")) {
                            break;
                        }
                    } else if (중복여부==true) {
                        break;
                    }

                }//while end [아이디 ]




            } else if (선택한번호.equals("2")) {//로그인계좌번호

            } else if (선택한번호.equals("3")) {
                break;
            } else {
                System.out.println("\n기능선택 오류!\n");
            }



        }//while end

    }// main end
}//class end
