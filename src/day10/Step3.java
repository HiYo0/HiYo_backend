package day10;

public class Step3 {//class start

    public static void main(String[] args) {//main start

        // p.237
            // 1. 객체 생성
        Car myCar = new Car();
            // 2. 필드에 5 저장
        myCar.gas = 50;
            // vs
        myCar.setGas(5);
        if(myCar.isLeftGas()){
            System.out.println("출발합니다.");
            myCar.run();
        }
        System.out.println("gas를 주입하세요.");

    }//main end
}//class end
