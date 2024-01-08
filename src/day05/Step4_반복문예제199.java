package day05;

import java.util.Scanner;

public class Step4_반복문예제199 {
    public static void main(String[] args) {//main start

        Scanner scanner = new Scanner(System.in);
        // 5. int형 데이터를 여러개 저장할수 있는 배열 선언.
        int[] 학생수 = new int[0];


        // 1. 무한루프
        while (true){
            // 2. 출력 
            System.out.println("-----------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-----------------------------------------");
            // 3. 입력
            System.out.print("선택 > ");String ch = scanner.nextLine();
            // 4. 경우의수
            if (ch.equals("1")){
                System.out.print("학생수 > "); String count = scanner.nextLine();
                //while 밖에서 입력받은 수 많큼 배열 선언 => 다른 if{  } 에서 사용하기 위해서
                // [p.172] 입력받은 (문자 ->정수 변환) 만큼 배열길이 만큼 배열길이를 다시 초기화
                학생수 = new int[Integer.parseInt(count)]; // 기존 대이터 다 사라짐.
            }
            else if (ch.equals("2")) {
                // 6. [1] 번에서 입력받은 학생 수 만큼 점수를 입력받기.
                for(int i = 0; i<학생수.length; i++){
                    System.out.printf("점수 > ",i);
                    // 입력받은 문자열 -> 정수 변환해서 i번째 인덱스에 저장
                    학생수[i] = Integer.parseInt(scanner.nextLine());

                }
            }
            else if (ch.equals("3")) {
                // 7. 배열내 모든 학생 점수 출력
                for(int i = 0 ; i<학생수.length; i++){
                    System.out.printf("scores[%d] %d: \n" , i , 학생수[i]); // i번째 인덱스의 값 호출
                }
            }
            // 8.
            else if (ch.equals("4")) {
                int max = 0; // 임의 최저 점수 대입하고 시작.
                double sum = 0; // 총 합계
                for (int i = 0; i<학생수.length; i++){
                    // 만약 i 번째 인덱스의 값이 max보다 크면 대입.
                    if(학생수[i]>=max){max=학생수[i];}
                    // [평균에서 사용할 누적 합계]
                    sum+=학생수[i];
                }
                System.out.println("max = "+ max );

                // 총합계 / 학생수(배열의 길이)
                double avg = sum/학생수.length;
                System.out.printf("avg = %f \n" , avg);
            }
            else if (ch.equals("5")) {System.out.println("\n프로그램종료\n");break;}
            else {
                System.out.println("\n없는 작업번호입니다.\n");
            }


        }//while end

    }//main end
}//class end
