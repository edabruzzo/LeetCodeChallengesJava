package br.com.abruzzo.estruturadadosDIO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMap {

    public static void main(String[] args) {


        Map<String,Integer> mapaVeiculos = new HashMap<>();
        Veiculo veiculo1 = new Veiculo("gol","fusca","branco",1970);
        Veiculo veiculo2 = new Veiculo("gol","fusca","branco",1970);
        Veiculo veiculo3 = new Veiculo("gol","fusca","branco",1970);
        Veiculo veiculo4 = new Veiculo("gol","fusca","branco",1970);

        List<Veiculo> listaVeiculos = new ArrayList<>();
        listaVeiculos.add(veiculo1);
        listaVeiculos.add(veiculo2);
        listaVeiculos.add(veiculo3);
        listaVeiculos.add(veiculo4);

        for(Veiculo veiculo : listaVeiculos) {
            mapaVeiculos.put(veiculo.getMarca(), veiculo.getAno());
        }

        System.out.println(listaVeiculos.contains(veiculo1));
        System.out.println(listaVeiculos.containsAll(listaVeiculos));
        System.out.println(listaVeiculos.get(1));

        System.out.println(mapaVeiculos.keySet());

        System.out.println(mapaVeiculos.values());

        System.out.println(mapaVeiculos.toString());

    }
    
}
