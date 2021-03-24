package company.Task6.List;

public interface List<T> {
    void addFirst(T item);
    void addLast(T item);
    T removeFirst();
    T removeLast();
    T head();
    T tail();
    T current();
    T next();
    T previous();
    T get(int index);
    int indexOf(T item);
}
