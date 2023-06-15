/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrderProduct;
import  java.sql.Timestamp;
/**
 *
 * @author ASUS
 */
public class product {
    private int product_id;
    private String product_name;
    private String description;
    private float price;
    private String category;
    private String supplier;
    private Timestamp experation_date;
    private int quantity;

    public product() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public product(int product_id, String product_name, String description, float price, String category, String supplier, Timestamp experation_date) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.supplier = supplier;
        this.experation_date = experation_date;
    }

    public int getProduct_id() {
        return product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getSupplier() {
        return supplier;
    }

    public Timestamp getExperation_date() {
        return experation_date;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public void setExperation_date(Timestamp experation_date) {
        this.experation_date = experation_date;
    }
    
    
}
