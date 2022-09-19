/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileinputoutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Bùi Minh Toàn
 */
public class FileInputOutput {
    static ArrayList <Person> listPerson = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            File f = new File ("listPerson.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String str;
            while ((str = br.readLine())!=null)
            {
               
                String[] obj;
                obj = str.split("\\$");
                
                String name = obj[0];                               // Ten
                int yearOfBirth = Integer.parseInt(obj[1]);         // nam sinh
                boolean male = Boolean.parseBoolean(obj[2]);        // gioi tinh
                listPerson.add(new Person(name,yearOfBirth,male));
                
            }
            br.close();
        } catch (IOException e) {
        }
        
        FormHienThi a = new FormHienThi();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
    }
    
}
