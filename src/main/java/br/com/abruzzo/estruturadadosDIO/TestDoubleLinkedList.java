package br.com.abruzzo.estruturadadosDIO;

public class TestDoubleLinkedList {


    public static void main(String[] args) {

        DoubleLinkedList<String>  doubleLinkedList = new DoubleLinkedList<>();
        for (int i=0; i < 11; i++){
            String content = String.format("Nó %d",i);
            doubleLinkedList.add(content);
        }

        System.out.println(doubleLinkedList.toString());
        doubleLinkedList.remove(5);
        System.out.println(doubleLinkedList.toString());
        doubleLinkedList.add(7, "novo Nó inserido nessa posição");
        System.out.println(doubleLinkedList.toString());

    }
}
