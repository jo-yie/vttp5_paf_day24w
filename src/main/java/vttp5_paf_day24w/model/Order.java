package vttp5_paf_day24w.model;

import java.time.LocalDate;
import java.util.Date;

public class Order {

    private LocalDate orderDate; 
    private String customerName; 
    private String shipAddress; 
    private String notes; 
    private double tax = 0.05;
    public Order() {
    }
    public Order(LocalDate orderDate, String customerName, String shipAddress, String notes, double tax) {
        this.orderDate = orderDate;
        this.customerName = customerName;
        this.shipAddress = shipAddress;
        this.notes = notes;
        this.tax = tax;
    }
    public LocalDate getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getShipAddress() {
        return shipAddress;
    }
    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }
    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }
    public double getTax() {
        return tax;
    }
    public void setTax(double tax) {
        this.tax = tax;
    } 

}
