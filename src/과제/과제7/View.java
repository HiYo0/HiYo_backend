package 과제.과제7;

import java.util.Scanner;

public class View {//class start

    public static void main(String[] args) {//
        Scanner scanner = new Scanner(System.in);

        System.out.println("================= 메인페이지 =================");
        System.out.println("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호 찾기");
        System.out.print("선택 > "); String 선택 = scanner.next();
        if (선택.equals("1")){
            System.out.print("사용할 ID를 입력해주세요");String id = scanner.next();
            System.out.print("사용할 PassWord 를 입력해주세요");String pw = scanner.next();
            System.out.print("사용자의 이름을 입력해주세요");String name = scanner.next();
            System.out.print("사용자의 전화번호를 입력해주세요");String phone = scanner.next();
            System.out.print("사용자의 나이를 입력해주세요");String age = scanner.next();
            MemberDto memberDto = new MemberDto(id,pw,name,phone,age);

            if(Controller.getInstance().회원가입(memberDto)){
                System.out.println("회원가입 성공");
            }else {
                System.out.println("회원가입 실패");
            }

        } else if (선택.equals("2")){

        } else if (선택.equals("3")){

        } else if (선택.equals("4")){

        } else {
            System.out.println("\n입력 오류\n");
        }



    }

}//class end
