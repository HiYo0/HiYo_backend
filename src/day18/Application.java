package day18;

import day18.view.MainView;

public class Application {//class start

    public static void main(String[] args) {//main start
        MainView.getInstance().run();

    }//main end
}//class end
/*
    -- 다른 클래스내 메소드를 호출하는 방법
        1. 인스턴스 메소드
        MainView mainView = new MainView();
        mainView.run();
        2. 인스턴스 메소드
        new MainView().run();
        
        3. 싱글톤(인스턴스 메소드)
        MainView.getInstance().run();

        4. 메소드 자체가 static 일떄 (정적메소드)
        MainView.run();
    -- 외부 클래스에서 메소드를 호출하는 방법
 */