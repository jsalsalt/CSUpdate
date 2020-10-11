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
public abstract class JStackGeneric {

    protected int top = -1;
    protected int size = 0;

    protected void push(Object val) {
        //To be implemented depending on the Structure
    }

    protected Object pop() {
        return null;
    }

    protected final boolean isEmpty() {
        return top == -1;
    }

    public String toString() {
        return "------------------\n"
                + "Top: " + top + "| Size: " + size + "|\n";
    }

    public void print() {
        System.out.println(toString());
    }

}
