package br.com.abruzzo.Challenges_DIO_LeetCode_Among_Others;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * João está comprando móveis novos para sua casa. Agora é a vez de comprar um colchão novo, de molas, para substituir o colchão velho. As portas de sua casa têm altura H e largura L e existe um colchão que está em promoção com dimensões A × B × C.
 *
 * O colchão tem a forma de um paralelepípedo reto retângulo e João só consegue arrastá-lo através de uma porta com uma de suas faces paralelas ao chão, mas consegue virar e rotacionar o colchão antes de passar pela porta.
 *
 * Entretanto, de nada adianta ele comprar o colchão se ele não passar através das portas de sua casa. Portanto ele quer saber se consegue passar o colchão pelas portas e para isso precisa de sua ajuda.
 *
 * Entrada
 * A primeira linha da entrada contém três números inteiros A, B e C (1 ≤ A, B, C ≤ 300), as três dimensões do colchão, em centímetros. A segunda linha contém dois inteiros H e L (1 ≤ H, L ≤ 250), respectivamente a altura e a largura das portas em centímetros.
 *
 * Saída
 * Se programa deve escrever uma única linha, contendo apenas a letra ‘S’ se o colchão passa pelas portas e apenas a letra ‘N’ em caso contrário.
 *
 *
 *
 * @author Emmanuel Abruzzo
 * @date 18/01/2022
 */
public class DesafioColchao {



    static boolean DEBUG = true;
    private static boolean LER_SCANNER = false;
    private static String nomeDesafio = "parOuImpar";
    private static final String ARQUIVO_ENTRADAS = "/home/usuario/IdeaProjects/LeetCodeChallengesJava/src/main/java/br/com/abruzzo/arquivosDebug/entradas.txt."+nomeDesafio;
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

        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int C = leitor.nextInt();
        int H = leitor.nextInt();
        int L = leitor.nextInt();


        boolean condicao1 = A >= 1 && A <=300;
        boolean condicao2 = B >= 1 && B <=300;
        boolean condicao3 = C >= 1 && C <=300;
        boolean condicao4 = H >= 1 && H <=250;
        boolean condicao5 = L >= 1 && L <=250;

        if(condicao1 && condicao2 && condicao3 && condicao4 && condicao5){

            String passa = "N";

            if ((A <= H && B <= L) ||  (A <= H && C <= L) ||
             (B <= H && A <= L) || (B <= H && C <= L) ||
                    (C <= H && A <= L) || (C <= H && B <= L) )
                passa = "S";

            System.out.println(passa);


        }

    }





}
