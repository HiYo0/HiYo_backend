package day22.step3_제네릭인터페이스;


// 클래스 : implements하면 구현클래스라고 한다.
public class CarAgency implements Rentable<Car>{
    @Override
    public Car rent() {
        return new Car();
    }
}
