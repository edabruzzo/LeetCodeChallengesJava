package br.com.abruzzo.turing;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TrigoNoTabuleiro {

    static boolean DEBUG = true;
    private static boolean LER_SCANNER = false;
    private static final String ARQUIVO_ENTRADAS = "/home/usuario/IdeaProjects/LeetCodeChallengesJava/src/main/java/br/com/abruzzo/turing/entradas.txt.teste2";
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

        int n = lerProximaEntrada();
        boolean condicao1 = n >=1 && n<=100;

        if (condicao1){
            for(int i=0 ; i<n ; i++) {
                int x = lerProximaEntrada();
                if(x>=1 && x<=100){
                    // https://github.com/mvsombra/urionlinejudge/blob/master/05.Matem%C3%A1tica/1169%20-%20Trigo%20no%20Tabuleiro.java
                    double valor = 1;
                    for(int j=0; j<x; j++){
                       valor *=2;
                    }
                    // https://www.ti-enxame.com/pt/java/como-arredondar-para-baixo-numeros-inteiros-em-java/968990287/
                    System.out.printf("%.0f kg\n", Math.floor((valor/12) / 1000));   //Complete o código aqui.

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