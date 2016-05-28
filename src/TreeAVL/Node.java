/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreeAVL;

/**
 *
 * @author Brandon
 */
public class Node {
    
protected Node root;
    protected int data;
    protected int height;
    protected Node left;
    protected Node right;

    public Node(int d) {
        this.data = d;
        height = 1;
        left = right = null;
    }
    
}
