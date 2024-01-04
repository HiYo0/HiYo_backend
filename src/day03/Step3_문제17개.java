package day03;

import java.util.Scanner;

public class Step3_문제17개 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//
//            // 1. 문제1 : 하나의 정수형으로  입력받아 7의 배수 이면 'O' 아니면 'X' 출력 하시오.
//        System.out.print("문제1 정수써주세요 : ");
//        int a = scanner.nextInt();
//        System.out.println(a%7==0?"O":"X");
//
//            // 문제2 : 하나의 정수형으로  입력받아 홀수 이면 'O' 아니면 'X' 출력 하시오.
//        System.out.print("문제2 정수써주세요 : ");
//        int b = scanner.nextInt();
//        System.out.println(b%2!=0? "O":"X");
//
//            // 문제3 : 하나의 정수형으로  입력받아 7의 배수 이면서 짝수 이면 'O' 아니면 'X' 출력 하시오.
//        System.out.print("문제3 정수써주세요 : ");
//        int c = scanner.nextInt();
//        System.out.println(c%7==0 && c% 2 == 0 ? "O":"X");
//
//            // 문제4 : 하나의 정수형으로  입력받아 11의 배수 이거나 짝수 이면 'O' 아니면 'X' 출력 하시오.
//        System.out.print("문제4 정수써주세요 : ");
//        int d = scanner.nextInt();
//        System.out.println(d%11==0 || d%2 == 0 ? "O":"X");
//
//            // 문제5 : 두개의 정수형으로 입력받아 더 큰수 출력 하시오.
//        System.out.print("문제5 1번 정수써주세요 : ");
//        int e = scanner.nextInt();
//        System.out.print("문제5 2번 정수써주세요 : ");
//        int f = scanner.nextInt();
//        System.out.println(e>f? e: e==f? "같다": f);
//
//            // 문제6 : 정수형으로 반지름을 입력받아 원 넓이 출력 하시오. 소수점 둘째 자리 까지 출력하시오.
//        System.out.print("문제6 정수으로 반지름 써주세요 : ");
//        int g = scanner.nextInt();
//        double 넓이 = g*g*3.14;
//        System.out.printf("%.2f \n",넓이);
//
//            //문제7 : 실수형으로 두번 입력받아 앞 실수의 값이 뒤의 값의 몇% 인지 소수점 첫째 자리까지 출력하시오.
//                    // 예) 54.5   84.3 실수 2개입력시 결과는   64.285714%
//        System.out.print("문제7 1번 실수로 써주세요 : ");
//        float h = scanner.nextFloat();
//        System.out.print("문제7 2번 실수로 써주세요 : ");
//        float i = scanner.nextFloat();
//
//        double 계산 = h/i*100;
//        System.out.printf("%.1f %% \n",계산);
//
//            // 문제8 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기 , 소수점 첫째 자리까지 출력하시오.
//        //                계산식) 사다리꼴 계산식 = > (윗변 + 밑변) * 높이 / 2
//        System.out.print("문제8 1번 '윗변'를 써주세요 : ");
//        double j = scanner.nextDouble();
//        System.out.print("문제8 2번 '밑변'를 써주세요 : ");
//        double k = scanner.nextDouble();
//        System.out.print("문제8 3번 '높이'를 써주세요 : ");
//        double l = scanner.nextDouble();
//
//        double 사다리계산 = (j+k)*l/2;
//        System.out.printf("사다리꼴 답 = %.1f\n",사다리계산);
//
//            // 문제9 : 키를 정수를 입력받아 표준체중 출력하기 , 정수형으로 출력하시오.
//        //                계산식) 표준체중 계산식 = > (키 - 100) * 0.9
//        System.out.print("문제9 '키'를 써주세요 : ");
//        int m = scanner.nextInt();
//        System.out.println("표준체중 = "+(m-100)*0.9);
//
//            // 문제10 : 키와 몸무게를 입력받아 BMI 출력하기 , 소수점 둘째 자리 까지 출력하시오.
//        //        계산식) BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100));
//        System.out.print("문제10 '키'를 써주세요 : ");
//        double n = scanner.nextInt();
//        System.out.print("문제10 '몸무개'를 써주세요 : ");
//        double o = scanner.nextInt();
//        System.out.printf("BMI = %.2f",o/(n/100)*(n/100) );
//
//
//            // 문제11 : inch 를 입력받아 cm 로 변환하기  , 소수점 둘째 자리까지 출력하시오.
//        //                계산식) 1 inch -> 2.54cm
//        System.out.print("inch를 입력해주세요 : ");
//        double p = scanner.nextDouble(); // 인치
//        System.out.printf("%.2f inch는 %.2f Cm입니다.\n",p,p*2.54);
//
//            // 문제12:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하여 소수 둘째자리까지 점수 출력하시오
//        //        계산식 반영비율)  중간고사 반영비율 => 30 %  / 기말고사 반영비율 => 30 %   / 수행평가 반영비율 => 40 %
//        System.out.print("중각고사 점수를 입력해주세요 : ");
//        double q = scanner.nextDouble();
//        System.out.print("기말고사 점수를 입력해주세요 : ");
//        double r = scanner.nextDouble();
//        System.out.print("수행평가 점수를 입력해주세요 : ");
//        double s = scanner.nextDouble();
//        System.out.printf("중간고사 : %.2f점\t 기말고사 : %.2f점\t 수행평가 : %.2f점\n",q*0.3,r*0.3,s*0.4);
//
//
//            // 문제13 :  연산 순서 나열 하고 printf() 에 출력되는 x 와 y 값을 예측하시오.
//
////        int x = 10;
////        int y = x-- + 5 + --x;
////        System.out.printf(" x의 값 : %d , y의값 :  %d ", x, y);
//
//            // 문제14 : 나이를 입력받아 나이가 10세이상이면 학생 , 20세이상이면 성인 , 40세이상이면 중년 으로 출력하기
//        System.out.print("나이를 입력해주세요 : ");
//        int t = scanner.nextInt();
//        System.out.printf("당신은 %s 입니다.\n",t>=40 ?"중년":t>=20 ? "성인": t>=10 ? "학생":"아동" );
//
//
//            // 문제15 : 국어 , 영어 , 수학 점수를 입력받아 각 변수에 저장하고 총점(소수점 0자리) 출력 , 평균(소수점 2자리 까지) 출력
//        System.out.print("'국어'점수를 입력해주세요 : ");
//        double u =scanner.nextDouble();
//        System.out.print("'영어'점수를 입력해주세요 : ");
//        double v = scanner.nextDouble();
//        System.out.print("'수학'점수를 입력해주세요 : ");
//        double w = scanner.nextDouble();
//
//        System.out.printf("총점수는 : %d\t 평균점수는 : %.2f\n",(int)(u+v+w),(u+v+w)/3);
//
//            // 문제16 : 아이디[문자열] 와 비밀번호[문자열] 를 입력받아 아이디가 'admin' 이고 비밀번호가 '1234' 와 일치하면 '로그인성공' 아니면 '로그인실패' 출력
//        System.out.print("아이디를 입력해주세요 : ");
//        String x = scanner.next();
//        System.out.print("비밀번호를 입력해주세요 : ");
//        String y = scanner.next();
//
//        System.out.println(x.equals("admin") && y.equals("1234") ?"로그인성공":"로그인실패");
//
//            // 문제17 : 3개의 정수형으로 입력받아 가장 큰수 출력
//        System.out.print("1번 정수를 입력해주세요 : "); //1
//        int z1= scanner.nextInt();
//        System.out.print("2번 정수를 입력해주세요 : "); // 2
//        int z2= scanner.nextInt();
//        System.out.print("3번 정수를 입력해주세요 : ");
//        int z3= scanner.nextInt();
//
//        System.out.println(z1>z2? z1>z3? z1 : z2>z3? z2:z3 :  z2 >z3? z2:z3);



    }
}
