package day14.Step3;

public class Step3 {//class start

    public static void main(String[] args) {//main start
        // 1. 객체 생성
        Car myCar = new Car();
            // myCar.tire = null;
        // 2. 객체의 필드 값 수정 => 타이어 장착

        myCar.tire = new Tire();
            // myCar.tire = Tire객체참조;
        myCar.run();
        // ---------- 필드 다형성 : 필드가 가지고 있는 객체참조의 타입을 변경 --------- //

        myCar.tire = new HangkookTire();
            // myCar.tire = HangkookTire객체참조;
        myCar.run();

        myCar.tire = new KumhoTire();
            // myCar.tire = KumhoTire객체참조;
        myCar.run();
        
    }//main end
}//class end
