package 과제.과제3;

import java.util.Scanner;

public class ex1_조과제 {
    public static void main(String[] args) {
//    2. 기계식 주차 프로그램 ( 1~3층 층 3개 )
//            [ 요구사항 필수 조건 - 그외 적절하게 판단하여 구현 ]
//        1. 배열 사용금지 ( 변수만 사용합니다. 아래 변수는 필수로 사용하되 새로운 변수 선언 가능 합니다. )
//            String 층1 = "";      String 층2 = "";       String 층3 ="";
//            String 층1시 = "";      String 층2시 = "";      String 층3시 = "";
//            String 층1분 = "";      String 층2분 = "";      String 층3분 = "";
//
//        2. 프로그램은 무한루프를 이용합니다. 단 *- printf 이용하여 현재 층 상황을 반복적으로 출력합니다.
//
//        3. 입차 : 사용자로부터 층 선택과 차량번호를 입력받습니다.
//            - 단 해당 층에 차량이 있을경우 '입차불가' 없으면 '입차완료' 출력 합니다.
//            - 해당 층 의 상태를 변경합니다.
//
//        4. 출차 : 사용자로부터 층 과 출차시간(시/분)을 입력받습니다.
//            - 단 해당 층에 차량이 있을경우 '출차완료[사용금액: 000원]' 없으면 '입차량이 없습니다' 출력 합니다.
//            - 해당 층 의 상태를 변경합니다.
//
//        5. 계산 : 10분당 천원으로 계산합니다.
            String 층1 = "";      String 층2 = "";       String 층3 ="";
            String 층1시 = "";      String 층2시 = "";      String 층3시 = "";
            String 층1분 = "";      String 층2분 = "";      String 층3분 = "";
        Scanner scanner = new Scanner(System.in);
        while (true){
            /*출력부분*/
            System.out.printf("1층 차량번호 : %s \t입차시간 : %s 시 %s 분 \n",층1,층1시,층1분);
            System.out.printf("2층 차량번호 : %s \t입차시간 : %s 시 %s 분 \n",층2,층2시,층2분);
            System.out.printf("3층 차량번호 : %s \t입차시간 : %s 시 %s 분 \n",층3,층3시,층3분);

            while (true) {

                System.out.print("원하는 작업을 선택해주세요(입차/출차/종료) : ");
                String 입력작업 = scanner.nextLine();
                if (입력작업.equals("입차")) {

                    System.out.print("입차를 희망하는 층 선택해주세요(1~3) : ");
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

                        } else {
                            System.out.println("입차불가");
                        }

                    } else {
                        System.out.println("잘못된 층을 입력하셧습니다\n");
                    }

////////////////////////////////////////////////////////////////
                } else if (입력작업.equals("출차")) {
                    /*여기에 출차 코드 입력해주세요*/
                    while (true) { //while2 start
                        String 출차층 = "";
                        String 출차시 = "";
                        String 출차분 = "";
                        int 금액 = 0;

                        System.out.print("층을 입력해주세요 : ");
                        출차층 = scanner.nextLine();
                        if (출차층.equals("1")) {
                            if (층1.equals("")) {
                                System.out.println("입차량이 없습니다.");
                            } else {
                                System.out.print("출차시를 입력하세요 : ");
                                출차시 = scanner.nextLine();
                                System.out.print("출차분을 입력하세요 : ");
                                출차분 = scanner.nextLine();

                                //금액 계산 - 10분당 1000원
                                if (Integer.parseInt(출차시) >= Integer.parseInt(층1시)) {
                                    금액 = (Integer.parseInt(출차시) - Integer.parseInt(층1시) - 1) * 6000
                                            + (60 - Integer.parseInt(층1분) + Integer.parseInt(출차분)) * 100;
                                    System.out.println("출차완료[사용금액 : " + 금액 + "]원\n");
                                    층1 = "";
                                    층1시 = "";
                                    층1분 = "";
                                    break;
                                } else if (Integer.parseInt(출차시) == Integer.parseInt(층1시) &&
                                        Integer.parseInt(출차분) < Integer.parseInt(층1분)) {
                                    금액 = (Integer.parseInt(층1분) - Integer.parseInt(출차분)) * 100;
                                    System.out.println("출차완료[사용금액 : " + 금액 + "]원\n");
                                    층1 = "";
                                    층1시 = "";
                                    층1분 = "";
                                    break;
                                } else {
                                    System.out.println("잘못 입력하셨습니다.");
                                }
                            }
                        } else if (출차층.equals("2")) {
                            if (층2.equals("")) {
                                System.out.println("입차량이 없습니다.");
                            } else {
                                System.out.println("출차시를 입력하세요 : ");
                                출차시 = scanner.nextLine();
                                System.out.println("출차분을 입력하세요 : ");
                                출차분 = scanner.nextLine();

                                //금액 계산 - 10분당 1000원
                                if (Integer.parseInt(출차시) >= Integer.parseInt(층2시)) {
                                    금액 = (Integer.parseInt(출차시) - Integer.parseInt(층2시) - 1) * 6000
                                            + (60 - Integer.parseInt(층2분) + Integer.parseInt(출차분)) * 100;
                                    System.out.println("출차완료[사용금액 : " + 금액 + "]원\n");
                                    층2 = "";
                                    층2시 = "";
                                    층2분 = "";
                                    break;
                                } else if (Integer.parseInt(출차시) == Integer.parseInt(층2시) &&
                                        Integer.parseInt(출차분) < Integer.parseInt(층2분)) {
                                    금액 = (Integer.parseInt(층2분) - Integer.parseInt(출차분)) * 100;
                                    System.out.println("출차완료[사용금액 : " + 금액 + "]원\n");
                                    층2 = "";
                                    층2시 = "";
                                    층2분 = "";
                                    break;
                                } else {
                                    System.out.println("잘못 입력하셨습니다.");
                                }
                            }
                        } else if (출차층.equals("3")) {
                            if (층3.equals("")) {
                                System.out.println("입차량이 없습니다.");
                            } else {
                                System.out.println("출차시를 입력하세요 : ");
                                출차시 = scanner.nextLine();
                                System.out.println("출차분을 입력하세요 : ");
                                출차분 = scanner.nextLine();

                                //금액 계산 - 10분당 1000원
                                if (Integer.parseInt(출차시) >= Integer.parseInt(층3시)) {
                                    금액 = (Integer.parseInt(출차시) - Integer.parseInt(층3시) - 1) * 6000
                                            + (60 - Integer.parseInt(층3분) + Integer.parseInt(출차분)) * 100;
                                    System.out.println("출차완료[사용금액 : " + 금액 + "]원\n");
                                    층3 = "";
                                    층3시 = "";
                                    층3분 = "";
                                    break;
                                } else if (Integer.parseInt(출차시) == Integer.parseInt(층3시) &&
                                        Integer.parseInt(출차분) < Integer.parseInt(층3분)) {
                                    금액 = (Integer.parseInt(층1분) - Integer.parseInt(출차분)) * 100;
                                    System.out.println("출차완료[사용금액 : " + 금액 + "]원\n");
                                    층3 = "";
                                    층3시 = "";
                                    층3분 = "";
                                    break;
                                } else {
                                    System.out.println("잘못 입력하셨습니다.");
                                }
                            }

                        } else {
                            System.out.println("잘못 입력하셨습니다.");
                        }
                    }//while2 End


                } else if (입력작업.equals("종료")) {
                    System.out.println("\n프로그램 종료\n");
                    break;
                } else {
                    System.out.println("입력확인해주세요");
                }

            }
        }//while End



    }//main end
}

/*

1. 가위바위보 게임 ( 사람과 컴퓨터 대전 )
        [ 요구사항 필수 조건 - 그외 적절하게 판단하여 구현 ]
        1. 배열 사용금지 ( 변수만 사용합니다. 아래 변수는 필수로 사용하되 새로운 변수 선언 가능 합니다. )
String 플레이어 = 입력값;	String 컴퓨터 = 난수.
int 플레이어승리수 = 0;	int 컴퓨터승리수 = 0

		2. 프로그램은 무한루프를 이용합니다. 단 *- printf 이용하여 현재 승리수 상황을 반복적으로 출력합니다.

		3. 'X' 입력할때까지 계속 게임은 반복되고 승리수는 누적이 됩니다. 'X'입력시 종료됩니다.

        4. 게임 종료시 각(플레이어와 컴퓨터) 승리수 를 출력후 승리수를 초기화 후 처음부터 다시 게임이 시작됩니다.

        2. 기계식 주차 프로그램 ( 1~3층 층 3개 )
	[ 요구사항 필수 조건 - 그외 적절하게 판단하여 구현 ]
        1. 배열 사용금지 ( 변수만 사용합니다. 아래 변수는 필수로 사용하되 새로운 변수 선언 가능 합니다. )
String 층1 = "";		String 층2 = "";	 	String 층3 ="";
String 층1시 = "";		String 층2시 = "";		String 층3시 = "";
String 층1분 = "";		String 층2분 = "";		String 층3분 = "";

		2. 프로그램은 무한루프를 이용합니다. 단 *- printf 이용하여 현재 층 상황을 반복적으로 출력합니다.

		3. 입차 : 사용자로부터 층 선택 과 차량번호 , 입차시간(시/분) 를 입력받습니다.
        - 단 해당 층에 차량이 있을경우 '입차불가' 없으면 '입차완료' 출력 합니다.
        - 해당 층 의 상태를 변경합니다.

		4. 출차 : 사용자로부터 층 과 출차시간(시/분)을 입력받습니다.
        - 단 해당 층에 차량이 있을경우 '출차완료[사용금액: 000원]' 없으면 '입차량이 없습니다' 출력 합니다.
        - 해당 층 의 상태를 변경합니다.

		5. 계산 : 10분당 천원으로 계산합니다.


3. 도서관 좌석 프로그램 ( 1~3 좌석 3개 )
	[ 요구사항 필수 조건 - 그외 적절하게 판단하여 구현 ]
        1. 배열 사용금지 ( 변수만 사용합니다. 아래 변수는 필수로 사용하되 새로운 변수 선언 가능 합니다. )
String 좌석1 = "";		String 좌석2= "";	 	String 좌석3="";
String 좌석1시 = "";		String 좌석2시 = "";		String 좌석3시 = "";
String 좌석1분 = "";		String 좌석2분 = "";		String 좌석3분 = "";

		2. 프로그램은 무한루프를 이용합니다. 단 *- printf 이용하여 현재 좌석 상황을 반복적으로 출력합니다.

		3. 입실: 사용자로부터 좌석 선택과 전화번호 , 입실시간(시/분)  를 입력받습니다.
        - 단 해당 좌석에 차량이 있을경우 '입실불가' 없으면 '입실완료' 출력 합니다.

        4. 퇴실 : 사용자로부터 좌석 과 현재시간(시/분)을 입력받습니다.
        - 단 해당 좌석에 차량이 있을경우 '퇴실완료[ 좌석을 이용한 시간(분) : 000분 ] ' 없으면 '입실이 없습니다' 출력 합니다.

        5. 계산 : 총 사용시간을 계산합니다.

4. 계산기
	[ 요구사항 필수 조건 - 그외 적절하게 판단하여 구현 ]
        1. 배열 사용금지 ( 변수만 사용합니다. 아래 변수는 필수로 사용하되 새로운 변수 선언 가능 합니다. )
String 피연산자1 = "";	String 피연산자2 = "";	String 연산자 = ""

		2. 프로그램은 무한루프를 이용합니다.단 *- printf 이용하여 계산 결과를 반복적으로 출력합니다.

        3. 입력 : 피연산자 , 연산자 , 피연산자 순으로 입력을 받습니다.

        4. 출력 : 입력받은 2개의 피연산자를 연산자에 맞게 계산처리 합니다.

        5. 계산 : 산술연산자만 구현합니다.

        0. 팀 과제 선정
    1 : 심재훈 , 장은경 , 김송아 , 김병래	(1)
    2 : 김동훈 , 김건우 , 이민형 , 신승호	(4)
    3 : 오승택 , 전승호 , 차준영 , 박효성	(2)
    4 : 이승호 , 노진섭 , 장혜란 , 김민지 	(3)

1. (설계) 프로그램 순서도(flowchart) 작성하기
    - 사진 찍어서 팀과제1 폴더에 넣어두기.
2. (구현) 구현파일 : 프로젝트 -> src -> 조별과제 폴더 -> 팀과제1 폴더 -> 클래스 생성 해서 구현

3. 추가기능
과제1 : 게임 시작시 난이도( 초급 , 중급 , 고급 ) 선택합니다.
예) 난이도에 따른 컴퓨터가 난수 생성에 차이를 두어 구현하며 초급 일수록 이길 확률을 올리시오.
        과제2 : 주차를 이용한 총 차량 수 와 주차을 이용한 차량들의 평균 사용시간 을 계산하여 출력하시오.
예) 총 이용차량 : 17대 / 평균 : 72분
과제3 : 좌석를 이용한 총 사람 수 와 좌석을 이용한 사람들의 평균 사용시간 을 계산하여 출력하시오.
예) 총 이용객 : 3명   /   평균 : 32분
과제4 : 첫번째 계산후 'c' 버튼을 입력할때까지 추가 연산을 진행 합니다.
예) 3+3-2-4*/
