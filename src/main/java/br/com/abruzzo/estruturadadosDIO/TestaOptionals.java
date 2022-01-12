package br.com.abruzzo.estruturadadosDIO;

import java.util.Optional;

/**
 * @author Emmanuel Abruzzo
 * @date 12/01/2022
 */
public class TestaOptionals {


    public static void main(String[] args) {

        Optional<EstudanteComparable> optionalEstudante = Optional.of(new EstudanteComparable());
        imprimirOptional(Optional.of(optionalEstudante));

        EstudanteComparable estudante = null;

        optionalEstudante = Optional.ofNullable(estudante);
        imprimirOptional(Optional.of(optionalEstudante));


        optionalEstudante = Optional.empty();
        imprimirOptional(Optional.of(optionalEstudante));


        estudante = new EstudanteComparable("João"); //nota Nula
        EstudanteComparable estudante2 = new EstudanteComparable(1); // nome Nulo

        Optional<Float> optionalNota = Optional.of(estudante.getNota());
        imprimirOptional(Optional.of(optionalNota));

        Optional<String> optionalNomeEstudante = Optional.ofNullable(estudante2.getNome());
        imprimirOptional(Optional.of(optionalNomeEstudante));



    }

    private static void imprimirOptional(Optional<Object> optionalEstudante) {
        optionalEstudante.ifPresentOrElse(System.out::println,()-> System.out.println("Valor nulo"));
    }


}
