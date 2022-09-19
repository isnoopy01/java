/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingform;

import java.util.Scanner;

/**
 *
 * @author Bùi Minh Toàn
 */
public class JavaSwingForm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FormDangKy reg = new FormDangKy();
        FormDangNhap log = new FormDangNhap();
        log.setLocationRelativeTo(null);
        reg.setLocationRelativeTo(null);
        log.setVisible(true);
        reg.setVisible(true);

        
    }
    
}
