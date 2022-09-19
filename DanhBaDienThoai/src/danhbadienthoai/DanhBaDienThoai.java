/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhbadienthoai;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author Bùi Minh Toàn
 */
public class DanhBaDienThoai {

    /**
     * @param args the command line arguments
     */
    
    static void menu()
    {
        System.out.println("\t\tMENU");
        System.out.println("\t1. Them nguoi moi");
        System.out.println("\t2. Xoa theo ten");
        System.out.println("\t3. Cap nhat SDT");
        System.out.println("\t4. Tim theo ten");
        System.out.println("\t5. Sap xep theo ten");
        System.out.println("\t6. Hien thi");
        System.out.println("\t0. Exit");
        System.out.print("\t\tVui long chon: ");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String chon;
        PhoneBook db = new PhoneBook();
        while (true)
        {
            menu();
            chon = new Scanner(System.in).nextLine();
            int option = Integer.parseInt(chon);
            
            switch (option)
            {
                case 1:
                    System.out.print("\tNhap ten muon them: ");
                    String name = new Scanner(System.in).nextLine();
                    System.out.print("\tNhap sdt: ");
                    String sdt = new Scanner(System.in).nextLine();
                    db.insertPhone(name,sdt);
                    break;
                case 2:
                    System.out.print("\tNhap ten muon xoa: ");
                    String delName = new Scanner(System.in).nextLine();
                    db.removePhone(delName);
                    break;
                case 3:
                    System.out.print("\tNhap ten muon sua: ");
                    String updateName = new Scanner(System.in).nextLine();
                    System.out.print("\tNhap sdt: ");
                    String updateNumber = new Scanner(System.in).nextLine();
                    db.updatePhone(updateName, updateNumber);
                    break;
                case 4:
                    System.out.print("\tNhap ten de tim sdt: ");
                    String findName = new Scanner(System.in).nextLine();
                    db.searchPhone(findName);
                    break;
                case 5:
                    db.sort();
                    System.out.println("\tSap xep xong");
                    break;
                case 6:
                    db.display();
                    break;
                case 0:
                    exit(0);
                default:
                    System.out.println("\tChi nhap 0-6");
            }
        }
    }
    
}
