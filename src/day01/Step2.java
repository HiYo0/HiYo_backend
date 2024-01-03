package day01;  // 패키지명

public class Step2 {    // class start
    public static void main(String[] args) { // main start

        // p.37
        /*
        int value; // 변수를 선언헀지만 초기값이 없기 때문에 메모리 할당 없음.

        int result = value + 10; // 오류발생[ 초기값 없는 변수를 호출했기떄문에 오류 발생 ]
        // java: variable value might not have been initialized
        // 해결방안 : 초기값 대입하자.
        */
        int value = 5;
        int result = value+10;
        System.out.println(result);/* 출력함수 */

    } // main end
}   // class End
