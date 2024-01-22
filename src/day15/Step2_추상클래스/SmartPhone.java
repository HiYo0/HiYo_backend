package day15.Step2_추상클래스;

public class SmartPhone extends Phone {//class start
    // 부모의 생성자를 호출
    SmartPhone ( String owner ){
        super(owner);
    }
    void internetSearch(){
        System.out.println("인터넷 검색을 합니다.");
    }
}//class end
