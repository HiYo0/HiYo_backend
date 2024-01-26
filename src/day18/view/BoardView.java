package day18.view;

import day18.controller.BoardControl;
import day18.controller.MemberController;
import day18.model.dto.BoardDto;
import day18.model.dto.CategoryDto;
import day18.model.dto.MemberDto;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BoardView {//class start
    // 싱글톤
    private BoardView(){}
    private static BoardView boardView= new BoardView();
    public static BoardView getInstance(){return boardView;}
    // 입력객체
    Scanner scanner = MainView.getInstance().scanner;

    // 0. 로그인 성공시 출력되는 화면.
    public void run(){
        while (true){
            System.out.println("============================ 으냐 게시판 ============================");
            // 추후에 현재 게시물을 출력 메소드가 들어갈 자리
                // 보드 전체 출력
            ArrayList<BoardDto> view = BoardControl.getInstance().boardView();
                // 카테고리이름 출력
            ArrayList<CategoryDto> categoryView = BoardControl.getInstance().categoryView();
                // 작성자이름 출력
            ArrayList<MemberDto>memberDtos = BoardControl.getInstance().memberName();
            System.out.print("게시물번호\t\t카테고리\t\t작성자\t\t작성일\t\t\t\t\t\t조회수\t\t제목\t\t\n");
            for (int i = 0; i < view.size(); i++) {
                System.out.printf("%-10d\t\t%4s\t\t%4s\t\t%10s\t\t%5d\t%10s\n",
                        view.get(i).getBno(),
                        categoryView.get(view.get(i).getCno()).getCname(),
                        memberDtos.get(view.get(i).getMno()-1).getMid(),
                        view.get(i).getBdate(),
                        view.get(i).getBcount(),
                        view.get(i).getBtitle());
            }
            // ==================================================================
            System.out.println(" 1.글쓰기 2.글보기 3.로그아웃");
            System.out.print("선택 > ");int ch = scanner.nextInt();
            try {
                if (ch == 1) {// 글쓰기
                    System.out.println("글쓰기 항목입니다.");
                    System.out.println("작성하실 카테고리를 선택해주세요");
                    // 가지고있는 카테고리 출력 영역============================
                    categoryView = BoardControl.getInstance().categoryView();;
                    for (int i = 0; i < categoryView.size(); i++) {
                        System.out.print(i+". "+categoryView.get(i).getCname()+"\t");
                    }
                    System.out.println("");
                    // ======================================================
                    System.out.print("선택 > "); int cateCh = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("\n\n제목 : "); String btitle = scanner.nextLine();
                    System.out.print("내용 : "); String bcontent = scanner.nextLine();

                    BoardDto boardDto = new BoardDto();
                    boardDto.setCno(cateCh);    // 카테고리
                    boardDto.setBtitle(btitle); // 제목
                    boardDto.setBcontent(bcontent); // 내용
                    boardDto.setMno(MemberController.getInstance().getLoginMno());// 작성자번호
                    boardDto.setBcount(0);


                    if(BoardControl.getInstance().write(boardDto)){
                        System.out.println("안내] 작성등록에 성공하셧습니다.");
                    }else {
                        System.out.println("안내] 등록실패 하였습니다.");
                    }


                } else if (ch == 2) {// 글보기
                    System.out.println("");

                } else if (ch == 3) {//로그아웃
                    System.out.println("로그아웃 되었습니다.");
                    MemberController.getInstance().logout(); // 로그아웃 처리요청
                    return; // 현재 메소드 종료
                }
            }catch (InputMismatchException e){
                System.out.println("숫자로 입력해주세요" + e);
            }


        }// while end
    }// run method end
}//class end
