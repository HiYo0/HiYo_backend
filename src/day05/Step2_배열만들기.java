package day05;

public class Step2_배열만들기 {//class start

    public static void main(String[] args) {//main start
        // p.165 : 배열(array) 타입
            /*
                - 변수는 하나의 값만 저장.
                1. 배열 : 연속된 공간에 값을 나열하고 각 값에 인덱스 부여.
                    - 인덱스 : 각 항목(요소)의 값을 호출 하거나 저장하는데 사용됨.
                2. 특징
                    1. 배열은 *같은/동일 타입의 값만 저장
                        int = [ 57 , "가" ]  불가능.
                    2. 배열의 길이는 선언된 이후 늘리거나 줄일 수 없다.
                        int = [ 57 , 62 , 97 ] : 항목/요소를 추가/삭제 할수 없다.
                3. 선언
                    - 변수선언 : 타입 변수명;
                    - 배열선언 : 타입[] 변수명; or  타입 변수명[];
                4. 값 목록으로 배열 선언
                    - 배열생성1 : 타입[] 변수명 = { 값0 , 값1 , 값2 , 값3 };
                        - 배열에 넣을 초기값을 알고 있을때 사용.
                    - 배열생성2 : 타입[] 변수명 = new 타입[ 길이 ];
                        - 배열에 넣을 초기값을 모르고 배열의길이(최대저장개수) 알고 있을때 사용.
                        - 초기값 : 정수 0 , 실수 0.0 , 논리 false , 클래스(String)/인터페이스 null
                            - 주의할점
                                1. 지역변수X
                                2. 배열 / 필드 적용
                                3. 필드 적용.

                5. 배열의 길이를 구하는 속성명
                    - 배열명.length        : 현재 배열의 길이를 알려준다.
                6. 배열 항목/요소 값 넣기.
                    - 배열명[인덱스] = 새로운값;

                7. 배열 항목/요소 값 호출
                    - 배열명[인덱스]

                8. 배열 항목/요소 값 수정
                    - 배열명[인덱스] = 새로운값;

                9. 배열 항목/요소 값 삭제 [ 항목/요소 위치 삭제는 없고 처음값으로 초기화 한다.]
                    - 배열명[인덱스] = 각 타입의 초기값


            */
        // 1. 배열 생성/선언 : 여러개 문자열을 저장하는 배열 선언.
                // 변수명1 = 값1        변수명2 = 값2
                    // 배열이 없다면 vs 배열 있다면
        String[] season = { "Spring" , "Summer" , "Fall" , "Winter" };
        // 타입[] 변수명 = { 값0 , 값1 , 값2 , 값3 };
        //          인덱스 : 0  ,  1  ,  2  , 3

        // 2. 배열의 각 요소/항목의 값 호출
        System.out.println("season : "+season); // 기본타입(7가지+String) 말고 참조타입 호출시 주소값이 나오는구나.
        // [Ljava.lang.String;@6d311334 인덱스번호를 안쓰면 메모리의 주소값이 나옴
        
        System.out.println("season[0] : "+season[0]);   // 배열내 0번 인덱스 요소값 호출
        System.out.println("season[1] : "+season[1]);   // 배열내 1번 인덱스 요소값 호출
        System.out.println("season[2] : "+season[2]);   // 배열내 2번 인덱스 요소값 호출
        System.out.println("season[3] : "+season[3]);   // 배열내 3번 인덱스 요소값 호출
        // System.out.println("season[4] : "+season[4]);       // 배열내 4번 인덱스 호출( 없어서 불가능 )
            //Index 4 out of bounds for length 4 오류나옴 [ 인덱스 범위를 넘어감 ]
            
        // 2. for반목문을 이용한 호출
        System.out.println("\n for문 이용한 출력");
        for( int i = 0; i< season.length; i++){
            // i는 0부터 마지막 인덱스까지 1씩증가
            System.out.println("season["+i+"] : "+season[i]);
        }

        // 3. 각 요소/항목의 값 수정
        System.out.println("\n배열안 값 수정하기");
        season[1] = "여름";
        System.out.println("season[1] : " +season[1]);

        System.out.println("\n배열 합/평균 구하기");
        // 1. int형 83 , 90 , 87 3개 정수를 저장하는 배열 선언.
        int[] scores = { 83 , 90 , 87 };
        // 2. 배열내 항목/요소 총합계
        int sum = 0;
        for( int i = 0; i<3; i++){
            // i는 0부터 3미만 까지 1씩 증가
            sum += scores[i]; // i번째 인덱스 항목의 값을 sum변수에 더한다.
        }//f end
        System.out.println("sum = "+sum);
        double avg = (double) sum/3;
        System.out.println("svg = "+avg);


        // p.173
        System.out.println("\nnew 를 이용한 배열 선언");
            // new 연산자를 이용한 배열 선언.
            // 1. int 3개를 저장할수 있는 배열 선언
        int[] arr1 = new int[3];    // 타입[ ] 변수명 = new 타입[길이];

        // 2. for이용한 배열내 모든 요소 호출
        for (int i= 0; i<arr1.length; i++){
            System.out.printf("arr1[%1d] : %2d , " , i , arr1[i] );
        }
        System.out.println("\n\n배열안 값을 넣어보기");
        // 3. 요소의 값 대입
        arr1[0] =10;    arr1[1] =20;    arr1[2] =30;
        for (int i= 0; i<arr1.length; i++){
            System.out.printf("arr1[%1d] : %2d , " , i , arr1[i] );
        }

        // 1. double형 3개를 저장할수 있는 배열 선언
        System.out.println("\n\ndouble배열안 값을 넣어보기");
        double[] arr2 = new double[3];
        for (int i= 0; i<arr2.length; i++) {
            System.out.printf("arr2[%1d] : %2f , ", i, arr2[i] );
        }
        //2.
        arr2[0] =10.01;    arr2[1] =20.12;    arr2[2] =30.33;
        System.out.println("\n\ndouble배열안 값을 넣어보기");
        for (int i= 0; i<arr2.length; i++) {
            System.out.printf("arr2[%1d] : %2f , ", i, arr2[i] );
        }

        // 1. String형 3개를 저장할수 있는 배열 선언
        System.out.println("\n\nString 배열안 값을 넣어보기");
        String[] arr3 = new String[3];
        for (int i= 0; i<arr3.length; i++) {
            System.out.printf("arr3[%1d] : %2f , ", i , arr3[i] );
        }
        // 2.
        arr3[0] ="인덱스0";    arr3[1] ="인덱스1";    arr3[2] ="인덱스3";
        System.out.println("\n\nString 배열안 값을 넣어보기");
        for (int i= 0; i<arr3.length; i++) {
            System.out.printf("arr3[%1d] : %2s , ", i, arr3[i] );
        }

        // ex


    }//main End
}//class End
