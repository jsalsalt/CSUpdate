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
public class IntLinkedList {

    public IntNode head = null;

    public IntLinkedList() {
        super();
    }

    public IntLinkedList(int[] o) {
        head = fromArray(o);
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int lSearch(int k) {
        IntNode x = head;
        while (x != null && x.value != k) {
            x = x.next;
        }
        return x.value;
    }

    public void lInsert(int k) {
        IntNode val = new IntNode(k);
        val.next = head;
        if (!isEmpty()) {
            head.prev = val;
        }
        head = val;
        val.prev = null;
    }

    public int lDelete(int k) {
        IntNode x = head;
        while (x != null && x.value != k) {
            x = x.next;
        }
        if (x.prev != null) {
            x.prev.next = x.next;
        } else {
            head = x.next;
        }
        if (x.next != null) {
            x.next.prev = x.prev;
        }
        return x.value;
    }

    public IntNode fromArray(int[] ob) {
        if (ob.length == 0) {
            return null;
        }
        IntNode init = new IntNode(ob[0]);
        IntNode p = init;

        for (int i = 1; i < ob.length; i++) {
            p.next = new IntNode(ob[i]);
            p = p.next;
        }
        return init;
    }

    public void print() {
        String ret = "";
        IntNode x = head;
        while (x != null) {
            ret += ((x.value != Integer.MIN_VALUE) ? x.value : "NIL") + " > ";
            x = x.next;
        }
        System.out.println(ret);
    }
}
