package day13.step1_상속;
/*
    상속
        - 클래스를 재사용해서 새로운 클래스를 만들때 중복되는 코드를 줄여 개발시간을 단축 / 유지보수
        1. 부모클래스의 필드/메소드를 자식클래스에게 물려받는다.
        2. 자식이 부모를 선택한다.
        3. 자식클래스 선언시 클래스명 뒤에 extends
        4. 자식클래스가 가질수 있는 부모의 개수는 1개 = 다중 상속 불가능.
            1. 설계 [ 신입 ]
            2. 라이브러리 / 프레임워크
*/

public class SmartPhone extends Phone {//class start
    //필드
    public boolean wifi;

    // 생성자
    public SmartPhone(String model,String color){
        this.model = model;
        this.color = color;
    }

    // 메소드
        // 1. 매개변수 : boolean , 반환값X
    public void setWifi(boolean wifi){
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경했습니다.");
    }
        // 2. 매개변수 : X , 반환값X
    public void internet(){
        System.out.println("인터넷에 연결합니다.");
    }
}//class end
