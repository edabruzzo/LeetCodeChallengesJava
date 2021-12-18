package br.com.abruzzo.turing;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MacPronalts {


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

    private static int lerProximaEntrada(){
        if(LER_SCANNER) {
            scanner.useLocale(Locale.ENGLISH);
            Locale.setDefault(new Locale("en", "US"));
            return scanner.nextInt();
        }
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



    public static void main(String[] args) {


        int produtos=0, quantidade=0;
        double res=0, valor=0;
        int N = lerProximaEntrada();
        boolean condicao1 = N >=1 && N<=5;

        if (condicao1){

            for (int x=0 ; x<N ; x++){
                produtos = lerProximaEntrada();
                quantidade  = lerProximaEntrada();

                if (quantidade >=1 && quantidade <=500){

                    if (produtos == 1001)
                        valor = 1.50;
                    else if (  produtos == 1002     )
                        valor = 2.50    ;
                    else if (produtos == 1003     )
                        valor = 3.50      ;
                    else if (produtos == 1004     )                  //complete o código nos espaços em branco
                        valor = 4.50   ;
                    else if (produtos == 1005     )
                        valor =   5.50     ;

                    res += valor * quantidade;
                }

            }

            System.out.printf("%.2f\n",res);

        }
    }
}
