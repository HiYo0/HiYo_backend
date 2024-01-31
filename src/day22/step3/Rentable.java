package day22.step3;

public interface Rentable <P>{
    // 인터페이스 제네릭 타입가능
    // 1. 추상메소드( public abstract 생략가능 )
        // 메소드의 반환타입을 제네릭탕비 P
    public abstract P rent(); // ?? 렌탈 타입 정해져 있지 않다.
    // 구현클래스 : 추상메소드의 실행부를 오버라이딩. // 추상메소드의 반환타입 정의

}// interface end
