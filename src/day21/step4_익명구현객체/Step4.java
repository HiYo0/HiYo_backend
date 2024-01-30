package day21.step4_익명구현객체;

public class Step4 {//class start

    public static void main(String[] args) { // main start
        // 1.
        Home home = new Home();
        // 2. 매개변수에 익명 구현 객체 대입
        home.use3(new RemoreControl() {
            @Override
            public void turnOn() {
                System.out.println("난방을 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("난방을 끕니다.");
            }
        });
    }//main end
}//class end
