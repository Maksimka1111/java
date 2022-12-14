package task2;

public interface Queue {
    void enqueue(Object object);
    Object dequeue();
    Object element();
    int size();
    boolean isEmpty();
    void clear();
}
