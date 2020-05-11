/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import BusinessLayer.Customer;
import java.util.ArrayList;

/**
 *
 * @author 0781317
 */
public class CustomerData {

    private ArrayList<Customer> dataStore;
    
    public CustomerData(){
        this.dataStore = new ArrayList<Customer>();
    }
    
    public ArrayList<Customer> getByCustomerID(int customerID){
        ArrayList<Customer> output = new ArrayList<Customer>();
        for(Customer customer : dataStore){
            if(customer.getCustomerID()== customerID){
                output.add(customer);
            }
            
        }
        return output;
           }
    
    public void create(Customer newCustomer){
        this.dataStore.add(newCustomer);
    }
    
    public ArrayList<Customer> getAll(){
        return dataStore;
    }

}

