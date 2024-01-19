package day14.Step3;

public class Car {//class start

    // 1. 한국타이어 객체 + 하위객체
    HankookTire hangkookTire;
    // 2. 금호타이어 객체 + 하위객체
    KumhoTire kumhoTIre;
    // 3. 타이어 객체 + 하위객체( 한국타이어 , 금호타이어 )
    Tire tire;
    // 4. 객체 + 자바의 모든 객체
    Object object;

    // 메소드
    public void run(){
        tire.roll();
    }

}//class end
