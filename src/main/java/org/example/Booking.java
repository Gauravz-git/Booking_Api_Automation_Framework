package org.example;

public class Booking {
    private String firstName;
    private String lastName;
    private double totalPrice;
    private boolean depositPaid;

    //Constructor
    public Booking(String firstName, String lastName, double totalPrice, boolean depositPaid) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalPrice = totalPrice;
        this.depositPaid = depositPaid;
    }


    //getter
    public String getFirstName() {
        return firstName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }



    //main
    public static void main(String[] args) {
        Booking booking = new Booking("Gaurav", "Chaudhari", 500.00, true);
        System.out.println(booking.getFirstName());
        System.out.println(booking.getTotalPrice());
    }
}


