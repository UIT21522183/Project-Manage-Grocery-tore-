 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package invoice;

import  java.sql.Timestamp;

/**
 *
 * @author ASUS
 */
public class Invoice {
    private int invoice_id;
    private int customer_id;
    private float total_amount;
    private String payment_method;
    private boolean payment_status;
    private Timestamp payment_date;
    private int employee_id;
    private Timestamp created_at;

    public Invoice() {
    }

    public Invoice(int invoice_id, int customer_id, float total_amount, String payment_method, boolean payment_status, Timestamp payment_date, int employee_id, Timestamp created_at) {
        this.invoice_id = invoice_id;
        this.customer_id = customer_id;
        this.total_amount = total_amount;
        this.payment_method = payment_method;
        this.payment_status = payment_status;
        this.payment_date = payment_date;
        this.employee_id = employee_id;
        this.created_at = created_at;
    }

    public Invoice(int customer_id, float total_amount, String payment_method, boolean payment_status, Timestamp payment_date, int employee_id, Timestamp created_at) {
        this.customer_id = customer_id;
        this.total_amount = total_amount;
        this.payment_method = payment_method;
        this.payment_status = payment_status;
        this.payment_date = payment_date;
        this.employee_id = employee_id;
        this.created_at = created_at;
    }

    public Invoice(float total_amount, String payment_method, boolean payment_status, Timestamp payment_date, Timestamp created_at) {
       
        this.total_amount = total_amount;
        this.payment_method = payment_method;
        this.payment_status = payment_status;
        this.payment_date = payment_date;
        this.created_at = created_at;
    }

    public Invoice(float total_amount, String payment_method, boolean payment_status, int employee_id, Timestamp created_at) {
        this.total_amount = total_amount;
        this.payment_method = payment_method;
        this.payment_status = payment_status;
        this.employee_id = employee_id;
        this.created_at = created_at;
    }
    
    

    public Invoice(int customer_id,float total_amount, String payment_method, boolean payment_status, Timestamp created_at) {
        this.customer_id = customer_id;
        this.total_amount = total_amount;
        this.payment_method = payment_method;
        this.payment_status = payment_status;
        this.created_at = created_at;
    }
    
    
    
    

    public void setInvoice_id(int invoice_id) {
        this.invoice_id = invoice_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public void setTotal_amount(float total_amount) {
        this.total_amount = total_amount;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public void setPayment_status(boolean payment_status) {
        this.payment_status = payment_status;
    }

    public void setPayment_date(Timestamp payment_date) {
        this.payment_date = payment_date;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public int getInvoice_id() {
        return invoice_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public float getTotal_amount() {
        return total_amount;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public boolean isPayment_status() {
        return payment_status;
    }

    public Timestamp getPayment_date() {
        return payment_date;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }
    
}
