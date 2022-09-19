/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tudien;

import java.util.Scanner;

/**
 *
 * @author Bùi Minh Toàn
 * 
 * 
 */
public class TuDien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dictionary dict = new Dictionary();
        System.out.println(dict.toString());
        System.out.print("\tNhap tu tieng anh: ");
        String en = new Scanner(System.in).nextLine();
        String vn = dict.findVn(en);
        if (vn!=null)
        {
            System.out.println("\tNghia cua tu "+en+" la: "+vn);
        }
        else
        {
            System.out.println("\tKhong tim duoc tu "+en+" trong tu dien");
        }    
        
    }
    
}
