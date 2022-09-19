/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import java.util.ArrayList;

/**
 *
 * @author Bùi Minh Toàn
 */
public class UserList {
    ArrayList<User> users = new ArrayList<>();

    public UserList() {
        users.add(new User("admin","admin"));
        users.add(new User("ad","1234"));
        users.add(new User("mod","4321"));
        users.add(new User("root","password"));
    }
    
    public boolean contain (User x)
    {
        String pass = this.getPassword(x.getuName());
        if (pass!= null)
        {
            return pass.equalsIgnoreCase(x.getuPass());
        }
        return false;
    }
    
    public boolean contain (String name)
    {
        for (User x: users)
        {
            if (x.getuName().equalsIgnoreCase(name))
            {
                return true;
            }
        }
        return false;
    }
    
    private String getPassword(String uName)
    {
        for (User x: users)
        {
            if (x.getuName().equalsIgnoreCase(uName))
            {
                return x.getuPass();
            }
        }
        return null;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
    
    @Override
    public String toString()
    {
        String result = "";
        for(User x: users)
        {
            result += x.toString()+"\n";
        }
        return result;
        
    }
    
    
}
