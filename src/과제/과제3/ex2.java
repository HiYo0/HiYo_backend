package 과제.과제3;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        /*
            2. 기계식 주차 프로그램 ( 1~3층 층 3개 )
                [ 요구사항 필수 조건 - 그외 적절하게 판단하여 구현 ]

                1. 배열 사용금지 ( 변수만 사용합니다. 아래 변수는 필수로 사용하되 새로운 변수 선언 가능 합니다. )
                String 층1 = "";        String 층2 = "";       String 층3 ="";
                String 층1시 = "";      String 층2시 = "";      String 층3시 = "";
                String 층1분 = "";      String 층2분 = "";      String 층3분 = "";

                2. 프로그램은 무한루프를 이용합니다. 단 *- printf 이용하여 현재 층 상황을 반복적으로 출력합니다.

                3. 입차 : 사용자로부터 층 선택과 차량번호를 입력받습니다.
                    - 단 해당 층에 차량이 있을경우 '입차불가' 없으면 '입차완료' 출력 합니다.
                    - 해당 층 의 상태를 변경합니다.

                4. 출차 : 사용자로부터 층 과 출차시간(시/분)을 입력받습니다.
                    - 단 해당 층에 차량이 있을경우 '출차완료[사용금액: 000원]' 없으면 '입차량이 없습니다' 출력 합니다.
                    - 해당 층 의 상태를 변경합니다.

                5. 계산 : 10분당 천원으로 계산합니다.

        */

        Scanner scanner = new Scanner( System.in);
        String 층1 = "";      String 층2= "";       String 층3="";
        String 층1시 = "";      String 층2시 = "";      String 층3시 = "";
        String 층1분 = "";      String 층2분 = "";      String 층3분 = "";

        while(true){

            String 출차층 = ""; String 출차시 = ""; String 출차분 = ""; int 금액=0;

            System.out.println("층1: "+층1+"\t층2 :"+층2+"\t층3 :"+층3);
            System.out.println("층1시 :"+층1시+"\t층2시 :"+층2시+"\t층3시 :"+층3시);
            System.out.println("층1분 :"+층1분+"\t층2분 :"+층2분+"\t층3분 :"+층3분);

            System.out.println("입차/출차 : ");
            String 입출 = scanner.next();

            if(입출.equals("입차")){
                System.out.print("입차를 희망하는 층 선택해주세요(1~3) : ");
                scanner.nextLine();
                String 입력받은층 = scanner.nextLine();
                if (입력받은층.equals("1")) {/*1번 선택했을때*/
                    if (층1.equals("")) {
                        System.out.print("차량번호를 입력해주세요 : ");
                        층1 = scanner.nextLine();
                        System.out.print("입차 '시'를 입력해주세요 : ");
                        층1시 = scanner.nextLine();
                        System.out.print("입차 '분'을 입력해주세요 : ");
                        층1분 = scanner.nextLine();
                        System.out.println("\n");

                    } else {
                        System.out.println("입차불가");
                    }
                } else if (입력받은층.equals("2")) {/*2번 선택했을떄*/
                    if (층2.equals("")) {
                        System.out.print("차량번호를 입력해주세요 : ");
                        층2 = scanner.nextLine();
                        System.out.print("입차 '시'를 입력해주세요 : ");
                        층2시 = scanner.nextLine();
                        System.out.print("입차 '분'을 입력해주세요 : ");
                        층2분 = scanner.nextLine();
                        System.out.println("\n");

                    } else {
                        System.out.println("입차불가");
                    }
                } else if (입력받은층.equals("3")) {/*3번 선택했을떄*/
                    if (층3.equals("")) {
                        System.out.print("차량번호를 입력해주세요 : ");
                        층3 = scanner.nextLine();
                        System.out.print("입차 '시'를 입력해주세요 : ");
                        층3시 = scanner.nextLine();
                        System.out.print("입차 '분'을 입력해주세요 : ");
                        층3분 = scanner.nextLine();
                        System.out.println("\n");

                    } else {System.out.println("입차불가");}

                } else {System.out.println("잘못된 층을 입력하셧습니다\n");}

            }
            else if(입출.equals("출차")){
                System.out.println("층을 입력해주세요 : ");
                출차층 = scanner.next();
                if(출차층.equals("1")){
                    if(층1.equals("")){
                        System.out.println("입차량이 없습니다.");
                    }
                    else{
                        System.out.println("출차시를 입력하세요 : ");
                        출차시 = scanner.next();
                        System.out.println("출차분을 입력하세요 : ");
                        출차분 = scanner.next();

                        //금액 계산 - 10분당 1000원
                        if(Integer.parseInt(출차시) > Integer.parseInt(층1시)){
                            금액 = (Integer.parseInt(출차시) - Integer.parseInt(층1시) - 1) * 6000
                                    + (60 - Integer.parseInt(층1분) + Integer.parseInt(출차분)) * 100;
                            System.out.println("출차완료[사용금액 : "+금액+"]원\n");
                            층1 = ""; 층1시 = ""; 층1분 = "";
                        }
                        else if(Integer.parseInt(출차시) == Integer.parseInt(층1시) &&
                                Integer.parseInt(출차분) > Integer.parseInt(층1분)){
                            금액 = (Integer.parseInt(출차분) - Integer.parseInt(층1분)) * 100;
                            System.out.println("출차완료[사용금액 : "+금액+"]원\n");
                            층1 = ""; 층1시 = ""; 층1분 = "";
                        }
                        else{
                            System.out.println("잘못 입력하셨습니다.");
                        }
                    }
                }
                else if(출차층.equals("2")){
                    if(층2.equals("")){
                        System.out.println("입차량이 없습니다.");
                    }
                    else{
                        System.out.println("출차시를 입력하세요 : ");
                        출차시 = scanner.next();
                        System.out.println("출차분을 입력하세요 : ");
                        출차분 = scanner.next();

                        //금액 계산 - 10분당 1000원
                        if(Integer.parseInt(출차시) > Integer.parseInt(층2시)){
                            금액 = (Integer.parseInt(출차시) - Integer.parseInt(층2시) - 1) * 6000
                                    + (60 - Integer.parseInt(층2분) + Integer.parseInt(출차분)) * 100;
                            System.out.println("출차완료[사용금액 : "+금액+"]원\n");
                            층2 = ""; 층2시 = ""; 층2분 = "";
                        }
                        else if(Integer.parseInt(출차시) == Integer.parseInt(층2시) &&
                                Integer.parseInt(출차분) > Integer.parseInt(층2분)){
                            금액 = (Integer.parseInt(출차분) - Integer.parseInt(층2분)) * 100;
                            System.out.println("출차완료[사용금액 : "+금액+"]원\n");
                            층2 = ""; 층2시 = ""; 층2분 = "";
                        }
                        else{
                            System.out.println("잘못 입력하셨습니다.");
                        }
                    }
                }
                else if(출차층.equals("3")){
                    if(층3.equals("")){
                        System.out.println("입차량이 없습니다.");
                    }
                    else{
                        System.out.println("출차시를 입력하세요 : ");
                        출차시 = scanner.next();
                        System.out.println("출차분을 입력하세요 : ");
                        출차분 = scanner.next();

                        //금액 계산 - 10분당 1000원
                        if(Integer.parseInt(출차시) > Integer.parseInt(층3시)){
                            금액 = (Integer.parseInt(출차시) - Integer.parseInt(층3시) - 1) * 6000
                                    + (60 - Integer.parseInt(층3분) + Integer.parseInt(출차분)) * 100;
                            System.out.println("출차완료[사용금액 : "+금액+"]원\n");
                            층3 = ""; 층3시 = ""; 층3분 = "";
                        }
                        else if(Integer.parseInt(출차시) == Integer.parseInt(층3시) &&
                                Integer.parseInt(출차분) > Integer.parseInt(층3분)){
                            금액 = (Integer.parseInt(출차분) - Integer.parseInt(층3분)) * 100;
                            System.out.println("출차완료[사용금액 : "+금액+"]원\n");
                            층3 = ""; 층3시 = ""; 층3분 = "";
                        }
                        else{
                            System.out.println("잘못 입력하셨습니다.");
                        }
                    }

                }
                else {
                    System.out.println("잘못 입력하셨습니다.");
                }
            }
            else{
                System.out.println("다시 입력해주세요.");
            }

        }

    }
}