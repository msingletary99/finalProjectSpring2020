/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0781317
 */
public class Order {

    private int orderNumber;
    private int customerID;
    private String date;

    public Order() {
        orderNumber = 0;
        customerID = 0;
        date = " ";
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    @Override
    public String toString(){
        String orderInformation;
        orderInformation = orderNumber + "\n" + customerID + "\n" + date;
        return orderInformation;
    }

}
