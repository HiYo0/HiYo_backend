package day20.step4;

public class Step4 {//class start
    public static void printlength( String data ){
        // ------------- 예외가 발생할것 같은 코드 ---------------- //
        try {
            int result = data.length();         // .(토트)
            System.out.println("문자 수 : " + result);

        }// ------------- 예외가 발생할것 같은 코드 ---------------- //
        // ------------- 만약에 try{} 코드 안에서 예외가 발생하면 catch실행 ---------------- //
        catch (Exception e){
            System.out.println(e.getMessage());
//             System.out.println(e.toString());
//             e.printStackTrace();
        }//================================================
        finally {
            System.out.println("[마무리실행]");
        }

    }

    public static void main(String[] args) {//main start
        // 1. [실행예외 - 컴파일시 예외검사 안함]NullPointerException
        printlength("ThisIsJAVA");
        printlength(null); // null 이면 참조가 없으므로 .(도트) 불가능

        // 2. [일반예외 - 컴파일시 예외 검사] ClassNotFoundException
        try {
            Class.forName("java.lang.string");
            Class.forName("java.lang.string2");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");

        // 3. 다중 catch 가능

            String[] array = {"100", "1oo"};    // NumberFormatException : "1oo" 는 정수타입으로 변환 불가능.
                                                // ArrayIndexOutOfBoundsException : 2 인덱스는 존재하지 않는
            for (int i = 0; i <= array.length; i++) {
                try {
                    int value = Integer.parseInt(array[i]);

                } catch (NumberFormatException | NullPointerException e) {
                    System.out.println(i + "숫자로 변환할수 없음." + e.getMessage());
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(i + "배열인덱스가 초과됨." + e.getMessage());
                }// c end
                System.out.println("상위 예외클래스");
            }// f end
    }//main end
}//class end
