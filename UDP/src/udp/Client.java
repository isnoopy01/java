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
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author Bùi Minh Toàn
 */
public class Client {
    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
        DatagramSocket dsk = new DatagramSocket();
        
        //Tao dia chi dich
        InetAddress ipAdd = InetAddress.getLocalHost();
        int port = 56789;
        
        while (true)
        {
            //Tao du lieu
            int n = new Scanner(System.in).nextInt();
            byte[] outByte = (n+"").getBytes();

            //Dong goi du lieu
            DatagramPacket outPacket = 
                new DatagramPacket(outByte, outByte.length, ipAdd, port);

            dsk.send(outPacket);
        }
        
    }
}
