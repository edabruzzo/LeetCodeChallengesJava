package br.com.abruzzo.estruturadadosDIO;

public interface IListaEncadeada<T> {

    Node4LinkedListAndCircularList<T> getNode(int index);

    default boolean indicePesquisadoMaiorTamanhoLista(int index) {
        if (index > this.size()) {
            try {
                throw new IndexOutOfBoundsException();
            } catch (IndexOutOfBoundsException erro) {
                System.out.println(String.format("" +
                                "O índice pesquisado (%d) " +
                                "é maior do que o tamanho da lista encadeada (%d)",
                        index, this.size()));
                return true;
            }
        } else
            return false;
    }

    T remove(int index);

    void add(T conteudo);

    boolean isEmpty();

    int size();

    @Override
    String toString();
}
