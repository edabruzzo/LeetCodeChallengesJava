package EstruturaDados;

public class Node4LinkedList<T> {

    private T content;
    private Node4LinkedList nextNode;


    public Node4LinkedList() {
        this.nextNode = null;
    }

    public Node4LinkedList(T content) {
        this.content = content;
        this.nextNode = null;
    }


    public T getContent() {
        return content;
    }


    public void setContent(T content) {
        this.content = content;
    }


    public Node4LinkedList getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node4LinkedList nextNode) {
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
