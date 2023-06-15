/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EquipmentManagement;


/**
 *
 * @author Hp
 */
import java.sql.Timestamp;
import java.time.LocalDate;

public class Equipment {
    private int id;
    private String name;
    private String type;
    private float price;
    private String status;
    private String createBy;
    private Timestamp createDate;

    public Equipment(int id, String name, String type, float price, String status, String createBy, Timestamp createDate) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
        this.status = status;
        this.createBy = createBy;
        this.createDate = createDate;
    }

    public Equipment(String name, String type, float price, String status, String createBy, Timestamp createDate) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.status = status;
        this.createBy = createBy;
        this.createDate = createDate;
    }

    
    public Equipment() {
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }

    public String getCreateBy() {
        return createBy;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }
    
    
}
