/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnhanvienghifile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Bùi Minh Toàn
 */
public class PersonNhanVienDocFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<NhanVien> listNV = new ArrayList<>();
        
        try {
            File f = new File("nhanvien.dat");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            
            String str;
            while ((str = br.readLine())!=null)
            {
                String obj[] = str.split("\\$");
                String hoTen = obj[0];
                String ngaySinh = obj[1];
                String diaChi = obj[2];
                boolean gioiTinh = Boolean.parseBoolean(obj[3]);
                String phongBan = obj[4];
                double heSoLuong = Double.parseDouble(obj[5]);
                double thamNien = Double.parseDouble(obj[6]);
                double luongCoBan = Double.parseDouble(obj[7]);
                listNV.add(new NhanVien(phongBan, heSoLuong, thamNien, luongCoBan, hoTen, ngaySinh, diaChi, gioiTinh));
                
            }
            br.close();
            
        } catch (IOException | NumberFormatException e) {
        }
        
        for (NhanVien x: listNV)
        {
            System.out.println(x.toString());
        }
        // TODO code application logic here
    }
    
}
