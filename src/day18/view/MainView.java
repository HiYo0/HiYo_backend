package day18.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainView {//class start
    Scanner scanner = new Scanner(System.in);
    // 싱글톤
     private MainView(){}
     private static MainView mainView = new MainView();
     public static MainView getInstance(){return mainView;}

    public void run(){
        while (true){
            System.out.println("============ 메인 페이지 =============");
            System.out.println("1.회원가입 2.로그인");
            try {
                System.out.print("선택 > ");int ch = scanner.nextInt();
                if(ch ==1){// 회원가입
                    MemberView.getInstance().signup();
                } else if (ch ==2) {// 로그인
                    MemberView.getInstance().login();
                }else {System.out.println("잘못된 기능 번호입니다.");}
            }catch (InputMismatchException e){
                System.out.println("오류남 번호써야하는대 문자씀"+e);
                scanner= new Scanner(System.in);
            }catch (NullPointerException e){
                System.out.println("찾는값이 null임"+e);
            }
            catch (Exception e){// 그외
                System.out.println("그외 오류"+e);
            }
        }
    }
}//class end
