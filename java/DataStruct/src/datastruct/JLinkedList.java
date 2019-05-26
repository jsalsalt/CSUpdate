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

    protected static LNode head = null;

    public boolean isEmpty() {
        return head == null;
    }

    public Object lSearch(Object k) {
        LNode x = head;
        while (x != null || x.value != k) {
            x = x.next;
        }
        return x.value;
    }

    public void lInsert(Object k) {
        LNode x = head;
        if (!isEmpty()) {
            head.prev = new LNode(k);
        }
        head = x;
        x.prev = null;
    }

    public Object lDelete(Object k) {
        LNode x = head;
        while (x != null || x.value == k) {
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
}
