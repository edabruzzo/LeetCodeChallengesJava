package EstruturaDados;

public class Node4Stack {

    private int dado;
    private Node4Stack node4Stack;


    public Node4Stack(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public Node4Stack getNode4Stack() {
        return node4Stack;
    }

    public void setNode4Stack(Node4Stack node4Stack) {
        this.node4Stack = node4Stack;
    }


    @Override
    public String toString() {
        return "Node4Stack{" +
                "dado=" + dado +
                '}';
    }
}
