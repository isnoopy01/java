/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhbadienthoai;

import java.util.ArrayList;

/**
 *
 * @author Bùi Minh Toàn
 */
public class PhoneBook extends Phone{
    ArrayList <User> list = new ArrayList<>();
    
    
    @Override
    public void insertPhone(String name, String number) {
        for (int i=0; i<list.size(); i++){
            if (list.get(i).getName().equalsIgnoreCase(name))
            {
                list.get(i).setNumber(list.get(i).getNumber()+" . "+number);
                System.out.println("\tThem SDT cho nguoi dung "+name+" thanh cong");
                return;
            }
        }
        
        User u = new User(name, number);
        list.add(u);
        System.out.println("\tThem nguoi dung "+name+" thanh cong");
    }

    @Override
    public void removePhone(String name) {
        for (User x: list){
            if (x.getName().equalsIgnoreCase(name)){
                list.remove(x);
                System.out.println("\tXoa thanh cong nguoi dung " + name);
                return;
            }
        }
        System.out.println("\tKhong tim thay ten " + name);
    }

    @Override
    public void updatePhone(String name, String number) {
        for (int i=0; i<list.size(); i++){
            if (list.get(i).getName().equalsIgnoreCase(name))
            {
                list.get(i).setNumber(number);
                System.out.println("\tCap nhat nguoi dung "+name+" thanh cong");
                return;
            }
        }
        System.out.println("\tKhong tim thay ten " + name);
    }

    @Override
    public void searchPhone(String name) {
        for (User x: list){
            if (x.getName().equalsIgnoreCase(name)){
                System.out.println(x.toString());
                return;
            }
        }
        System.out.println("\tKhong tim thay ten " + name);
    }

    @Override
    public void sort() {
        for (int i=0; i<list.size()-1; i++)
        {
            for (int j=i+1; j<list.size(); j++)
            {
                //list[i].name < list[j].name
                if (list.get(i).getName().
                        compareToIgnoreCase(list.get(j).getName())>0)
                {
                    User tmp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, tmp);
                }
            }
        }

    }
    
    public void display()
    {
        for (User x: list)
        {
            System.out.println("\t"+x.toString());
        }
    }
    
}
