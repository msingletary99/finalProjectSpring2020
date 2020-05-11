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
public class Product {
    private int productID;
    private String description;
    private int quantityOnHand;
    private double price;
    
    public Product(){
        productID=0;
        description="";
        quantityOnHand=0;
        price=0.0;
    }
 public Product(int pID, String pDescription, int pQuantityOnHand, double pPrice){
        productID=pID;
        description=pDescription;
        quantityOnHand=pQuantityOnHand;
        price=pPrice;
    }
    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    public void setQuantityOnHand(int quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public String toString(){
        String productInformation;
        productInformation= productID + "\n"+description+"\n"+quantityOnHand+"\n"+price;
        return productInformation;
    }
    
}
