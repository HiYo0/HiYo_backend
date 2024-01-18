package day13.Step5_protected.package1;

public class B {//class start
    public void method(){
        A a = new A();  // 같은 패키지 이니까 가능.
        a.field = "value";
        a.method();
    }
}//class end
