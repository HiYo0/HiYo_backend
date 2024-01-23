package 과제.과제9_팀.오승택;

public class Machine implements Capsule{

    @Override
    public void insert() {

    }

    void run(Capsule capsule){
        capsule.insert();
    }

    public void clean(){
        System.out.println("머신 청소를 시작합니다.");
    }
}
