/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity1.CircularList;

/**
 *
 * @author Vane
 */
public class Node {
    protected int data;
     protected Node next;
     protected Node back;
     
     public Node(int d){
         data = d;
         next = null;
         back = null;
     } 
}
