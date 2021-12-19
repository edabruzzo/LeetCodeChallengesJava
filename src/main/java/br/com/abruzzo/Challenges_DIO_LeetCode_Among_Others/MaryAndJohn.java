package br.com.abruzzo.Challenges_DIO_LeetCode_Among_Others;

import java.io.*;
import java.util.Scanner;

public class MaryAndJohn {


    public static void exec1(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);

        int T = leitor.nextInt();

        for (int c = 0; c < T; c++) {
            int N = leitor.nextInt();
            int K = leitor.nextInt();
            if (K != 0 && N >= 1 && N <= 10000 && K >= 1 && K <= 10000)
                System.out.println((N % K) + (N / K));
        }

    }


    public static void b(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();

/*            int[] a = {5,
            0, 0, 1, 0, 1,
            6,
            0, 0, 0, 0, 0, 1,
            0};
   */

        while (n != 0) {
            int M = 0, J = 0;
            for (int i = 0; i < n; i++) {
                int a = entrada.nextInt();
                if (a == 0)
                    M++;
                else
                    J++;
            }
            System.out.println("Mary won " + M + " times and John won " + J + " times");
            n = entrada.nextInt();
        }


    }


    public static void c(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        if (n >= 1 && n <= 10000) {

            while (n != 0) {
                int M = 0, J = 0;
                for (int i = 0; i < n; i++) {
                    int a = entrada.nextInt();
                    if (a == 0)
                        M++;
                    else
                        J++;
                }
                System.out.println("Mary won " + M + " times and John won " + J + " times");
                n = entrada.nextInt();
            }


        }


    }

}
