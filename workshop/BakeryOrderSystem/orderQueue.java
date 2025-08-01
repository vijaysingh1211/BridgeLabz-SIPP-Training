package workshop.BakeryOrderSystem;

import java.util.*;
public class orderQueue<T> {
    private final Queue<T> queue = new LinkedList<>();

    public void addOrder(T item) {
        queue.add(item);
    }

    public T removeOrder() {
        return queue.remove();
    }
   public T peekNext() {
        return queue.peek();
    }
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
