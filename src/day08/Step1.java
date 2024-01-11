package day08;

import java.util.Arrays;
import java.util.Scanner;

public class Step1 {//class start

    public static void main(String[] args) {//main start
        Scanner scanner = new Scanner(System.in);
        붕어빵틀[] 붕어빵트레이 = new 붕어빵틀[100];


        while (true){// while start
            System.out.println(Arrays.toString(붕어빵트레이));
            for (int i = 0; i < 붕어빵트레이.length; i++) {
                if(붕어빵트레이[i]!=null){
                    System.out.println(붕어빵트레이[i].속재료);
                }
            }

            System.out.print("1.굽기 2.판매 : "); int ch = scanner.nextInt();

            if(ch==1){
                System.out.print("속재료 : "); String 입력속재료 = scanner.next();
                // 1. 객체생성 : 1.new -> 2.클래스/생성자()
                붕어빵틀 붕어빵 = new 붕어빵틀(); // (1개의 주소생성)붕어빵 객체생성.

                붕어빵.속재료 = 입력속재료;

                for (int i = 0; i < 붕어빵트레이.length; i++) {
                    // 만약 i번째 공간이 비어있으면 거기에 붕어빵 넣는다. 1개만.
                    if(붕어빵트레이[i]==null) {
                        붕어빵트레이[i] = 붕어빵;
                        break; // 트레이[배열] 에 붕어빵 넣었으면 끝
                    }
                }
                // if가 끝나면 객체를 참조하는 변수는 사라짐 -> 객체의 참조주소를 사라지기 전에 배열로 움김
            }// if가 끝나면 '붕어빵'의 지역변수는 사라짐 -> 곧 객체도 사라짐.
            else if (ch==2) {
                System.out.print("판매할 붕어빵 위치 : ");
                int dNo = scanner.nextInt();

                // - 자바는 힙영역에 객체를 제거 하는 방법을 제공하지 않는다. 그래서 초기값(null) 활용
                붕어빵트레이[dNo-1]=null;
                // - 만약에 삭제할 객체 인덱스 뒤로 객체가 존재하면 한칸씩 옮기기

                for (int i = dNo-1; i < 붕어빵트레이.length; i++) {
                    // i는 삭제할 객체의 인덱스 위치부터 마지막 인덱스까지 반복.
                    // i+1 : 삭제한 인덱스 뒤
                    if(i+1 == 붕어빵트레이.length)break;// 마지막 인덱스면 생략
                    붕어빵트레이[i] = 붕어빵트레이[i+1]; // 뒤에있는 객체를 앞으로 이동

                }// for end
                
            }

        }//while end
        
    }// main end
}//class end
