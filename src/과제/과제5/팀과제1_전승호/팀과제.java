package 과제.과제5.팀과제1_전승호;

import java.util.Scanner;

public class 팀과제 {//class start

    public static void main(String[] args) {// main start
        서비스형태 Basic = new 서비스형태("Basic","1TB","2",10000);
        서비스형태 Standard = new 서비스형태("Standard","2TB","2",11000);
        서비스형태 Premiunm = new 서비스형태("Premiunm","3TB","2",12000);

        서비스형태[] 서비스형태배열 = new 서비스형태[]{Basic,Standard,Premiunm};


        Client[] uesrList = new Client[10];
        Scanner scanner = new Scanner(System.in);

//            Client 임시객체 = new Client("","",0,"");
//            uesrList[0]=임시객체;

        System.out.println("OOO솔루션 구독 및 판매시스템");
        while (true){//while start
            System.out.println("uesrList 수 : "+uesrList.length);
            System.out.println("----------------------------");
            System.out.println("1.회원가입 | 2.로그인 | 3.종료");
            System.out.println("----------------------------");
            for (Client value : uesrList) {//ID등록된거 확인하려고 만들어 둔거
                if (value == null) {
                    break;
                } else {
                    System.out.println(value.id);
                }
            }

            System.out.print("기능을 선택해주세요 ( 1~2 ) : "); String chooseNo = scanner.nextLine();


            if (chooseNo.equals("1")) {//회원가입
                while (true) {
                    System.out.println("회원가입 실행");
                    System.out.print("희망하는 ID를 입력해주세요 : ");
                    String id = scanner.nextLine();
                    System.out.print("희망하는 Password 를 입력해주세요 : ");
                    String pw = scanner.nextLine();
                    Client client = new Client(id, pw, 0, "");

                    int uesrIndex = 0;
                    for (int j = 0; j < uesrList.length; j++) {
                        if (uesrList[j] == null) {
                            uesrList[j] = client;
                            uesrIndex = j;
                            break;
                        }
                    }// 빈 배열에 일단 입력받은 값 넣기

                    int arrangementCount = 0;
                    for (int i = 0; i < uesrList.length; i++) {
                        if (uesrList[i] == null) {
                            arrangementCount = i;
                            break;
                        }
                    }// 존재하고있는 배열수 구하는 for문 종료

                    boolean duplication = true;//true= 중복없음 | false= 중복있음
                    for (int i = 0; i < arrangementCount; i++) {//중복검사 for문
                        if (uesrList[i].id.equals(client.id)) {
                            if(uesrList[i]==uesrList[uesrIndex]){
                                System.out.println("회원가입 완료2");
                                if(arrangementCount>uesrList.length/2) {//배열수 추가
//                                    System.out.println("실행됨\n\n");
                                    // 배열길이 증가
                                    Client[] uesrList2 = new Client[uesrList.length + 10];
                                    for (int j = 0; j < uesrList.length; j++) {
                                        uesrList2[j] = uesrList[j];
                                    }
                                    uesrList = uesrList2;
                                }
                            }else {
                                System.out.println("\n이미있는 ID 입니다.\n");
                                uesrList[uesrIndex] = null;
                                duplication = false;
                                break;
                            }
                        }
                    } // for end 중복검사


                    if (!duplication) {//false 일때
                        System.out.print("1.다시쓸래 | 2.처음으로 입력 > ");
                        String chooseService = scanner.nextLine();
                        if (chooseService.equals("1")){
                            System.out.println("다시입력하세요");
                        } else if (chooseService.equals("2")) {
                            break;
                        }
                    } else{ // true 일때
                        break;
                    }
                    if(arrangementCount>uesrList.length/2){//배열수 추가
//                        System.out.println("실행됨\n\n");
                        Client[] uesrList2 = new Client[uesrList.length+10];
                        for (int i = 0; i < uesrList.length; i++) {
                            uesrList2[i]=uesrList[i];
                        }
                        uesrList = uesrList2;
                    }

                }//while end [아이디 ]
//////////////////////////////////////////////////////////////////////////
            } else if (chooseNo.equals("2")) {//로그인계좌번호
                int arrangementCount = 0;
                for (int i = 0; i < uesrList.length; i++) {
                    if (uesrList[i] == null) {
                        arrangementCount = i;
                        // 존재하는 배열수 저장
                        break;
                    }
                }
                System.out.print("ID 를 입력해주세요 : "); String id = scanner.nextLine();
                System.out.print("PW 를 입력해주세요 : "); String pw = scanner.nextLine();

                boolean loginSwich = false;
                String loginID = "";
                int loginIndex = 0;
                for (int i = 0; i < arrangementCount; i++) {
                    if (id.equals(uesrList[i].id)&& pw.equals(uesrList[i].pw)){
                        loginSwich = true;
                        loginID = uesrList[i].id;
                        loginIndex = i;
                        break;
                    }
                }//로그인 유효성검사
                if (loginSwich){
                    System.out.println("\n로그인성공\n");
                    while (true){//로그인 후 기능들
                        System.out.println("기능을 선택해주세요");
                        System.out.println("1.구독신청 | 2.사용현황 | 3.기간연장 | 4.로그아웃 ");
                        System.out.print("선택 > "); String myService = scanner.nextLine();

                        if (myService.equals("1")){// 구독신청
                            System.out.println("신청하실 구독의 종류를 선택해주세요");
                            System.out.println("1.Basic 2.Standard 3.Premiunm");
                            System.out.print("선택(1~3) > "); String subscribe = scanner.nextLine();

                            if (subscribe.equals("1")){
                                System.out.println("선택하신 상품의 금액은 : "+서비스형태배열[0].금액+"원 입니다.");
                                System.out.println("상품을 이용하시겠습니까?");
                                System.out.print("1.예 | 2.아니요 > "); String ch = scanner.nextLine();
                                if(ch.equals("1")) {
                                    for (int i = 0; i < arrangementCount; i++) {
                                        if (uesrList[i].id.equals(loginID)) {
                                            uesrList[i].구독기간 = 1;
                                            uesrList[i].서비스형태 = 서비스형태배열[0].이름;
                                            break;
                                        }
                                    }
                                } else if (ch.equals("2")) {
                                    System.out.println("");
                                }else {
                                    System.out.println("입력확인해주세요");
                                }
                            } else if (subscribe.equals("2")) {
                                System.out.println("선택하신 상품의 금액은 : "+서비스형태배열[1].금액+"원 입니다.");
                                System.out.println("상품을 이용하시겠습니까?");
                                System.out.print("1.예 | 2.아니요"); String ch = scanner.nextLine();
                                if(ch.equals("1")) {
                                    for (int i = 0; i < arrangementCount; i++) {
                                        if(uesrList[i].id.equals(loginID)){
                                            uesrList[i].구독기간 = 1;
                                            uesrList[i].서비스형태 = 서비스형태배열[1].이름;
                                            break;
                                        }
                                    }
                                } else if (ch.equals("2")) {
                                    System.out.println();
                                }else {
                                    System.out.println("입력확인해주세요");
                                }
                            } else if (subscribe.equals("3")) {
                                System.out.println("선택하신 상품의 금액은 : "+서비스형태배열[2].금액+"원 입니다.");
                                System.out.println("상품을 이용하시겠습니까?");
                                System.out.print("1.예 | 2.아니요"); String ch = scanner.nextLine();
                                if(ch.equals("1")) {
                                    for (int i = 0; i < arrangementCount; i++) {
                                        if(uesrList[i].id.equals(loginID)){
                                            uesrList[i].구독기간 = 1;
                                            uesrList[i].서비스형태 = 서비스형태배열[2].이름;
                                            break;
                                        }
                                    }
                                } else if (ch.equals("2")) {
                                    System.out.println();
                                }else {
                                    System.out.println("입력확인해주세요");
                                }

                            }

                        } else if (myService.equals("2")) {// 사용현황
                            System.out.println("============================");
                            System.out.println("|       사용현황            |");
                            System.out.println("============================");
                            System.out.println("현재 ID : "+uesrList[loginIndex].id);
                            System.out.println("현재구독상품 : "+uesrList[loginIndex].서비스형태);
                            System.out.println("현재남은 구독기간 : "+uesrList[loginIndex].구독기간+" 개월");
                            String Volume = "";
                            for (int i = 0; i <서비스형태배열.length ; i++) {
                                if (uesrList[loginIndex].서비스형태.equals(서비스형태배열[i].이름)){
                                    Volume=서비스형태배열[i].용량;
                                }
                            }
                            System.out.println("사용가능Volume : "+Volume);
                            String 인원 = "";
                            for (int i = 0; i <서비스형태배열.length ; i++) {
                                if (uesrList[loginIndex].서비스형태.equals(서비스형태배열[i].이름)){
                                    인원=서비스형태배열[i].사용인원;
                                }
                            }
                            System.out.println("사용가능인원 : "+인원);

                        } else if (myService.equals("3")) {// 기간연장
                            System.out.print("연장기간을 적어주세요 : "); int month = scanner.nextInt();

                            uesrList[loginIndex].구독기간+=month;

                            System.out.println("\n연장되었습니다.\n");

                        } else if (myService.equals("4")) {// 로그아웃
                            System.out.println("\n로그아웃 되었습니다.\n");
                            loginID ="";
                            break;
                        }else {
                            System.out.println("\n\n");
                        }


                    }// 로그인후 기능들


                }else {
                    System.out.println("\n로그인실패 ID와 Password 를 확인해주세요\n");
                }







            } else if (chooseNo.equals("3")) {
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
