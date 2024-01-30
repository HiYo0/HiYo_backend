package day21.step3_익명객체;

public class Car {//class start

    // 1. 필드에 tire 객체 대입
    private Tire tire1 = new Tire(); // 익명 자식 객체
        // 상속 하거나 인터페이스 구현 일 경우

        // - 자식 객체 : private Tire tire2 = new KumhoTire();
        // - 익명 자식 객체 : private Tire tire2 = new Tire(){ 재정의 };
            // - 클래스가 없다 => 설계도 없다 => 재사용 불가능
    private Tire tire2 = new Tire(){
        @Override
        void roll() {
            System.out.println("익명 자식 Tire 객체 1이 굴러갑니다..");
        }
    };

    public void run1(){
        tire1.roll();
        tire2.roll();
    }

    public void run2(){
    // 2. 지역변수에 익명자식객체 대입
        Tire tire = new Tire(){
            int speed = 0;
            void roll() {
                System.out.println("익명 자식 Tire 객체 2가 굴러갑니다.");
            }
        };
    }

    // 3. 매개변수에 익명자식 객체 대입
    public void run3(Tire tire){
        tire.roll();
    }


}//class end
