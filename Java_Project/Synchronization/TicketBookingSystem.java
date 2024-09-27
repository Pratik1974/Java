import java.util.Scanner;

public class TicketBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ticket concertTicket = new Ticket("Concert", 10); // 10 tickets available

        while (true) {
            System.out.print("Enter the number of tickets to book (or -1 to exit): ");
            int numberOfTickets = scanner.nextInt();

            if (numberOfTickets == -1) {
                System.out.println("Exiting...");
                break;
            }

            BookingThread bookingThread = new BookingThread(concertTicket, numberOfTickets);
            bookingThread.start();
        }

        scanner.close();
    }
}
