package br.com.abruzzo.turing;
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class ExchangingCards {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    private static final boolean DEBUG = true;
    private PrintWriter w;
    private StreamTokenizer token;
    private HashSet<Integer> n1, n2;

    private int a, b;

    public void inicializacao() {

        try {
            if (DEBUG) {
                in = new BufferedReader(new InputStreamReader(new FileInputStream("/home/emmanuel/NetBeansProjects/Turing/src/main/java/br/com/abruzzo/turing/entradas.txt")));
            } else {
                in = new BufferedReader(new InputStreamReader(System.in));
            }
            token = new StreamTokenizer(in);
            w = out;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public boolean entrada() {
        a = Integer.parseInt(proximo());
        b = Integer.parseInt(proximo());
        if (a == 0 && b == 0) return false;
        n1 = new HashSet<Integer>();
        n2 = new HashSet<Integer>();
        for (int i = 0; i < a; i++) {
            n1.add(Integer.parseInt(proximo()));
        }
        for (int i = 0; i < b; i++) {
            n2.add(Integer.parseInt(proximo()));
        }
        return true;
    }


    private String proximo() {

        try {
            token.nextToken();
            if (token.ttype == StreamTokenizer.TT_EOF) return null;
            else if (token.ttype == StreamTokenizer.TT_NUMBER) {
                return String.valueOf((int) token.nval);
            } else return token.sval;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    public void resolver() {

        int s = n1.size();
        Iterator<Integer> it = n2.iterator();
        int cont = 0;
        while (it.hasNext()) {
            int num = it.next();
            if (!n1.contains(num)) cont++;
            else s--;
        }
        s = Math.min(s, cont);
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