package day16.step1_인터페이스;

public class Audio implements RemoteControl{
    @Override
    public void turnon() {
        System.out.println("Audio를 켭니다.");
    }
}
