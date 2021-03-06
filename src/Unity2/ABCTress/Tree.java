/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unity2.ABCTress;

import java.awt.Graphics;
import java.util.Stack;
import java.util.Vector;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

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
     
     public void printPath(int d) {
       Vector<Node> path = new Vector<Node>();
        Node aux = root;
         while (aux != null) {
             path.add(aux);
             if (d > aux.data) {
                 aux = aux.right;
             } else if (d < aux.data) {
                 aux = aux.left;
             } else {
                 for (int i = 0; i < path.size(); i++) {
                     System.out.println(" " + path.elementAt(i).data);
                 }
                 System.out.println("");
                 return;
             }
         }
         System.out.println("Doesn't exist");
     }
 
     public boolean isLeaf(int d) {
         Node aux = root;
         while (aux != null) {
             if (d > aux.data) {
                 aux = aux.right;
             } else if (d < aux.data) {
                 aux = aux.left;
             } else {
                 if (aux.right == null && aux.left == null) {
                     return true;
                 } else {
                     return false;
                 }
             }
 
         }
         return false;
     }
     
     
     public void print(){
         Node aux=root; 
                 Stack <Node> s  = new Stack <Node>();
                 while (aux!=null){
                     s.push (aux);
                     aux=aux.left;
                     }
                 while(!s.empty()){
                     aux=s.pop();
                     System.out.println(" "+aux.data);
                     aux=aux.right;
                             while(aux!=null){
                                 s.push(aux);
                                 aux=aux.left;
                                  }
                 }
                 System.out.println();
     }
   
    public int count(){
        int count=0;
        Node aux=root; 
                 Stack <Node> s  = new Stack <Node>();
                 while (aux!=null){
                     s.push (aux);
                     aux=aux.left;
                     }
                 while(!s.empty()){
                     aux=s.pop();
                     count++;
                     aux=aux.right;
                             while(aux!=null){
                                 s.push(aux);
                                 aux=aux.left;
                                  }
                 }
                 return count();
                     
    } 
    
      public void printLeafs(){
          Node aux=root; 
                 Stack <Node> s  = new Stack <Node>();
                 while (aux!=null){
                     s.push (aux);
                     aux=aux.left;
                     }
                 while(!s.empty()){
                     aux=s.pop();
                     if(aux.left==null&&aux.right==null){
                                      
                         System.out.println(" "+aux.data);
                     }
                     aux=aux.right;
                             while(aux!=null){
                                 s.push(aux);
                                 aux=aux.left;
                                  }
                 }
                 System.out.println();
          
          
      }
      public int Max(){
          if(root==null)return-1;
          Node aux=root;
          while(aux.right!=null){
              aux=aux.right;
          }
          return aux.data;
      }
      
      public int Min(){
            if(root==null)return-1;
          Node aux=root;
          while(aux.left!=null){
              aux=aux.left;
          }
          return aux.data;
      }
      public void recursivePrint(){
          recursivePrint(root);
          System.out.println();
      }
     private void recursivePrint(Node r){
     recursivePrint(r.left);
         System.out.println( +r.data);
         recursivePrint(r.right);
      }
     
     
     public int recursiveCount(){
       
         return recursiveCount(root);
                 
     }
     
     private int recursiveCount(Node r){
         if(r==null) return 0;
         return recursiveCount(r.left)+            
         recursiveCount(r.right)+1;
         
     }
          public int recursiveSum() {
         return recursiveSum(root);
     } 
     
     private int recursiveSum(Node r){
         if(r == null) return 0;
         return recursiveSum(r.left) + recursiveSum(r.right) + r.data;
     }
     
     public void PreOrderPrint(){        
         PreOrderPrint(root);
         System.out.println();
     }
     
     private void PreOrderPrint(Node r){
         if(r==null) return;
         System.out.println(" " + r.data);
         PreOrderPrint(r.left);
         PreOrderPrint(r.right);
     } 
     
      public void inOrderPrint(){        
         inOrderPrint(root);
         System.out.println();
     }
     
     private void inOrderPrint(Node r){
         if(r==null) return;
         inOrderPrint(r.left);
         System.out.println(" " + r.data);
         inOrderPrint(r.right);
     } 
     
      public void PostOrderPrint(){
         PostOrderPrint(root);
         System.out.println();
     }
     
     private void PostOrderPrint(Node r){
         if(r==null) return;
         PostOrderPrint(r.left);
         PostOrderPrint(r.right);
         System.out.println(" " + r.data);
     } 
     
     public void PrintLeafsR(){
         PrintLeafsR(root);
         System.out.println();
     }
     
     private void PrintLeafsR(Node r){
         if(r==null) return;
         
         PrintLeafsR(r.left);
         if(r.left==null){
          System.out.println(" " + r.data);   
         }
          PrintLeafsR(r.right);
          if(r.right==null){
             System.out.println(" " + r.data);
         }
     }
     
     public int Height (){
         return Height(root);
     }
     private int Height (Node r){
 
         if(r==null) return 0;
 
         return 1;
     }
     
public void rDraw() {
         JFrame f = new JFrame() {
             public void paint(Graphics g) {
                 g.clearRect(0, 0, getWidth(), getHeight());
                 rDraw(root, 20, 40, g);
             }
         };
         f.setSize(600,400);
         f.setVisible(true);
         f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
      
     
     
     class Info {
         int xroot, xfinal;
     }
     
     private Info rDraw(Node r, int x, int y,Graphics g){
         Info rootInfo = new Info();
         rootInfo.xfinal = x;
         if(r == null) {
             return rootInfo;
         }
         Info leftInfo, rightInfo;
         
         leftInfo = rDraw(r.left, x, y+40,g);
         x = leftInfo.xfinal;
         
         g.drawOval(x, y, 30, 30);
         g.drawString("" + r.data, x+10, y+20);
         rootInfo.xroot = x;
         
         rightInfo = rDraw(r.right, x+30, y+40, g);
         rootInfo.xfinal = rightInfo.xfinal;
         
         if(r.left != null) {
             g.drawLine(rootInfo.xroot+5, y+25, leftInfo.xroot+15, y+50);
         }
         
         if(r.right != null) {
             g.drawLine(rootInfo.xroot+25, y+25, rightInfo.xroot+15, y+50);
         }
         return rootInfo;
         
      }
       public boolean isComplete(){
        
       return isComplete(root);
       
       
    }
    
    private boolean isComplete(Node r){
        
       if (r==null) return true;
       if ((r.left==null && r.right != null ) || (r.left!=null && r.right==null)){
           return false;
       }
       
      return isComplete(r.left) && isComplete(r.right);
               
      
    }   
                
     public boolean Exist (int d){
         
         Node aux = root;
         
         while(aux != null){
             if(d==aux.data){
                 
                 return true;
                 
             }else if(d > aux.data){
                 aux=aux.right;
                 
                 }else{
                 aux=aux.left;
             }
             
         }
         return false;
 
         }  
       
           public void invert(){
         invert(root);
                        }
    private void invert (Node r){
        
        if(r==null) return;
        Node aux=r.left;
        invert(r.left);
        invert (r.right);
        r.left=r.right;
        r.right=aux;
                                      
    }
    public void Prune(){
    Prune(root);
    }    
    private void Prune(Node r){
               
       if (r==null) return;
       
        Prune(r.left);
        Prune(r.right);
       
       if (r.left==null && r.right != null )  {
           r.right=null;
           
       }else if (r.left!=null && r.right==null){
           r.left=null;
      }     
       
     }
     
  
    public void Complete(){        
    Complete(root);
       
   }
   private void Complete (Node r){
        
       if (r==null) return;
       
        Complete(r.left);
        Complete(r.right);
       
       if (r.left==null && r.right != null )  {
           
           this.add(r.data-1);
           
       }else if (r.left!=null && r.right==null){
            this.add(r.data+1);
      }
    }
   public void reversePrint(){
   reversePrint(root);
  }
  
  private void reversePrint(Node r){
      
      if(r==null) return;
      
      reversePrint(r.right);
      System.out.println(""+r.data);
      reversePrint(r.left);
  }
  public void printSonsAlone() {

 printSonAlone(root);
  }
  
  private void printSonAlone(Node r){
      
      if(r==null) return;
      
      printSonAlone(r.left);
      printSonAlone(r.right);
      
      if(r.left==null && r.right != null ){
          System.out.println(""+r.right.data);
      }else if (r.left!=null && r.right==null){
          
          System.out.println(""+r.left.data);
      }
  }
  public int countOdds() {
      return countOdds(root);
  }
  
  public void printMissings() {

   printMissings(root); 
    }

   private void printMissings(Node r){
      
              if(r.left != null && r.right == null) {
            for(int i = r.left.data + 1 ; i < r.data; i++) {
                System.out.println(" " + i);
            }
        } else if(r.left == null && r.right != null){
            for(int i = r.data + 1; i < r.right.data; i++) {
                System.out.print(" " + i);
            }
        }
        printMissings(r.left);
        printMissings(r.right);         
            
}
  
  private int countOdds(Node r){
     
      if(r==null) return 0;
      int count=0;
      if(r.data%2==1){
          count++; 
      }
      
      countOdds(r.right);
      countOdds(r.left);
      return count+1;
      
  }
  public void remove(int d){
        Node aux = root,p = null;
        while(aux != null) {
            p = aux;
            if(d > aux.data) {
                aux = aux.right;
            } 
            else if(d < aux.data) {
                aux = aux.left;
            } 
            else {
                if(aux == root) {
                    if(aux.left == null) {
                        root = aux.right;
                    }
                    else {
                        root = aux.left;
                        p = root;
                    }
                    while(p.right != null) {
                        p = p.right;
                    }
                    p.right = aux.right;
                }
                else {
                    if(d < p.data) {
                        if(aux.left == null) {
                            p.left = aux.right;
                        }
                        else {
                            p.left = aux.left;
                            p = p.left;
                            while(p.right != null) {
                                p = p.right;
                            }
                            p.right = aux.right;
                        }
                    }
                    
                }
            }
            return;
        }
    }

}  
     
           