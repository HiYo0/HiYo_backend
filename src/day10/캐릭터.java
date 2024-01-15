package day10;

import java.util.Random;

public class 캐릭터 {

    // 클래스 구성멤버
    // 1. 필드
    String nickname;
    String job = "초보자";
    int level = 1;
    int health = 100;
    // 2. 생성자
    캐릭터(String nickname){
        this.nickname = nickname;

    }

    // 3. 메소드
    public void attack(){

        Random random = new Random();
        // 체력감소
        this.health -= random.nextInt(11);
        return;// 메소드 종료 / 상호아에 따라 사용 / 생략가능
    }


    // 객체의 필드 확인용 메소드
        // 오른쪽 클랙 -> 생성 -> toString()
    @Override
    public String toString() {
        return "캐릭터{" +
                "nickname='" + nickname + '\'' +
                ", job='" + job + '\'' +
                ", level=" + level +
                ", health=" + health +
                '}';
    }
}
