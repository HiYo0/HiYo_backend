package 과제.과제7;

import java.util.ArrayList;

public class MemberDao {//class start

    // 싱글톤
    private MemberDao(){}
    private static MemberDao memberDao = new MemberDao();
    public static MemberDao getInstance(){return memberDao;}

    //배열
    ArrayList<MemberDto> 배열 = new ArrayList<>();

    // 회원가입
    public boolean 회원가입(MemberDto memberDto){
        if(중복검사(memberDto.get아이디())){
            배열.add( memberDto );
        }else {
            return false; // 회원가입 실패
        }

        return true; // 회원가입성공
    }
    // 3. ID중복검사 : 배열속에 같은 ID있는지 확인 :사용 = 회원가입
    private boolean 중복검사(String id){
        for (int i = 0; i < 배열.size(); i++) { // 중복검사
            if(배열.get(i).get아이디().equals(id)){
                return false; //같은아이디 있음
            }
        }

        return true;// 같은아이디 없음
    }
}//class end
