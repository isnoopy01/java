/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Bùi Minh Toàn
 */
public class Person {
    protected String name;
    private String dob; //Date of Birth
    private boolean gender;
    
    public Person(){
        
    }
    
    public Person(String name, String dob, boolean gender)
    {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
    }
    
    public String getName (){
        return this.name;
    }
    
    public String getDob (){
        return this.dob;
    }
    
    public boolean isMale(){
        return this.gender;
    }
    
    public String getGender(){
        return isMale()?"Male":"Female";
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setDob (String dob){
        this.dob = dob;
    }
    
    public void setGender (boolean gender)
    {
        this.gender = gender;
    }
    
    public String getDetail(){
        return "Name: "+this.name+", Date of Birth: "+this.dob+
                ", Gender: "+this.getGender();
    }
}
