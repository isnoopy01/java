/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmanprogram;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class HangManProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //1. Tao 1 chuoi chinh la chuoi can doan
        Hangman h = new Hangman();
            
       
        //2. Hien thi chuoi theo dang _ 
        while (true)
        {
            h.display();    
            if (h.isGameOver()) 
            {
                System.out.println("Het mang. Game over");
                exit(0);
            }
            if (h.isVictory())
            {
                System.out.println("Ban da doan dung");
                exit(0);
            }
        //3. Nguoi dung nhap 1 ki tu de doan
            String str;
            while (true)
            {
                str = new Scanner(System.in).nextLine();
                if (h.isAlreadyGuessed(str))
                {
                    System.out.println("Ban da doan tu "+str+" roi");
                }
                else
                    break;
            }
            h.isGuessed(str);
        }     
    }
    
}