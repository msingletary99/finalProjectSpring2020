/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import BusinessLayer.Product;
import java.util.ArrayList;

/**
 *
 * @author 0781317
 */
public class ProductDataManager {
    private ArrayList<Product> dataStore;
    
    public ProductDataManager(){
        this.dataStore = new ArrayList<Product>();
    }
    
    public ArrayList<Product> getByProductID(int productID){
        ArrayList<Product> output = new ArrayList<Product>();
        
        for(Product product : dataStore){
            if (product.getProductID()==productID){
                output.add(product);
            }
        }
        return output;
    }
    
    public void create(Product newProduct){
        this.dataStore.add(newProduct);
        
    }
    
    public ArrayList<Product> getAll(){
        return dataStore;
    }
}
