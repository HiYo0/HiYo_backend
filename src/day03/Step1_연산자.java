package day03;

public class Step1_연산자 { // class s
    public static void main(String[] args) { // main s
        int x = 10; int y =-3;
        // 1. 산술연산자 ( 결과 : 값 )
        System.out.println( "x+y = "+(x+y) );
        System.out.println( "x-y = "+(x-y) );
        System.out.println( "x*y = "+(x*y) );
        System.out.println( "x/y = " +(x/y) ); // int + int 여서 정수로만 나옴 소숫점으로 연산시 소숫점나옴
        System.out.println( "x%y = " +(x%y) );

        // 2. 비교연산자 ( 결과 : boolean )
        System.out.println( "x == y : "+( x == y ) );   // 같다
        System.out.println( "x != y : "+( x != y ) );   // 같지않다
        System.out.println( "x > y : "+( x > y ) );     // 초과
        System.out.println( "x >= y : "+( x >= y ) );   // 이상
        System.out.println( "x < y : "+( x < y ) );     // 미만
        System.out.println( "x <= y : "+( x <= y ) );   // 이하

        // 3. 논리연산자
        System.out.println("10 < x < 20 = " + (x > 10 && x <20) );   // 이면서 면서 이고 모두 그리고
        System.out.println("y == 10 또는 20 " +(y==10 || y==20) );    // 이거나 거나 또는
        System.out.println(" x>=30 의 반대 : " + !(x>=30));           // 부정/반대


        // 4. 증감연산자
        System.out.println( "x++ : "+(x++) );       // 10 출력후 1증가
        System.out.println("x : "+(x) );            // 11
        System.out.println("++x : "+(++x));         // 1증가후 12출력

        System.out.println("x-- : "+(x--));         // 12 출력후 1감소
        System.out.println("x : "+(x));             // 11
        System.out.println("x : "+(--x));           // 1감소후 10 출력

        // 5. (복합)대입연산자
        x = 30;     // = 오른쪽 값을 왼쪽에 대입
        x += 10;    // x에 10을 더한후에 x에 결과 대입
        // -= , *= , /= , %=
        
        // 6. 삼항연산자
            // 조건 ? 참 : 거짓
            // 조건1 ? 참 : 조건2 ? 참 : 거짓
            // 조건1 ? 참1 : 조건2 ? 참2 : 조건3 ? 참 : 거짓
        String 결과 = x >= 90 ? "합격" : "불합격";
        System.out.println("결과 = "+결과);

        String 결과2 = x>=90 ? "A등급" : x>=80? "B등급" : "탈락";
        System.out.println("결과2 = "+결과2);

        // 7. 연결연산자
            // 변수 + "문자열" , "문자열"+"문자열"

    } // maim end
} // class s


// 1. 변수 : 하나의 값 저장하는 메모리 공간 , 1.타입 2. 변수명 3. 대입 4. 초깃값
// 타입 : boolean , byte , short , int ,long , float , double , char , String

// 2. 출력함수
// 1. System.out.print();
// 2. System.out.println();     sout
// 3. System.out.printf();      soutf
// 3. 입력객체/함수
// scanner scanner = new Scanner(System.in);
// scanner.next()