package br.com.abruzzo.estruturadadosDIO;

public class Node4BinaryTree<T extends Comparable<T>> {

    private T content;
    private Node4BinaryTree<T> leftNode;
    private Node4BinaryTree<T> rightNode;


    public Node4BinaryTree(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public Node4BinaryTree<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node4BinaryTree<T> leftNode) {
        this.leftNode = leftNode;
    }

    public Node4BinaryTree<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node4BinaryTree<T> rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public String toString() {
        return "Node4BinaryTree{" +
                "content=" + content +
                '}';
    }
}
