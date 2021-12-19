package br.com.abruzzo.Challenges_DIO_LeetCode_Among_Others;

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class AlturaMinAlturaMaximaMontanhaRussa {

    static BufferedReader in = null;

    private static final boolean DEBUG = true;
    private static final boolean lerScanner = false;
    private PrintWriter w;
    private StreamTokenizer token;
    private HashSet<Integer> entrada1;
    private String PATH_ENTRADA = "/home/emmanuel/NetBeansProjects/Turing/src/main/java/br/com/abruzzo/arquivosDebug/entradas.txt";

    private int numeroVisitantes, alturaMinima, alturaMaxima;

    public void inicializacao() {

        try {
            if (DEBUG) {
                in = new BufferedReader(new InputStreamReader(new FileInputStream(PATH_ENTRADA)));
            } else {
                in = new BufferedReader(new InputStreamReader(System.in));
            }
            token = new StreamTokenizer(in);
            w = new PrintWriter(System.out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public boolean entrada() {
        try {
            numeroVisitantes = proximo();
            alturaMinima = proximo();
            alturaMaxima = proximo();

        }catch(Exception erro){
            System.out.println(erro.getMessage());
        }
        if (numeroVisitantes == 0)
            return false;
        entrada1 = new HashSet<Integer>();

        for (int i = 0; i < numeroVisitantes; i++) {
            try {
                entrada1.add(proximo());
            }catch(Exception erro){
                System.out.println(erro.getMessage());
            }
        }
        return true;
    }


    private int proximo() {

            int valor = 0;
            if(lerScanner){
                Scanner scanner = new Scanner(System.in);
                valor =  scanner.nextInt();
            }else{

                try {
                    token.nextToken();
                    if (token.ttype == StreamTokenizer.TT_EOF)
                        valor =  0;
                    else if (token.ttype == StreamTokenizer.TT_NUMBER) {
                        valor =  (int) token.nval;
                    } else
                        return Integer.parseInt(token.sval);
                } catch (Exception e) {
                    e.printStackTrace();

                }

            }

            return valor;

    }


    public void resolver() {

        /*
        
        
         int numeroVisitantes = lerProximoScanner();
        boolean condicao1 = numeroVisitantes >=1 && numeroVisitantes<=100;
        int alturaMin = lerProximoScanner();
        int alturaMax = lerProximoScanner();
        boolean condicao2 = alturaMin >=50 && alturaMin<=alturaMax;
        boolean condicao3 = alturaMax <=250;


        if (condicao1 && condicao2 && condicao3){


        }
        
        
        
         */

        Iterator<Integer> iterator = entrada1.iterator();
        int contador = 0;
        while (iterator.hasNext()) {
            int numero = iterator.next();
            if (numero >= alturaMinima && numero<=alturaMaxima)
                contador++;
        }
        w.println(contador);
        w.flush();
    }




    public static void teste3() throws IOException {
        String l;
        int cards1, cards2;
        //Continue com o seu código aqui
        AlturaMinAlturaMaximaMontanhaRussa solucao = new AlturaMinAlturaMaximaMontanhaRussa();
        solucao.inicializacao();
        solucao.entrada();
        solucao.resolver();

    }

}
