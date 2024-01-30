package day21.step4_익명구현객체;

public class Home {

    // 1. 필드에 익명 구현 객체 대입
        // 1. 인터페이스는 추상메소드[선언o실행x] 가 존재하므로 객체 생성 불가.
            // 실행부를 구현(오버라이딩)
            // 1. 구현클래스         : class 클래스명 implements 인터페이스명{ }
            // 2. 익명 구현 객체     : new 인터페이스명(){  };
    private RemoreControl rc = new RemoreControl() {
        // 1. 필드 O
        int a= 0;

        // 2. 생성자 x

        // 3. 메소드 O (*오버라이딩 필수)
        public void method(){ }
        @Override
        public void turnOn() {
            System.out.println("TV를 켭니다.");
        }

        @Override
        public void turnOff() {
            System.out.println("TV를 끕니다.");
        }
    };

    // 2. 지역 변수에 익명 구현 객체 대입
    public void use2(){
        RemoreControl rc = new RemoreControl() {
            @Override
            public void turnOn() {System.out.println("TV를 켭니다.");}

            @Override
            public void turnOff() {System.out.println("TV를 끕니다.");}
        };
    }

    // 3. 매개 변수에 익면 구현 객체 대입
    public void use3(RemoreControl rc){
        rc.turnOn();
        rc.turnOff();
    }


}//class end
