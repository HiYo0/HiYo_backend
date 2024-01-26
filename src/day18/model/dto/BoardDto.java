package day18.model.dto;

public class BoardDto {
    private int bno;
    private int cno;
    private String btitle;
    private String bcontent;
    private int mno;
    private String bdate;
    private int bcount;

    //생성자
    public BoardDto(){}
    public BoardDto(int bno, int cno, String btitle, String bcontent, int mno, String bdate, int bcount) {
        this.bno = bno;
        this.cno = cno;
        this.btitle = btitle;
        this.bcontent = bcontent;
        this.mno = mno;
        this.bdate = bdate;
        this.bcount = bcount;
    }

    //get/set

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public String getBtitle() {
        return btitle;
    }

    public void setBtitle(String btitle) {
        this.btitle = btitle;
    }

    public String getBcontent() {
        return bcontent;
    }

    public void setBcontent(String bcontent) {
        this.bcontent = bcontent;
    }

    public int getMno() {
        return mno;
    }

    public void setMno(int mno) {
        this.mno = mno;
    }

    public String getBdate() {
        return bdate;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
    }

    public int getBcount() {
        return bcount;
    }

    public void setBcount(int bcount) {
        this.bcount = bcount;
    }

    @Override
    public String toString() {
        return "BoardDto{" +
                "bno=" + bno +
                ", cno=" + cno +
                ", btitle='" + btitle + '\'' +
                ", bcontent='" + bcontent + '\'' +
                ", mno=" + mno +
                ", bdate='" + bdate + '\'' +
                ", bcount=" + bcount +
                '}';
    }
}//c end
