package br.com.abruzzo.turing;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * O jogo de xadrez possui várias peças com movimentos curiosos: uma delas é a dama, que pode se mover qualquer quantidade de casas na mesma linha, na mesma coluna, ou em uma das duas diagonais, conforme exemplifica a figura abaixo:
 *
 *
 *
 *
 *
 * O grande mestre de xadrez Kary Gasparov inventou um novo tipo de problema de xadrez: dada a posição de uma dama em um tabuleiro de xadrez vazio (ou seja, um tabuleiro 8 × 8, com 64 casas), de quantos movimentos, no mínimo, ela precisa para chegar em outra casa do tabuleiro?
 *
 * Kary achou a solução para alguns desses problemas, mas teve dificuldade com outros, e por isso pediu que você escrevesse um programa que resolve esse tipo de problema.
 *
 * Entrada
 * A entrada contém vários casos de teste. A primeira e única linha de cada caso de teste contém quatro inteiros X1, Y1, X2 e Y2 (1 ≤ X1, Y1, X2, Y2 ≤ 8). A dama começa na casa de coordenadas (X1, Y1), e a casa de destino é a casa de coordenadas(X2, Y2). No tabuleiro, as colunas são numeradas da esquerda para a direita de 1 a 8 e as linhas de cima para baixo também de 1 a 8. As coordenadas de uma casa na linha X e coluna Y são (X, Y ).
 *
 * O final da entrada é indicado por uma linha contendo quatro zeros.
 *
 * Saída
 * Para cada caso de teste da entrada seu programa deve imprimir uma única linha na saída, contendo um número inteiro, indicando o menor número de movimentos necessários para a dama chegar em sua casa de destino.
 */
public class Dama {


    static boolean DEBUG = true;
    private static boolean LER_SCANNER = false;
    private static String nomeDesafio = "Dama";
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

        int x1,y1,x2,y2;
        //se estiver na mesma linha ou mesma coluna ou mesma diagonal, gasta 1 movimento
        //se estiver em qualquer outra posição, a rainha gastará 2 movimentos!

        while(true){
            x1 = lerProximaEntrada();
            y1 = lerProximaEntrada();
            x2 = lerProximaEntrada();
            y2 = lerProximaEntrada();

            boolean condicao1 = (x1 >=1 && x1<=8) || x1 == 0;
            boolean condicao2 = (x2 >=1 && x2<=8) || x2 == 0;
            boolean condicao3 = (y1 >=1 && y1<=8) || y1 == 0;
            boolean condicao4 = (y2 >=1 && y2<=8) || y2 == 0;


            if(! condicao1 || ! condicao2 || ! condicao3 || ! condicao4){
                try {
                    //https://stackoverflow.com/questions/12568340/add-custom-message-to-thrown-exception-while-maintaining-stack-trace-in-java
                    throw new Exception();
                }catch(Exception e){
                    System.out.println("Valor inválido");
                }
            }else{

                if(x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) break; //condição de parada

                boolean mesmaLinha = x1 == x2;
                boolean mesmaColuna = y1 == y2;

                // https://www.geeksforgeeks.org/check-if-two-elements-of-a-matrix-are-on-the-same-diagonal-or-not/
                boolean mesmaDiagonal = (Math.abs(x1-y1) == Math.abs(x2-y2) || ((x1 + y1) == (x2+y2)));


                boolean mesmaPosicao = mesmaLinha && mesmaColuna;

                if(mesmaPosicao)
                    System.out.println("0");
                else if((mesmaLinha || mesmaColuna || mesmaDiagonal) && ! mesmaPosicao)
                    System.out.println("1");
                else
                    System.out.println("2");
            }
            }
    }
}