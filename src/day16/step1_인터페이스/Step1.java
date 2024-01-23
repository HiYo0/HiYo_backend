package day16.step1_인터페이스;

public class Step1 {//class start

    public static void main(String[] args) {//main start
        // 1. 인터페이스 변수 선언
        RemoteControl rc;
        // 2. 인터페이스 변수에 객체참조 값 대입
        rc = new Television();  // - 다형성
            // RemoteControl remoteControl = new Television();
            // 타입이 다른데 가능한 이유 : extends , implements
        // 3. 인터페이스의 메소드 호출하면 구현객체의 메소드가 호출된다.
        rc.turnon();

        // 다형성( 교체 )
        rc = new Audio();
        rc.turnon();

    }//main end
}//class end
