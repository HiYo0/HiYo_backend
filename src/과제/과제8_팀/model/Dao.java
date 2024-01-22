package 과제.과제8_팀.model;

import java.util.ArrayList;
import java.util.Random;

public class Dao {
    // 싱글톤
    private Dao(){}
    private static Dao dao = new Dao();
    public static Dao getInstance(){return dao;}

    Random random=new Random();

    public ArrayList<부모은행> 부모배열=new ArrayList<>();

    public boolean 계좌생성(부모은행 부모은행a, String 선택한은행){//계좌생성

        if(선택한은행.equals("1")){
            String 계좌no="1";
            for(int i=0; i<6; i++) {
                계좌no += String.valueOf(random.nextInt(10));
            }

            신한은행 temp=new 신한은행();   //신한은행 객체 temp 생성
            temp.set마일리지(0);          //마일리지 0 적립
            부모은행 신한Array=temp;      //temp객체 부모은행으로 자동형변환
            신한Array.set계좌주(부모은행a.get계좌주());
            신한Array.set계좌번호(계좌no);  //랜덤 계좌번호 등록
            부모배열.add(신한Array);      //부모배열에 형변환된 객체 대입

            //2.
            /*신한은행 temp신한배열=(신한은행)부모은행a;
            temp신한배열.set마일리지(0);
            신한배열.add(temp신한배열);
            System.out.println();*/

            return true;
        }//if end 은행1
        else if(선택한은행.equals("2")){
            String 계좌no="2";
            for(int i=0; i<6; i++) {
                계좌no += String.valueOf(random.nextInt(10));
            }

            국민은행 temp=new 국민은행();   //신한은행 객체 temp 생성
            temp.set쿠폰("0");            //쿠폰 0 적립
            부모은행 국민Array=temp;       //temp객체 부모은행으로 자동형변환
            국민Array.set계좌주(부모은행a.get계좌주());
            국민Array.set계좌번호(계좌no);  //랜덤 계좌번호 등록
            부모배열.add(국민Array);      //부모배열에 형변환된 객체 대입

            return true;
        }//end if end 은행2
        else if(선택한은행.equals("3")){
            String 계좌no="3";
            for(int i=0; i<6; i++) {
                계좌no += String.valueOf(random.nextInt(10));
            }

            농협은행 temp=new 농협은행();   //신한은행 객체 temp 생성
            temp.set포인트(0);             //포인트 0 적립
            부모은행 농협Array=temp;       //temp객체 부모은행으로 자동형변환
            농협Array.set계좌주(부모은행a.get계좌주());
            농협Array.set계좌번호(계좌no);  //랜덤 계좌번호 등록
            부모배열.add(농협Array);      //부모배열에 형변환된 객체 대입

            return true;
        }//end if end 은행3
            return false;
    }//m end

    public boolean 예금(부모은행 부모은행a){//예금
        for(int i=0; i<부모배열.size(); i++) {
            if (부모은행a.get계좌번호().equals(부모배열.get(i).get계좌번호())){
                if(부모은행a.get계좌번호().charAt(0)=='1'){
                    //해당하는 계좌의 잔액 입금액 더해서 다시 대입
                    부모배열.get(i).set잔액(부모배열.get(i).get잔액()+부모은행a.get잔액());
                    //국민temp에 해당 배열 강제 타입변환
                    신한은행 신한temp=(신한은행)부모배열.get(i);
                    //마일리지 적립
                    신한temp.set마일리지(부모은행a.get잔액()*0.001);
                    //기존 부모배열에 다시 저장
                    부모배열.set(i,신한temp);

                    return true;
                }//if end 선택한은행 시작계좌==2
                else if(부모은행a.get계좌번호().charAt(0)=='2'){
                    //해당하는 계좌의 잔액 입금액 더해서 다시 대입
                    부모배열.get(i).set잔액(부모배열.get(i).get잔액()+부모은행a.get잔액());

                    return true;
                }//else if end
                else if(부모은행a.get계좌번호().charAt(0)=='3'){
                    //해당하는 계좌의 잔액 입금액 더해서 다시 대입
                    부모배열.get(i).set잔액(부모배열.get(i).get잔액()+부모은행a.get잔액());
                    //농협temp에 해당 배열 강제 타입변환
                    농협은행 농협temp=(농협은행)부모배열.get(i);
                    //포인트 적립
                    농협temp.set포인트(부모은행a.get잔액()*0.005);
                    //기존 부모배열에 다시 저장
                    부모배열.set(i,농협temp);

                    return true;
                }//else if end
            }//if end
        }//for end

        return false;
    }//m end

    public boolean 출금(부모은행 부모은행a){//출금
        for(int i=0; i<부모배열.size(); i++) {
            if (부모은행a.get계좌번호().equals(부모배열.get(i).get계좌번호())){
               //해당하는 계좌의 잔액 입금액 더해서 다시 대입
               부모배열.get(i).set잔액(부모배열.get(i).get잔액() - 부모은행a.get잔액());

               return true;
            }//if end
        }//for end

        return false;
    }//m end

    public boolean 유효성검사(부모은행 부모은행a, String 선택한은행){//유효성검사

            for (int i = 0; i < 부모배열.size(); i++) {
                if (부모은행a.get계좌번호().equals(부모배열.get(i).get계좌번호())) {
                    return false;
                }//if end
            }//for end
        return true;
    }//m end
}//c end
