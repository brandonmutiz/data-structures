/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity1.doublelist;

/**
 *
 * @author 
 */
public class Test {
    public static void main(String[] args){
         
         List l = new List();
         l.add(2);
         l.add(3);
         l.add(8);
         l.add(7);
         l.add(5);
         l.add(4);
         l.add(9);
         l.add(10);
                  System.out.print("initial values:");
         l.print();  
         System.out.println("Remueva el primero");
         System.out.println("Lista inicial");
         l.removeFirst();
         l.print();  
         System.out.println("Remueva el ultimo");
         System.out.println("Lista inicial");
         l.removeLast();
         l.print();  
     }    
       
}
