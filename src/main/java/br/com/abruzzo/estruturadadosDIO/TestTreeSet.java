package br.com.abruzzo.estruturadadosDIO;

import java.util.TreeSet;

public class TestTreeSet {

    public static void main(String[] args) {

        TreeSet<Veiculo> treeSetVeiculos = criarPopularTreeSet();

        System.out.println(treeSetVeiculos);


        System.out.println(treeSetVeiculos.first());

        System.out.println(treeSetVeiculos.lower(new Veiculo("gol",15.2d)));
        System.out.println(treeSetVeiculos.higher(new Veiculo("gol",18d)));

        System.out.println(treeSetVeiculos);

        Veiculo veiculoPrimeiro = treeSetVeiculos.pollFirst();
        System.out.println(veiculoPrimeiro);
        System.out.println(treeSetVeiculos);

        Veiculo veiculoUltimo = treeSetVeiculos.pollLast();
        System.out.println(veiculoUltimo);
        System.out.println(treeSetVeiculos);

        treeSetVeiculos.add(veiculoUltimo);
        treeSetVeiculos.add(veiculoPrimeiro);

        System.out.println(treeSetVeiculos);

    }

    private static TreeSet<Veiculo> criarPopularTreeSet() {

        TreeSet<Veiculo> treeSetVeiculo = new TreeSet<>();
        Veiculo veiculo1 = new Veiculo("gol", 10.8d);
        Veiculo veiculo2 = new Veiculo("fiat",15.1d);
        Veiculo veiculo3 = new Veiculo("volks",20.7d);
        Veiculo veiculo4 = new Veiculo("renault",18.2d);

        treeSetVeiculo.add(veiculo1);
        treeSetVeiculo.add(veiculo2);
        treeSetVeiculo.add(veiculo3);
        treeSetVeiculo.add(veiculo4);

        return treeSetVeiculo;
    }


}
