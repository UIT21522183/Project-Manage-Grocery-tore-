package ManageEmployee;

import java.sql.Timestamp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dinhn
 */
//[full_name]
//      ,[username]
//      ,[password]
//      ,[role]
//      ,[email]
//      ,[phone_number]
//      ,[address]
//      ,[join_date]
//      ,[salary]
//      ,[is_active]
public class Employee {

    public Employee(String full_name, String username, String password,
            String role, String email, String phone_number, String address, 
            Timestamp join_date, double salary, boolean is_active) {
        this.full_name = full_name;
        this.username = username;
        this.password = password;
        this.role = role;
        this.email = email;
        this.phone_number = phone_number;
        this.address = address;
        this.join_date = join_date;
        this.salary = salary;
        this.is_active = is_active;
    }


    private int employee_id;
    private String full_name;
    private String username;
    private String password;
    private String role;
    private String email;
    private String phone_number;
    private String address;
    private Timestamp join_date;
    private double salary;
    private boolean is_active;

    public Employee() {
    }

    public Employee(int employee_id) {
        this.employee_id = employee_id;
    }

    public Employee(int employee_id, String full_name, String username, 
            String password, String role, String email, String phone_number, String address, Timestamp join_date, double salary, boolean is_active) {
        this.employee_id = employee_id;
        this.full_name = full_name;
        this.username = username;
        this.password = password;
        this.role = role;
        this.email = email;
        this.phone_number = phone_number;
        this.address = address;
        this.join_date = join_date;
        this.salary = salary;
        this.is_active = is_active;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Timestamp getJoin_date() {
        return join_date;
    }

    public void setJoin_date(Timestamp join_date) {
        this.join_date = join_date;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    @Override
    public String toString() {
        return "Employee{" + "employee_id=" + employee_id + ", full_name=" + full_name + ", username=" + username + ", password=" + password + ", role=" + role + ", email=" + email + ", phone_number=" + phone_number + ", address=" + address + ", join_date=" + join_date + ", salary=" + salary + ", is_active=" + is_active + '}';
    }

    Employee getEmployeeById(int employee_id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}