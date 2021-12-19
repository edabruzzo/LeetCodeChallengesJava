package br.com.abruzzo.turing.Challenges_DIO_LeetCode_Among_Others;

import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;

public class TrigoNoTabuleiro {


    static boolean DEBUG = true;
    private static boolean LER_SCANNER = false;
    private static final String ARQUIVO_ENTRADAS = "/home/usuario/IdeaProjects/LeetCodeChallengesJava/src/main/java/br/com/abruzzo/turing/arquivosDebug/entradas.txt.tabuleiro";
    private static BufferedReader bufferedReader;
    private static Scanner scanner = new Scanner(System.in);

    static {
        try {
            if (DEBUG)
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(ARQUIVO_ENTRADAS)));
            else
                bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }




    public static void main(String[] args) {

     resolverComBitwiseOperations();
     resolverComMathPow();

    }







    public static void resolverComBitwiseOperations() {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=0 ; i<n ; i++) {
            long x = sc.nextLong();
            if (x <= 5) {
                System.out.println("0 kg");
            } else {
                long two_power = 1L << (x - 5L);
                System.out.println((two_power / 375L) + " kg");
            }

        }
        sc.close();
    }



    public static void resolverComMathPow() {

        int n = lerProximaEntrada();
        boolean condicao1 = n >=1 && n<=100;

        if (condicao1){
            for(int i=0 ; i<n ; i++) {
                int x = lerProximaEntrada();
                if(x>=1 && x<=100){
                    double valor;
                    if(x==64) valor = (Math.pow(2,63)-1)/6;
                    else valor = Math.pow(2,x)/12;
                    System.out.printf("%.0f kg\n", Math.floor((valor) / 1000));
                }
            }

        }
    }


    private static int lerProximaEntrada(){
        if(LER_SCANNER) return scanner.nextInt();
        else return lerProximoStream();
    }


    private static int lerProximoStream() {

        StringTokenizer st = null;
        try {
            st = new StringTokenizer(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Integer.parseInt(st.nextToken());
    }

}