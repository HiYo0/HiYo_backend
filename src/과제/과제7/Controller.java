package 과제.과제7;


public class Controller {//class start

    //싱글톤 만들기
    private Controller(){}
    private static Controller controller =new Controller();
    public static Controller getInstance(){return controller;}

    // 1. 회원가입
    public boolean 회원가입(MemberDto memberDto){

        boolean result = MemberDao.getInstance().회원가입(memberDto);
        return result;
    }
}//class end
