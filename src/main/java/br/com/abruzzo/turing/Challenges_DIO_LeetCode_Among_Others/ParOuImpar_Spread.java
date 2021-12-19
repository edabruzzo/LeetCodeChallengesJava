package br.com.abruzzo.turing.Challenges_DIO_LeetCode_Among_Others;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida. Para cada valor lido, mostre uma mensagem em inglês dizendo se este valor lido é par (EVEN), ímpar (ODD), positivo (POSITIVE) ou negativo (NEGATIVE). No caso do valor ser igual a zero (0), embora a descrição correta seja (EVEN NULL), pois por definição zero é par, seu programa deverá imprimir apenas NULL.
 *
 * Entrada
 * A primeira linha da entrada contém um valor inteiro N(N < 10000) que indica o número de casos de teste. Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).
 *
 * Saída
 * Para cada caso, imprima uma mensagem correspondente, de acordo com o exemplo abaixo. Todas as letras deverão ser maiúsculas e sempre deverá haver um espaço entre duas palavras impressas na mesma linha.
 *
 *
 * Exemplo de Entrada	Exemplo de Saída
 * 4
 * -5
 * 0
 * 3
 * -4
 *
 * ODD NEGATIVE
 * NULL
 * ODD POSITIVE
 * EVEN NEGATIVE
 */
public class ParOuImpar_Spread {


    static boolean DEBUG = true;
    private static boolean LER_SCANNER = false;
    private static String nomeDesafio = "parOuImpar";
    private static final String ARQUIVO_ENTRADAS = "/home/usuario/IdeaProjects/LeetCodeChallengesJava/src/main/java/br/com/abruzzo/turing/arquivosDebug/entradas.txt."+nomeDesafio;
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

        int N = lerProximaEntrada();
        boolean condicao1 = N < 1000;
        String mensagemFinal = null;
        String tipoNumero = null;
        String positivoNegativo = null;
        //Escreva a sua lógica aqui
        if(condicao1){

            for (int i = 0; i < N; i++) {
                //complete sua solução aqui.
                int X = lerProximaEntrada();
                if (X > -107 && X < 107){
                    if(X == 0) mensagemFinal = "NULL\n";
                    else{
                        if(X % 2 == 0) tipoNumero = "EVEN";
                        else tipoNumero = "ODD";
                        if(X>0) positivoNegativo = "POSITIVE";
                        if(X<0) positivoNegativo = "NEGATIVE";
                        mensagemFinal = String.format("%s %s\n", tipoNumero, positivoNegativo);
                    }
                    System.out.println(mensagemFinal);
                }
            }
        }
    }
}