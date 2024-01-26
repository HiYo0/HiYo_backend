package day18.model.dto;

public class BoardSubDto {
    private int bsubno;
    private int bno;
    private String bsubcontent;
    private int mno;

    //생성자
    public BoardSubDto(){}
    public BoardSubDto(int bsubno, int bno, String bsubcontent, int mno) {
        this.bsubno = bsubno;
        this.bno = bno;
        this.bsubcontent = bsubcontent;
        this.mno = mno;
    }

    //get/set

    public int getBsubno() {
        return bsubno;
    }

    public void setBsubno(int bsubno) {
        this.bsubno = bsubno;
    }

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getBsubcontent() {
        return bsubcontent;
    }

    public void setBsubcontent(String bsubcontent) {
        this.bsubcontent = bsubcontent;
    }

    public int getMno() {
        return mno;
    }

    public void setMno(int mno) {
        this.mno = mno;
    }

    @Override
    public String toString() {
        return "BoardSubDto{" +
                "bsubno=" + bsubno +
                ", bno=" + bno +
                ", bsubcontent='" + bsubcontent + '\'' +
                ", mno=" + mno +
                '}';
    }
}
