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
public class Test {
    public static void main(String args[]){
        List l = new List();
         l.add(2);
         l.add(4);
         l.add(6);
         l.add(8);
         l.add(10);
         l.add(12);
         l.remove(3);
         l.invert();
         l.print();
         
         
     }
}
