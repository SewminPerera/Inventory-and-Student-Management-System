/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author puvie
 */
public class Supplier {
    private int SupplierID;
    private String SupplierName;
    private String Address;
    private String email;
    private int phone;
    
    public Supplier(int Supplierid,String SupplierName,String Address,String email,int phone){
        
        this.SupplierName=SupplierName;
        this.SupplierID=Supplierid;
        this.Address=Address;
        this.email=email;
        this.phone=phone;
    }
    public String printDetails(){
        return "Supplier name is : "+this.SupplierName+"  Supplier id is: "+this.SupplierID+" email of the supplier is: "+this.email+" the address of the Supplier is: "+this.Address+" the phone number of the supplier is: "+this.phone;
    }

    public int getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(int SupplierID) {
        this.SupplierID = SupplierID;
    }

    public String getSupplierName() {
        return SupplierName;
    }

    public void setSupplierName(String SupplierName) {
        this.SupplierName = SupplierName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    
    
}
