import org.example.Booking;

public class BookingTest {
    public static void main(String[] args) {
        Booking booking1 = new Booking("Gaurav", "Chaudhari", 500.00, true);

        Booking booking2 = new Booking(
                booking1.getFirstName(),
                booking1.getLastName(),
                booking1.getTotalPrice(),
                booking1.isDepositPaid()
        );

        booking2.setTotalPrice(750.00);

        System.out.println(booking1.getTotalPrice());
        System.out.println(booking2.getTotalPrice());
    }
}
