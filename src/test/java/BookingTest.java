import org.example.Booking;

public class BookingTest {
    public static void main(String[] args) {
        Booking booking = new Booking("Gaurav", "Chaudhari", 500.00, true);
        System.out.println(booking.getFirstName());
        System.out.println(booking.getLastName());
        System.out.println(booking.getTotalPrice());
        System.out.println(booking.isDepositPaid());
    }
}
