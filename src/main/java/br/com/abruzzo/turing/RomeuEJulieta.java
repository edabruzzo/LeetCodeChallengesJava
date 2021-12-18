package br.com.abruzzo.turing;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Desafio
 * Romeu e Julieta acabaram de casar e estão planejamendo a Lua de Mel na Europa. Como vão visitar vários países, o fuso horário de cada um é diferente, por isso eles precisam ficar atento às escalas.
 *
 * Para que a Lua de Mel deles seja um sucesso, ele pediram que você desenvolva um aplicativo que, a partir da hora de saída, tempo de viagem e fuso horário do destino comparado ao país de origem, informe a hora de chegada de cada vôo no destino.
 *
 * Por exemplo, se eles partirem às 10 horas da manhã para uma viagem de 4 horas rumo a um destino que fica à leste, em um fuso horário com uma hora a mais com relação ao fuso horário do ponto de partida, a hora de chegada terá que ser: 10 horas + 4 horas de viagem + 1 hora de deslocamento pelo fuso, ou seja, chegarão às 15 horas. Note que se a hora calculada for igual a 24, seu programa deverá imprimir 0 (zero).
 *
 * Entrada
 * A entrada contém 3 inteiros: S (0 ≤ S ≤ 23), T (1 ≤ T ≤ 12) e F (-5 ≤ F ≤ 5), separados por um espaço, indicando respectivamente a hora da saída, o tempo de viagem e o fuso horário do destino com relação à origem.
 *
 * Saída
 * Imprima um inteiro que indica a hora local prevista no destino, conforme os exemplos abaixo.
 */
public class RomeuEJulieta {


    static boolean DEBUG = true;
    private static boolean LER_SCANNER = false;
    private static final String ARQUIVO_ENTRADAS = "/home/usuario/IdeaProjects/LeetCodeChallengesJava/src/main/java/br/com/abruzzo/turing/arquivosDebug/entradas.txt.romeuEJulieta";
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


        int horasaida = lerProximaEntrada();
        int tempoviagem = lerProximaEntrada();
        int fuso = lerProximaEntrada();


        boolean condicao1 = horasaida >=0 && horasaida <=23;
        boolean condicao2 = tempoviagem >=1 && tempoviagem <=12;
        boolean condicao3 = fuso >=-5 && tempoviagem <=5;

        //Escreva a sua lógica aqui
        int ajuste = 0;



        System.out.println(ajuste);


    }
}