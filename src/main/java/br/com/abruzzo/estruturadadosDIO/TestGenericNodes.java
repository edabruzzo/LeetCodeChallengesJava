package br.com.abruzzo.estruturadadosDIO;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @link https://docs.oracle.com/javase/tutorial/extra/generics/wildcards.html
 * @link https://web.dio.me/articles/generics-em-java-1?back=%2Farticles&page=1&order=oldest
 *
 */
public class TestGenericNodes {


    public static void main(String[] args) {

            Node node1 = new Node("Nó 1");
            Node node2 = new Node("Nó 2");
            Node node3 = new Node("Nó 3");
            Node node4 = new Node("Nó 4");

            node1.setNextNode(node2);
            node2.setNextNode(node3);
            node3.setNextNode(node4);

            List<Node> listaNodes = new ArrayList<Node>();

            listaNodes.add(node1);
            listaNodes.add(node2);
            listaNodes.add(node3);
            listaNodes.add(node4);

            for(Node node : listaNodes){
                System.out.println(node.getContent());
                if (node.getNextNode() != null){
                    System.out.println(node.getNextNode().getContent());
                }

            }

        GenericNode<String> genericNode1 = new GenericNode<>("Nó 1");
        GenericNode<String> genericNode2 = new GenericNode<>("Nó 2");
        GenericNode<String> genericNode3 = new GenericNode<>("Nó 3");
        GenericNode<String> genericNode4 = new GenericNode<>("Nó 4");

        genericNode1.setNextNode(genericNode2);
        genericNode2.setNextNode(genericNode3);
        genericNode3.setNextNode(genericNode4);

        List<GenericNode<String>> listaGenericNodes = new ArrayList<GenericNode<String>>();

        listaGenericNodes.add(genericNode1);
        listaGenericNodes.add(genericNode2);
        listaGenericNodes.add(genericNode3);
        listaGenericNodes.add(genericNode4);

        for(GenericNode<String> node : listaGenericNodes){
            System.out.println(node.getContent());
            if (node.getNextNode() != null){
                System.out.println(node.getNextNode().getContent());
            }
        }


    }



}
