package EstruturaDados;

public class Node4Queue {

    private Object object;
    private Node4Queue nodeReferencia;

    public Node4Queue(Object object) {
        this.object = object;
        this.nodeReferencia = null;
    }


    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
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
