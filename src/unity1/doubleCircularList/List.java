/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity1.doubleCircularList;

/**
 *
 * @author Vane
 */
public class List {
    private Node head;
    public List(){
        head = null;
    }
    public void add(int d){
      Node n = new Node(d);
        if(head == null){
            head = n; 
        }else{
            n.next = head;
            n.back = head.back;
            head.back.next = n;
             head.back = n;
         }
         
    }
     
     public void moveFirstToEnd(){
        if (head == null) {
             return;
         }
         head = head.next;
     }
     
     public void moveLastToBeginning(){
         if (head == null) {
             return;
         }
 
         head = head.back;
         
     }
     
     public void print(){
         if(head == null)return;
         Node aux = head;
         do{
             System.out.println(" "+aux.data);
             aux = aux.next;
         }
         while(aux != head);
         System.out.println("");
     }
     
     public void remove(int index){
         if (head == null) {
             return;
         }
 
         if (head.next == head) {
             head = null;
         } else {
             Node aux = head;
             
             for(int i=0;i<index;i++) {
                 aux = aux.next;
             }
             
            aux.back.next = aux.next;
            aux.next.back = aux.back;
         }
     }
     
     public void invert(){
          if (head == null) {
             return;
         }
         Node aux = head.back;
 
         do {
             aux = aux.back;
             aux.next = aux;    
                          
             aux = aux.back;
         } while (aux != head.back);
         
     }

}
