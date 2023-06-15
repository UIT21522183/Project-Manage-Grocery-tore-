/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package invoice;

/**
 *
 * @author ASUS
 */
public class invoiceDetail {
    private int invoice_detail_id;
    private int invoice_id ;
    private int product_id;
    private int quantity;
    private float price;

    public invoiceDetail() {
    }

    public invoiceDetail(int invoice_detail_id, int invoice_id, int product_id, int quantity, float price) {
        this.invoice_detail_id = invoice_detail_id;
        this.invoice_id = invoice_id;
        this.product_id = product_id;
        this.quantity = quantity;
        this.price = price;
    }

    public invoiceDetail(int product_id, int quantity, float price) {
        this.product_id = product_id;
        this.quantity = quantity;
        this.price = price;
    }

    
    public void setInvoice_detail_id(int invoice_detail_id) {
        this.invoice_detail_id = invoice_detail_id;
    }

    public void setInvoice_id(int invoice_id) {
        this.invoice_id = invoice_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getInvoice_detail_id() {
        return invoice_detail_id;
    }

    public int getInvoice_id() {
        return invoice_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getPrice() {
        return price;
    }
    
    
}
