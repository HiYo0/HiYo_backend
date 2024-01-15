package 팀과제2;

import java.util.Scanner;
import java.util.SimpleTimeZone;

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
                    if(존재하는배열수>회원명단.length/2){//배열
///////////////////////////만드는중
                    }
//
                }//while end [아이디 ]
//////////////////////////////////////////////////////////////////////////
            } else if (선택한번호.equals("2")) {//로그인계좌번호
                int 존재하는배열수 = 0;
                for (int i = 0; i < 회원명단.length; i++) {
                    if (회원명단[i] == null) {
                        존재하는배열수 = i;
                        break;
                    }
                }
                System.out.print("ID 를 입력해주세요 : "); String id = scanner.nextLine();
                System.out.print("PW 를 입력해주세요 : "); String pw = scanner.nextLine();

                boolean 로그인스위치 = false;
                String 로그인된ID = "";
                int 로그인된ID위치 = 0;
                for (int i = 0; i < 존재하는배열수; i++) {
                    if (id.equals(회원명단[i].id)&& pw.equals(회원명단[i].pw)){
                        로그인스위치 = true;
                        로그인된ID = 회원명단[i].id;
                        로그인된ID위치 = i;
                        break;
                    }
                }//로그인 유효성검사
                if (로그인스위치 == true){
                    System.out.println("\n로그인성공\n");
                    while (true){//로그인 후 기능들
                        System.out.println("기능을 선택해주세요");
                        System.out.println("1.구독신청 | 2.사용현황 | 3.기간연장 | 4.로그아웃 ");
                        System.out.print("선택 > "); String 로그인후기능 = scanner.nextLine();

                        if (로그인후기능.equals("1")){// 구독신청
                            System.out.println("신청하실 구독의 종류를 선택해주세요");
                            System.out.println("1.Basic 2.Standard 3.Premiunm");
                            System.out.print("선택(1~3) > "); String 서비스선택 = scanner.nextLine();

                            if (서비스선택.equals("1")){
                                System.out.println("선택하신 상품의 금액은 : "+서비스형태배열[0].금액+"원 입니다.");
                                System.out.println("상품을 이용하시겠습니까?");
                                System.out.print("1.예 | 2.아니요 > "); String ch = scanner.nextLine();
                                if(ch.equals("1")) {
                                    for (int i = 0; i < 존재하는배열수; i++) {
                                        if (회원명단[i].id.equals(로그인된ID)) {
                                            회원명단[i].구독기간 = 1;
                                            회원명단[i].서비스형태 = 서비스형태배열[0].이름;
                                            break;
                                        }
                                    }
                                } else if (ch.equals("2")) {
                                    System.out.println("");
                                }else {
                                    System.out.println("입력확인해주세요");
                                }
                            } else if (서비스선택.equals("2")) {
                                System.out.println("선택하신 상품의 금액은 : "+서비스형태배열[1].금액+"원 입니다.");
                                System.out.println("상품을 이용하시겠습니까?");
                                System.out.print("1.예 | 2.아니요"); String ch = scanner.nextLine();
                                if(ch.equals("1")) {
                                    for (int i = 0; i < 존재하는배열수; i++) {
                                        if(회원명단[i].id.equals(로그인된ID)){
                                            회원명단[i].구독기간 = 1;
                                            회원명단[i].서비스형태 = 서비스형태배열[1].이름;
                                            break;
                                        }
                                    }
                                } else if (ch.equals("2")) {
                                    System.out.println("");
                                }else {
                                    System.out.println("입력확인해주세요");
                                }
                            } else if (서비스선택.equals("3")) {
                                System.out.println("선택하신 상품의 금액은 : "+서비스형태배열[2].금액+"원 입니다.");
                                System.out.println("상품을 이용하시겠습니까?");
                                System.out.print("1.예 | 2.아니요"); String ch = scanner.nextLine();
                                if(ch.equals("1")) {
                                    for (int i = 0; i < 존재하는배열수; i++) {
                                        if(회원명단[i].id.equals(로그인된ID)){
                                            회원명단[i].구독기간 = 1;
                                            회원명단[i].서비스형태 = 서비스형태배열[2].이름;
                                            break;
                                        }
                                    }
                                } else if (ch.equals("2")) {
                                    System.out.println("");
                                }else {
                                    System.out.println("입력확인해주세요");
                                }

                            }

                        } else if (로그인후기능.equals("2")) {// 사용현황
                            System.out.println("============================");
                            System.out.println("|       사용현황            |");
                            System.out.println("============================");
                            System.out.println("현재 ID : "+회원명단[로그인된ID위치].id);
                            System.out.println("현재구독상품 : "+회원명단[로그인된ID위치].서비스형태);
                            System.out.println("현재남은 구독기간 : "+회원명단[로그인된ID위치].구독기간+" 개월");
                            String 용량 = "";
                            for (int i = 0; i <서비스형태배열.length ; i++) {
                                if (회원명단[로그인된ID위치].서비스형태.equals(서비스형태배열[i].이름)){
                                    용량=서비스형태배열[i].용량;
                                }
                            }
                            System.out.println("사용가능용량 : "+용량);
                            String 인원 = "";
                            for (int i = 0; i <서비스형태배열.length ; i++) {
                                if (회원명단[로그인된ID위치].서비스형태.equals(서비스형태배열[i].이름)){
                                    인원=서비스형태배열[i].사용인원;
                                }
                            }
                            System.out.println("사용가능인원 : "+인원);

                        } else if (로그인후기능.equals("3")) {// 기간연장
                            System.out.print("연장기간을 적어주세요 : "); int month = scanner.nextInt();

                            회원명단[로그인된ID위치].구독기간+=month;

                            System.out.println("\n연장되었습니다.\n");

                        } else if (로그인후기능.equals("4")) {// 로그아웃
                            System.out.println("\n로그아웃 되었습니다.\n");
                            로그인된ID ="";
                            break;
                        }else {
                            System.out.println("\n\n");
                        }


                    }// 로그인후 기능들


                }else {
                    System.out.println("\n로그인실패 ID와 Password 를 확인해주세요\n");
                }







            } else if (선택한번호.equals("3")) {
                break;
            } else {
                System.out.println("\n기능선택 오류!\n");
            }
            // 회고 : ID 중복검사 부분에서 상당히 애먹었었다.
            // null 이란 단어가 단순히 없다라는게 아니라는걸 알게된 과제
            // 애먹었던부분 배열[0].id 이런식으로 출력하려고 할때 처음 객체 를 저장안하면
            // 찾을수 없다고 오류 나옴("해당주소는 null이야")


        }//while end

    }// main end
}//class end
