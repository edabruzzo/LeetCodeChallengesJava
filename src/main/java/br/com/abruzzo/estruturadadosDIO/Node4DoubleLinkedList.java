package br.com.abruzzo.estruturadadosDIO;

public class Node4DoubleLinkedList <T>{


    private T content;
    private Node4DoubleLinkedList<T> nextNode;
    private Node4DoubleLinkedList<T> priorNode;


    public Node4DoubleLinkedList(T content) {
        this.content = content;
        this.nextNode = null;
        this.priorNode = null;
    }


    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }


    public Node4DoubleLinkedList<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node4DoubleLinkedList<T> nextNode) {
        this.nextNode = nextNode;
    }

    public Node4DoubleLinkedList<T> getPriorNode() {
        return priorNode;
    }

    public void setPriorNode(Node4DoubleLinkedList<T> priorNode) {
        this.priorNode = priorNode;
    }

    @Override
    public String toString() {
        return "Node4DoubleLinkedList{" +
                "conteudo=" + content +
                '}';
    }
}
