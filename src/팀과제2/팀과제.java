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



        System.out.println("OOO솔루션 구독 및 판매시스템");
        while (true){//while start
            System.out.println("-------------------");
            System.out.println("1.회원가입 | 2.로그인");
            System.out.println("-------------------");

            System.out.print("기능을 선택해주세요 ( 1~2 ) : "); String 선택한번호 = scanner.nextLine();
            if (선택한번호.equals("1")){//회원가입

                System.out.println(회원명단[0].id);
//                while (true) {
//                    System.out.println("회원가입 실행");
//                    System.out.print("희망하는 ID를 입력해주세요 : ");
//                    String id = scanner.nextLine();
//                    System.out.print("희망하는 Password 를 입력해주세요 : ");
//                    String pw = scanner.nextLine();
//
//                    boolean 중복여부 = false;
//                    for (int i = 0; i < 회원명단.length; i++) {
//                        if(회원명단[i].id==null){
//                            중복여부 = false;
//                        } else if (id.equals(회원명단[i].id)) {
//                            중복여부 = true;
//                        }else {
//                            중복여부 = false;
//                        }
//                    }//f end 중복여부
//
//                    if (중복여부){
//                        System.out.println("\n중복된 id입니다.\n");
//                        System.out.print("다시 입력하시겠습니까? \n(1.다시입력하기 2.처음으로 : ");
//                        int 선택 = scanner.nextInt();
//                        if(선택==1){//다시입력하기
//                            System.out.println("");
//                        } else if (선택==2) {//처음으로
//                            break;
//                        }
//
//                    }else {// 중복이 아니면
//                        for (int j = 0; j < 회원명단.length; j++) {
//                            if (회원명단[j] == null) {
//                                Client client = new Client(id, pw, 0, "");
//                                회원명단[j] = client;
//                                System.out.println("\n회원가입이 완료되었습니다.\n");
//                                break;
//                            }
//                        }
//                    }
//
//                }// 1번 선택while end

            } else if (선택한번호.equals("2")) {//로그인계좌번호

            }else {
                System.out.println("\n기능선택 오류!\n");
            }


            break;
        }//while end

    }// main end
}//class end
