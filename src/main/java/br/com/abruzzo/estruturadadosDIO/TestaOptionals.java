package br.com.abruzzo.estruturadadosDIO;

import java.util.Optional;

/**
 * @author Emmanuel Abruzzo
 * @date 12/01/2022
 */
public class TestaOptionals {


    public static void main(String[] args) {

        Optional<EstudanteComparable> optionalEstudante = Optional.of(new EstudanteComparable());
        imprimirOptional(optionalEstudante);

        EstudanteComparable estudante = null;

        optionalEstudante = Optional.ofNullable(estudante);
        imprimirOptional(optionalEstudante);


        optionalEstudante = Optional.empty();
        imprimirOptional(optionalEstudante);


    }

    private static void imprimirOptional(Optional<EstudanteComparable> optionalEstudante) {

        optionalEstudante.ifPresentOrElse(System.out::println,()-> System.out.println("Valor nulo"));
    }


}
