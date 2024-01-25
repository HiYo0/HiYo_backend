package day18.controller;

import day18.model.dao.MemberDao;
import day18.model.dto.MemberDto;

public class MemberController {//class start

    private MemberController(){}
    private static MemberController memberController = new MemberController();
    public static MemberController getInstance(){return memberController;}

    // 1. 회원가입
    public int signup(MemberDto memberDto){
        // 1. 반환변수
        int result = 0;

            // 3. 가공처리 / 로직
                // 1. 만약에 입력받은 아이디의 길이가 3글자 미만이면 실패.
            if(memberDto.getMid().length()<3){return 3;}
                // 2. 아이디 중복검사
            if(MemberDao.getInstance().idCheck(memberDto.getMid())){return 2;}

                // 3. 회원가입요청
            result= MemberDao.getInstance().signup(memberDto);
            result = 0; // 샘플
        // 2. 반환
        return result;
    }

    // - 로그인 상태 필드. [ boolean 했다/안했다, String 아이디/null , int 회원번호/0 , dto 객체/null ]
    int loginMno = 0;
        // - 나중에 글쓰기 할때 fk에 pk번호 삽입.

    // 2. 로그인
    public boolean login(MemberDto memberDto){
        boolean result = false;

        result = MemberDao.getInstance().login(memberDto);
        if(result){
            loginMno=MemberDao.getInstance().findMno(memberDto.getMid());
        }

        return result;
    }

    // 2-2 로그아웃
    public void logout(){
        loginMno = 0;
    }

}//class end
