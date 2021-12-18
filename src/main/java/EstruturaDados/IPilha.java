package EstruturaDados;

public interface IPilha {

    Node4Stack top();

    void push(Node4Stack novoNode);

    Node4Stack pop();

    boolean isEmpty();

    @Override
    String toString();
}
