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
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p = new Person("Nguyen Quang Huy", "2001", true);
        System.out.println(p.getDetail());
        Student s = new Student("Nguyen Thanh Hai","2001",true, 5.5, "ACT");
        System.out.println(s.getDetail());
    }
    
}
