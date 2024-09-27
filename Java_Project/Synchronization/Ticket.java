public class Ticket {
    private String eventName;
    private int totalSeats;
    private int availableSeats;

    public Ticket(String eventName, int totalSeats) {
        this.eventName = eventName;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
    }

    public synchronized boolean bookTickets(int numberOfTickets) {
        if (numberOfTickets <= availableSeats) {
            availableSeats -= numberOfTickets;
            System.out.println(numberOfTickets + " tickets booked for " + eventName + ". Remaining seats: " + availableSeats);
            return true;
        } else {
            System.out.println("Not enough seats available for " + eventName + ". Requested: " + numberOfTickets + ", Available: " + availableSeats);
            return false;
        }
    }

    public String getEventName() {
        return eventName;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }
}
