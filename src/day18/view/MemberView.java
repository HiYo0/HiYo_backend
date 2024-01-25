package day18.view;

import java.util.Scanner;

public class MemberView {//class start
    // 싱글톤
    private MemberView(){};
    private static MemberView memberView = new MemberView();
    public static MemberView getInstance(){return memberView;}

    Scanner scanner = new Scanner(System.in);

    // 1. 회원가입
    public void sugnup(){
        System.out.print("생성할 ID를 입력하시오 > ");String id = scanner.next();
    }

    // 2. 로그인


}//class end
