/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

/**
 *
 * @author ASUS
 */
public class Customer {
    private int id;
    private String username;
    private String password;
    private String addressLine1;
    private String addressLine2;
    private String answer;
    private String question;
    private long phone;
    private String name;
    private String email;

    public Customer(int id, String username, String password, String addressLine1, String addressLine2, String answer, String question, int phone, String name, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.answer = answer;
        this.question = question;
        this.phone = phone;
        this.name = name;
        this.email = email;
    }

    public Customer() {
    }

    public Customer(String username, String password, String addressLine1, String addressLine2, String answer, String question, int phone, String name, String email) {
        this.username = username;
        this.password = password;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.answer = answer;
        this.question = question;
        this.phone = phone;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getAnswer() {
        return answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public long getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
