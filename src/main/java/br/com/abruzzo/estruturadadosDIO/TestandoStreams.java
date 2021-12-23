package br.com.abruzzo.estruturadadosDIO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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



        List<String> listaString = Arrays.asList("1","2","10","25","40","3");

        listaString.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        listaString.stream().forEach( s -> System.out.println(s));

        System.out.println("------------------------------------------");

        listaString.stream().forEach(System.out::println);

        System.out.println("------------------------------------------");


        listaString.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        }).collect(Collectors.toList())
                .forEach(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) {
                        System.out.println(elevaAPotencia(integer, 10));
                    }

                    private int elevaAPotencia(int i, int potencia) {
                        return (int) Math.pow(i,potencia);

                    }
                });


        System.out.println("------------------------------------------");


        listaString.stream().map(Integer::parseInt)
                .collect(Collectors.toList())
                .forEach(integer -> {
                    System.out.println((Math.pow(integer, 10)));
                });

        System.out.println("------------------------------------------");


        listaString.stream().map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s);
                    }
                })
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        return integer > 10;
                    }
                })
                .collect(Collectors.toList())
                .forEach(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) {
                        System.out.println(elevaAPotencia(integer, 10));
                    }

                    private int elevaAPotencia(int i, int potencia) {
                        return (int) Math.pow(i,potencia);

                    }
                });


        System.out.println("------------------------------------------");




        System.out.println("------------------------------------------");


        listaString.stream().map(Integer::parseInt)
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        return integer>10;
                    }
                })
                .collect(Collectors.toList())
                .forEach(System.out::println);


        System.out.println("------------------------------------------");


        System.out.println("------------------------------------------");


        listaString.stream().map(Integer::parseInt)
                .filter(i-> i > 10)
                .collect(Collectors.toList())
                .forEach(System.out::println);


        System.out.println("------------------------------------------");







    }
}
