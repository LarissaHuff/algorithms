package interfaces;

public interface LinkedList<E> {
    E getHead();
    E getTail();
    void addFirst(E element);
    void addLast(E element);
}
