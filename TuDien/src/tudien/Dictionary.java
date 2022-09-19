/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tudien;

import java.util.ArrayList;

/**
 *
 * @author Bùi Minh Toàn
 */
public class Dictionary {
    ArrayList <Word> list = new ArrayList<>();

    public Dictionary() {
        list.add(new Word(1,"Computer","May tinh"));
        list.add(new Word(2,"Mouse","Chuot"));
        list.add(new Word(3,"Monitor","Man hinh"));
        list.add(new Word(4,"Keyboard","Ban phim"));
        list.add(new Word(5,"Memory","Bo nho"));
        list.add(new Word(6,"White","Mau trang"));
        list.add(new Word(7,"Pen","But bi"));
        list.add(new Word(8,"Pencil","But chi"));
        list.add(new Word(9,"Table","Ban"));
        list.add(new Word(10,"Glasses","Kinh"));
    }
    
    public void add (Word word)
    {
        list.add(word);
    }
    
    @Override
    public String toString(){
        String str = "";
        for (Word x: list){
            str += x.toString();
            str += "\n";
        }
        return str;
    }
    
    public String findEn (String vn)
    {
        for (Word x: list)
        {
            if (vn.equalsIgnoreCase(x.getVn())){
                return x.getEn();
            }
        }
        return null;
    }
    
    public String findVn (String en)
    {
         for (Word x: list)
        {
            if (en.equalsIgnoreCase(x.getEn())){
                return x.getVn();
            }
        }
        return null;
    }
}
