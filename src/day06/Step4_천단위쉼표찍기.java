package day06;

import java.util.Scanner;

public class Step4_천단위쉼표찍기 {//class start

    public static void main(String[] args) {//main start
        Scanner scanner = new Scanner(System.in);

        // 1. 문자열로 받은 금액을 턴단위 쉼표를 넣어주는 코드
        System.out.print("입력(숫자형식으로 입력받기) : ");
        String money = scanner.nextLine();

        String result = "";

        // result = money; // money의 객체번지를 result에 대입 ( 커스텀 불가능 )
        // result = money.replaceAll("\\B(?=(\\d{3})+(?!\\d))", ","); // 검색으로 찾은거
        
        for (int i =0; i<money.length();i++){
            // System.out.println("i = " + i);
            // System.out.print(money.charAt(i)+"  ");    // 입력받은 문자열들을 for문 이용한 한 문자씩 추출.
            // 천단위쉼표 : 천단위마다 , 추가 , 패턴 : 3자리마다
            if(i>0 && (money.length()-i)%3==0){result += ",";}

            result += money.charAt(i);


        }//for end
        
            // 입력받은 문자열타입의 금액을 천단위 쉽표 변환
        System.out.println("result = " + result);


    }//main end
}//class end
