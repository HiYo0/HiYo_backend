package day22.step3_제네릭인터페이스;

public class Step3 {
    public static void main(String[] args) {
        // 1. 대리점 객체 생성
        HomeAgency 상록수대리점 = new HomeAgency();
        // 2. 랜탈 요청
        Home home=상록수대리점.rent();
        // 3. 랜탈된 객체 이벤트 실행
        home.turnOnLight();


        // 1. 대리점 객체 생성
        CarAgency 중앙대리점 = new CarAgency();
        // 2. 랜탈 요청
        Car car = 중앙대리점.rent();
        // 3. 랜탈된 객체 이벤트 실행
        car.run();


    }// main end
}//class end
