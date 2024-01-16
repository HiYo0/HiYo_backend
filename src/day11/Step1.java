package day11;

public class Step1 {//class start

    public static void main(String[] args) {//main start
        // 1. 객체호출
        Korean_final k1 = new Korean_final("123456-1234567","김자반");

        // 2. 필드 호출
        System.out.println("k1.nation : "+k1.nation);
        System.out.println("k1.ssn : "+k1.ssn);
        System.out.println("k1.name : "+k1.name);

        // 3. 필드의 값 수정
        // k1.nation = "USA"; // final 초기화 이후 수정불가.
        // k1.ssn="123-12-1234";

        k1.name = "김자바";

        // 4. 상수호출
        System.out.println(Korean_final.EARTH_RADIUS);
        System.out.println(Korean_final.EARTH_SURFACE_AREA);


    }// main end

}//class end
