package day12.model;

import java.util.ArrayList;
import java.util.Arrays;

// DAO : 데이터베이스 접근 객체
public class MemberDao {//class start

    // 싱글톤
    private MemberDao(){}
    private static MemberDao memberDto = new MemberDao();
    public static MemberDao getInstance(){return memberDto;}

    // DB 대신 배열
        // 배열사용시 불편한점 : 고정길이
        // 고정길이 배열을 가변길이 배열로 구현 => 제공하는 라이브러리/컬렉션(수집) 프레임워크(라이브러리집합)
        // 컬렉션 프레임워크 : ArrayList 가변길이 배열을 지원하는 클래스
        // ArrayList<여러개 저장할 객체의 타입>;
        // 제공하는 함수
                //          가병길이                            고정길이
                //      ArrayList< 타입 > 변수명     vs      타입[ ] 변수명
                // 요소 저장 : .add( 저장할 객체 )                배열명[인덱스] = 저장할데이터
                // 요소 개수 : .size( )                         배열명.length
                // 요소 호출 : .get( )                          배열명[인덱스]
                // 요소 삭제 : .remove(인덱스)                   배열명[인덱스] = null

    // MemberDto[] memberDtos =new MemberDto[100];
    ArrayList<MemberDto> memberDtos = new ArrayList<>();

    // 1. 회원가입 메소드
    public boolean signup(MemberDto memberDto){
        System.out.println("MemberDao.signup");
        if(중복검사(memberDto.getId())){
            memberDtos.add( memberDto );

        }else {
            return false;
        }

        return true; // 회원가입성공
    }
    // 2. 로그인 메소드
    public boolean login(MemberDto memberDto){
        System.out.println("[3]MemberDao.login");

        // 로그인 처리 : 전체 회원객체 중 에 입력받은 동일한 값이 있는지 확인

        for (int i = 0; i < memberDtos.size(); i++) {
            //i 는 0 부터 리스트내 요소 개수 까지 1씩 증가
            if(중복검사(memberDto.getId())){
                // 리스트내 i번째 객체의 아이디 와 입력받은 아이디(매개변수) 같으면
                if(memberDtos.get(i).getId().equals(memberDto.getPw())){
                    return true; // 로그인 성공
                }
            }
        }//for end

        return false;// 로그인 실패
    }

    // 3. ID중복검사
    public boolean 중복검사(String id){
        for (int i = 0; i < memberDtos.size(); i++) { // 중복검사
            if(memberDtos.get(i).getId().equals(id)){
                System.out.println("\n중복된 ID가 있습니다.\n");
                return false;
            }
        }

        return true;
    }


}//class end
