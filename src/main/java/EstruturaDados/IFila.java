package EstruturaDados;

public interface IFila {
    void enqueue(Node4Queue novoNode);

    Node4Queue dequeue();

    boolean isEmpty();

    @Override
    String toString();
}
