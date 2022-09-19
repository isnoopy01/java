/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tudiendictionary;

import java.util.Scanner;

/**
 *
 * @author Bùi Minh Toàn
 */
public class TuDienDictionary {

    /**
     * @param args the command line arguments
     */
    
    public static int count = 0;
    public static void main(String[] args) {
        // TODO code application logic here
        Dictionary di = new Dictionary();
        di.display();
        while (true)
        {
            System.out.print("Nhap tu can tim: ");
            String en = new Scanner(System.in).nextLine();
            if (en.equals("!quit"))
            {
                break;
            }
            Word x = di.lookUpWordByEN(en);
            if (x==null)
            {
                System.out.println("Khong tim thay tu "+en);
                System.out.println("Nhap nghia tieng viet cua tu "+en+": ");
                String vn = new Scanner(System.in).nextLine();
                di.addWord(en, vn);
                System.out.println("Them Thanh Cong");
                di.display();
            }
            else
            {
                System.out.println(x.getEn()+" co nghia la: "+x.getVn());
            }
        }
    }
    
}
