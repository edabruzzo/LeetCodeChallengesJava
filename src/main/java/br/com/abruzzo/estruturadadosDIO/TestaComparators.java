package br.com.abruzzo.estruturadadosDIO;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Emmanuel Abruzzo
 * @date 11/01/2022
 */
public class TestaComparators {


    public static void main(String[] args) {

        List<EstudanteComparable> listaEstudantes = new ArrayList<>();

        for(Integer i=0; i < 10; i++)
            listaEstudantes.add(new EstudanteComparable(String.format("Estudante %d",i), i));

        listaEstudantes.stream().forEach(System.out::println);

    }







}
