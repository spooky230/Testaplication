package company.Task6.List;

public class ListImpl<T> implements List<T>{
    @Override
    public void addFirst(T item) {
        if (head==null){
            init(item);
        }
        else{
            Node<T> newHead = new Node<>(item);
            head.previous = newHead;
            newHead.next = head;
            head = newHead;
        }

    }

    @Override
    public void addLast(T item) {
        if (head==null){
            init(item);
        }
        else{
            Node<T> newTail = new Node<>(item);
            tail.next = newTail;
            newTail.previous = tail;
            tail = newTail;
        }
    }

    @Override
    public T removeFirst() {
        T data = head.data;
        if(head==tail){
            remove();
        }
        else {
            Node<T> newHead = head.next;
            head.next = null;
            newHead.previous = null;
            head = newHead;
        }
        return data;
    }

    @Override
    public T removeLast() {
        T data = tail.data;
        if(head==tail){
            remove();
        }
        else {
            Node<T> newTail = tail.previous;
            tail.previous = null;
            newTail.next = null;
            tail = newTail;
        }
        return data;
    }
    private void remove() {
     head = null;
     tail = null;
     current = null;
    }

    @Override
    public T head() {
        current = head;
        return current.data;
    }

    @Override
    public T tail() {
        current = tail;
        return current.data;
    }

    @Override
    public T current() {
        return current.data;
    }

    @Override
    public T next() {
        if(current.next==null){
            throw new IndexOutOfBoundsException();
        }
        current = current.next;
        return current.data;
    }

    @Override
    public T previous() {
        if(current.previous==null){
            throw new IndexOutOfBoundsException();
        }
        current = current.previous;
        return current.data;
    }

    @Override
    public T get(int index) {
        if (index<0){
            throw new IndexOutOfBoundsException();
        }
        head();
        for (int i = 0; i <index; i++) {
            next();
        }
        return current.data;
    }

    @Override
    public int indexOf(T item) {
        return 0;
    }
    private Node<T> head;
    private Node<T> current;
    private Node<T> tail;
    private void init(T item){
        head = new Node<>(item);
        current = head;
        tail = head;
    }
    private class Node<T>{
        private T data;

        public Node(T data) {
            this.data = data;
        }
        private Node<T>next;
        private Node<T>previous;
    }
}
