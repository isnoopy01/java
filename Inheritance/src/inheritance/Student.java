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
public class Student extends Person{
    private double mark;
    private String school;
    
    public Student(){
        
    }
    
    public Student(String name, String dob, boolean gender, double mark, String school)
    {
        super(name,dob,gender);
        this.mark = mark;
        this.school = school;
    }
    
    public double getMark(){
        return this.mark;
    }
    
    public String getSchool(){
        return this.school;
    }
    
    public void setMark (double mark)
    {
        this.mark = mark;
    }
    
    public void setSchool(String school){
        this.school = school;
    }
    
    @Override
    public String getDetail(){
        return super.getDetail()+
                ", Mark: "+this.mark+", School: "+this.school;
    }
}
