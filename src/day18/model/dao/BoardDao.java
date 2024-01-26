package day18.model.dao;

import day18.model.dto.BoardDto;
import day18.model.dto.CategoryDto;
import day18.model.dto.MemberDto;

import java.sql.DriverManager;
import java.util.ArrayList;

public class BoardDao extends Dao{//class start
    public BoardDao() { // 생성자. : 객체 생성시 초기화 담당.
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
    private static BoardDao boardDao = new BoardDao();
    public static BoardDao getInstance() {return boardDao;}

    // 게시글 출력을 위한 메소드
    public ArrayList<BoardDto> boardView(){
        try {
            // 1. sql 작성한다
            String sql = "select * from board;";
            // 2. sql 기재한다
            ps = conn.prepareStatement(sql);
            // 3. sql 실행한다.
            rs = ps.executeQuery();
            // 4. sql 결과처리
            ArrayList<BoardDto> boardDtos = new ArrayList<>();

            while (rs.next()){
                BoardDto boardDto = new BoardDto();
                boardDto.setBno(rs.getInt(1));
                boardDto.setCno(rs.getInt(2));
                boardDto.setBtitle(rs.getString(3));
                boardDto.setBcontent(rs.getString(4));
                boardDto.setMno(rs.getInt(5));
                boardDto.setBdate(rs.getString(6));//날짜
                boardDto.setBcount(rs.getInt(7));//조회수

                boardDtos.add(boardDto);
            }
            return boardDtos;
        }catch (Exception e){
            System.out.println("오류"+e);
        }
        return null;// 없음
    }

    // 카테고리 출력을위한 메소드
    public ArrayList<CategoryDto> categoryView(){
        try {
            // 1. sql 작성한다
            String sql = "select * from category;";
            // 2. sql 기재한다
            ps = conn.prepareStatement(sql);
            // 3. sql 실행한다.
            rs = ps.executeQuery();
            // 4. sql 결과처리
            ArrayList<CategoryDto> categoryDtos = new ArrayList<>();

            while (rs.next()){
                CategoryDto categoryDto = new CategoryDto();
                categoryDto.setCno(rs.getInt(1));
                categoryDto.setCname(rs.getString(2));

                categoryDtos.add(categoryDto);
            }
            return categoryDtos;
        }catch (Exception e){
            System.out.println("오류"+e);
        }
        return null;// 없음
    }

    // 작성자이름 출력을 위한 메소드
    public ArrayList<MemberDto> memberName(){
        try {
            // 1. sql 작성한다
            String sql = "select * from member;";
            // 2. sql 기재한다
            ps = conn.prepareStatement(sql);
            // 3. sql 실행한다.
            rs = ps.executeQuery();
            // 4. sql 결과처리
            ArrayList<MemberDto> memberDtos = new ArrayList<>();

            while (rs.next()){
                MemberDto memberDto = new MemberDto();
                memberDto.setMno(rs.getInt(1));
                memberDto.setMid(rs.getString(2));
                memberDto.setMpw(rs.getString(3));
                memberDto.setMphone(rs.getString(4));
                memberDto.setMdate(rs.getString(5));

                memberDtos.add(memberDto);
            }
            return memberDtos;
        }catch (Exception e){
            System.out.println("오류"+e);
        }
        return null;// 없음
    }


    public boolean write(BoardDto boardDto){
        try {
            // 1. sql 작성한다
            String sql = "insert into board(cno,btitle,bcontent,mno,bcount) value(?,?,?,?,?);";
            // 2. sql 기재한다
            ps = conn.prepareStatement(sql);
                // + ? 매개변수 대입
            ps.setInt(1,boardDto.getCno());
            ps.setString(2,boardDto.getBtitle());
            ps.setString(3,boardDto.getBcontent());
            ps.setInt(4,boardDto.getMno());
            ps.setInt(5,boardDto.getBcount());

            // 3. sql 실행한다.
            ps.executeUpdate();

            // 4. sql 결과처리
            return true;
        }catch (Exception e){
            System.out.println("오류남"+ e);
        }
        return false;

    }
}//class end
