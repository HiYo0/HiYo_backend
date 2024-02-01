package day23.step2;

public class Step2 {// class start

    public static void main(String[] args) {
        Map_a<String ,Object> mapA = new Map_a<>();

        mapA.add("name","유재석");
        mapA.add("age",12);
        System.out.println(mapA);
        System.out.println(mapA.size());
//        mapA.remove(1);

        System.out.println(mapA.getArray()[1].toString());



        System.out.println(mapA);
        System.out.println(mapA.size());

    }//main end
}// class end
