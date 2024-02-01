package day23.step1_가변길이배열만들기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Step1 {//class start

    public static void main(String[] args) {//main start

        // 1. 배열타입 : 고정길이
        String[] strArray = new String[3];  // String 타입 데이터/객체 3개를 저장/참조 하는 배열 타입
        strArray[0] = "유재석";
        // strArray[1] = 100;  // X 타입이 다르니까 오휴
        strArray[1] = "강호동";
        strArray[2] = "신동엽";

        System.out.println("strArray = " + Arrays.toString(strArray)+ strArray);   // Object 클래스 toString()메소드 객체의 주소값 반환.
            // Arrays.toString(strArray) : 해당 배열 상태 호출

        // 2. 클래스타입 : 컬렉션프레임워크 ( 수집관련라이브러리 제공 )
            // ArrayList : 가변길이 가능하도록 만든 객체
        ArrayList<String> strList = new ArrayList<>();
            // 클래스명<제네릭타입> 변수명 = new 클래스명<>();
        strList.add("유재석");
        strList.add("강호동");
        strList.add("신동엽");
        strList.add("서장훈");

        System.out.println("strList = " + strList+"\n\n");

        // 3. 가변길이배열객체 만들기.
        // SimpleList{ 객체 , 객체 , 객체 }
        SimpleList<String> simpleList1 = new SimpleList<>();
        simpleList1.add("유재석");
        simpleList1.add("신동엽");
        simpleList1.add("서장훈");
        simpleList1.add("으애앵");
        System.out.println("simpleList1 = " + simpleList1);
        simpleList1.remove(1);
        System.out.println("simpleList1 = " + simpleList1);
        // simpleList1.add(100);

        SimpleList<Integer> simpleList2 = new SimpleList<>();
        simpleList2.add(100);

        Map<String, Integer>map=new HashMap<>();

    }// main end
}//class end
