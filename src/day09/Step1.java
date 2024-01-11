package day09;

public class Step1 {//class start

    public static void main(String[] args) {// main start

        int n = 18;
        // 1,3,5,7,9,11,13,15,17 // 18일떄
        // 1,3,5,7,8,11
        int[] a = new int[n%2==0?n/2:n/2+1];

        int[] answer = {};
        for (int i = 0; i <a.length ; i++) {
            for (int j = 1; j <= n; j++) {
                if(a[i]==0) {
                    if (j % 2 != 0) {
                        a[i] = j;
                    }
                }
            }
            System.out.print(a[i]+" ");
        }
        System.out.println("\n"+a.length);



    }//main end
}//class end
