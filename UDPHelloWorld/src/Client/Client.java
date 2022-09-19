/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author Bùi Minh Toàn
 */
public class Client {
    
    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
        DatagramSocket dsk = new DatagramSocket();
        
        InetAddress ip = InetAddress.getByName("localhost");
        int port = 56789;
        while (true)
        {
            System.out.print("\tUsername: ");
            String message = new Scanner(System.in).nextLine();
            System.out.print("\tPassword: ");
            message += "$"+new Scanner(System.in).nextLine();
            byte[] outByte = message.getBytes();

            DatagramPacket outPacket = 
                    new DatagramPacket(outByte, outByte.length, ip, port);
            dsk.send(outPacket);

            byte[] inByte = new byte[1024];
            DatagramPacket inPacket = new DatagramPacket(inByte, inByte.length);
            dsk.receive(inPacket);
            String result = new String (inPacket.getData()).trim();
            String[] resultArr = result.split("\\$");
            System.out.println(resultArr[1]);
            if (resultArr[0].equals("1"))
            {
                return;
            }
        }
    }
}
