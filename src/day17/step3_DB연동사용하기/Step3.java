package day17.step3_DB연동사용하기;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Step3 {
    /*
        0. Class.forName("JDBC드라이버 클래스 경로");
            - 해당 클래스를 찾아서 JDBC 드라이버 객체 (DriverManager) 자동 등록한다.

        1. [클래스] DriverManager
            - 연동 성공하면 Connection 구현체(객체)를 반환한다.
            1. 연동함수
                DriverManager.getConnection("jdbc:mysql://ip번호:port번호/db명" , "계정명" , "비밀번호");
                - ip번호 = localhost : 현재 pc 뜻.
                - port번호 = mysql 3306 사용 권장.

        2. [인터페이스] Connection
            - statement , PreparedStatement 구현 객체를 반환한다.
            1. connection.PreparedStatement( SQL );     SQL 서명/기재 된 PreparedStatement 구현체 반환한다.

        3. [인터페이스] PreparedStatement
            - DDL , DML 문을 실행 할때 사용한다.
            1 . 실행
                1. insert , update ,delete => .executeUpdate();
                2. select => .executeQuery();

        4. [인터페이스] ResultSet
            - DB에서 가져온 데이터를 읽을때 사용한다.
            1. 다음 레코드 이동 : .next()      : 다음레코드 이동후 존재하면 true / 없으면 false 반환
            2. 현재 레코드에서 필드 값 호출      : .get타입( 호출한 필드순서번호 or 필드명 );
                                            .getString(  ) : 문자타입 호출 , .getInt(  )  : 정수타입호출
               

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Connection connection = null; // DB변수
        try {
            // DB연동
            // 1. JDBC 드라이버 로딩
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. DB서버와 연동 후 연동객체를 반환 받는다.
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test5",
                    "root",
                    "1234"
            );
            System.out.println("[시스탬안내]DB 연동성공");
            // 3. DB연동시 필요한 메소드중에 Class.forName , getConnection 일반예외 발생 => try처리
                // - try{}catch(예외클래스명 매개변수){}
        }catch (Exception e){System.out.println("[시스템안내] DB연동 오류\n"+e);}

        while (true){
            System.out.println(" 고객명단 : 1.삽입 2.출력 3.수정 4.삭제 ");
            System.out.print("선택 > ");
            try {
                int ch= scanner.nextInt();  // 만일 int 타입 범위 벗어난 입력시
                if(ch==1){// 삽입
                    // 1. 입력받기
                    System.out.print("저장할 고객명 : "); String name = scanner.next();
                    // 2. DB에 저장한다.
                    String sql = "insert into members values('"+name+"');";
                    System.out.println(sql);
                     connection.prepareStatement(sql).executeUpdate();
                } else if (ch==2) {// 출력
                    // 모든 필드(*) 를 표시하는 모든 레코드(where없이) 출력
                    String sql = "select * from members;";
                    // 반환된걸 저장해야함
                    ResultSet resultSet = connection.prepareStatement(sql).executeQuery();

                    // .next() : select 결과 테이블에서 다음 레코드로 이동후 존재여부 true/false 반환함수
                    while (resultSet.next()){// 검색결과내 첫번째 레코드부터 마지막레코드까지 순회.
                        // 하나씩 next()로 레코드를 이동하면서 반복처리 만약에 다음레코드가 존재하면 실행.
                        // 다음레코드가 존재하지 않으면 false 이므로 while 종료.
                        System.out.println(resultSet.getString(1));
                        // System.out.println(resultSet.getString("name"));
                            // .get타입( 가져올 필드순서번호 or 필드명 );

                    }//while end
                    /*
                        ResultSet : 인터페이스   <---------- select 결과표( 표 )
                            null                        name     age
                                                        유재석     30
                                                        강호동     25
                     */

                } else if (ch==3) {// 수정
                    // 1. 입력받기
                    System.out.print("수정할 고객명 : ");String oldName = scanner.next();     // 누구를
                    System.out.print("새로운 고객명 : ");String newName = scanner.next();     // 어떻게
                    // 2. DB에 수정처리를 한다.
                    String sql = "update members set name = '"+newName+"' where name = '"+oldName+"';";
                        System.out.println(sql);
                    connection.prepareStatement(sql).executeUpdate();

                } else if (ch==4) {// 삭제
                    // 1. 입력받기 // 누구를 삭제할껀지 입력
                    System.out.print("삭재할 고객명 : ");String deleteName = scanner.next();     // 누구를
                    // 2. DB에 삭제처리한다.
                    String sql = "delete from members where name = '"+deleteName+"';";
                    System.out.println(sql);
                    connection.prepareStatement(sql).executeUpdate();


                }else {
                    System.out.println("[안내]없는 항목입니다.");
                }
            }catch (InputMismatchException e){
                System.out.println("[시스템오류]번호를 입력해주세요");
                scanner = new Scanner(System.in);   // 기존에 입력받은 입력값을 초기화
            }catch (SQLException e){
                System.out.println("[시스템오류]SQL에서 오류가발생했습니다.\n"+e);
            }

        }//while end
    }//main end
}//class end
