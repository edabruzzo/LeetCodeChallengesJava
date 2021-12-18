package EstruturaDados;

public class GenericNode<T> {

    private T content;
    private GenericNode nextNode;

    public GenericNode(T content) {
        this.content = content;
        this.nextNode = null;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public GenericNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(GenericNode<String> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "content='" + content + '\'' +
                '}';
    }


}
