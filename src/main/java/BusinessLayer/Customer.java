package BusinessLayer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0781317
 */
public class Customer {

    private int customerID;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Customer() {
        customerID = 0;
        firstName = " ";
        lastName = " ";
        phoneNumber = " ";
    }
    
    public Customer(int userID, String first, String last, String phone){
        customerID = userID;
        firstName = first;
        lastName = last;
        phoneNumber = phone;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        String customerInformation = "";
        customerInformation = customerID + "\n" + firstName + "\n" + lastName + "\n" + phoneNumber;
        return customerInformation;
    }
}
