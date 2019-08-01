/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastruct;

/**
 *
 * @author JOSALAZA
 */
public class IntNode {

    public IntNode next;
    public IntNode prev;
    public int value;

    public IntNode(int k) {
        value = k;
        next = null;
        prev = null;
    }

    public void print() {
        String res = "" + this.value;
        IntNode p = next;
        while (p != null) {
            res += "> " + p.value;
            p = p.next;
        }
        System.out.println(res);
    }
}
