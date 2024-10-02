/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emart.pojo;

/**
 *
 * @author ABC
 */
public class ProductPojo {

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public ProductPojo(){
        
    }

    public ProductPojo(String prouductId, String productName, String productCompany, double productprice, double ourprice, int tax, int quantity, double total) {
        this.prouductId = prouductId;
        this.productName = productName;
        this.productCompany = productCompany;
        this.productprice = productprice;
        this.ourprice = ourprice;
        this.tax = tax;
        this.quantity = quantity;
        this.total = total;
    }

    public String getProuductId() {
        return prouductId;
    }

    public void setProuductId(String prouductId) {
        this.prouductId = prouductId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCompany() {
        return productCompany;
    }

    public void setProductCompany(String productCompany) {
        this.productCompany = productCompany;
    }

    public double getProductprice() {
        return productprice;
    }

    public void setProductprice(double productprice) {
        this.productprice = productprice;
    }

    public double getOurprice() {
        return ourprice;
    }

    public void setOurprice(double ourprice) {
        this.ourprice = ourprice;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    private String prouductId;
    private String productName;
    private String productCompany;
    private double productprice;
    private double ourprice;
    private int tax;
    private int quantity;
    private double total;
    
    
}
