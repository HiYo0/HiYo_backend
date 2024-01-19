package day14.Step2;

public class Step2 {
    public static void main(String[] args) {
        // 1. 자식 객체 생성
        Child child = new Child();

        // 2. 자식객체의 타입을 부모타입으로 변환 ( 자동 타입 변환 )
        Parent parent = child;

        // 3. 메소드 호출
        parent.method1();
        parent.method2();

    }//main end
}//class end
