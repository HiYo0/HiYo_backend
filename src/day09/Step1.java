package day09;

public class Step1 {//class start

    public static void main(String[] args) {// main start

        // p.231
            // JS코드를 읽어 주는 역활 : HTML(JS) <-- 브라우저 ( 프로그램[스레드] )
            // JAVA 코드를 읽어주는 역활 : main함수() <-- main 스래드
            // !!!!. 필드/메소드를 사용하기 위해서는 꼭!!! 객체가 필요
            // Calculator.powerOn();

        // 1. 객체 생성
            // new Calculator_메소드();
        Calculator_메소드 myCalc = new Calculator_메소드();

        // 2. 객체내 멤버(필드/메소드) 호출
        myCalc.powerOn();
            // *
        new Calculator_메소드().powerOn();

        // 3. 메소드 호출 하고 매개변수 전달.
            // - 매개변수 타입과 개수에 맞게 제공한다.
        myCalc.plus(5,6);
        // myCalc.puls("오","육");    // 타입이 불일치
            // - 리턴값이 있는 경우에는 변수에 저장
        int result = myCalc.plus(5,6);
        System.out.println("result = " + result);

        // 4.
        int x = 10;
        int y = 4;
        double result2 = myCalc.divide(x,y);
        System.out.println("result2 = " + result2);

        // 5.
        myCalc.powerOff();

    }//main end
}//class end
