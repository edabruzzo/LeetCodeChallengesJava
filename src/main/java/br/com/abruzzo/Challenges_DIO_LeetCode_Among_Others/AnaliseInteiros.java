package br.com.abruzzo.Challenges_DIO_LeetCode_Among_Others;

import java.util.Scanner;

/**
 *
 *
 * Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados são pares, quantos valores informados são ímpares, quantos valores informados são positivos e quantos valores informados são negativos. Considere que o número zero é positivo, mas não pode ser considerado como positivo ou negativo.
 *
 * Entrada
 * Você receberá 5 valores inteiros.
 *
 * Saída
 * Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por linha e não esquecendo o final de linha após cada uma.
 *
 *
 *
 * @author Emmanuel Abruzzo
 * @date 20/01/2022
 */
public class AnaliseInteiros {

    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);

        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;

        while(leitor.hasNext()){

            int numero = leitor.nextInt();

            if(numero % 2 == 0)
                pares ++;
            else
                impares ++;

            if (numero > 0)
                positivos ++;
            if (numero < 0)
                negativos ++;

        }

        System.out.println( pares + " par(es)");
        System.out.println( impares + " impar(es)");
        System.out.println( positivos + " positivo(s)");
        System.out.println(negativos  + " negativo(s)");
    }



}