package 과제.과제5_개인;


import java.util.Scanner;

public class MemberSys {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Member[] 배열 = new Member[5];
		
		while(true) {

			System.out.println("\n\n--------- 회원 시스템 ---------");
			System.out.print("1.회원가입 2.로그인    선택> ");
			int ch = sc.nextInt();
			sc.nextLine();
			if( ch == 1 ) {
				while (true) {
					// 입력받기 start
					System.out.println("==회원가입 입니다.==");
					System.out.print("사용하실 ID를 입력해주세요 : ");
					String id = sc.nextLine();
					System.out.print("사용하실 password를 입력해주세요 : ");
					String pw = sc.nextLine();
					System.out.print("사용자의 성함을 입력해주세요 : ");
					String name = sc.nextLine();
					System.out.print("사용자의 전화번호 입력해주세요 : ");
					String phone = sc.nextLine();
					System.out.print("사용자의 나이 입력해주세요 : ");
					String age = sc.nextLine();
					// 입력받기 end

					// 유저객체생성,등록
					Member user = new Member(id, pw, name, phone, age);
					int uesrIndex = 0; // 유저 저장 위치
					for (int i = 0; i < 배열.length; i++) {
						if (배열[i] == null) {
							배열[i] = user;
							uesrIndex = i;
							if (배열.length > 배열.length / 2) {//배열수 추가
								// 배열길이 증가
								Member[] 배열2 = new Member[배열.length + 10];
								for (int j = 0; j < 배열.length; j++) {
									배열2[j] = 배열[j];
								}
								배열 = 배열2;
							}
							break;
						}
					}//for end


					boolean duplication = true;//true= 중복없음 | false= 중복있음
					for (int i = 0; i < 배열.length; i++) {//중복검사 for문
						if (배열[i] == null) {//배열에 값이 없으면 스탑
							break;
						} else {
							if (배열[i].아이디.equals(user.아이디)) {
								if (배열[i] == 배열[uesrIndex]) {
									System.out.println("\n회원가입 완료\n");
									if (배열.length > 배열.length / 2) {//배열수절반이상이면 추가
										// 배열길이 증가
										Member[] 배열2 = new Member[배열.length + 10];
										for (int j = 0; j < 배열.length; j++) {
											배열2[j] = 배열[j];
										}
										배열 = 배열2;
									}
								} else {
									System.out.println("\n이미있는 ID 입니다.\n");
									배열[uesrIndex] = null;
									duplication = false;
									break;
								}
							}
						}
					} // for end 중복검사

					if (!duplication) {//false 일때
						System.out.print("1.다시쓰기 | 2.처음으로 입력 > ");
						String chooseService = sc.nextLine();
						if (chooseService.equals("1")) {
							System.out.println("다시입력하세요");
						} else if (chooseService.equals("2")) {
							break;
						}else {
							System.out.println("입력오류 처음으로");
							break;
						}

					} else { // true 일때
						break;
					}


					if (배열.length > 배열.length / 2) {//배열수 추가
						// 배열길이 증가
						Member[] 배열2 = new Member[배열.length + 10];
						for (int j = 0; j < 배열.length; j++) {
							배열2[j] = 배열[j];
						}
						배열 = 배열2;
					}

				}
			} else if( ch == 2 ) {
				System.out.println("==로그인 입니다.==");
				System.out.print("ID 를 입력해주세요 > ");
				String id = sc.nextLine();
				System.out.print("PassWord 를 입력해주세요 > ");
				String password = sc.nextLine();

				boolean loginSwich = false;
				String loginID = "";

				for (int i = 0; i < 배열.length; i++) {
					if (배열[i]==null){break;}
					if (id.equals(배열[i].아이디)&& password.equals(배열[i].비밀번호)){
						loginSwich = true;
						loginID = 배열[i].아이디;
						break;
					}
				}//로그인 유효성검사
				if (loginSwich) {
					System.out.println("유저 ID : "+loginID+"\n로그인성공\n");
				}else {System.out.println("\n로그인실패\n");}

			}//2번 끝

		} // w e 
	} // m e 
} // c e 


/*
 	주제 : 회원제 시스템 part1
 		- Member , MemberSys 클래스를 이용하여 아래 조건에 따라. 코드를 완성하시오.
 		- Member , MemberSys 클래스 외 새로운 클래스를 생성 하지 마시오.
 		- main() 메소드 외 새로운 메소드를 생성 하지 마시오.

 		[ Member 클래스 ]
 		0. 아래 필드를 가지는 클래스를 설계 하시오.
 			필드 : 아이디 , 비밀번호 , 이름 , 전화번호 , 나이

		[ MemberSys 클래스 ]
 		1. 초기 메뉴 [ 무한루프 ]
 			1. 회원가입 2.로그인 
 			
 		2. 조건 기능 
 			1. 회원가입 선택시
 				1. 아이디 , 비밀번호 , 이름 , 전화번호 , 나이  각 입력받아 저장 
 				2. Member 객체화
 				3. 객체를 배열 저장 
 				 
 			2. 로그인 선택시
 				1. 아이디 , 비밀번호 입력받아 저장 
 				2. 입력받은 값과 배열내 동일한 값 찾기
 					- 만약에 동일한 값 있으면 로그인 성공 
 					- 아니면 실패
*/





