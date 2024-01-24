package day17.step2_DB연동방법;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Step2 {//class start

    public static void main(String[] args) {//main start
        try {
            // 1. DB연동
            // 1. mySQL 드라이버를 메모리(드라이버 객체)에 로딩한다
            // * 예외처리 필수 : try{  }catch( 예외클래스명 매개변수 ){  }
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. 위에서 등록된 드라이버객체를 이용한 DB연동( jdbc:mysql://ip번호:port번호/DB명 , 계정 , 비밀번호 )
            // * 예외처리 필수 : try{  }catch( 예외클래스명 매개변수 ){  } // SQLException ( 오류발생이유 )
            // * 연동성공시 반환객체 : Connection 객체 ( statement ) 구현객체 생성, 트랜잭션처리 , DB연결 끊읗때 사용
            Connection connection =
            DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test5",
                    "root",
                    "1234");

            System.out.println("[시스템오류] : 연동성공");
            // 3. SQL 작성하고 SQL 실행
            // [C]
            connection.prepareStatement("insert into table1 value (1 , '유재석');").executeUpdate();
            // [U]
            connection.prepareStatement("update table1 set 데이터필드2 = '강호동';").executeUpdate();
            // [D]
            connection.prepareStatement("delete from table1;").executeUpdate();



        } catch (SQLException e){System.out.println(e);}
        catch (Exception e){System.out.println("[시스템오류] : 연동실패");}
    }//main end
}//class end
