package 과제.과제5.과제1;

import java.util.Scanner;

public class P281_20번 {/* p.281 문제임 */ //class start

    public static void main(String[] args) {// main start

        Account[] BankApplication = new Account[100];

        Scanner scanner = new Scanner(System.in);
        while (true){//w
            // 메뉴 출력
            System.out.println("----------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("----------------------------------------------");

            System.out.print("선택> "); String ch = scanner.nextLine();

            if(ch.equals("1")){//계좌생성
                System.out.println("-------------");
                System.out.println("계좌생성");
                System.out.println("-------------");

                System.out.print("계좌번호: "); String accountNumber = scanner.nextLine();
                System.out.print("계좌주: "); String name = scanner.nextLine();
                System.out.print("초기입금액: "); String money = scanner.nextLine();

                Account account = new Account(accountNumber,name,money);

                for (int i = 0; i < BankApplication.length; i++) {
                    if(BankApplication[i]==null){
                        BankApplication[i]=account; break;
                    }
                }// 없는대 추가하고 반복문종료

            } else if (ch.equals("2")) {//계좌목록 출력
                System.out.println("--------------------------------");
                System.out.println("계좌목록");
                System.out.println("--------------------------------");
                System.out.printf("%4s \t %3s \t\t %2s\n","계좌번호","예금주","잔액");
                for (int i = 0; i < BankApplication.length; i++) {
                    if(BankApplication[i]!=null) {
                        System.out.printf("%7s \t %3s \t\t %s\n",BankApplication[i].accountNumber,BankApplication[i].name,BankApplication[i].money);
                    }
                }


            } else if (ch.equals("3")) {//예금
                System.out.print("계좌번호: "); String accountNumber = scanner.nextLine();
                System.out.print("예금액: "); String money = scanner.nextLine();
                for (int i = 0; i < BankApplication.length; i++) {
                    if(BankApplication[i].accountNumber.equals(accountNumber)){
                        int a = Integer.parseInt(BankApplication[i].money);
                        int b = Integer.parseInt(money);
                        BankApplication[i].money=Integer.toString(a+b);break;
                    }
                }

            } else if (ch.equals("4")) {//출금
                System.out.print("계좌번호: "); String accountNumber = scanner.nextLine();
                System.out.print("출금액: "); String money = scanner.nextLine();
                for (int i = 0; i < BankApplication.length; i++) {
                    if(BankApplication[i].accountNumber.equals(accountNumber)){
                        int a = Integer.parseInt(BankApplication[i].money);
                        int b = Integer.parseInt(money);
                        BankApplication[i].money=Integer.toString(a-b);break;
                    }
                }

            } else if (ch.equals("5")) {//종료
                System.out.println("프로그램 종료");
                break;
            }else {
                System.out.println("\n잘못입력된 명령입니다.\n");
            }


        }


    }// main end
}// class end
