package 과제.과제7;


public class Controller {//class start

    //싱글톤 만들기
    private Controller(){}
    private static Controller controller =new Controller();
    public static Controller getInstance(){return controller;}

    // 회원가입
    public boolean 회원가입(MemberDto memberDto){

        boolean result = MemberDao.getInstance().회원가입(memberDto);
        return result;
    }

    // 로그인
    public boolean 로그인(String id,String pw){
        boolean result = MemberDao.getInstance().로그인(id,pw);

        return result;
    }

    //아이디 찾기1 존재유무
    public boolean 아이디존재여부(String name , String phone){
        boolean result = MemberDao.getInstance().아이디존재여부(name,phone);
        return result;
    }
    //아이디 찾기2 출력용
    public String 아이디찾기(String name , String phone){
        String result = MemberDao.getInstance().아이디찾기(name,phone);
        return result;
    }
    //비밀번호 찾기 출력용
    public String 비밀번호찾기(String id , String name , String phone){
        String result = MemberDao.getInstance().비밀번호찾기(id,name,phone);
        return result;
    }
}//class end
