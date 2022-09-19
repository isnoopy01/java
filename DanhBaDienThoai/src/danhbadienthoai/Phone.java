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
public abstract class Phone {
    public abstract void insertPhone(String name, String number);
    public abstract void removePhone(String name);
    public abstract void updatePhone(String name, String number);
    public abstract void searchPhone(String name);
    public abstract void sort();
}
