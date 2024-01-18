package day13.step4_final;

public /*final*/ class Car {//class start
    public int speed;
    public void speedUp(){
        speed +=1;
    }
    public final void stop(){
        System.out.println("차를 멈춤");
        speed=0;
    }
}//class end
