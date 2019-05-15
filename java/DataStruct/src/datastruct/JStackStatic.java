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
public class JStackStatic extends JStackGeneric {

    private final Object[] structure;

    public JStackStatic(int size) {
        this.size = size;
        this.top = 0;
        this.structure = new Object[size];
    }

    @Override
    protected void push(Object val) {
        top++;
        if (top < size) {
            structure[top] = val;
        }
    }

    @Override
    protected Object pop() {
        if (isEmpty()) {
            return null;
        } else {
            top--;
            return structure[top + 1];
        }
    }
}
