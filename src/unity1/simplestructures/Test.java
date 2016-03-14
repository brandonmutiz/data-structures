/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity1.simplestructures;

/**
 *
 * @author JORGE ERASO
 */
public class Test {
    public static void testingList(){
        System.out.println("*********Testing List*********");
        List l = new List();
        l.add(52);
        l.add(14);
        l.add(19);
        l.add(45);
        
        l.remove(1);
        System.out.print("Initial Values: ");
        l.print();
        
        int c = l.count();
        
        System.out.println("total Nodes in List:  " + c);
        l.printFirstElement();
        l.printLastElement();
        l.removeIntercalated();
        l.duplicateIntercalated();
        l.removeRecurrents();
        
    }
    
    public static void main (String [ ] args) {
        
        testingList();
        
    }
}
