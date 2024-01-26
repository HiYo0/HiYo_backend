package day18.controller;

import day18.model.dao.BoardDao;
import day18.model.dao.MemberDao;
import day18.model.dto.BoardDto;
import day18.model.dto.CategoryDto;
import day18.model.dto.MemberDto;

import java.util.ArrayList;

public class BoardControl {//class start

    // 싱글톤
    private BoardControl(){}
    private static BoardControl boardControl = new BoardControl();
    public static BoardControl getInstance(){return boardControl;}

    // 게시글 출력
    public ArrayList<BoardDto> boardView(){
        return BoardDao.getInstance().boardView();
    };

    // 카테고리 출력
    public ArrayList<CategoryDto> categoryView(){
        return BoardDao.getInstance().categoryView();
    }
    // 작성자 ID 출력
    public ArrayList<MemberDto> memberName(){
        return BoardDao.getInstance().memberName();
    }

    // 게시글 작성
    public boolean write(BoardDto boardDto){
        if(BoardDao.getInstance().write(boardDto)){
            return true;
        }
        return false;
    }

}//class end
