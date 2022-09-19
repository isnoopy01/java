/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileinputoutput;

/**
 *
 * @author Bùi Minh Toàn
 */
public class Person {
    private String name;
    private int yearOfBirth;
    private boolean male;

    public Person(String name, int yearOfBirth, boolean male) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.male = male;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    @Override
    public String toString() {
        return name + "$" + yearOfBirth + "$" + male;
    }
    
    
}
