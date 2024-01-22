package 과제.과제8_팀.model;

public class 농협은행 extends 부모은행{
    private double 포인트;

    public 농협은행() {
    }

    public 농협은행(String 계좌번호, String 계좌주, int 잔액, double 포인트) {
        super(계좌번호, 계좌주, 잔액);
        this.포인트 = 포인트;
    }

    public double get포인트() {
        return 포인트;
    }

    public void set포인트(double 포인트) {
        this.포인트 = 포인트;
    }
}
