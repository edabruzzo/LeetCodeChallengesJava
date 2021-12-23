package br.com.abruzzo.estruturadadosDIO;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TestandoStreams {


    public static void main(String[] args) {


        Veiculo veiculo5 = new Veiculo("gol", 10.8d);
        Veiculo veiculo6 = new Veiculo("fiat",15.1d);
        Veiculo veiculo7 = new Veiculo("volks",20.7d);
        Veiculo veiculo8 = new Veiculo("renault",18.2d);

        List<Veiculo> listaVeiculosConsumo = new ArrayList<>();
        listaVeiculosConsumo.add(veiculo5);
        listaVeiculosConsumo.add(veiculo6);
        listaVeiculosConsumo.add(veiculo7);
        listaVeiculosConsumo.add(veiculo8);

        System.out.println("--------------------------------------------------------------------");

        listaVeiculosConsumo.stream().forEach(new Consumer<Veiculo>() {
            @Override
            public void accept(Veiculo veiculo) {
                System.out.println(veiculo.toString());
            }
        });

        System.out.println("--------------------------------------------------------------------");

        listaVeiculosConsumo.stream().forEach((veiculo) -> System.out.println(veiculo.toString()));


        System.out.println("--------------------------------------------------------------------");
        listaVeiculosConsumo.stream().filter(veiculo -> veiculo.getConsumo()>15d).forEach(
                veiculo -> System.out.println(veiculo.toString())
        );









    }



}
