package day01;

public class Step3 {
    public static void main(String[] args) { // main()함수 // 실행시 필수! // main start

        // [ p. 41 ] 진수 표현하는 방법 [ int 타입이 자동으로 10진수로 변환 ]
        int var1 = 0b1011;  // 2진수 : 데이터 앞에 0b 1011[2] -> [10]
            System.out.println("var1 : "+var1); // "문자열"+변수명

        int var2 = 0206;    // 8진수 : 데이터앞에 0 206[8] -->134[10]
        System.out.println("var2 : "+var2);

        int var3 = 365;     // 10진수 : 365[10] -->365[10]
        System.out.println("var3 : "+var3);

        int var4 = 0xB3;    // 16진수 : 데이터 앞에 0x B3[16] --> 179[10]
        System.out.println("var4 : "+var4);

        // [ p.42 ] byte타입 [ -128 ~ 127 ] : 1바이트 => 8bit => 1[부호]+7[값] -> 2의 7승
        byte b1 = -128;     System.out.println("b1 : "+b1);
        byte b2 = 127;     System.out.println("b2 : "+b2);
        // byte b3 = 200;     System.out.println("b3 : "+b3);
            // java: incompatible types: possible lossy conversion from int to byte

        // short타입 [ -32768 ~ 32767] : 2바이트 => 16bit
        short s1 = 32000;       System.out.println("s1 : "+s1);
        // short s2 = 50000;       System.out.println("s2 : "+s2); // 허용범위 벗어남
            // java: incompatible types: possible lossy conversion from int to byte
        
        // *int타입 [ +-21억 정도 ] : 4byte : !!! : *리터럴()
        int i1 =2000000000;      System.out.println("i1 : "+i1);
        // int i2 =3000000000;      System.out.println("i2 : "+i2); // 허용범위 벗어남
            // java: integer number too large

        // long타입 [ +-21억 이상 ] : 8바이트 : !!! : 정수타입 리터럴 뒤에 l/L
        long l1 = 3000000000L;      System.out.println("l1 : "+l1);

        // [ p.43 ] char [ 0~65535 ] : 2바잍트 : !!! : ''작은따옴표
        char c1 = 'A';          System.out.println("c1 : "+c1);
        char c2 = '가';          System.out.println("c2 : "+c2);
        // char c3 = "가";          System.out.println("c3 : "+c3);
            // 1. char 왜 정수형타입이 가능한지.
        int i3 = 'A';           System.out.println("i3 : "+i3); // 65
        int i4 = '가';          System.out.println("i4 : "+ i4); // 44032

        char c4 = 80;           System.out.println("c4 : "+ c4); // P

        // [ p.49 ] 문자열[] : " " 큰따옴표 , 참조자료형/클래스
        String str1 = "안녕하세요";  System.out.println("ste1 : "+str1);
        String str2 = "나는\"자바\"를 배웁니다";     System.out.println("ste2 : "+str2);
        String str3 = "번호\t이름\t직업";           System.out.println("ste3 : "+str3);

        // java/JDK13 이후 가능한 문법
        String str4 = """
                \t나는 자바를
                \t\t학습합니다.
                \t\t나는 자바 고수가 될 겁니다.
                """;                            System.out.println("ste4 : "+str4);

        // [ p.45 ] float[ 7자리 유효 ]     : 4바이트 : 반올림
        float f1 = 0.123456789123456789f;       System.out.println("f1 : "+f1);

        // double[ 16자리 유효 ]            : 8바이트 : 실수타입의 기본타입
        double d1 = 0.123456789123456789f;       System.out.println("d1 : "+d1);

        // [ p.48 ] boolean [ true 또는 false ] : 1바이트
        boolean bool1 = true;
        // boolean bool2 = 1;   1[int] 이므로 boolean에 저장할수 없다, [ 정수의 가장 최소단위가 바이트 ]
        


    } // main end
}
