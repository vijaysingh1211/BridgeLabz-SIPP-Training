package Review.TicketQueueSystem;

public class ticket {
    private final int ticketId;
    private final String eventName;
    private final String customerName;

    public ticket(int ticketId, String eventName, String customerName) {
        this.ticketId = ticketId;
        this.eventName = eventName;
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Ticket Id" + ticketId + " for " + eventName + " CustomerName: " + customerName ;
    }
}
