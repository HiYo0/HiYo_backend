package day18.model.dao;


import day18.model.dto.BoardDto;
import day18.model.dto.MemberDto;

import java.sql.*;


public class MemberDao extends Dao {//class start

//    public static void main(String[] args) {//테스트용 main
//        MemberDao.getInstance();
//    }//테스트용 main end


    // 싱글톤

    private static MemberDao memberDao = new MemberDao();
    public static MemberDao getInstance() {return memberDao;}

    // 1. 회원가입
    public int signup(MemberDto memberDto) {
        try {
            // 1. SQL 작성 [변수가 들어갈 자리에는 ? 대체한다. ]
            String sql = "insert into member(mid , mpw, mphone)values(?,?,?);";
            // 2. SQL 기재
            ps = conn.prepareStatement(sql);
            // ? 매개변수 대입
            ps.setString(1, memberDto.getMid());    // 기재된 SQL내 첫번째 ? 에 값 대입
            ps.setString(2, memberDto.getMpw());     // 기재된 SQL내 두번째 ? 에 값 대입
            ps.setString(3, memberDto.getMphone());  // 기재된 SQL내 세번째 ? 에 값 대입
            // 3. SQL 실행
            int count = ps.executeUpdate(); // executeUpdate() 기재된 sql 실행하고 insert된 레코드 개수 반환.
            if (count == 1) {
                return 0;
            }// 만약에 insert처리된 레코드가 1개이면 회원가입 성공
            // 4. SQL 결과
        } catch (Exception e) {
            System.out.println(e);
        }
        // 5. 함수 종료
        return 1;//실패
    }

    // 2. 아이디 검사용 (아이디 중복검사 용도)
    public boolean idCheck(String mid) {
        try {
            // 1. sql 작성한다
            String sql = "select mid from member where mid = ?;";
            // 2. sql 기재한다
            ps = conn.prepareStatement(sql);
            // + ? 매개변수 대입
            ps.setString(1, mid);    // SQL 문법내 첫번쨰 ? 에 mid 변수 값 대입;
            // 3. sql 실행한다.
            rs = ps.executeQuery(); // 질의/검색 (select) 결과를 rs 인터페이스 대입한다.
            // 4. sql 결과처리
            if (rs.next()) {      // rs.next(): 검색 결과 테이블에서 다음레코드 이동. [ 다음레코드 이동후 존재하면 true. 없으면 false]
                return true;      // 중복 있음
            }
        } catch (Exception e) {System.out.println("오류" + e);}
        // 5. 함수종료
        return false;       // 중복 없음
    }//아이디검사end
    // 2. 로그인
    public boolean login(MemberDto memberDto){
        try {
            // 1. sql 작성한다
            String sql = "select * from member where mid = ? and mpw = ?;";
            // 2. sql 기재한다
            ps = conn.prepareStatement(sql);
                // + ? 매개변수 대입
            ps.setString(1,memberDto.getMid()); // sql 문법내 첫번째 ? 에 매개변수 값 대입
            ps.setString(2,memberDto.getMpw()); // sql 문법내 첫번째 ? 에 매개변수 값 대입
            // 3. sql 실행한다.
            rs= ps.executeQuery();
            // 4. sql 결과처리
            if (rs.next()){ return true;}
        }catch (Exception e){
            System.out.println("로그인 오류"+e);
        }

        // 5. 함수종료
        return false;
    }

    // 0 . 아이디를 찾기
    public int findMno(String mid) {
        try {
            // 1. sql 작성한다
            String sql = "select mno from member where mid = ? ;";
            // 2. sql 기재한다
            ps = conn.prepareStatement(sql);
            // + ? 매개변수 대입
            ps.setString(1, mid);
            // 3. sql 실행한다.
            rs = ps.executeQuery();
            // 4. sql 결과처리
            if (rs.next()) {
                // rs.next() : 다음 레코드 이동
                // rs.get타입( 호출할 필드번호 or 필드이름 ) : 현재 레코드
                return rs.getInt("mno");
            }
        }catch (Exception e){
            System.out.println("오류"+e);
        }
        return 0;
    }


}//class end
