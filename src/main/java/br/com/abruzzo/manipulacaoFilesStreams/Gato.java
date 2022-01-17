package br.com.abruzzo.manipulacaoFilesStreams;

import java.io.Serializable;

/**
 * @author Emmanuel Abruzzo
 * @date 17/01/2022
 */
public class Gato implements Serializable {


    String nome;
    int idade;
    String cor;
    boolean ronrona;
    boolean castrado;

    public Gato(String nome, int idade, String cor, boolean ronrona, boolean castrado) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
        this.ronrona = ronrona;
        this.castrado = castrado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isRonrona() {
        return ronrona;
    }

    public void setRonrona(boolean ronrona) {
        this.ronrona = ronrona;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }


}