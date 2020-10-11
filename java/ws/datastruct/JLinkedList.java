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
public class JLinkedList {

    public LNode head = null;

    public JLinkedList() {
        super();
    }

    public JLinkedList(Object[] o) {
        head = fromArray(o);
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Object lSearch(Object k) {
        LNode x = head;
        while (x != null && x.value != k) {
            x = x.next;
        }
        return x.value;
    }

    public void lInsert(Object k) {
        LNode val = new LNode(k);
        val.next = head;
        if (!isEmpty()) {
            head.prev = val;
        }
        head = val;
        val.prev = null;
    }

    public Object lDelete(Object k) {
        LNode x = head;
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

    public LNode fromArray(Object[] ob) {
        if (ob.length == 0) {
            return null;
        }
        LNode init = new LNode(ob[0]);
        LNode p = init;

        for (int i = 1; i < ob.length; i++) {
            p.next = new LNode(ob[i]);
            p = p.next;
        }
        return init;
    }

    public void print() {
        String ret = "";
        LNode x = head;
        while (x != null) {
            ret += ((x.value != null) ? x.value.toString() : "NIL") + " > ";
            x = x.next;
        }
        System.out.println(ret);
    }
}
