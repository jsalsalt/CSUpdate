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
public class JBST {

    public TNode root;

    public String inOrder(TNode node) {
        String val = "";
        if (node.left != null) {
            val += ", " + inOrder(node.left);
        }

        val += ", " + node.value;

        if (node.right != null) {
            val += ", " + inOrder(node.right);
        }
        return val;
    }

    public TNode contains(TNode node, int k) {
        if (node == null || node.value == k) {
            return node;
        }
        if (k < node.value) {
            return contains(node.left, k);
        } else {
            return contains(node.right, k);
        }
    }

    public TNode min(TNode n) {
        while (n.left != null) {
            n = n.left;
        }
        return n;
    }

    public TNode max(TNode n) {;
        while (n.right != null) {
            n = n.right;
        }
        return n;
    }

    public TNode succ(TNode x) {
        if (x.right != null) {
            return min(x.right);
        }
        TNode y = x.parent;
        while (y != null && x == y.right) {
            x = y;
            y = y.parent;
        }
        return y;
    }

    public int rmin(TNode n) {
        if (n.left == null) {
            return n.value;
        }
        return rmin(n.left);
    }

    public void insert(int val) {
        TNode y = null;
        TNode x = root;
        TNode z = new TNode(val);

        while (x != null) {
            y = x;
            if (z.value < x.value) {
                x = x.left;
            } else {
                x = x.right;
            }
        }

        z.parent = y;
        if (y == null) {
            root = z;
        } else if (z.value < y.value) {
            y.left = z;
        } else {
            y.right = z;
        }
    }

    public void transplant(TNode u, TNode v) {
        if (root == u) {
            root = v;
        } else if (u == u.parent.left) {
            u.parent.left = v;
        } else {
            u.parent.right = v;
        }
        if (v != null) {
            v.parent = u.parent;
        }
    }

    public void delete(TNode z) {
        if (z.left == null) {
            transplant(z, z.right);
        } else if (z.right == null) {
            transplant(z, z.left);
        } else {
            TNode y = min(z.right);
            if (y.parent != z) {
                transplant(y, y.right);
                y.right = z.right;
                y.right.parent = y;
            }
            transplant(z, y);
            y.left = z.left;
            y.left.parent = y;

        }
    }

    public void print() {
        System.out.println(inOrder(root));
    }
}
