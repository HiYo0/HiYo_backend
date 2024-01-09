package day6;

import java.util.Scanner;

public class Step5_시계시간추가하기 {//class start

    public static void main(String[] args) {//main start
        Scanner scanner = new Scanner(System.in);

        // 1. 문자열로 받은 금액을 턴단위 쉼표를 넣어주는 코드
        System.out.print("시간(hhmmss형식) : ");
        String time = scanner.nextLine();
        System.out.print(" 시간(숫자) : ");
        String second = scanner.nextLine();

        String result = "";
        

        
        // 시 분 초 가져오기
        int hh = Integer.parseInt(time.substring(0,2)); // 0부터 2까지 인덱스 추출
        // System.out.println("hh = " + hh);
        int mm = Integer.parseInt(time.substring(2,4));
        // System.out.println("mm = " + mm);
        int ss = Integer.parseInt(time.substring(4,6));
        // System.out.println("cc = " + cc);

        // 1. 입력받은 time의 초 추출
        ss+=Integer.parseInt(second);
        mm+=( ss/60 ); // 초를 60으로 나눈값을 분에 더함 .

        hh += (mm/60);  // 분을 60로 나눈값을 시에 더함 .


        System.out.printf(" %02d : %02d : %02d\n",hh,mm%60,ss%60);
        // 입력받은 time에서 second 만큼 지난시간은 hhmmss형식으로 출력
        hh = hh>24? hh-24 :hh;


        result=(hh<10?"0"+hh : hh)+" : "+(mm%60<10?"0"+mm%60:mm%60)+" : "+(ss%60<10? "0"+ss%60:ss%60) ;
        System.out.println("result = " + result);
        /*
                예]
                    time = 145930
                    second = 70
                        result = 15:00:40
        */



    }// main end
}//class end
