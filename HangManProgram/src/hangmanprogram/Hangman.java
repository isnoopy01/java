/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmanprogram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Hangman {
    private String original;
    private String displayStr;
    private int life;
    
    public Hangman ()
    {
        this.original = this.getRandomStringFromFile();
        this.displayStr = "";
        for (int i=0; i<this.original.length(); i++)
        {
            this.displayStr += "_";
        }
        this.life = 5;
    }
    
    public Hangman (String str)
    {
        this.original = str;
        this.displayStr = "";
        for (int i=0; i<this.original.length(); i++)
        {
            this.displayStr += "_";
        }
        this.life = 5;
    }
    
    public String getDisplay()
    {
        return this.displayStr;
    }
    
    public void display()
    {
        System.out.println("Life: "+this.life); 
        for (int i=0; i<displayStr.length();i++)
        {
            System.out.print(displayStr.charAt(i)+" ");
        }
        System.out.println("");
    }
    
    public boolean isExistOriginal(String sub){
        return original.contains(sub);
    }
    
    private boolean isExistDisplay (String sub)
    {
        return displayStr.contains(sub);
    }
    
    public boolean isExistOriginal(char character){
        for (int i=0; i<original.length();i++)
        {
            if (original.charAt(i)==character)
                return true;
        }
        return false;
    }
    
    private boolean isExistDisplay(char character){
        for (int i=0; i<displayStr.length();i++)
        {
            if (displayStr.charAt(i)==character)
                return true;
        }
        return false;
    }


    public void revealDisplayStr (String str)
    {
        char ch = str.charAt(0);
        char[] displayStrArray = displayStr.toCharArray();
        
        for (int i=0; i<original.length(); i++)
        {
            if (original.charAt(i) == ch)
                displayStrArray[i] = ch;
        }
        
        displayStr = String.valueOf(displayStrArray);
    }
    
    public boolean isGuessed(String str)
    {
        if (this.isExistOriginal(str))
        {
            this.revealDisplayStr(str);
            return true;
        }
        else
        {
            this.decreaseLife();
            return false;
        }
    }
    
    public boolean isVictory()
    {
        return this.original.equalsIgnoreCase(this.displayStr);
    }
    
    
    public boolean isGameOver()
    {
        return life<=0;
    }
    
    public void decreaseLife ()
    {
        this.life--;
    }
    
    public boolean isAlreadyGuessed(String str)
    {
        char ch = str.charAt(0);
        if (this.isExistDisplay(ch))
            return true;
        return false;
    }
    
    public boolean isAlreadyGuessed(char ch)
    {
        if (this.isExistDisplay(ch))
            return true;
        return false;
    }
    
    private String getRandomStringFromFile()
    {
        try {
            File f = new File("hangman.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String str = "";
            ArrayList listString = new ArrayList<>();
            
            //Mo file, luu toan bo chuoi vao mang listString
            while ((str = br.readLine())!=null)
            {
                listString.add(str);
            }
            br.close();
            
            //Lay 1 chuoi ngau nhien trong mang listString
            int n = (int) Math.round(Math.random()*(listString.size()-1));
            return listString.get(n).toString();
        } catch (IOException e) {
            System.out.println("Unable to open file");
            return null;
        }
    }
    
}