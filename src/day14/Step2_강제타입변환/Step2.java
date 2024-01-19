package day14.Step2_강제타입변환;

public class Step2 {
    public static void main(String[] args) {
        // 1. 자식 객체 생성
        Child child = new Child();

        // 2. 자식객체의 타입을 부모타입으로 변환 ( 자동 타입 변환 )
        // * 자식객체가 부모타입으로 변환시 자식타입의 필드/메소드 를 사용할수 없다.
        // * 단) 오버라이딩 된 메소드는 부모타입이 아닌 자식타입의 메소드가 우선 갖는다. 다형성
        Parent parent = child;

        // 3. 메소드 호출
        parent.method1();
        parent.method2();

        // 4. P.311~312
        System.out.println(parent.filed1);
            // 부모타입에서 자식타입의 필드/메소드 사용불가
        // System.out.println(parent.filed2);

        // 5. 강제 타입 변환
        Child child1 = (Child) parent;

        System.out.println(child1.filed1);
            // 자식타입에서 부모타입의 필드/메소드 사용가능.
        System.out.println(child1.filed2);
            //

    }//main end
}//class end
