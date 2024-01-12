package day09;

public class Calculator_메소드 {//class start

    // 클래스멤버
        // 1. 필드
            // 필드선언
            // [ p.214 : 초기화 있을경우 객체 생성시 기본값으로 초기화 ]
        //"예시" String name

        // 2. 생성자
        //"예시" Korean(){}//기본생성자
        //"예시" Korean( String name , String s)
            // - 객체들간의 다른 값을 가져야 할때
            // 1. 생성자명 작성한다. 단 클래스명도 동일
            // 2. ( )안에 매개변수를 정의한다.
            // 3. { }안에 생성자호출시 처리할 명령어/로직 작성
        //"예시"  this.name = name;

        // 3. 메소드
            // 1. return 타입
            // 2. 함수명
            // 3. (매개변수,매개변수)
            // 4. { 명령문; }
            // 5. return

    // 1.
    void powerOn(/*매개변수*/){//ms
        // 1. void      : 메소드가 호출한 곳으로 전당하는 결과값이 없다.
        // 2. 'powerOn' : 함수명이고 소문자 시작 카멜표기법 권장
        // 3. ( )       : 메소드를 호출할때 전달한 매개값을 받기위한 곳
        // 4. { }       : 메소드가 실행되는 구역
        // 5. return    : (void 일 경우)생략가능. [ 종료 ]

    }//ms
    // 2.
    void powerOff(/*매개변수*/){//ms
        System.out.println("전원을 끕니다.");
        // 1. void      : 메소드가 호출한 곳으로 전당하는 결과값이 없다.
        // 2. powerOff  : 함수명이고 소문자 시작 카멜표기법 권장
        // 3. ( )       : 메소드를 호출할때 전달한 매개값을 받기위한 곳
        // 4. { }       : 메소드가 실행되는 구역
        // 5. return    : 생략.

    }//ms

    // 3.
    int plus(int x , int y){
        // 1. int : 메소드가 호출한 곳으로 전달하는 결과 값의 타입이 int 사용.
        // 2. 함수이름
        // 3. (int x , int y) : 메소드를 호출할때 전달한 매개값을 받기 위한 곳 x 와 y를 받았다.
        // 4. -
        // 5. void 제외한 함수내 return 무조건 1개이상 필수

        int a =x+y;

        return a;
    }

    // 4.
    double divide(int x ,int y ){
        double result = (double)x/(double)y;
        
        return result;
        // return : 함수를 종료하는 키워드
            // vs
        // break : 가장 가까운 반복문 종료
    }


}//class end
