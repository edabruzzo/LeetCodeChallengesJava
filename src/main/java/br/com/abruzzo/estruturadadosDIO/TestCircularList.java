package br.com.abruzzo.estruturadadosDIO;

public class TestCircularList {


    public static void main(String[] args) {

        CircularList<Integer> listaCircular = new CircularList<Integer>();
        // Populate the circular list
        for(int i=0; i<21; i++){
            listaCircular.add(i);
        }
        System.out.println(listaCircular.toString());
        listaCircular.remove(7);
        listaCircular.add(999999999);
        System.out.println(listaCircular.toString());
    }
}
