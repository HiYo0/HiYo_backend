package day20.step3_인터페이스상속;

public class Step3 {//class start
    public static void main(String[] args) {//main start
        // 1. (구현)객체
            InterfaceCImpl impl = new InterfaceCImpl();

        // 2. 구현객체가 자식과부모 인터페이스의 모두 대입 가능
        InterfaceA ia = impl;
        ia.methodA();
        ia.methodB();
        ia.methodC();

        InterfaceB ib = impl;
        ib.methodA();
        ib.methodB();
        ib.methodC();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }//main end
}//class end
