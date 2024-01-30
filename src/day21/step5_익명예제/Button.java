package day21.step5_익명예제;

public class Button {//class start

    // 중첩인터페이스
    public static interface ClickListener{
        void onClick();
    }

    // 필드
    private ClickListener clickListener;

    // 메소드
    public void setClickListener(ClickListener clickListener){
        this.clickListener = clickListener;
    }
    // 메소드
    public void click(){
        this.clickListener.onClick();
    }
}//class end
