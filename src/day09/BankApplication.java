package day09;

import java.util.Scanner;

public class BankApplication {//class start 실행클래스

    // 클래스멤버
    // 1. 필드
    static Account[] accounts = new Account[100];
    static Scanner scanner = new Scanner(System.in);
    // main() 함수 아닌 main() 밖에 정적필드로 선언하는 이유 : 여럿 함수에서 사용할려고.
    // 2. 생성자
    // 3. 메소드

    static void 계좌생성(){// 2. 계좌생성
        System.out.println("BankApplication.계좌생성");
        // 1. 입력받기
        System.out.print("계좌번호 : "); String accountNumber = scanner.nextLine();
        System.out.print("예금주 : "); String name = scanner.nextLine();
        System.out.print("초기입금액 : "); String money = scanner.nextLine();

        // 2. 객체생성
        Account account = new Account(accountNumber,name,money);

        // 3. 객체를 배열에 넣는다.
            // 정적메소드에서는 인스턴스 필드를 호출할수 없다.
                // 1. 인스턴스를 static 한다.
                // 2. 객체생성한다???[ x ] => 사라짐
        for (int i = 0; i < accounts.length; i++) {
            if(accounts[i]==null){ // 만약에 비어있으면 객체 저장
                accounts[i]= account;
                break;
            }
        }//for emd


    }//function end

    static void 계좌목록(){// 3. 계좌목록
        for (int i = 0; i < accounts.length; i++) {
            Account account = accounts[i];
            if(accounts[i] ==null)break;
            System.out.printf("%10s \t %5s \t%10s \n",account.accountNumber,account.name,account.money);

        }
    }

    static void 예금(){// 4. 예금
        // * 입력받은 계좌번호가 계좌목록에 존재하면 입력한 예금액을 찾은계좌에 추가대입 [ 1 명 ]
        System.out.print("예금] 계좌번호 : "); String accountNumber = scanner.nextLine();
        System.out.print("예금] 예금액 : "); String money = scanner.nextLine();
        // 2. 계좌목록/배열 에서 입력계좌를 찾은다
        for (int i = 0; i < accounts.length; i++) {
            Account account =accounts[i];
            if(account==null)break;
            // 만약에 동일한 계좌번호의 객체가 있으면 해당 객체내 입금액을 더한다.
            if(account.accountNumber.equals(accountNumber)){account.money = Integer.toString(Integer.parseInt(account.money)+Integer.parseInt(money)); break;}
        }// for end
    }

    static void 출금(){// 5. 출금
        
        System.out.print("출금] 계좌번호 : "); String accountNumber = scanner.nextLine();
        System.out.print("출금] 예금액 : "); String money = scanner.nextLine();

        // 2. 계좌목록/배열 에서 입력계좌를 찾은다
        for (int i = 0; i < accounts.length; i++) {
            Account account =accounts[i];
            if(account==null)break;
            // 만약에 동일한 계좌번호의 객체가 있으면 해당 객체내 입금액을 더한다.
            if(account.accountNumber.equals(accountNumber)){account.money = Integer.toString(Integer.parseInt(account.money)-Integer.parseInt(money)); break;}
        }// for end
    }


    public static void main(String[] args) {//main start    // 1. 실행 시작점

        while (true){//while start
            // 메뉴 출력
            System.out.println("----------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("----------------------------------------------");
            System.out.print("선택> "); String ch = scanner.nextLine();

            if (ch.equals("1")){
                계좌생성();
            } else if (ch.equals("2")) {
                계좌목록();
            }else if (ch.equals("3")) {
                예금();
            }else if (ch.equals("4")) {
                출금();
            }else if (ch.equals("5")) {//종료
                System.out.println("프로그램종료");
                break;
            }else {
                System.out.println("잘못쓴듯");
            }



        }//while end
    }//main end


}//class end
