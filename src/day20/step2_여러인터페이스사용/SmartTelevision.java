package day20.step2_여러인터페이스사용;

public class SmartTelevision implements RemoteControl, Searchabel {
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");

    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void search(String url) {
        System.out.println(url + " 을 검색합니다.");
    }
}
