package day22.step2;

public class Step2 {//class start

    public static void main(String[] args) {//main start
        // * 클래스 선언시 객체 필드의 타입을 다양하게 사용하기 위해
        // - Object , 타입변환필요 2. 제네릭<>
        // 1. Product클래스에 Tv 타입, String타입 정의

        Product<Tv,String> product1 = new Product<>();
        /*
            - product1객체의 필드 상태
            private Tv kind;
            private String model;
         */

        // 2. 대입
        product1.setKind(new Tv()); // 해당 kind필드가 Tv 타입이므로 Tv객체 대입 가능.
        product1.setModel("스마트TV"); // 해당 model필드가 String타입이므로 String객체 대입 가능.

        // 3. 호출
        Tv tv = product1.getKind();
        String model = product1.getModel();
        // -------------------------------------------------- //
        Product<Car , String >product2 = new Product<>();
        /*
            - product1 객체의 필드상태
            private Car kind;
            private String model;
         */
        // product2.setKind(new Tv());  // 제네릭에서 정의한 타입이 다르므로 불가능
        product2.setKind(new Car());
        product2.setModel("SUB자동차");

        Car car = product2.getKind();
        String carModer = product1.getModel();




    }//main end
}//class end
