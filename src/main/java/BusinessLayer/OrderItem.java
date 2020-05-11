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
public class OrderItem {

    private int orderNumber;
    private int lineNumber;
    private int productID;
    private String productDescription;
    private int quantity;
    private double price;

    public OrderItem() {
        orderNumber = 0;
        lineNumber = 0;
        productID = 0;
        productDescription = " ";
        quantity = 0;
        price = 0.0;

    }
      public OrderItem(int oiOrderNumber, int oiLineNumber, int oiProductID,
              String oiProductDescription, int oiQuantity, double oiPrice){
        orderNumber = oiOrderNumber;
        lineNumber = oiLineNumber;
        productID = oiProductID;
        productDescription = oiProductDescription;
        quantity = oiQuantity;
        price = oiPrice;

    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        String orderItemInformation;
        orderItemInformation = orderNumber + "\n" + lineNumber + "\n" + productID + "\n"
                + productDescription + "\n" + quantity + "\n" + price;
        return orderItemInformation;
    }

}
