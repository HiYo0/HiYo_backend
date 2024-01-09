package 과제.과제3_조과제;

import java.util.Scanner;

public class ex1_배열ver {//class start

    public static void main(String[] args) {//main start
        Scanner scanner = new Scanner(System.in);

        String[] 층 = new String[3];
        String[] 시 = new String[3];
        String[] 분 = new String[3];

        while (true){
            /*출력부분*/
            for (int i =0; i<층.length; i++) {
                if (층[i] != null) {
                    System.out.printf("%d층 차량번호 : %s \t입차시간 : %s 시 %s 분 \n", i, 층[i], 시[i], 분[i]);
                }
            }


                System.out.print("원하는 작업을 선택해주세요(입차/출차/종료) : ");
                String 입력작업 = scanner.nextLine();
                if (입력작업.equals("입차")) {
                    while (true) {

                        System.out.print("입차를 희망하는 층 선택해주세요(1~3) : ");
                        int 입력받은층 = scanner.nextInt();
                        if (입력받은층 >= 1 && 입력받은층 <= 층.length) {
                            if (층[입력받은층 - 1] == null) {
                                // 층에 값 없으면 등록하기
                                System.out.print("차량번호를 입력해주세요 : ");
                                String 층입력 = scanner.nextLine();
                                System.out.print("입차 '시'를 입력해주세요 : ");
                                String 시입력 = scanner.nextLine();
                                System.out.print("입차 '분'을 입력해주세요 : ");
                                String 분입력 = scanner.nextLine();

                                층[입력받은층 - 1] = 층입력;
                                시[입력받은층 - 1] = 시입력;
                                분[입력받은층 - 1] = 분입력;
                                break;
                            } else {
                                System.out.println("해당층에 차량이 있습니다.");
                            }
                        } else {
                            System.out.println("잘못된 층을 입력하셧습니다\n");
                        }
                    }//while1 End

////////////////////////////////////////////////////////////////
                } else if (입력작업.equals("출차")) {
                    /*여기에 출차 코드 입력해주세요*/
                    while (true) { //while2 start
                        int 출차층 = 0;
                        int 출차시 = 0;
                        int 출차분 = 0;
                        int 금액 = 0;

                        System.out.print("층을 입력해주세요 : ");
                        출차층 = scanner.nextInt();
                        if (층[출차층-1] == null) {
                            System.out.println("입차량이 없습니다.");
                        } else {
                            // 나갈시간과 나갈 분 입력받음
                            System.out.print("출차시를 입력하세요 : ");
                            출차시 = scanner.nextInt();
                            System.out.print("출차분을 입력하세요 : ");
                            출차분 = scanner.nextInt();

                            금액 = (((출차시 * 60) + 출차분) - ((Integer.parseInt(시[출차층 - 1]) * 60) + Integer.parseInt(분[출차층 - 1]))) * 100;

                            System.out.println("\n\n출차완료[사용금액 : " + 금액 + "]원\n");
                            층[출차층 - 1] = null;
                            시[출차층 - 1] = null;
                            분[출차층 - 1] = null;
                            break;
                        }
                    }//while2 End


                } else if (입력작업.equals("종료")) {
                    System.out.println("\n프로그램 종료\n");
                    break;
                } else {
                    System.out.println("\n입력확인해주세요\n");
                }


        }//while End
    }//main end
}//class end
