package br.com.abruzzo.turing.Challenges_DIO_LeetCode_Among_Others;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        try {
            AlturaMinAlturaMaximaMontanhaRussa.teste3();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void testeHamburgueres(String[] args) throws IOException {
        //Continue com o seu código aqui
        Scanner scanner = new Scanner(System.in);

        try{

            while(scanner.hasNext()){

                double totalHamburgueres = scanner.nextDouble();
                int participantes = scanner.nextInt();
                double media = totalHamburgueres / participantes;
                System.out.println(df.format((media)));

            }

        }catch (Exception erro){
            System.out.println(erro.getMessage());
        }finally {
            scanner.close();
        }

    }

}
