package EstruturaDados;

public interface IFila<T> {

    void enqueue(Node4Queue objeto);

    T dequeue();

    boolean isEmpty();

    @Override
    String toString();
}
