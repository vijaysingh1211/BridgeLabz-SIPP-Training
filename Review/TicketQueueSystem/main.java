package Review.TicketQueueSystem;

public class main {
    public static void main(String[] args) {
        BookingQueue<ticket> ticketQueue = new BookingQueue<>();

        ticketQueue.addBooking(new ticket(11, "cricket match", "Jhon Shelby"));
        ticketQueue.addBooking(new ticket(22, "football match", "Arthur Shelby"));
        ticketQueue.addBooking(new ticket(33, "concert", "Thomas Shelby"));
        
        while (!ticketQueue.isEmpty()) {
            ticket served = ticketQueue.removebooking();
            System.out.println("Serving:"+served);
            System.out.println("Next to be served: " + ticketQueue.peekNext());
        }
    }
}

