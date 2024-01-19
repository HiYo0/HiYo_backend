package day14;
// p.306

class A{}

class B extends A{ } // B의 부모는 A

class C extends A{ } // C의 부모는 A

class D extends B{ } // D의 부모는 B

class E extends C{ } // E의 부모는 C

public class Step1 {//class start

    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        // A 타입으로 자동 타입변환
        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;

        // B , C 타입으로 자동 타입 변환
        B b1 = d;
        C C1 = e;

        // 불가능
        // B b2 = e;       C c2 = d;
        String str1 = "ab6CDE443fgh22iJKlmn1o";
        String str2 = "6CD";
        int AA = 0;
            for (int i = 0; i < str1.length(); i++) {
                if(i<str1.length()-str2.length())break;
                if (str1.substring(i,str2.length()).equals(str2.substring(0,str2.length()))) {
                    System.out.println("일치함");
                }
            }



    }
}// class end

