package day22.제네릭와일드카드;

public class Course {
    // 1. 모든 사람이면 등록 가능.
    public static void registerCourse1(Applicant<?> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName()+"이(가) Course1을 등록함");
    }
    // 2. 학생만 등록 가능.                 : ? extends student : 본인타입 포함 하위타입 가능.
    public static void registerCourse2(Applicant<? extends Student> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName()+"이(가) Course2를 등록함");
    }
    // 3. 직장인 및 일반인 등록 가능.        : ? super Worker : 본인타입 포함 상위타입 가능.
    public static void registerCourse3(Applicant<? super Worker> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName()+"이(가) Course3를 등록함");
    }
}
