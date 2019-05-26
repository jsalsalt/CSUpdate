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
public abstract class JQueueGeneric {

    protected int size = 0;
    protected int head = 0;
    protected int tail = 0;

    protected boolean isEmpty() {
        return head == tail;
    }

    protected void in(Object val) {

    }

    protected Object out() {
        return null;
    }

    public String toString() {
        return "------------------\n"
                + "Head: " + head + "| Tail: " + tail + "| Size: " + size + "|\n";
    }

    public void print() {
        System.out.println(toString());
    }

}
