package day02;

import java.util.Scanner;

public class Step3 { // class s
    public static void main(String[] args) { // main start

        // [p.70] 콘솔에서  키보드로 부터 입력 받고 변수에 저장
            // [ 준비물 ]
            // 1. Scanner 클래스 : 입력에 관련된 메소드/속성 제공 하는 설게도.

            // 2. Scanner 클래스 이용한 객체 생성
                // Scanner scanner = new Scanner( System.in );
                // 클래스명 변수명     new 클래스명( 매개변수 );
                    // System.in : 시스템 입력 = 키보드
                    // System.out : 시스템 출력 = 모니터(콘솔)

            // 3. 객체/변수 이용한 입력값 호출하는 메소드
                // 객체/변수명.nextLine() : 엔터 키가 입력되면 지금까지 입력된 모든 내용을 읽는다.

            // [1] 객체 생성
        // new Scanner( System.in);
            // [2] 객체 생성 했으면 담아야 변수(타입:객체의타입)에 한다.
        Scanner scanner = new Scanner(System.in);
            // [3] 객체를 통한 메소드 사용.
        // scanner.nextLine();
            // [4] 메소드 호출의 결과[return] 저장한다.
        String Str = scanner.nextLine();
        System.out.println("Str = " + Str); // soutv : 가장 가까운 변수 출력해줌

        // [ Scanner 제공하는 메소드 ]
        // 1. 입력받은 문자열(String) 반환.  띄어쓰기 포함 불가.
        String str1 = scanner.next();               System.out.println("str1 = " + str1);

        scanner.nextLine(); // 의미없는 nextLine() 추가하기
        // 2. 입력받은 문자열(String) 반환.  띄어쓰기 포함 [ 주의할점 : 앞에 next() 있을경우 하나로 취급 ]
        String str2 = scanner.nextLine();           System.out.println("str2 = " + str2);


        // 3. 입력받은 논리(Boolean) 반환
        boolean bool = scanner.nextBoolean();       System.out.println("bool = " + bool);

        // 4. 입력받은 바이트(byte) 반환
        byte b = scanner.nextByte();                System.out.println("b = " + b);

        // 5. 입력받은 쇼트(short) 반환
        short s = scanner.nextShort();              System.out.println("s = " + s);
        
        // 6. 입력받은 인트(int) 반환
        int i = scanner.nextInt();                  System.out.println("i = " + i);

        // 7. 입력받은 롱(long) 반환
        long l = scanner.nextLong();                System.out.println("l = " + l);

        // 8. 입력받은 플릇(float) 반환
        float f = scanner.nextFloat();              System.out.println("f = " + f);

        // 9. 입력받은 더블(double) 반환
        double d = scanner.nextDouble();            System.out.println("d = " + d);

        // 10. 입력받은 문자(char) 반환 없음
            // --> "문자열".charAt(추출인댁스) : 문자열에서 문자 1개 추출 함수
        char ch = scanner.next().charAt(0); // 첫 글자 추출
        System.out.println("ch = " + ch);


        // * 기본타입 비교 ==
        //      vs 참조타입(문자열) 비교 "문자열".equals("비교할문자열")
        
        /*
            // p.73 ~ 75 확인문제.
            //1.
                1. 변수 : 하나의 값만 저장 VS 배열 : 여러개의 값 저장.
                2. 선언시 사용한 타입의 허용 범위내 데이터 저장.
                3. {  } 안에서 선언된 변수는 {  } 밖에서 호출이 불가능하다
                4. 변수는 초기값이 저장되지 않은 상태에서 읽을 수 없다. O
                    변수 : 메소드 안에서 선언된.
                    필드 : 클래스 안에서 선언된.

            // 2.
                2. class 3. 6hour 6. #name 7. int (사용할수 없음)

            // 3.

            // 4.
                타입 : int , double
                변수이름 : age , price
                리터럴 : 10 , 3.14

            // 5.
                byte : -128 ~ 127
                char : unsigned(부호x) 0~65535

                1. int = byte   [자동]
                2. int = char   [자동]
                3. short = char [자동]
                    short : +-32,xxx  / char : 65535까지 가능
                4. double = byte[자동]

            // 6.
                int 10              char 'A'
                double 5.7          String "A"  <-- 1바이트
                1. double = (double)int     8바이트 <- 4바이트
                2. byte = (byte)int         1바이트 <- 4바이트
                3. int = (int)double        4바이트 <- 8바이트
                4. char = (char)String      2바이트 <- ????

            // 7.
                3. char 에 '' 사용 불가능 / 공백 = 스페이스바1개 넣어야함

            // 8.
                (3) 바꾼다 -> 출력한다.

            // 9. (1) : byte , short 무조건 int 로 반환됨
                byte 10     float 2.5f      double 2.5
                1. byte = byte + byte[x]       int
                2. int = 5+ byte
                3. float = 5 + float
                4. double = 5 + double

            // 10. (2)

            // 11. 지역변수으 허용범위 : {  } 안에서 선언된 변수는 밖으로 호출 할수없음

        */




    } // main End

} // class End

/*
    타입
        1. 기본타입( int , double , float 등 소문자. )
        2. 참조타입( String , Scanner , System 등등 )


*/