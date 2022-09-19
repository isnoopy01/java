/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import Common.User;
import Common.UserList;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 *
 * @author Bùi Minh Toàn
 */
public class Server {
    
    
    public static void main(String[] args) throws SocketException, IOException {
        UserList users = new UserList();
        DatagramSocket dsk = new DatagramSocket(56789);
        System.out.println("\tSERVER IS READY");
        
        while (true)
        {
            byte[] inByte = new byte[1024];
            DatagramPacket inPacket = new DatagramPacket(inByte, inByte.length);
            dsk.receive(inPacket);

            InetAddress ipSender = inPacket.getAddress();
            int portSender = inPacket.getPort();
            String strData = new String (inPacket.getData()).trim();
            System.out.println(strData);
            String[] strTmp = strData.split("\\$");
            String uName = strTmp[0].trim();
            String uPass = strTmp[1].trim();
            System.out.println("\tClient send: User "+uName+", Password: "+uPass);
            String response = "";
            if (users.contain(new User(uName,uPass)))
            {
                response += "1$";
                response += "Welcome to server";
            }
            else
            {
                response += "2$";
                response += "Wrong username or password";
            }
            byte[] outByte = response.getBytes();
            DatagramPacket outPacket = 
                    new DatagramPacket(outByte, outByte.length, ipSender, portSender);
            dsk.send(outPacket);
        }
    }
}
