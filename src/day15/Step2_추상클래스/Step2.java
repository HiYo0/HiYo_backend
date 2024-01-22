package day15.Step2_추상클래스;

public class Step2 {//class start
    public static void main(String[] args) {//main start
        // 1. 추상클래스 객체 생성
        // Phone phone = new Phone("홍길동");
        // 2.
        SmartPhone smartPhone = new SmartPhone("홍길동");
        Phone phone1 = new SmartPhone("홍길동");

        // 3.
        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();

    }//main end
}//class end
