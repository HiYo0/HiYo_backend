package day13.step3_super;

public class Step3 {//class start

    public static void main(String[] args) {// main start

        // p. 297~
            // 1. 자식객체를 만들면 부모객체 같이 만들어진다.
        SupersonicAirplane sa = new SupersonicAirplane();

            // 2. 자식객체는 부모객체 멤버를 사용할수 있다.
        sa.takeOff();
        // 단 자식객체가 부모객체 메소드를 재정의(오버라이딩) 했을때. 본인 객체 메소드가 우선순위가 됨
        sa.fly();
            // 3. 외부클래스에서 상수(static) 호출시 객체가 필요 없음.     클래스.static필드
        sa.flyMode = SupersonicAirplane.SUPERSONUC;
        sa.fly();
            // 4.
        sa.flyMode = SupersonicAirplane.NORMAL;
        sa.fly();
            // 5.
        sa.land();

    }// main end
}// class end
