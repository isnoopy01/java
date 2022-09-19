/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classobjectconstructor;

import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Bùi Minh Toàn
 */
public class ClassObjectConstructor {

    /**
     * @param args the command line arguments
     */
    
    public static void menu(){
        System.out.println("\t\tMENU");
        System.out.println("\t1. Them sach");
        System.out.println("\t2. Hien thi sach");
        System.out.println("\t3. Tim sach theo ten");
        System.out.println("\t4. Xoa sach theo ten");
        System.out.println("\t0. Exit");
        System.out.print("\t\tVui long chon: ");
    }
    public static void main(String[] args) {
        ArrayList<Book> listBook = new ArrayList<>();
        int chon;
        int id = 0;
        Scanner input = new Scanner(System.in);
        while (true)
        {
            menu();
            chon = input.nextInt();
            input.nextLine();
            switch (chon)
            {
                case 1:
                    System.out.print("\tNhap ten sach: ");
                    String title = input.nextLine();
                    System.out.print("\tNhap ten tac gia: ");
                    String author = input.nextLine();
                    System.out.print("\tNhap nam xuat ban: ");
                    int publishYear = input.nextInt();
                    input.nextLine();
                    Book bk = new Book(id++,title,author,publishYear);
                    listBook.add(bk);
                    break;
                case 2: 
                    int index = 1;
                    for(Book x: listBook)
                    {
                        x.display(index++);
                    }
                    break;
                case 4:
                    System.out.print("\tNhap ten sach can xoa: ");
                    String delTitle = input.nextLine();
                    boolean deleted = false;
                    for (Book x: listBook)
                    {
                        if (x.getTitle().compareToIgnoreCase(delTitle)==0){
                            listBook.remove(x);
                            deleted = true;
                            break;
                        }
                    }
                    if (!deleted){
                        System.out.println("\tKhong tim thay sach "+delTitle);
                    }
                    else{
                        System.out.println("\tXoa thanh cong");
                    }
                    break;
                case 0:
                    System.out.println("\tBye");
                    exit(0);
            }
        }
        
    }
    
}
