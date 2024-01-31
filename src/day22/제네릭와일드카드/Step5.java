package day22.제네릭와일드카드;

public class Step5 {//class start

    public static void main(String[] args) {//main start

        // 1. 모든 사람이 신청 가능
            // 1. 사람 객체
        Person person = new Person();
            // 2. 사람객체를 등록자1 에 대입
        Applicant<Person> applicant1 = new Applicant<>(person);
        Course.registerCourse1( applicant1 );
        // 1.
        Course.registerCourse1(new Applicant<Worker>(new Worker()));
        Course.registerCourse1(new Applicant<Student>(new Student()));
        Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));

        // 2.
//        Course.registerCourse2(new Applicant<Person>(new Person()));
//        Course.registerCourse2(new Applicant<Worker>(new Worker()));
        Course.registerCourse2(new Applicant<Student>(new Student()));
        Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));

        // 3.
        Course.registerCourse3(new Applicant<Person>(new Person()));
        Course.registerCourse3(new Applicant<Worker>(new Worker()));
//        Course.registerCourse3(new Applicant<Student>(new Student()));
//        Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()));
//        Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));

        // 예외 : 예외클래스 라이브러리 지원
            // 1. 일반예외 : 컴파일 전에 예외 검사
            // 2. 실행예외 : 컴파일 후에 예외 검사
    }//main end
}//class end
