/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

/**
 *
 * @author Bùi Minh Toàn
 */
public class User {
    private String uName;
    private String uPass;

    public User() {
    }

    public User(String uName, String uPass) {
        this.uName = uName;
        this.uPass = uPass;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPass() {
        return uPass;
    }

    public void setuPass(String uPass) {
        this.uPass = uPass;
    }

    @Override
    public String toString() {
        return "User{" + "uName=" + uName + ", uPass=" + uPass + '}';
    }
    
    
} 
