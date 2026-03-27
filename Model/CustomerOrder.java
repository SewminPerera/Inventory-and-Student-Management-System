/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author puvie
 */
public class CustomerOrder {
    private int OrderID;
    private String OrderName;
    private String OrderDate;
    private int Quantity;
    private float UnitPrice;
    private float deliveryFee;
    private String OrderType;
    
    public CustomerOrder(int OrderID,String OrderName,String OrderDate,int Quantity,float UnitPrice,float deliveryFee,String OrderType){
        this.OrderID=OrderID;
        this.OrderName=OrderName;
        this.OrderDate=OrderDate;
        this.Quantity=Quantity;
        this.UnitPrice=UnitPrice;
        this.deliveryFee=deliveryFee;
        this.OrderType=OrderType;
    }
    public String printCustomerOrder(){
        return "order ID is: " +this.OrderID+" you have orderred "+this.OrderType+" and the order name is : "+this.OrderName+" the orderred date is : "+this.OrderDate+" the quantity of item orderred is : "+this.Quantity+" and the unit price of each item is : " +this.UnitPrice+" and the delivery fee is : "+this.deliveryFee;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public String getOrderName() {
        return OrderName;
    }

    public void setOrderName(String OrderName) {
        this.OrderName = OrderName;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String OrderDate) {
        this.OrderDate = OrderDate;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public float getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(float UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    public float getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(float deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public String getOrderType() {
        return OrderType;
    }

    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }
    
}
