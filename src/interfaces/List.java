package interfaces;

public interface List <E>{
    boolean isEmpty();
    int size();
    E get(int index);
    E add();
    E add(int index);
    void clear();
    E remove(E element);
    E remove(int index);
    int indexOf(E element);
}
