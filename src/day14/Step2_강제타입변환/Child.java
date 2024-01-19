package day14.Step2_강제타입변환;

public class Child extends Parent{
    // 필드
    public String filed2;


    @Override   // 재정의(오버라이딩) : 상속받았을때[extends Parent] 부모의 매소드 재정의
    // 상속받을을때 [extends Parent] 부모클래스내 메소드와 선언부를 동일하게
    public void method1() {
        System.out.println("Child-method1");
    }

    @Override
    public void method2() {
        System.out.println("Child.method2");
    }
}
