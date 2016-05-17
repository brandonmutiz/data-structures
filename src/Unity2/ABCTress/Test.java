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
public class Test {
    public static void main(String [] args){
         Tree t = new Tree();
         int values[] = {8,4,16,2,6,12,20,1,10,14,13,15};
         for (int i=0; i<values.length; i++){
             t.add(values[i]);
         }
 
         int v=30; 
         System.out.print("Path to" +v+ ":");
         t.printPath(v);
         
         if(t.isLeaf(v)){
             System.out.println(" "+v+ "is a leaf");
         }else{
             System.out.println(" "+v+ "doesn't a leaf");
         }
         System.out.println("recursivePrint");
         t.recursivePrint();
         
         int r=t.recursiveCount();
         System.out.println("Total nodes: " + r);
          System.out.println("Print Leafs");
          
         t.PrintLeafsR();
        System.out.println("");
        System.out.println("HEIGHT");
        System.out.println(""+t.Height());
        System.out.println("");
        System.out.println("Draw Tree");
        t.rDraw();
         System.out.println(""+ t.isComplete());
       
       System.out.println(""+ t.Exist(4));
       System.out.println("PRUEBA DE FALSO");
       System.out.println("");
       System.out.println(""+ t.Exist(50));
       t.invert();
       t.Prune();
       t.Complete();
        
     }

}
