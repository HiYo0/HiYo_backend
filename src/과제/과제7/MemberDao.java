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
    // ID중복검사 : 배열속에 같은 ID있는지 확인 :사용 = 회원가입
    private boolean 중복검사(String id){
        for (int i = 0; i < 배열.size(); i++) { // 중복검사
            if(배열.get(i).get아이디().equals(id)){
                return false; //같은아이디 있음
            }
        }

        return true;// 같은아이디 없음
    }

    // 로그인
    public boolean 로그인(String id,String pw){
        for (int i = 0; i < 배열.size(); i++) {
            // 만약 배열의 i번째에 아이디가 입력 아디디와 패스워드가 일치한다면
            if(배열.get(i).get아이디().equals(id)&&배열.get(i).get비밀번호().equals(pw)){
                return true;
            }
        }
        return false;
    }

    // 아이디찾기1 존재유무
    public boolean 아이디존재여부(String name , String phone){
        for (int i = 0; i < 배열.size(); i++) {
            if(배열.get(i).get이름().equals(name)&&배열.get(i).get전화번호().equals(phone)){
                return true;
            }
        }
        return false;
    }
    //아이디 찾기2 출력용
    public String 아이디찾기(String name , String phone){
        for (int i = 0; i < 배열.size(); i++) {
            if (배열.get(i).get이름().equals(name) && 배열.get(i).get전화번호().equals(phone)) {
                return 배열.get(i).get아이디();
            }
        }
        return "";
    }
    //비밀번호 찾기 출력용
    public String 비밀번호찾기(String id ,String name , String phone){
        String 임시비밀번호 = "";
        for (int i = 0; i <6; i++) {
            임시비밀번호 += Integer.toString((int)(Math.random()*10));
        }
        for (int i = 0; i < 배열.size(); i++) {
            if (배열.get(i).get아이디().equals(id) && 배열.get(i).get이름().equals(name)&&배열.get(i).get전화번호().equals(phone)) {
                배열.get(i).set비밀번호(임시비밀번호);
                return 임시비밀번호;
            }
        }
        return "";
    }
}//class end
