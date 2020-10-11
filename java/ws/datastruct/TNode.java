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
public class TNode {

    protected TNode right = null;
    protected TNode left = null;
    protected TNode parent = null;
    protected int value = Integer.MIN_VALUE;

    public TNode(int val) {
        value = val;
    }
}
