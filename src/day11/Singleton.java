package day11;

public class Singleton {//class start
    // - 단하나의 객체를 만드는 방법 제공
        // - 서비스(기능/메소드) 1개 , 회원
    // 1. 생성자를 외부로부터 호출 불가능으로 만든다.

    private Singleton(){}
    // 2-1. 필드에 미리 객체 만든다.
    // Singleton singleton = new Singleton();

    // 2-2. 필드에 직접적인 접근 막는다.
    // private Singleton singleton = new Singleton();

    // 2-3. 필드 정적멤버( 인스턴스 생성이 불가능 )
    private static Singleton singleton = new Singleton();

    // 3. 필드 간접전근 이용한 싱글톤 반환
    public static Singleton getInstance() {
        return singleton;
    }

}//class end
