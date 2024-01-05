package day04;

public class Step2_반복문 {//class start

    public static void main(String[] args) {// main start

        // p.124
        // 1. 1~10까지 출력하는 코드
        System.out.print( 1 + " " );
        System.out.print( 2 + " " );
        System.out.print( 3 + " " );
        System.out.print( 4 + " " );        // 1 부터 10까지 1씩 증가됨
        System.out.print( 5 + " " );
        System.out.print( 6 + " " );
        System.out.print( 7 + " " );
        System.out.print( 8 + " " );
        System.out.print( 9 + " " );
        System.out.print( 10 + " " + "\n" );

        for (int i = 1; i<=10; i++){//for start
            System.out.print( i + " " );
        }   // for end

        // 2. 1~100 까지 합.
        int sum = 0;    // 누적 저장하기 위해서, for 안에서도 쓰고 밖에서 쓰고
        for( int i = 1 ; i<=100 ; i++){
            sum += i;
        }   // for end
        System.out.println("\nsum = " + sum); // soutv

        // 3. 구구단 : 중첩 for문 :
        for(int i = 2; i<=9; i++){// for1 start
            System.out.println(i+"단");
            for (int j = 1; j<=9; j++ ) { // for2 start
                System.out.print(i+" X "+j+" = "+(i*j)+"\t");
            }// for2 end
            System.out.println(" ");
        }// for1 end

        // 4. for -> while 1 ~ 10 까지.
        int j = 1;
        while (j<=10) { // w s
            System.out.print( j +" " );
            j++;
        } // w e

        // 5. (2) for -> while 1 ~ 100 까지 누적합계
        int sum2 = 0 ;
        int m = 1;
        while (m<=100){
            sum2 +=m;
            m++;
        }// w end
        System.out.println(" 1~ "+(m-1) + " 합 : "+sum2 );



    }//main end
}//class end
