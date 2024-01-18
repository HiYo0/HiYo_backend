package 과제.과제6;
import java.util.Random;
import java.util.Scanner;

public class MemberSys { // class s
	// 저장용 배열지정
	static Member[] 객체배열 = new Member[100];

	//회원가입용 메소드
	public static void 회원가입(){
		Scanner sc = new Scanner(System.in);

		// 입력라인
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
		//=========================================================

//		// Member 필드저장
//		Member.getInstance().set아이디(id);
//		Member.getInstance().set비밀번호(pw);
//		Member.getInstance().set이름(name);
//		Member.getInstance().set전화번호(phone);
//		Member.getInstance().set나이(age);
		// ===========================================================

//		System.out.println("나이 = "+Member.getInstance().get나이());
		Member member = new Member(id,pw,name,phone,age);
		// 빈 배열에 저장

		for (int i = 0; i < 객체배열.length; i++) {
//			System.out.println("객체배열["+i+"] = " + 객체배열[i]); //테스트용
			if (객체배열[i]==null){
				if(id중복검사(id)){
					System.out.println("회원가입 성공");
					객체배열[i]= member;
				}else {
					System.out.println("회원가입 실패(중복)");
				}

				// ? 여기 member -> getInstance().member 를쓰면 왜 배열 1,2 번이 똑같이등록될까?
				// 싱글톤 = 1가지 객체만들때 사용

				break;
			}
		}//for end
	}// 회원가입 method end

	//중복검사 메소드
	public static boolean id중복검사(String id){// 중복검사 method start
		// 배열에 입력한 ID 와 동일한 값이 있으면 false(중복있음) 리턴
		for (int i = 0; i < 객체배열.length; i++) {
			if (객체배열[i]==null)break;
			if(객체배열[i].get아이디().equals(id)){
				return false;
			}
		}
		return true; // 해당안되면 true (중복없음)
	}// 중복검사 method end

	// 로그인 메소드
	public static boolean 로그인(String id,String pw){
		// 만약 배열중에 입력받은 아이디와 비밀번호가 등록된것과 같은게 있으면 true 반환
		for (int i = 0; i < 객체배열.length; i++) {
			if (객체배열[i]==null)break;
			if(객체배열[i].get아이디().equals(id)&&객체배열[i].get비밀번호().equals(pw)){
				return true;
			}
		}
		return false;
	}


	// 아이디 찾기 메소드
	public static String 아이디찾기(String name,String phone){
		for (int i = 0; i < 객체배열.length; i++) {
			if(객체배열[i]==null){break;}
			if(객체배열[i].get이름().equals(name)&&객체배열[i].get전화번호().equals(phone)){
				// 입력한 이름과 전화번호가 동일한 객체가 있으면
				return "\n찾으시는 아이디 = "+객체배열[i].get아이디()+"\n";
				// 해당 객체순번의 아이디 값 반환
			}
		}
		return "입력하신 정보로 가입된 ID가 없습니다.";
		// 같은게 없으면 반환될 문구
	}

	// 비밀번호 찾기 메소드
	public static String 비밀번호찾기(String id,String phone){


		String 임시비밀번호 = "";
		for (int i = 0; i < 6; i++) {
			임시비밀번호 += Integer.toString((int)(Math.random()*10));
		}
		for (int i = 0; i < 객체배열.length; i++) {
			if(객체배열[i]==null){break;}
			if(객체배열[i].get아이디().equals(id)&&객체배열[i].get전화번호().equals(phone)){
				// 입력한 이름과 전화번호가 동일한 객체가 있으면
				객체배열[i].set비밀번호(임시비밀번호);
				return "\n임시비밀번호 = "+임시비밀번호+"\t입니다.\n";
				// 해당 객체순번의 아이디 값 반환
			}
		}
		return "입력하신 정보로 가입된 정보가 없습니다.";
		// 같은게 없으면 반환될 문구
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
			else if( ch == 2 ) {// 로그인 기능
				System.out.println("로그인 실행");
				System.out.print("ID를 입력해주세요 : ");
				String id = sc.nextLine();
				System.out.print("Password 를 입력해주세요 : ");
				String pw = sc.nextLine();
				if(로그인(id,pw)){
					System.out.println("\n로그인 성공\n");
				}else {
					System.out.println("\n로그인 실패\n");
				}

			}
			else if( ch == 3 ) {//아이디찾기 기능
				System.out.println("아이디 찾기실행");
				System.out.print("가입시 사용한 이름을 입력해주세요 : ");
				String name = sc.nextLine();
				System.out.print("가입시 사용한 전화번호을 입력해주세요 : ");
				String phone = sc.nextLine();

				System.out.println(아이디찾기(name,phone));



			}
			else if( ch == 4 ) {
				System.out.println("비밀번호 찾기실행");
				System.out.print("가입시 사용한 ID을 입력해주세요 : ");
				String id = sc.nextLine();
				System.out.print("가입시 사용한 전화번호을 입력해주세요 : ");
				String phone = sc.nextLine();

				System.out.println(비밀번호찾기(id,phone));

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














