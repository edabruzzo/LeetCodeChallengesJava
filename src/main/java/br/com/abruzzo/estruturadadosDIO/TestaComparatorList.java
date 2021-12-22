package br.com.abruzzo.estruturadadosDIO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestaComparatorList {

    public static void main(String[] args) {

        List<Veiculo> listaVeiculos = new ArrayList<>(){{

            add(new Veiculo("Volks","Fusca","amarelo",1970));
            add(new Veiculo("Fiat","Uno","azul",1996));
            add(new Veiculo("Honda","HB20","preto",2000));
            add(new Veiculo("Renault","Sandero","branco",2010));

        }};


        Collections.sort(listaVeiculos, new ComparadorModeloVeiculo());
        System.out.println(listaVeiculos);

        Collections.sort(listaVeiculos, new ComparadorCorVeiculo());
        System.out.println(listaVeiculos);

        Collections.sort(listaVeiculos, new ComparadorAnoVeiculo());
        System.out.println(listaVeiculos);


    }

    private static class ComparadorModeloVeiculo implements Comparator<Veiculo> {

        @Override
        public int compare(Veiculo veiculo, Veiculo t1) {
            return veiculo.getModelo().compareToIgnoreCase(t1.getModelo());
        }

    }


    private static class ComparadorCorVeiculo implements Comparator<Veiculo> {

        @Override
        public int compare(Veiculo veiculo, Veiculo t1) {
            return veiculo.getCor().compareToIgnoreCase(t1.getCor());
        }

    }



    private static class ComparadorAnoVeiculo implements Comparator<Veiculo> {

        @Override
        public int compare(Veiculo veiculo, Veiculo t1) {
            return Integer.compare(veiculo.getAno(), t1.getAno());
        }

    }



    private static class ComparadorAnoMarcaModeloVeiculo implements Comparator<Veiculo> {

        @Override
        public int compare(Veiculo veiculo, Veiculo t1) {

            int marcaIgual = veiculo.getMarca().compareToIgnoreCase(t1.getMarca());

            if(marcaIgual != 0) return marcaIgual;

            int modeloIgual = veiculo.getModelo().compareToIgnoreCase(t1.getModelo());

            if (modeloIgual !=0) return modeloIgual;

            return Integer.compare(veiculo.getAno(), t1.getAno());

        }

    }



}



