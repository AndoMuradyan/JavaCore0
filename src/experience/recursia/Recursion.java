package experience.recursia;

public class Recursion {
    public static void main(String[] args) {
        int a=0x4f;

    //    factorial5! = 1*2*3*4*5
        System.out.println(Recursion.fact(4));
        System.out.println(Recursion.factR(9));

    }

//    public static int fib(int n){
//
//    }
    public static int factR(int n) {
    if (n==0||n==1)
        return 1;
        return n*factR(n-1);


    }
    public static int fact(int n) {
        int r = 1;
        for (int i = 2; i <= n; i++) {
            r = r * i;

        }
        return r;

    }
}
