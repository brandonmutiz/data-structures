/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unity2.ABCTress;

/**
 *
 * @author Vane
 */
public class Tree {
    private Node root;
   
   public Tree() {
         root = null;
     }
     
     public void add(int d) {
         Node n = new Node(d);
         if(root == null) {
            root = n;
        } else {
            Node aux = root, p = null;
             while(aux != null) {
                 if(d < aux.data) {
                     p = aux;
                     aux = aux.left;
                 } else if(d > aux.data) {
                     p = aux;
                     aux = aux.right;
                 } else {
                     return;
                 }
             }
             if(d < p.data) {
                 p.left = n;
            } else {
                 p.right = n;
             }
         } 
     }

}
