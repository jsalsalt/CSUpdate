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
public class TreeMain {

    public static void main(String args[]) {
        JBST tree = new JBST();

        tree.insert(12);
        tree.insert(2);
        tree.insert(5);
        tree.insert(18);
        tree.insert(17);
        tree.print();

        tree.insert(3);
        tree.insert(45);
        tree.print();
        TNode del = tree.contains(tree.root, 18);
        tree.delete(del);
        tree.print();

        System.out.println(tree.rmin(tree.root));
        System.out.println(tree.min(tree.root).value);
        System.out.println(tree.max(tree.root).value);
        System.out.println(tree.succ(tree.root).value);

    }
}
