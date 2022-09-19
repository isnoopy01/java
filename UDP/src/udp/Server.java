/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udp;

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
        
        //Tao socket
        DatagramSocket dsk = new DatagramSocket(56789);
        System.out.println("\tSERVER IS UP");
        
        
        
        while (true)
        {
            //Chuan bi Packet de nhan
            byte[] inByte = new byte[1024];
            DatagramPacket inPacket = new DatagramPacket(inByte, inByte.length);
            
            //Nhan goi tin
            dsk.receive(inPacket);

            InetAddress ipAdd = inPacket.getAddress(); 
            int port = inPacket.getPort();
            String dataReceive = new String (inPacket.getData()).trim();
            System.out.println("\tNhan duoc goi tin "+dataReceive);
            System.out.println("\tDia chi nguoi gui: "+ipAdd);
            System.out.println("\tPort nguoi gui: "+port);
        }
    }
}
