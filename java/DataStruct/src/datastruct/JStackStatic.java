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
        this.top = -1;
        this.structure = new Object[size];
    }

    @Override
    protected void push(Object val) {
        if (top < size) {
            top++;
            structure[top] = val;
        }
    }

    @Override
    protected Object pop() {
        if (isEmpty()) {
            return null;
        } else {
            top--;
            Object ret = structure[top + 1];
            structure[top + 1] = null;
            return ret;
        }
    }

    private String strutToString() {
        String x = "";
        for (Object t : structure) {
            String text = "NIL";
            if (t != null) {
                text = t.toString();
            }
            x += text + ", ";
        }
        return x;
    }

    @Override
    public String toString() {
        return "------------------\n"
                + "Top: " + top + "| Size: " + size + "|\n"
                + strutToString();
    }
}
