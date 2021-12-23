package br.com.abruzzo.estruturadadosDIO;

import java.util.Objects;

public class Veiculo implements Comparable<Veiculo>{

    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private Double consumo;


    public Veiculo(String marca, Double consumo) {
        this.marca = marca;
        this.consumo = consumo;
    }

    public Veiculo(String marca, String modelo, String cor, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Double getConsumo() {
        return consumo;
    }

    public void setConsumo(Double consumo) {
        this.consumo = consumo;
    }


    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                ", consumo=" + consumo +
                '}';
    }

    @Override
    public int compareTo(Veiculo veiculo) {
        return this.marca.compareToIgnoreCase(veiculo.getMarca());
    }
}
