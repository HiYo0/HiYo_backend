package 과제.과제7;

import java.util.Scanner;

public class View {//class start

    public static void main(String[] args) {//
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("================= 메인페이지 =================");
            System.out.println("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호 찾기");
            System.out.print("선택 > ");
            String 선택 = scanner.next();
            if (선택.equals("1")) {//회원가입
                System.out.print("사용할 ID를 입력해주세요 : ");
                String id = scanner.next();
                System.out.print("사용할 PassWord 를 입력해주세요 : ");
                String pw = scanner.next();
                System.out.print("사용자의 이름을 입력해주세요 : ");
                String name = scanner.next();
                System.out.print("사용자의 전화번호를 입력해주세요 : ");
                String phone = scanner.next();
                System.out.print("사용자의 나이를 입력해주세요 : ");
                String age = scanner.next();
                MemberDto memberDto = new MemberDto(id, pw, name, phone, age);

                if (Controller.getInstance().회원가입(memberDto)) {
                    System.out.println("회원가입 성공");
                } else {
                    System.out.println("회원가입 실패");
                }

            } else if (선택.equals("2")) {//로그인
                System.out.print("ID를 입력해주세요 : ");
                String id = scanner.next();
                System.out.print("PassWord 를 입력해주세요 : ");
                String pw = scanner.next();
                if(Controller.getInstance().로그인(id,pw)){
                    System.out.println("\n로그인 성공\n");
                }else {
                    System.out.println("\n로그인 실패\n");
                }

            } else if (선택.equals("3")) {// 아이디 찾기
                System.out.print("가입시 입력하신 이름을 입력해주세요 : ");
                String name = scanner.next();
                System.out.print("가입시 입력하신 전화번호를 입력해주세요 : ");
                String phone = scanner.next();

                    // 입력한 정보로 아이디가 존재하는지 판별
                if(Controller.getInstance().아이디존재여부(name,phone)) {
                    //있으면 가입했던 아이디를 출력해줌
                    System.out.println("찾으시는 ID = " + Controller.getInstance().아이디찾기(name, phone) + " 입니다.");
                }else {
                    // 없으면
                    System.out.println("\n입력해주신 정보로 찾을수 있는 ID가 존재하지 않습니다.\n");
                }


            } else if (선택.equals("4")) {// 비밀번호 찾기
                System.out.print("가입시 입력하신 ID를 입력해주세요 : ");
                String id = scanner.next();
                System.out.print("가입시 입력하신 이름을 입력해주세요 : ");
                String name = scanner.next();
                System.out.print("가입시 입력하신 전화번호를 입력해주세요 : ");
                String phone = scanner.next();

                if(Controller.getInstance().아이디존재여부(name,phone)) {
                    //있으면 가입했던 아이디를 출력해줌
                    System.out.println("\n입력하신 ID "+id+"의 임시 비밀번호가 발급됩니다.");
                    System.out.println("임시비밀번호 = " + Controller.getInstance().비밀번호찾기(id,name,phone) + " 입니다.\n");
                }else {
                    // 없으면
                    System.out.println("\n입력해주신 정보로 찾을수 있는 ID가 존재하지 않습니다.\n");
                }


            } else {
                System.out.println("\n입력 오류\n");
            }


        }
    }

}//class end
