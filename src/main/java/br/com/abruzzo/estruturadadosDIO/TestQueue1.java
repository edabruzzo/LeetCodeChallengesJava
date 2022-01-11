package br.com.abruzzo.estruturadadosDIO;

import java.util.*;

public class TestQueue1 {

    public static void main(String[] args) {

        List<Character> consoantesMeuNome = Arrays.asList('c', 'm', 'l', 'c', 'v', 'l', 'c', 'n', 't');
        System.out.println(consoantesMeuNome);

        testaQueue();


    }

    private static void testaQueue() {

        Queue<Veiculo> fila = criarPopularFila();

        System.out.println("------------------------------------------");
        System.out.println(fila);

        System.out.println("------------------------------------------");

        // Estou limpando para ver se vai estourar alguma exception no poll()
        fila.clear();

        Veiculo veiculo5 = fila.poll();

        System.out.println(fila);
        System.out.println(veiculo5);


        fila = criarPopularFila();


        System.out.println(String.format("Tamanho da lista antes do poll(): %d",fila.size()));

        veiculo5 = fila.poll();

        System.out.println("Imprimindo fila após o poll()");
        System.out.println(String.format("Tamanho da lista: %d",fila.size()));
        System.out.println(fila);
        System.out.println(veiculo5.toString());



        System.out.println("------------------------------------------");



        System.out.println("------------------------------------------");

        fila.clear();
        Veiculo veiculo6 = null;
        try {

            veiculo6 = fila.element();

        }catch(NoSuchElementException erro){

            System.out.println(erro.getMessage());

        }

        System.out.println(fila);
        System.out.println(veiculo6);

        fila = criarPopularFila();

        System.out.println("------------------------------------------");


        System.out.println("---------------------Imprimindo fila antes do peek()---------------------");

        System.out.println(fila);
        System.out.println(String.format("Tamanho da lista antes do peek(): %d",fila.size()));

        Veiculo veiculo7 = fila.peek();

        System.out.println("Imprimindo fila após o peek()");
        System.out.println(String.format("Tamanho da lista após o peek() : %d",fila.size()));
        System.out.println(fila);
        System.out.println(veiculo7.toString());
        System.out.println("------------------------------------------");

    }



    private static Queue<Veiculo> criarPopularFila() {

        Queue<Veiculo> fila = new LinkedList<>();

        Veiculo veiculo1 = new Veiculo("gol", 10.8d);
        Veiculo veiculo2 = new Veiculo("fiat",15.1d);
        Veiculo veiculo3 = new Veiculo("volks",20.7d);
        Veiculo veiculo4 = new Veiculo("renault",18.2d);

        fila.add(veiculo1);
        fila.add(veiculo2);
        fila.add(veiculo3);
        fila.add(veiculo4);

        return fila;


    }


}
