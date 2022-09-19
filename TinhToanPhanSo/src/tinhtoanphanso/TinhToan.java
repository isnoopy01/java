/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhtoanphanso;

/**
 *
 * @author Bùi Minh Toàn
 */
public class TinhToan {
    static int UCLN (int a, int b)
    {
        int ucln = a<b?a:b;
        while (true)
        {
            if (a%ucln==0 && b%ucln==0)
                return ucln;
            ucln--;
        }
    }
}
