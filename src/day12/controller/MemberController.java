package day12.controller;

import day12.model.MemberDao;
import day12.model.MemberDto;

// CONTROLLER : VIEW 와 DAO 의 중계 역할
public class MemberController {//Class start

    // 싱글톤
    private MemberController(){}
    private static MemberController memberController = new MemberController();
    public static MemberController getInstance(){return memberController;}

    // 1. 회원가입 controller 메소드
    public boolean signup(MemberDto memberDto){
        // 컨트롤 처리
        boolean result = MemberDao.getInstance().signup(memberDto);
        return result;
    }
    // + 로그인 했다는 증거. - 로그아웃을 하기전까지. [ 식별가능한 데이터 : 회원번호 또는 아이디 ]
    String loginSession = null; // null 이면 비로그인 null 대신에 아이디가 있으면 로그인 상태

    // 2. 로그인 메소드
    public boolean login(MemberDto memberDto){
        System.out.println("[2]MemberController.login");

        boolean result = MemberDao.getInstance().login(memberDto);
        System.out.println("[4] result = " + result);

        if(result){
            //로그인상태 필드에 로그인 성공한 아이디를 대입한다.
            loginSession = memberDto.getId();
        }

        return result;
    }

}//class end
