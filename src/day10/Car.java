package day10;

public class Car {

    //클래스 멤버
    // 1. 필드
    int gas;
    // 2. 생성자 : 객체 생성시 new

    // 3. 메소드
        // 1. 필드값을 변경하는 메소드 [ 매개변수 : int / 리턴 : x ]
    void setGas(int gas){
        this.gas = gas;
    }
        // 2. 필드 확인하는 메소드
    boolean isLeftGas(){
        if (this.gas==0){
            System.out.println("gas가 없습니다.");
            return false;
        }
        System.out.println("gas가 있습니다.");
        return true;
    }// f end
        // 3. 필드의 값이 0이면 무한루프가 종료되는 함수[ 매개변수 : X / 리턴 : X ]
    void run(){//f start
        while (true){//while start
            if (this.gas>0){
                System.out.println("달립니다. gas 잔량 : "+this.gas);
                gas-=1;
            }else {
                System.out.println("멈춥니다. gas 잔량 : "+this.gas);
                return; // 메소드 종료
            }// if end
        }// while end
    }//f end
    
}//class end
