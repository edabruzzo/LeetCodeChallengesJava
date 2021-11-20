public class Teste {

    public static int foo(int a, String s)

    {

        s = "Yellow";

        a=a+2;

        return a;

    }

    public static void bar()

    {

        int a=3;

        String s = "Blue";

        a = foo(a,s);

        System.out.println("a="+a+" s="+s);

    }



    /*public static void main(String args[])

    {

        bar();

    }
    */

    public static void XXXX(String[] args) throws java.io.IOException {

        java.util.Scanner leitor = new java.util.Scanner(System.in);
        int T = leitor.nextInt();
        int K = 0;

        while(T>0){
            int N = leitor.nextInt();
            K = leitor.nextInt();

            if (K != 0) {
                System.out.println((N % K) + (N / K));
            }

        }


    }
}
