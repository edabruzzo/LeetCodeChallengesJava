package br.com.abruzzo.Challenges_DIO_LeetCode_Among_Others;

import java.util.Scanner;

/**
 *
 * A fórmula de Binet é uma forma de calcular números de Fibonacci.
 *
 *
 *
 * Sua tarefa é, dado um natural n, calcular o valor de Fibonacci(n) usando a fórmula acima.
 *
 * Entrada
 * A entrada é um número natural n (0 < n ≤ 50).
 *
 * Saída
 * A saída é o valor de Fibonacci(n) com 1 casa decimal utilizando a fórmula de Binet dada.
 *
 *
 *
 *
 *
 * @author Emmanuel Abruzzo
 * @date 20/01/2022
 */
public class Fibonacci {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //escreva o seu código aqui
        double fibonacci = fibonacci(sc.nextInt());

        System.out.printf("%.1f",fibonacci);

    }

    private static double fibonacci(int numero) {

        double fibonacci = 0d;

        if (numero > 0 && numero <=50){
            double fator1 = Math.pow((1+Math.sqrt(5))/2,numero);
            double fator2 = Math.pow((1-Math.sqrt(5))/2,numero);
            fibonacci = (fator1 - fator2)/Math.sqrt(5);

        }
        return fibonacci;

    }


}
