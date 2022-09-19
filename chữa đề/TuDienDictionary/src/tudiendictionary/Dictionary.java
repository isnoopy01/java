/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tudiendictionary;

import java.util.ArrayList;

/**
 *
 * @author Bùi Minh Toàn
 */
public class Dictionary {
    ArrayList<Word> list = new ArrayList<>();

    public Dictionary() {
        list.add(new Word("Pen","But bi"));
        list.add(new Word("Pencil","But chi"));
        list.add(new Word("Chalk","Phan"));
        list.add(new Word("Bottle","Binh"));
        list.add(new Word("Computer","May tinh"));
        list.add(new Word("Screen","Man hinh"));
        list.add(new Word("Keyboard","Ban phim"));
        list.add(new Word("Table","Ban"));
        list.add(new Word("Mouse","Chuot"));
        this.sortAscending();
    }
    
    void sortAscending()
    {
        if (list.size()>1)
        {
            for (int i=0; i<list.size()-1; i++)
            {
                for (int j=i+1; j<list.size();j++)
                {
                    if (list.get(i).getEn().toLowerCase()
                            .compareTo(list.get(j).getEn().toLowerCase())>0)
                    {
                        Word tmp = list.get(i);
                        list.set(i, list.get(j));
                        list.set(j, tmp);
                    }
                }
            }
        }
    }
    
    public void display()
    {
        for (Word x: list)
        {
            System.out.println(x.toString());
        }
    }
    
    private Word getWordBinarySearch(int left, int right, String en)
    {
        if (left > right){
            return null;
        }
        
        int mid = (left + right)/2;
        
        if (list.get(mid).getEn().toLowerCase().
                compareTo(en.toLowerCase())==0)
        {
            return list.get(mid);
        }
        else if (list.get(mid).getEn().toLowerCase().
                compareTo(en.toLowerCase())<0)
        {
            return getWordBinarySearch(mid+1,right,en);
        }
        else
        {
            return getWordBinarySearch(left,mid-1,en);
        }
    }
    
    public Word lookUpWordByEN (String en)
    {
        return getWordBinarySearch(0, list.size()-1, en);
    }
    
    public void addWord (String en, String vn)
    {
        list.add(new Word(en,vn));
        this.sortAscending();
    }
}
