package br.com.abruzzo.turing;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;


public class ACELERACAO_GFT {

    private static BufferedReader bufferedReader = null;
    private static boolean DEBUG = true;

    public static int valor_absoluto(int valor){
       return Math.abs(valor);
    }



    public static void teste2(String[] args) {

        try {

            int numeroVisitantes = lerProximoScanner();
            boolean condicao1 = numeroVisitantes >=1 && numeroVisitantes<=100;
            int alturaMin = lerProximoScanner();
            int alturaMax = lerProximoScanner();
            boolean condicao2 = alturaMin >=50 && alturaMin<=alturaMax;
            boolean condicao3 = alturaMax <=250;


            if (condicao1 && condicao2 && condicao3){


            }



        }catch (Exception erro) {

        }


    }

    private static int lerProximoScanner() {

        Scanner sc = new Scanner(System.in);
        return sc.nextInt();

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





    public static void teste1(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        //escreva o seu código aqui
        //escreva o seu código aqui
        int posicaoMestreKung = leitor.nextInt();
        int posicaoMestreLu = leitor.nextInt();

        boolean condicoesKUNG = posicaoMestreKung >= 1 && posicaoMestreKung <= 16;
        boolean condicoesLU = posicaoMestreLu >= 1 && posicaoMestreLu <= 16;
        boolean condicoes_3 = posicaoMestreKung != posicaoMestreLu;

        if (condicoes_3 && condicoesKUNG && condicoesLU) {

            if (valor_absoluto(posicaoMestreKung - posicaoMestreLu) == 1)
                System.out.println("oitavas");

            if (valor_absoluto(posicaoMestreKung - posicaoMestreLu) > 1 &&
                    valor_absoluto(posicaoMestreKung - posicaoMestreLu) <= 3)
                System.out.println("quartas");

            if (valor_absoluto(posicaoMestreKung - posicaoMestreLu) > 3 &&
                    valor_absoluto(posicaoMestreKung - posicaoMestreLu) <= 7)
                System.out.println("semifinal");

            if (valor_absoluto(posicaoMestreKung - posicaoMestreLu) >= 8)
                System.out.println("final");

        }


    }

}
