/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.CustomerOrder;
/**
 *
 * @author puvie
 */
public class CustomerOrderController {
    CustomerOrder customerobj;
    public CustomerOrder addCustomerOrder(int OrderID,String OrderName,String OrderDate,int Quantity,float UnitPrice,float deliveryFee,String OrderType){
        customerobj=new CustomerOrder( OrderID, OrderName, OrderDate, Quantity, UnitPrice,deliveryFee,OrderType);
        return customerobj;
    }
    public CustomerOrder updateCustomerOrder(int OrderID,String OrderName,String OrderDate,int Quantity,float UnitPrice,float deliveryFee,String OrderType){
        customerobj=new CustomerOrder(OrderID,OrderName,OrderDate,Quantity,UnitPrice,deliveryFee,OrderType);
        return customerobj;
    }
    public CustomerOrder removeCustomerOrder(int OrderID,String OrderName,String OrderDate,int Quantity,float UnitPrice,float deliveryFee,String OrderType){
        customerobj=new CustomerOrder(OrderID,OrderName,OrderDate,Quantity,UnitPrice,deliveryFee,OrderType);
        return customerobj;
    }
}
