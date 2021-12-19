package br.com.abruzzo.turing.Challenges_DIO_LeetCode_Among_Others;

import java.util.Scanner;

public class Xadrez {

    public static void main(String[] args) {

        Scanner sc = null;

        try{
            sc = new Scanner(System.in);

        int L = sc.nextInt();
        int C = sc.nextInt();

        boolean condicao_1 = L >=1 && L <= 1000;
        boolean condicao_2 = C >=1 && C <= 1000;

        if (condicao_1 && condicao_2){

            if (( L + C  ) % 2 == 0)
                System.out.println("1");
            else                                               //complete o código nos espaços em branco
                System.out.println("0");

        }

        }catch(Exception e){System.out.println(e.getMessage());}
        finally{sc.close();}

    }
}