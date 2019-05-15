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
public class JQueueStatic extends JQueueGeneric {

    private Object[] structure;

    public JQueueStatic(int size) {
        structure = new Object[size];
        size = size;
        head = 0;
        tail = 0;
    }

    protected void in(Object val) {
        structure[tail] = val;
        if (tail == (size - 1)) {
            tail = 0;
        } else {
            tail++;
        }
    }

    protected Object out() {
        Object ret = structure[head];
        if (head == (size - 1)) {
            head = 0;
        } else {
            head++;
        }
        return ret;
    }
}
