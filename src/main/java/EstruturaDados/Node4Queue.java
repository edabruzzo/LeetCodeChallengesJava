package EstruturaDados;

public class Node4Queue<T> {

    private T object;
    private Node4Queue nodeReferencia;

    public Node4Queue(T object) {
        this.object = object;
        this.nodeReferencia = null;
    }


    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public Node4Queue getNodeReferencia() {
        return nodeReferencia;
    }

    public void setNodeReferencia(Node4Queue nodeReferencia) {
        this.nodeReferencia = nodeReferencia;
    }

    @Override
    public String toString() {
        return "Node4Queue{" +
                "object=" + object.toString() +
                '}';
    }
}
