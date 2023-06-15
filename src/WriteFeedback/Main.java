/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WriteFeedback;

import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author TuanTuti
 */
public class Main {
     
    
    public static dsConnectDatabase connection = new dsConnectDatabase();

    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static void thongBao(String noiDungThongBao,String tieuDeThongBao,int icon){
        JOptionPane.showMessageDialog(new JFrame(),noiDungThongBao,tieuDeThongBao,icon);
    }
    
    private int feedback_id;
    private int customer_id;
    private int product_id;
    private String feedback_content;

    @Override
    public String toString() {
        return "Main{" + "feedback_id=" + feedback_id + ", customer_id=" + customer_id + ", product_id=" + product_id + ", feedback_content=" + feedback_content + '}';
    }

    public static void setConnection(dsConnectDatabase connection) {
        Main.connection = connection;
    }

    public void setFeedback_id(int feedback_id) {
        this.feedback_id = feedback_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

  

    public void setFeedback_content(String feedback_content) {
        this.feedback_content = feedback_content;
    }

    public static dsConnectDatabase getConnection() {
        return connection;
    }

    public int getFeedback_id() {
        return feedback_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public int getProduct_id() {
        return product_id;
    }

  

    public String getFeedback_content() {
        return feedback_content;
    }

    public Main() {
       
    }

    public Main(int customer_id, int product_id,  String feedback_content) {
        this.customer_id = customer_id;
        this.product_id = product_id;
        this.feedback_content = feedback_content;
    }

    public Main(int feedback_id, int customer_id, int product_id,  String feedback_content) {
        this.feedback_id = feedback_id;
        this.customer_id = customer_id;
        this.product_id = product_id;
        this.feedback_content = feedback_content;
    }

}
