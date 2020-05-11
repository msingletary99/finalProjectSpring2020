/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import BusinessLayer.Order;
import java.util.ArrayList;

/**
 *
 * @author 0781317
 */
public class OrderDataManager {
    private ArrayList<Order> dataStore;
    
    public OrderDataManager(){
        this.dataStore = new ArrayList<Order>();
    }
    
    public ArrayList<Order> getByCustomerID(int customerID){
        ArrayList<Order> output = new ArrayList<Order>();
        
        for (Order order:dataStore){
            if(order.getCustomerID()==customerID){
                output.add(order);
            }
        }
        return output;
    }
    
    public void create(Order newOrder){
        this.dataStore.add(newOrder);
    }
    
    public ArrayList<Order> getAll(){
        return dataStore;
    }
}
