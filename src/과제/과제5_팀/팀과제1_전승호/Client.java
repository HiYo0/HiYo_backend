package 과제.과제5_팀.팀과제1_전승호;

public class Client {//class start

    String id;
    String pw;
    int 구독기간=0;
    String 서비스형태 ="";

    Client(){};
    Client(String id , String pw , int 구독기간 , String 서비스형태){
        this.id = id;
        this.pw = pw;
        this.구독기간 = 구독기간;
        this.서비스형태 = 서비스형태;
    }

}//class end
