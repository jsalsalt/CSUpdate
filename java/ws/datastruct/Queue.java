/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastruct;

import ds2.Node;

/**
 *
 * @author JOSALAZA
 */
public class Queue {

    Node head;
    Node tail;

    public Queue() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return tail == null;
    }

    public void add(int v) {
        Node n = new Node(v);
        if (isEmpty()) {
            head = tail = n;
            return;
        }
        tail.next = n;
        tail = n;
    }

    public Node remove() {
        if (head == null) {
            return null;
        }

        Node tmp = head;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return tmp;
    }

    public boolean remove(int v) {
        if (head == null) {
            return true;
        } else if (head.value == v) {
            return remove().value == v;
        }
        boolean res = false;
        Node t = head;
        while (t.next != null) {
            if (t.next.value == v) {
                t.next = t.next.next;
            }
            t = t.next;
        }

        if (t != null) {
            tail = t;
        }
        return res;
    }

    public static void main(String args[]) {
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.remove(20);
        q.add(40);
        q.add(50);
        q.remove();
        q.add(60);
        System.out.println(q.remove().value);
    }

}
