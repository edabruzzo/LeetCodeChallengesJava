package br.com.abruzzo.Challenges_DIO_LeetCode_Among_Others;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * O MacPRONALTS está com uma super promoção, exclusivo para os competidores da primeira Seletiva do MaratonaTEC. Só que teve um problema, todos os maratonistas foram tentar comprar ao mesmo tempo, com isso gerou uma fila muito grande. O pior é que a moça do caixa estava sem calculadora ou um programa para ajudá-la a calcular com maior agilidade, eis que surge você para fazer um programa para ajudar a coitada e aumentar a renda do MacPRONALTS. Segue o cardápio do dia contendo o número do produto e seu respectivo valor.
 *
 * 1001 | R$ 1.50
 *
 * 1002 | R$ 2.50
 *
 * 1003 | R$ 3.50
 *
 * 1004 | R$ 4.50
 *
 * 1005 | R$ 5.50
 *
 * Entrada
 * A primeira entrada informada é a quantidade de produtos comprados (1 <= p <= 5). Para cada produto segue a quantidade (1 <= q <= 500) que o consumidor comprou.
 *
 * Obs.: não poderão ser informados números de produtos repetidos.
 *
 * Saída
 * Você deve imprimir o valor da compra com duas casas decimais.
 *
 *
 * Input Sample	Output Sample
 * 2
 *
 * 1001 2
 *
 * 1005 3
 *
 * 19.50
 *
 * 1
 *
 * 1003 500
 *
 * 1750.00
 *
 * 5
 *
 * 1001 500
 *
 * 1005 300
 *
 * 1003 23
 *
 * 1002 52
 *
 * 1004 44
 *
 * 2808.50
 *
 *
 * I Seletiva MaratonaTEC - Maratona de Programação PRONATEC - UNIME
 */

public class MacPronalts {


    static boolean DEBUG = true;
    private static boolean LER_SCANNER = false;
    private static final String ARQUIVO_ENTRADAS = "/home/usuario/IdeaProjects/LeetCodeChallengesJava/src/main/java/br/com/abruzzo/arquivosDebug/entradas.txt.teste2";
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
