/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classobjectconstructor;

/**
 *
 * @author Bùi Minh Toàn
 */
public class Book {
    private int id;
    private String title;
    private String author;
    private int publishYear;
    
    public Book(){
        
    }
    
    public Book(int id, String title, String author, int publishYear){
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
    }
    
    public String getTitle (){
        return this.title;
    }
    
    public String getAuthor(){
        return this.author;
    }
    
    public int getPublishYear(){
        return this.publishYear;
    }
    
    public void setTitle (String title){
        this.title = title;
    }
    
    public void setAuthor (String author){
        this.author = author;
    }
    
    public void setPublishYear (int publishYear){
        this.publishYear = publishYear;
    }
    
    public void display (){
        System.out.println("\tTitle: " + this.title);
        System.out.println("\tAuthor: " + this.author);
        System.out.println("\tPublish year: " + this.publishYear);
    }
    
    public void display (int index){
        System.out.printf("\t%4d%25s%25s%8d\n",index,this.title,this.author,this.publishYear);
    }
    
    @Override
    public String toString(){
        return "Title: "+title+", Author: "+author+", Publish year: "+publishYear;
    }
}
