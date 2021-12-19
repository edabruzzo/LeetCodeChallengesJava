package br.com.abruzzo.estruturadadosDIO;

public class CircularList<T>{

    private Node4LinkedListAndCircularList<T> head;
    private Node4LinkedListAndCircularList<T> tail;
    private int listLength;

    public Node4LinkedListAndCircularList<T> getHead() {
        return head;
    }

    public void setHead(Node4LinkedListAndCircularList<T> head) {
        this.head = head;
    }

    public Node4LinkedListAndCircularList<T> getTail() {
        return tail;
    }

    public void setTail(Node4LinkedListAndCircularList<T> tail) {
        this.tail = tail;
    }


    public boolean isEmpty(){
        return this.listLength == 0 ? true : false;
    }

    public int size(){
        return this.listLength;
    }


    public T getContent(int index){
        return getNode(index).getContent();
    }


    public Node4LinkedListAndCircularList<T> getNode(int index) {

        if (validateIfListisEmptyOrIndexIsOutOfBound(index))
            return null;
        if (index == 0)
            return this.tail;

        else {
            Node4LinkedListAndCircularList auxiliarNode = this.tail;

            for (int i = 0; i < index; i++) {
                auxiliarNode = auxiliarNode.getNextNode();
            }
            return auxiliarNode;
        }
    }

    private boolean validateIfListisEmptyOrIndexIsOutOfBound(int index) {
        if (this.isEmpty() || index > this.size()) {
            String mensagemErro = null;

            if(this.isEmpty()) mensagemErro = "Lista vazia";
            if(index > this.size() && ! this.isEmpty())
                mensagemErro = String.format("O index passado (%d) é maior que o tamanho da lista (%d)",
                        index,this.size());

            try {
                throw new IndexOutOfBoundsException();
            } catch (IndexOutOfBoundsException exception) {
                System.out.println(mensagemErro);
                return true;
            }
        }
        return false;
    }


    public void remove(int index){

        this.validateIfListisEmptyOrIndexIsOutOfBound(index);
        Node4LinkedListAndCircularList<T> auxiliarNode;

        if(index == 0){
            this.tail = this.tail.getNextNode();
            this.head.setNextNode(this.tail);
        }
    }


    public void add(T content){
        Node4LinkedListAndCircularList<T> newNode = new Node4LinkedListAndCircularList<>(content);
        if (this.isEmpty()){
            this.head = newNode;
            this.tail = this.head;
            this.head.setNextNode(this.tail);
        }else{
            newNode.setNextNode(this.tail);
            this.tail = newNode;
            this.head.setNextNode(newNode);

        }
        this.listLength ++;
    }


    @Override
    public String toString() {
        Node4LinkedListAndCircularList<T> auxiliarNode = this.tail;
        String retorno = null;

        for(int i=0; i<this.size(); i++){
            retorno += String.format(" Node{ conteudo %s } --> next Node --> \n", auxiliarNode.toString());
            auxiliarNode = auxiliarNode.getNextNode();
        }

        return retorno;
    }
}
