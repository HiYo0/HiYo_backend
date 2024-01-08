package day05;

public class ex1 {
    public static void main(String[] args) {
        int n = 36;

        int[] a = new int[n/2];

        for(int i = 1; i<=n; i++) {
            for(int j = 0; j<a.length; j++){
                if (i % 2 != 0) {a[j]=i;break;}
            }
        }
//        for (int d = 0; d<a.length;d++){}
        System.out.println(a[2]);


//        int[] answer = {};

    }
}
