/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Supplier;

/**
 *
 * @author puvie
 */
public class SupplierController {
    Supplier supplierobj;
    public Supplier addSupplier(int SupplierId,String SupplierName,String Address,String email,int phone){
        supplierobj=new Supplier(SupplierId,SupplierName,Address,email,phone);
        return supplierobj;
    }
     public Supplier updateSupplier(int SupplierId,String SupplierName,String Address,String email,int phone){
        supplierobj=new Supplier(SupplierId,SupplierName,Address,email,phone);
        return supplierobj;
     }
      public Supplier removeSupplier(int SupplierId,String SupplierName,String Address,String email,int phone){
        supplierobj=new Supplier(SupplierId,SupplierName,Address,email,phone);
        return supplierobj;
      }
}
