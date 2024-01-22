package day15.Step1_다형성;

public class Step1 {//class start
    public static void main(String[] args) {//main start

        // 1. 객체 생성
        Driver driver1 = new Driver();
        Driver driver2 = new Driver();

        // 2. 객체 생성
        Bus bus = new Bus();
        driver1.drive(bus);     // 버스 운전

        // 3. 객체 생성
        Taxi taxi = new Taxi();
        driver1.drive(taxi);    // 택시로 변경
        
//        driver1.drive( taxi );  // 운전자1 택시A 운행
//        Taxi taxi2 =new Taxi(); // 택시B 생성
//        driver2.drive( taxi2 );  // 운전자2 택시B 운행

    }//main end
}//class end
