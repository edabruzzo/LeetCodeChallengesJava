package br.com.abruzzo.turing;

/**
 * Ordenando Números Pares e Ímpares
 * <p>
 * Desafio:
 * - Crie um programa onde você receberá valores inteiros
 * não negativos como entrada.
 * <p>
 * - Ordene estes valores de acordo com o seguinte critério:
 * <p>
 * - Primeiro os Pares
 * - Depois os Ímpares
 * <p>
 * - Você deve exibir os pares em ordem crescente e na sequência
 * os ímpares em ordem decrescente.
 * <p>
 * Entrada:
 * - A primeira linha de entrada contém um único inteiro positivo
 * N (1 < N < 10000) Este é o número de linhas de entrada que vem
 * logo a seguir. As próximas N linhas terão, cada uma delas, um
 * valor inteiro não negativo.
 * <p>
 * Saída:
 * - Exiba todos os valores lidos na entrada segundo a ordem apresentada
 * acima. Cada número deve ser impresso em uma linha, conforme exemplo de
 * saída abaixo.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


public class OrdenacaoParesImpares {

    private static BufferedReader bufferedReader = null;
    private static boolean DEBUG = true;

    public static void main(String[] args) throws Exception {

        int proximoValor = lerProximoStream();

        ArrayList<Integer> entrada = new ArrayList<Integer>();
        ArrayList<Integer> pares = new ArrayList<Integer>();
        ArrayList<Integer> impares = new ArrayList<Integer>();

        for (int i = 0; i < proximoValor; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            entrada.add(Integer.parseInt(stringTokenizer.nextToken()));

            if (entrada.get(i) % 2 == 0)
                pares.add(entrada.get(i));
            else
                impares.add(entrada.get(i));
        }

        Collections.sort(pares);
        Collections.sort(impares);
        Collections.reverse(impares);

        for (int par : pares) {
            System.out.println(par);
        }
        for (int impar : impares) {
            System.out.println(impar);
        }
    }


    private static int lerProximoStream() {

        if(!DEBUG)
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        else {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/home/emmanuel/NetBeansProjects/Turing/src/main/java/br/com/abruzzo/turing/entradas.txt.teste1")));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        StringTokenizer st = null;
        try {
            st = new StringTokenizer(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Integer.parseInt(st.nextToken());
    }

}
