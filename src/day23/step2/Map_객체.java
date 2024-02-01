package day23.step2;

public class Map_객체<A,B> {
    // 1. 필드
    private A 키;
    private B 값;

    // 2. 생성자
    Map_객체(){
    }

    // 3. 매소드

    public A get키() {
        return 키;
    }

    public void set키(A 키) {
        this.키 = 키;
    }

    public B get값() {
        return 값;
    }

    public void set값(B 값) {
        this.값 = 값;
    }

    // 4. toString

    @Override
    public String toString() {
        return 키 + " = " + 값;
    }
}
