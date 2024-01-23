package 과제.과제9_팀;

import java.util.Scanner;

public class 과제test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        그림판도구툴 tool;
        tool = new 그림판A();

        while (true) {
            System.out.println("1.팬선택 | 2.굵기조정 | 3.색상선택 | 4.현재사용중인거");
            System.out.print("기능선택 (1~4) > ");String 기능선택 = scanner.next();
            if (기능선택.equals("1")){
                System.out.println("1.팬툴 | 2.붓툴 | 3.연필");
                System.out.print("사용할 팬을 선택해주세요(1~3) : ");
                String 선택번호 = scanner.next();
                if(선택번호.equals("1")){
                    tool.팬();
                } else if (선택번호.equals("2")) {
                    tool.붓();
                } else if (선택번호.equals("3")) {
                    tool.연필();
                }else {
                    System.out.println("잘못된 입력");
                }
            } else if (기능선택.equals("2")) {
                System.out.print("사용할 굴기를 입력해주세요 : ");
                int 굵기 = scanner.nextInt();
                tool.굵기(굵기);

            } else if (기능선택.equals("3")) {
                System.out.print("사용할 색상를 입력해주세요 : ");
                String 색상 = scanner.next();
                tool.색상(색상);

            } else if (기능선택.equals("4")) {
                tool.출력();

            }else {
                System.out.println("입력오류");
            }

        }

    }//main end
}//class end
