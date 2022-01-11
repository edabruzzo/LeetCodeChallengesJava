package br.com.abruzzo.estruturadadosDIO;

import java.util.Comparator;
import java.util.Objects;

/**
 * @author Emmanuel Abruzzo
 * @date 11/01/2022
 */
public class EstudanteComparable implements Comparable<EstudanteComparable> {


    private String nome;
    private float nota;

    public EstudanteComparable() { }

    public EstudanteComparable(String nome, float nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getNota() {
        return nota;
    }

    public void setNota(Float nota) {
        this.nota = nota;
    }





    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EstudanteComparable that = (EstudanteComparable) o;
        return nome.equals(that.nome) && Objects.equals(nota, that.nota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nota);
    }

    @Override
    public int compareTo(EstudanteComparable thatStudent) {
        return (int) (Math.abs(this.getNota()) - Math.abs(thatStudent.getNota()));
    }


    @Override
    public String toString() {
        return "EstudanteComparable{" +
                "nome='" + nome + '\'' +
                ", nota=" + nota +
                '}';
    }
}
