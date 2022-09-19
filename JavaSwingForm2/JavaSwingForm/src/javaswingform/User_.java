/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingform;

import java.util.ArrayList;

/**
 *
 * @author Bùi Minh Toàn
 */
public class User_ {
    private String user;
    private String password;
    private String name;
    private boolean gender;
    ArrayList <String> hobby = new ArrayList<>();
    private String hometown;
    private String address;

    public User_() {
    }

    public User_(String user, String password) {
        this.user = user;
        this.password = password;
    }
    
    

    public User_(String user, String password, String name, boolean gender, String hometown, String address) {
        this.user = user;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.hometown = hometown;
        this.address = address;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public ArrayList<String> getHobby() {
        return hobby;
    }
    
    public String getStringHobby(){
        String str = "";
        for (String x: hobby)
        {
            str += x;
            str += " ";
        }
        return str;
    }
    
    public void addHobby (String hob)
    {
        hobby.add(hob);
    }

    public void setHobby(ArrayList<String> hobby) {
        this.hobby = hobby;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getGender(){
        return gender?"Male":"Female";
    }

    @Override
    public String toString() {
        return "User_{" + "user=" + user + ", password=" + password + ", name=" + name + ", gender=" + gender + ", hobby=" + getStringHobby() + ", hometown=" + hometown + ", address=" + address + '}';
    }

    
    
    
}
