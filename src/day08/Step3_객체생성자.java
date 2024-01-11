package day08;

public class Step3_객체생성자 {//class start

    public static void main(String[] args) {//main start
        // Korean k1 = new Korean(); => 안됨 - 생성자 이미있음

        Korean k3 = new Korean();
        k3.name = "이자바";
        k3.ssn = "940429-2017112";
        System.out.println("k3 = " + k3);

        // 1. 정의된생성자로 객체생성
        Korean k1= new Korean("박자바","010112-1231511");
        System.out.println(k1);

        Korean k2 = new Korean("김자바","950304-1231123");
        System.out.println(k2);

    }// main end
}//class end
