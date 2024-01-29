package day20.step3_인터페이스상속;

public class InterfaceCImpl implements InterfaceC {
    // 자식인터페이스를 구현한때 부모인터페이스 구현해야한다.
    // * 추상메소드 도 상송이 가능하다.
    @Override
    public void methodA() {
        System.out.println("InterfaceCImpl.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("InterfaceCImpl.methodB");
    }

    @Override
    public void methodC() {
        System.out.println("InterfaceCImpl.methodC");
    }
}

