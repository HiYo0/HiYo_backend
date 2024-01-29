package day20.step2_여러인터페이스사용;

public class Step2 {//class start

    public static void main(String[] args) {
        RemoteControl rc =new SmartTelevision();

        rc.turnOn();
        rc.turnOff();
//        rc.search("주소");

        Searchabel searchabel = new SmartTelevision();
        searchabel.turnOn();
//        searchabel.turnOff();
        searchabel.search("주소");

    }// main end
}//class end
