package day11;

public class Step2 {//class start

    public static void main(String[] args) {//main start
        Car myCar = new Car();

        // speed 필드가 private 이므로 외부에서 접근 불가능
        // myCar.speed = -50;
        
        // 메솓를 이용한 speed 필드에 접근
        myCar.setSpeed(-50); // 유효성검사
        System.out.println("myCar = " + myCar.getSpeed());

        myCar.setSpeed(60); // 유효성검사
        System.out.println("myCar = " + myCar.getSpeed());

        // 만약에 Car객체의 stop필드가 false 이면
        if(!myCar.isStop()){
            myCar.setStop(true); // 멈춤
        }


    }//main end
}//class end
