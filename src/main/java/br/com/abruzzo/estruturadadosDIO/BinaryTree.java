package br.com.abruzzo.estruturadadosDIO;

public class BinaryTree<T extends Comparable<T>> {


    private Node4BinaryTree<T> root;


    public void insert(T content){
        Node4BinaryTree<T> node = new Node4BinaryTree<>(content);
        this.root = insert(this.root, node);
    }

    private Node4BinaryTree<T> insert(Node4BinaryTree<T> root, Node4BinaryTree<T> node) {

        if(root == null) return node;
        else {
            if(node.getContent().compareTo(root.getContent())<0)
                root.setLeftNode(insert(root.getLeftNode(),node));

            if(node.getContent().compareTo(root.getContent())>0)
                root.setRightNode(insert(root.getRightNode(),node));

            return root;
        }

    }

}
