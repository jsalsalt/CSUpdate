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
public class LNode {

    public LNode next = null;
    public LNode prev = null;
    public Object value = null;

    public LNode(Object k) {
        value = k;
    }
}
