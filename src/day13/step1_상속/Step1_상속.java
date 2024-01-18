package day13.step1_상속;

public class Step1_상속 {//class start

    public static void main(String[] args) {//main start



        // 1. SmartPhone 객체생성( + Phone )
        SmartPhone myPhone = new SmartPhone("갤럭시","은색");

        // 2. Phone 으로부터 상속받은 필드 읽기 ( + Phone 필드 호츌 )
        System.out.println("모델 :  = " + myPhone.model);
        System.out.println("색상 = " + myPhone.color);

        // 3. SmartPhone 의 필드 일기
        System.out.println("와이파이 상태 : "+myPhone.wifi);

        // 4. phone 으로부터 상속받은 메소드 호출
        myPhone.bell(); // SmartPhone 객체내 메소드 호출( + Phone 메소드 호출 )
        myPhone.sendVoice("여보세요");  // SmartPhone 객체내 메소드 호출( + Phone 메소드 호출 )
        myPhone.receiveVoice("안녕하세요! 저는 홍길동 인대요."); // SmartPhone 객체내 메소드 호출( + Phone 메소드 호출 )
        myPhone.sendVoice("아~ 네, 반갑습니다.");  // SmartPhone 객체내 메소드 호출( + Phone 메소드 호출 )
        myPhone.hangUp();   // SmartPhone 객체내 메소드 호출( + Phone 메소드 호출 )

        // 5. SmartPhone 의 메소드 호출
        myPhone.setWifi(true);  // SmartPhone 객체내 메솓 호출
        myPhone.internet();     // SmartPhone 객체내 메솓 호출


    }//main end
}//class end
