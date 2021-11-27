package br.com.abruzzo.turing;
import java.io.*;
import java.util.HashSet;
import java.util.Iterator;


public class ExchangingCards {

    static BufferedReader in = null;

    private static final boolean DEBUG = true;
    private PrintWriter w;
    private StreamTokenizer token;
    private HashSet<Integer> entrada1, entrada2;

    private int a, b;

    public void inicializacao() {

        try {
            if (DEBUG) {
                in = new BufferedReader(new InputStreamReader(new FileInputStream("/home/emmanuel/NetBeansProjects/Turing/src/main/java/br/com/abruzzo/turing/entradas.txt.teste1")));
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
        a = Integer.parseInt(proximo());
        b = Integer.parseInt(proximo());
        if (a == 0 && b == 0)
            return false;
        entrada1 = new HashSet<Integer>();
        entrada2 = new HashSet<Integer>();
        for (int i = 0; i < a; i++) {
            entrada1.add(Integer.parseInt(proximo()));
        }
        for (int i = 0; i < b; i++) {
            entrada2.add(Integer.parseInt(proximo()));
        }
        return true;
    }


    private String proximo() {

        try {
            token.nextToken();
            if (token.ttype == StreamTokenizer.TT_EOF)
                return null;
            else if (token.ttype == StreamTokenizer.TT_NUMBER) {
                return String.valueOf((int) token.nval);
            } else
                return token.sval;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    public void resolver() {

        int s = entrada1.size();
        Iterator<Integer> iterator = entrada2.iterator();
        int contador = 0;
        while (iterator.hasNext()) {
            int numero = iterator.next();
            if (!entrada1.contains(numero))
                contador++;
            else
                s--;
        }
        s = Math.min(s, contador);
        w.println(s);
        w.flush();
    }




    public static void main(String[] args) throws IOException {
        String l;
        int cards1, cards2;
        //Continue com o seu código aqui
        ExchangingCards solucao = new ExchangingCards();
        solucao.inicializacao();
        while (solucao.entrada()) {
            solucao.resolver();
        }

    }

}