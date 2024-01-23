package day16.step1_인터페이스;


// 클래스 : 일반 클래스가 인터페이스의 추상메소드를 구현했으면 구
public class Television implements RemoteControl {//class start
    // -implements (빨간줄)재정의한 메소드가 있어요!! 뜻
    // - 무조건 오버라이딩 한다.
    // 인스턴스 필드
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(this.volume<RemoteControl.MAX_VOLUME){
            this.volume =volume;
        }
        System.out.println("현재 TV 볼륨 : "+this.volume);
    }


}//class end

/*
    오버로딩 : 생성자/메소드 에서 매개변수의 타입/개수/순서 에 따라 여러개 선언
    오버라이딩 : 메소드에서 extends/implements 한 메소드를 재정의
*/
