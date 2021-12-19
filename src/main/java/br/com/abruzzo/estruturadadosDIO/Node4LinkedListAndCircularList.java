package br.com.abruzzo.estruturadadosDIO;

public class Node4LinkedListAndCircularList<T> {

    private T content;
    private Node4LinkedListAndCircularList nextNode;


    public Node4LinkedListAndCircularList() {
        this.nextNode = null;
    }

    public Node4LinkedListAndCircularList(T content) {
        this.content = content;
        this.nextNode = null;
    }


    public T getContent() {
        return content;
    }


    public void setContent(T content) {
        this.content = content;
    }


    public Node4LinkedListAndCircularList getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node4LinkedListAndCircularList nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node4LinkedList{" +
                "content=" + content +
                '}';
    }


    public String toStringEncadeado(){
        String retorno = this.toString();
        if(this.nextNode != null)
            retorno += String.format("Next node --> %s \n",this.nextNode.toString());
        return retorno;
    }

}
