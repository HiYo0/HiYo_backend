package 과제.과제6;
import java.util.Scanner;

public class MemberSys { // class s
	static Member[] 객체배열 = new Member[100];
	public static void 회원가입(){
		Scanner sc = new Scanner(System.in);


		System.out.println("회원가입 실행");
		System.out.print("희망하는 ID를 입력해주세요 : ");
		String id = sc.nextLine();
		System.out.print("희망하는 Password 를 입력해주세요 : ");
		String pw = sc.nextLine();
		System.out.print("사용자의 이름을 입력해주세요 : ");
		String name = sc.nextLine();
		System.out.print("사용자의 전화번호를 입력해주세요 : ");
		String phone = sc.nextLine();
		System.out.print("사용자의 나이를 입력해주세요 : ");
		String age = sc.nextLine();

		Member.getInstance().set아이디(id);
		Member.getInstance().set비밀번호(pw);
		Member.getInstance().set이름(name);
		Member.getInstance().set전화번호(phone);
		Member.getInstance().set나이(age);

		for (int i = 0; i < MemberSys.객체배열.length; i++) {
			if (객체배열[i]==null){
				객체배열[i]= Member.getInstance();

				System.out.println(객체배열[0].get나이());
				System.out.println(객체배열[객체배열.length>0?0:1].get나이());
				break;
			}

		}//for end


	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		Member member=new Member();

		while(true) {

			System.out.println("\n\n--------- 회원 시스템 ---------");
			System.out.print("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기   선택> ");
			int ch = sc.nextInt();
			sc.nextLine();

			if( ch == 1 ) {//회원가입
				회원가입();

			}
			else if( ch == 2 ) {

			}
			else if( ch == 3 ) {

			}
			else if( ch == 4 ) {

			}

		} // w e
	} // m e 
} // class e 
/*
	주제 : 회원제 시스템 part2
	 	- Member , MemberSys 클래스를 이용하여 아래 조건에 따라. 코드를 완성하시오.
 		- Member , MemberSys 클래스 외 새로운 클래스를 생성 하지 마시오.
 		- main() 메소드 외 기능별 함수를 4개 생성하시오.

		[ Member 클래스 ]
 		0. 아래 필드를 가지는 클래스를 설계 하시오.
 			필드 : 아이디 , 비밀번호 , 이름 , 전화번호 , 나이
		1. 생성자 사용하시오.
		2. getter , setter 메소드를 사용하시오.

		[ MemberSys 클래스 ]
		0. 배열
			Member[] 객체배열 = new Member[100];

		1. 초기 메뉴
			1. 회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기
			
		2. 조건 기능 
			1. 회원가입 메소드 
				1. 아이디 , 비밀번호 , 이름 , 전화번호 , 나이  각 입력받아 저장 
				2. Member 객체화
				3. 객체를 배열 저장 
				 
			2. 로그인 메소드
				1. 아이디 , 비밀번호 입력받아 저장 
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 로그인 성공 
					- 아니면 실패
					 
			3. 아이디찾기 메소드
				1. 이름 , 전화번호 입력받아 저장
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 찾은 아이디 출력 
					- 아니면 없다.
					 
			4. 비밀번호찾기 메소드 
				1. 아이디 , 전화번호 입력받아 저장
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 찾은 비밀번호 출력
					- 아니면 없다.

			
*/














