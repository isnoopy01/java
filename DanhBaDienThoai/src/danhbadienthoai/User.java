/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhbadienthoai;

/**
 *
 * @author Bùi Minh Toàn
 */
public class User {
    private String name;
    private String number;

    public User() {
    }

    public User(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", number=" + number + '}';
    }
    
    
}
