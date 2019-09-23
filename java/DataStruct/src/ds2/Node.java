/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2;

/**
 *
 * @author JOSALAZA
 */
public class Node {

    public Node next = null;
    public int value;

    public Node(int n) {
        value = n;
    }

    public void insertEnd(int n) {
        Node tail = new Node(n);
        Node p = this;
        while (p.next != null) {
            p = p.next;
        }
        p.next = tail;
    }

    public Node delete(Node head, int n) {
        Node p = head;
        if (p.value == n) {
            return head.next;
        }

        while (p.next != null) {
            if (p.next.value == n) {
                p.next = p.next.next;
                return head;
            }
            p = p.next;
        }
        return head;
    }
}
