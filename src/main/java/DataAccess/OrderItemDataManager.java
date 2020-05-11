/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import BusinessLayer.OrderItem;
import java.util.ArrayList;

/**
 *
 * @author 0781317
 */
public class OrderItemDataManager {
    private ArrayList<OrderItem> dataStore;
    
    public OrderItemDataManager(){
        this.dataStore = new ArrayList<OrderItem>();
    }
    
    public ArrayList<OrderItem> getByOrderNumber(int orderNumber){
        
        ArrayList<OrderItem> output = new ArrayList<OrderItem>();
        
        for (OrderItem orderItem : dataStore){
            if(orderItem.getOrderNumber() == orderNumber){
                output.add(orderItem);
            }
        }
        return output;
    }
    
    public void create(OrderItem newOrderItem){
        this.dataStore.add(newOrderItem);
    }
    
    public ArrayList<OrderItem> getAll(){
        return dataStore;
    }
}
