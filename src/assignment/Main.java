/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
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
    public static void playSound(String soundName){
        try{
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(
                    new File(soundName).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        }
        catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.out.println(e.toString());
        }
    }
    private int product_id;
    private String product_name;
    private float price;
    private String category;
    private int quantity_inventory;

    public Main() {
       
    }

    public Main(int product_id ,String product_name, float price, String category, int quantity_inventory) {
        this.product_id = product_id;
        this.product_name = product_name;
     
        this.price = price;
        this.category = category;
        this.quantity_inventory = quantity_inventory;
    }

    /**
     * @return the id
     */
   
    public int getProduct_id() {
        return product_id;
    }
    
    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    /**
     * @return 
     */
     public String getProduct_name() {
        return product_name;
    }

    /**
     * @param product_name
     */
   public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
    /**
     * @param  the name to set
     */
    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

       
    public String getCategory() {
        return category;
    }
      public void setCategory(String category) {
        this.category = category;
    }
      
      /**
       * @return the quantity
     */
       public int getQuantity() {
        return quantity_inventory;
    }
    public void setQuantity(int quantity_inventory) {
        this.quantity_inventory = quantity_inventory;
    }

   
   

    @Override
    public String toString() {
        return "Product{" + "product_id=" + product_id + ", product_name=" + product_name + ", price=" + price + ", category=" + category + ", quantity_inventory=" + quantity_inventory + '}';
    }
    
    
}
