package 과제.과제5_팀.과제1;

public class Account {//class start
    // 필드 : 정석 vs 인스턴스
        String accountNumber;
        String name;
        String money;

    // 생성자
        // 1. 기본생성자
    Account(){}
        // 2. 모든필드를 받는 생성자
    Account(String accountNumber, String name, String money){
        this.accountNumber=accountNumber;
        this.name=name;
        this.money = money;
    }

    // 메소드
    String getmoney(){
        return this.money;
    }
}//class end
