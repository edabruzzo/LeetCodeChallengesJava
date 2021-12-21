package br.com.abruzzo.Challenges_DIO_LeetCode_Among_Others;

import java.io.IOException;
import java.util.Scanner;

public class TempoDobby {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int A = leitor.nextInt() + leitor.nextInt();
        //TODO: Complete o If com a condição que soluciona o problema.
        boolean condicao1 = N >=2 && N <= 100;
        boolean condicao2 = A >=1 && N <= 100;

        if(condicao1 && condicao2){
            if (N < A)
                System.out.println("Deixa para amanha!");
            else
                System.out.println("Farei hoje!");

        }
    }

}
