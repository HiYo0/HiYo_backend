package day21.step5_익명예제;

public class Click implements Button.ClickListener {//class start


    @Override
    public void onClick() {
        System.out.println("구현 객체를 이용한] OK 버튼을 클릭했습니다.");
    }
}//class end
