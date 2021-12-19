package br.com.abruzzo.turing.Challenges_DIO_LeetCode_Among_Others;

import java.io.IOException;


public class AnUnexpectedJourney {

    public static void main(String[] args) throws IOException {
        System.out.print("Hello World!");
    }

    public static String hello(){
        return "Hello World!";
    }

        public static void a(String[] args) throws IOException {

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int numberOfDwarfs = scanner.nextInt();
        numberOfDwarfs += 2;
        double distancia = scanner.nextDouble();
        boolean condicao_1 = numberOfDwarfs >=1  && numberOfDwarfs <=100;
        boolean condicao_2 = distancia >=1  && distancia <=1000;
        //BigDecimal distancia_ = new BigDecimal(String.valueOf(distancia));
        //BigDecimal numberOfDwarfs_ = new BigDecimal(String.valueOf(numberOfDwarfs));

        boolean condicoes = condicao_1 && condicao_2;
        String daysOfJourney  = condicoes ? calculaDistancia(numberOfDwarfs,distancia):null;
        System.out.println(daysOfJourney);

    }

    private static String calculaDistancia(int peopleGoing, double distance) {
        //String valorFormatado = df.format(distance);
        //https://mkyong.com/java/java-display-double-in-2-decimal-points/
        // https://www.alura.com.br/artigos/arredondando-numeros-no-java?gclid=CjwKCAiA1uKMBhAGEiwAxzvX9-4lvT45oPMk_sll0rvmoQKN8erEOIhf2oLJlIxLHcICBH9fYkmPHBoCcTUQAvD_BwE
        //DecimalFormat df = new DecimalFormat("0.00");
        //df.setRoundingMode(RoundingMode.HALF_UP);
        //https://www.geeksforgeeks.org/bigdecimal-class-java/
        String diasViagem = String.format("%.2f",distance/peopleGoing);
        return diasViagem;
    }




}
