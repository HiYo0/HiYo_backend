package 과제.과제9_팀;

import day07.Student;
import day12.model.MemberDao;

public class 그림판A implements 그림판도구툴 {

    private String 현재팬종류 = "팬";
    private int 현재굵기 = 10;
    private String 현재색상 = "검정색";

//    private 그림판A(){}
//    private static 그림판A 그림판A = new 그림판A();
//    public static 그림판A getInstance(){return 그림판A;}

    @Override
    public void 팬() {
        System.out.println("팬 툴을 선택하셧습니다.");
        this.현재팬종류 = "팬";
        System.out.println("현재팬종류 : "+this.현재팬종류);
        System.out.println("현재색상 : "+this.현재색상);
        System.out.println("현재굵기 : "+this.현재굵기);

    }

    @Override
    public void 붓() {
        System.out.println("붓 툴을 선택하셧습니다.");
        this.현재팬종류 = "붓";
        System.out.println("현재팬종류 : "+this.현재팬종류);
        System.out.println("현재색상 : "+this.현재색상);
        System.out.println("현재굵기 : "+this.현재굵기);

    }

    @Override
    public void 연필() {
        System.out.println("연필 툴을 선택하셧습니다.");
        this.현재팬종류 = "연필";
        System.out.println("현재팬종류 : "+this.현재팬종류);
        System.out.println("현재색상 : "+this.현재색상);
        System.out.println("현재굵기 : "+this.현재굵기);
    }

    @Override
    public void 굵기(int 굵기) {
        this.현재굵기 = 굵기;
        System.out.println("굵기가 "+굵기+"px 로 변경되었습니다.");

    }

    @Override
    public void 색상(String 색상) {
        this.현재색상 = 색상;
        System.out.println("색상이 "+색상+"(으)로 변경되었습니다.");
    }

    @Override
    public void 출력() {
        System.out.println(this.현재팬종류);
        System.out.println(this.현재색상);
        System.out.println(this.현재굵기);
    }

}//class end
