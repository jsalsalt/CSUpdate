/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

/**
 *
 * @author JOSALAZA
 */
public class HoriToVertical {

    void htv(int val) {
        int dig = 0;
        while ((int) (val % Math.pow(10, dig)) != val) {
            dig++;
        }
        dig--;
        int rem = val;
        while (dig > -1) {
            int f = (int) (rem / Math.pow(10, dig));
            rem = (int) (rem % Math.pow(10, dig));
            System.out.println(f);
            dig--;
        }

    }

    public static void main(String[] args) {
        HoriToVertical x = new HoriToVertical();
        x.htv(123);
        x.htv(1230);
        x.htv(1203);
        x.htv(3);

    }

}
