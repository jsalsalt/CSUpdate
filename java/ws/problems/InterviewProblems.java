/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

import datastruct.IntLinkedList;
import datastruct.IntNode;

/**
 *
 * @author JOSALAZA
 */
public class InterviewProblems {

    public void taskPriority() {

    }

    public int meetingRooms(Object[] o) {
        return 0;
    }

    public void horizontalToVertical(int val) {

        int dig = 0;
        while ((int) (val % Math.pow(10, dig)) != val) {
            dig++;
        }
        dig--;
        int rem = val;
        while (dig > -1) {
            int f = (int) (rem / Math.pow(10, dig));
            rem = (int) (rem % Math.pow(10, dig));
            System.out.println(f);
            dig--;
        }
    }

    public void bucketWeights(int[] arr) {

    }

    public IntNode merge1(IntNode p1, IntNode p2) {
        IntNode res = new IntNode(0);
        IntNode p3 = res;

        while (p1 != null && p2 != null) {
            if (p1.value <= p2.value) {
                p3.next = new IntNode(p1.value);
                p1 = p1.next;
            } else {
                p3.next = new IntNode(p2.value);
                p2 = p2.next;
            }
            p3 = p3.next;
        }

        if (p1 != null) {
            p3.next = p1;
        }
        if (p2 != null) {
            p3.next = p2;
        }

        return res.next;
    }

    public IntNode merge(IntNode headA, IntNode headB) {

        IntNode dummyNode = new IntNode(0);
        IntNode tail = dummyNode;
        while (true) {

            if (headA == null) {
                tail.next = headB;
                break;
            }
            if (headB == null) {
                tail.next = headA;
                break;
            }

            if (headA.value <= headB.value) {
                tail.next = headA;
                headA = headA.next;
            } else {
                tail.next = headB;
                headB = headB.next;
            }
            tail = tail.next;
        }
        return dummyNode.next;
    }

    public static void main(String[] args) {
        InterviewProblems ip = new InterviewProblems();
        IntLinkedList l1 = new IntLinkedList(new int[]{1, 2, 2, 6, 8, 9});
        IntLinkedList l2 = new IntLinkedList(new int[]{1, 4, 5, 8, 10, 12});
        l1.print();
        l2.print();
        ip.merge1(l1.head, l2.head).print();

        ip.horizontalToVertical(123);
        ip.horizontalToVertical(1230);
        ip.horizontalToVertical(1203);
        ip.horizontalToVertical(3);

    }
}
