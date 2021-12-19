package br.com.abruzzo.estruturadadosDIO;

public class TestBinaryTree {


    public static void main(String[] args) {

        BinaryTree<Integer> binaryTree = new BinaryTree<>();

        for(int i=0; i<30; i++ ){
            binaryTree.insert(i);
        }

        binaryTree.toString();
        binaryTree.traverseTree();
        binaryTree.remove(10);
        binaryTree.traverseTree();






    }




}
