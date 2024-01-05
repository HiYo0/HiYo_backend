package 과제.과제3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("비교할 값을 입력해주세요 : "); String a = scanner.nextLine();

        // a 의 입력값이 숫자인지 확인하시오
        char 차 = ' ';
        System.out.println(a);
        for (int i =0; i<a.length(); i++){
            차 = a.charAt(i);

            if(57>=차 && 차>=48){
                System.out.println("참");
            }else {
                System.out.println("false");}

        }




    }
}
