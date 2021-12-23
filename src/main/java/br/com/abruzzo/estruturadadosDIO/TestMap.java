package br.com.abruzzo.estruturadadosDIO;

import java.util.*;

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



        Map<String, Double> mapaVeiculosConsumo = new HashMap<>();

        Veiculo veiculo5 = new Veiculo("gol", 10.8d);
        Veiculo veiculo6 = new Veiculo("fiat",15.1d);
        Veiculo veiculo7 = new Veiculo("volks",20.7d);
        Veiculo veiculo8 = new Veiculo("renault",18.2d);

        List<Veiculo> listaVeiculosConsumo = new ArrayList<>();
        listaVeiculosConsumo.add(veiculo5);
        listaVeiculosConsumo.add(veiculo6);
        listaVeiculosConsumo.add(veiculo7);
        listaVeiculosConsumo.add(veiculo8);

        for(Veiculo veiculo : listaVeiculosConsumo) {
            mapaVeiculosConsumo.put(veiculo.getMarca(), veiculo.getConsumo());
        }

        Double valorMenorConsumo = Collections.min(mapaVeiculosConsumo.values());


        Set<Map.Entry<String, Double>> entrySet = mapaVeiculosConsumo.entrySet();

        System.out.println(entrySet);

        for (Map.Entry<String, Double> entry: entrySet) {
            if(entry.getValue() == valorMenorConsumo)
                System.out.println(String.format("Marca com consumo mais eficiente -> %s", entry.toString()));
        }



        // Iterator

        Iterator<Double> iteratorMapaVeiculos = mapaVeiculosConsumo.values().iterator();
        double somaConsumo = 0;
        while(iteratorMapaVeiculos.hasNext()){
            somaConsumo += iteratorMapaVeiculos.next();
        }
        double mediaConsumo = somaConsumo / mapaVeiculosConsumo.size();
        System.out.println(String.format("Média consumo: %.2f",mediaConsumo));

        System.out.println(mapaVeiculosConsumo);

        while(iteratorMapaVeiculos.hasNext()){
            Double proximo = iteratorMapaVeiculos.next();
            if(proximo.compareTo(15.6) > 0)
                iteratorMapaVeiculos.remove();
        }

        System.out.println(mapaVeiculosConsumo);


        Map<String,Double> linkedHashMap = new LinkedHashMap<>(mapaVeiculosConsumo);
        Map<String,Double> treeMap = new TreeMap<>(mapaVeiculosConsumo);

        System.out.println(linkedHashMap.toString());
        System.out.println("------------------------------------");
        System.out.println(treeMap);


        ordenarMap(mapaVeiculos);
        ordenarMap(mapaVeiculosConsumo);


        Map<String, Livro> mapaLivros = new HashMap<>();





    }







    private static void ordenarMap(Map<?, ?> mapaVeiculosConsumo) {



    }



}
