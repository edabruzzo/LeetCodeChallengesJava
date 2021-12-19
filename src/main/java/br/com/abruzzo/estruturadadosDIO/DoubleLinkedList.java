package br.com.abruzzo.estruturadadosDIO;

public class DoubleLinkedList<T> implements IDoubleLinkedList<T> {


    private Node4DoubleLinkedList<T> firstNode;
    private Node4DoubleLinkedList<T> lastNode;
    private int tamanhoLista = 0;


    @Override
    public int size(){
        return this.tamanhoLista;
    }


    @Override
    public void add(T content){

        Node4DoubleLinkedList<T> novoNode = new Node4DoubleLinkedList<>(content);
        novoNode.setNextNode(null);
        novoNode.setPriorNode(this.lastNode);

        if(this.firstNode == null) this.firstNode = novoNode;
        if (this.lastNode != null) this.lastNode.setNextNode(novoNode);

        this.lastNode = novoNode;
        this.tamanhoLista ++;
    }


    @Override
    public void add(int index, T content){

        Node4DoubleLinkedList<T> auxiliarNode = this.getNode(index);
        Node4DoubleLinkedList<T> newNode = new Node4DoubleLinkedList<>(content);
        newNode.setNextNode(auxiliarNode);

        if(auxiliarNode.getNextNode() != null){
            auxiliarNode.getPriorNode().setNextNode(newNode);
            newNode.setPriorNode(auxiliarNode.getPriorNode());
            auxiliarNode.setPriorNode(newNode);
        }else{
            newNode.setPriorNode(this.lastNode);
            this.lastNode = newNode;
        }

        if(index == 0) this.firstNode = newNode;
        else newNode.getPriorNode().setNextNode(newNode);

        tamanhoLista ++;
    }


    @Override
    public T remove(int index){

        T content = null;
        if(index==0){
            this.firstNode = this.firstNode.getNextNode();
            content = firstNode.getContent();

            if(this.firstNode != null) this.firstNode.setPriorNode(null);

        }else {
            Node4DoubleLinkedList<T> auxiliarNode = this.getNode(index);
            auxiliarNode.getPriorNode().setNextNode(auxiliarNode.getNextNode());
            auxiliarNode.getNextNode().setPriorNode(auxiliarNode.getPriorNode());
            content = auxiliarNode.getContent();
        }

        tamanhoLista --;
        return content;

    }

    @Override
    public Node4DoubleLinkedList<T> getNode(int index) {

        Node4DoubleLinkedList<T> auxiliarNode = this.firstNode;
        for (int i = 0; (i < index && auxiliarNode != null); i++) {
            auxiliarNode = auxiliarNode.getNextNode();
        }
        return auxiliarNode;
    }


    @Override
    public T getContent(int index){
        return this.getNode(index).getContent();
    }


    @Override
    public String toString() {

        Node4DoubleLinkedList<T> auxiliarNode = this.firstNode;
        String retorno = null;

        for(int i=0; i<this.size(); i++){
            retorno += String.format(" Node{ conteudo %s } --> next Node --> \n", auxiliarNode.toString());
            auxiliarNode = auxiliarNode.getNextNode();
        }

        return retorno;
    }
}
