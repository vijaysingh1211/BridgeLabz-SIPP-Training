package Review.TicketQueueSystem;
import java.util.*;
public class BookingQueue<T> {
    private final Queue<T> queue = new LinkedList<>();

    public void addBooking(T item) {
        queue.add(item);
    }

    public T removebooking() {
        return queue.remove();
    }
   public T peekNext() {
        return queue.peek();
    }
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}

