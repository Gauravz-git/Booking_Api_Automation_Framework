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

    public String getLastName() {
        return lastName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public boolean isDepositPaid() {
        return depositPaid;
    }
}


