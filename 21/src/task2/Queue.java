package task2;

public interface Queue<T> {
    void enqueue(T t);
    T dequeue();
    T peek();
    int size();
    boolean isEmpty();
}