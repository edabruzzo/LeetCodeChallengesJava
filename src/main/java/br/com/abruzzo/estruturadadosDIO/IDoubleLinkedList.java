package br.com.abruzzo.estruturadadosDIO;

public interface IDoubleLinkedList<T> {

    int size();

    void add(T content);

    void add(int index, T content);

    T remove(int index);

    Node4DoubleLinkedList<T> getNode(int index);

    T getContent(int index);

    @Override
    String toString();
}
