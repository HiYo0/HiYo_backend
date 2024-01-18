package day13.step1_상속;

public class Phone {//class start

    // 클래스 멤버
        // 1. (접근제한자public/private)(정적/인스턴스)필드
    public String model;
    public String color;
        // 2. (접근제한자public/private)생성자
        // 3. (접근제한자public/private)(정적/인스턴스)메소드

        // 1. 매개변수 : 매개변수X, 반환값X
    public void bell(){
        System.out.println("벨이 울립니다.");
    }
        // 2. 매개변수 : String, 반환값X
    public void sendVoice (String message){
        System.out.println("자기 : "+message);
    }
        // 3. 매개변수 : String , 반환값X
    public void receiveVoice(String message){
        System.out.println("상대방 : "+message);
    }
        // 4. 매개변수 : X , 반환값X
    public void hangUp(){
        System.out.println("전화를 끊습니다.");
    }

}//class end
