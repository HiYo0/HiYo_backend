package day18.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {//class start
    /*
        public           : 모든 패키지 접근 가능    
        private          : 현재 클래스 접근 가능
        protected        : 동일패키지 접근가능 + 상속관계 가능
        default(생략시)   : 동일패키지 접근가능
     */
    protected Connection conn; // 1. 여러 메소드에서 사용할려고 (필드에생성) // DB연동객체
    protected PreparedStatement ps; // 작성된 SQL 가지고 있고 , 실행 담당.
    protected ResultSet rs;

    public Dao() { // 생성자. : 객체 생성시 초기화 담당.
        // - 객체 생성시 DB연동.
        try {
            // 1. mySQL 회사의 JDBC관련된(Driver) 객체를 JVM에 로딩한다. 불러오기.
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. 연동된 결과의 (구현체)객체를 Connection 인터페이스에 대입한다.
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java",
                    "root",
                    "1234"
            );
            System.out.println("DB연동 성공");
        } catch (Exception e) {
            System.out.println("DB서버 연동오류남" + e);
        }
    }

}//class end
