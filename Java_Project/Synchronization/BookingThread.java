public class BookingThread extends Thread {
    private Ticket ticket;
    private int numberOfTickets;

    public BookingThread(Ticket ticket, int numberOfTickets) {
        this.ticket = ticket;
        this.numberOfTickets = numberOfTickets;
    }

    @Override
    public void run() {
        ticket.bookTickets(numberOfTickets);
    }
}
