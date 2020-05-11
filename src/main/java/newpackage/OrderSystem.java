/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import BusinessLayer.Customer;
import BusinessLayer.Order;
import BusinessLayer.OrderItem;
import BusinessLayer.Product;
import DataAccess.CustomerData;
import DataAccess.OrderDataManager;
import DataAccess.OrderItemDataManager;
import DataAccess.ProductDataManager;
import java.util.ArrayList;

/**
 *
 * @author 0781317
 */
public class OrderSystem {

    public static void main(String[] args) {

        CustomerData customerDm = new CustomerData();
        OrderDataManager OrderDm = new OrderDataManager();
        ProductDataManager productDm = new ProductDataManager();
        OrderItemDataManager orderItemDm = new OrderItemDataManager();

        Customer firstCustomer = new Customer(1, "Magnus", "Burnsides", "0000000000");
        customerDm.create(firstCustomer);

        Order firstOrder = new Order(10, 1, "5/10/2020");
        OrderDm.create(firstOrder);

        Customer secondCustomer = new Customer(2, "Angus", "McDonald", "1111111111");
        customerDm.create(secondCustomer);

        Order secondOrder = new Order(20, 2, "5/15/2020");
        OrderDm.create(secondOrder);

        Customer thirdCustomer = new Customer(3, "Fitzroy", "Maplecourt", "2222222222");
        customerDm.create(thirdCustomer);

        Order thirdOrder = new Order(30, 3, "5/20/2020");
        OrderDm.create(thirdOrder);

        Product firstProduct = new Product(101, "Xbox One S Bundle with Xbox controler and 'Minecraft'", 100, 249.99);
        Product secondProduct = new Product(202, "Nintendo Switch Bundle with 'Mario Kart 8 Delux'", 75, 324.86);
        Product thirdProduct = new Product(303, "PS4 Slim Bundle with 'The Last of Us'", 50, 397.86);
        productDm.create(firstProduct);
        productDm.create(secondProduct);
        productDm.create(thirdProduct);

        OrderItem firstOrderItem = new OrderItem(10, 1, 101, "Xbox One S Bundle with Xbox controler and 'Minecraft'", 1, 249.99);
        orderItemDm.create(firstOrderItem);

        System.out.println("Reading Information from Database:");

        ArrayList<Customer> customersInDatabase1 = customerDm.getByCustomerID(1);
        for (Customer dbCustomer : customersInDatabase1) {
            System.out.println(dbCustomer);
        }

        ArrayList<Order> ordersFromDatabase1 = OrderDm.getByCustomerID(1);
        for (Order dborder : ordersFromDatabase1) {
            System.out.println(dborder);
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");

        ArrayList<Customer> customersInDatabase2 = customerDm.getByCustomerID(2);
        for (Customer dbCustomer : customersInDatabase2) {
            System.out.println(dbCustomer);
        }

        ArrayList<Order> ordersFromDatabase2 = OrderDm.getByCustomerID(2);
        for (Order dborder : ordersFromDatabase2) {
            System.out.println(dborder);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");

        ArrayList<Customer> customersInDatabase3 = customerDm.getByCustomerID(3);
        for (Customer dbCustomer : customersInDatabase3) {
            System.out.println(dbCustomer);
        }

        ArrayList<Order> ordersFromDatabase3 = OrderDm.getByCustomerID(3);
        for (Order dborder : ordersFromDatabase3) {
            System.out.println(dborder);
        }
    }
}
