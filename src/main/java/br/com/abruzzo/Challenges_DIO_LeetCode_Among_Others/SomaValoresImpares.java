package br.com.abruzzo.Challenges_DIO_LeetCode_Among_Others;

import java.util.Scanner;

/**
 *
 * Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.
 *
 * Entrada
 * O arquivo de entrada contém dois valores inteiros.
 *
 * Saída
 * O programa deve imprimir um valor inteiro. Este valor é a soma dos valores ímpares que estão entre os valores fornecidos na entrada que deverá caber em um inteiro.
 *
 *
 *
 *
 * @author Emmanuel Abruzzo
 * @date 20/01/2022
 */
public class SomaValoresImpares {


    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int somaNumerosImpares = 0;
        int inicio = numero1;
        int fim = numero2;

        if(numero1 > numero2){

            inicio = numero2;
            fim = numero1;

        }
        for(int i = inicio +1; i < fim; i++){
            if(i % 2 != 0)
                somaNumerosImpares += i;
        }

        System.out.println(somaNumerosImpares);


    }



}
