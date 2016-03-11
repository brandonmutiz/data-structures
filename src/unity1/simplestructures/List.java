                                                                  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity1.simplestructures;

/**
 *
 * @author 
 */
public class List {
    private Node head;
    
    List(){
        head = null;
    }
    
    public void add(int d){
        Node n = new Node(d);
        if(head == null){
            head = n;
        }
        else{
            Node aux = head;
            while(aux.next != null){
                aux = aux.next;
            }
            aux.next = n;
        }
    }
    
    
    
    public int count(){
        int count = 0;
        Node aux = head;
        
        while(aux != null){
            count++;
            aux = aux.next;
        }
        
        return count;
    }
    
    public void printFirstElement(){
        Node aux = head;
        if(aux == null){
            System.out.println(-1);
        }
        else{
            System.out.println(aux.data);
        }
    }
    
    public void printLastElement(){
            Node aux = head;
            while(aux.next != null){
                aux = aux.next;
            }
            int elem = aux.data;
            System.out.println(elem);
        
    }
    
    
    public void print(){
        Node aux = head;
        
        while(aux != null){
            System.out.print(" " + aux.data);
            aux = aux.next;
        }
        
        System.out.println();
    }
    
    public int remove(int index){
        if(head == null){return -1;}
            if(index == 0){
                head = head.next;
                return 0;
            }

            Node aux = head;
            Node p = null;
            int counter = 0;
            for(counter = 0; counter < index && aux != null; counter++){
                p = aux;
                aux = aux.next;
            }
            
            if(aux != null){
                p.next = aux.next;
            }
            return aux.data;
    }
    
    public void removeFirstElement(){
        if(head != null){
            head = head.next;
        }
    }
    
    public void removeLastElement(){
        if(head != null){
            Node aux = head;
            Node p = null;
            if(head.next == null){
                head = head.next;
            }
            else{
                while(aux.next != null){
                    p = aux;
                    aux = aux.next;
                }
                p.next = aux.next;
            }
        }
    }
    public void duplicate(){
        if (head==null) return;
        Node last = head,aux=head;
        while(last.next!=null){
            last=last.next;
        }
       int c= count();
       for(int i=0; i<c; i++){
           last.next=new Node(aux.data);
           aux=aux.next;
           last=last.next;
       }
    }
    
    public void reversprint (){
        if(head==null)return;
        if(head == null) return;
        Node ok = null;
        Node aux;
            do {            
            aux = head;
            while(aux.next != ok){
            aux = aux.next;
                  }
            System.out.print("  " + aux.data);
                       ok = aux;
        } while (ok != head);
         System.out.println();
    }


      
       public void invert (){
         if(head == null) return;
       Node aux = head,head2=null;
       while(head!=null){
           aux=head;
           head=head.next;
           aux.next=head2;
           head2=aux;
       }
           head=head2;
       }
       ///EVALUACION
       
       
       public void inserZeros(){
           if(head==null)return;
           Node aux = head;
            Node P= head;
            while(aux.next!= null){
                Node n= new Node (0);
                aux=aux.next;
               P.next= n;
                n.next=aux;
                P=aux;
                
            }
                         
        
           
       }
       
    public void removeMiddle(){
       Node aux = head;
       Node P= head;
               if(head==null)return;
               int c= count();
        for(int i=0; i<c; i++){
             
        }
                        aux= head;
           while(aux.next!=null){
           aux=aux.next;
            c ++; 
              P.next=aux.next;
              
        
                       
        }
        
        
    }
    
    public void countOdds(){
        if(head==null)return;
        Node aux= head;
        Node n= head;
        int c= count(); 
         while(aux.next!=null){
            aux=aux.next;
            c ++;
            for(int i=0; i<c; i++){ //voy
            
                
                
            
        
        }
    }
  }
    public void removeIntercalated(){
    if(head==null)return;
        Node aux = head;
           Node P= head;
        int c= count(); 
    
    for(int i= 0; i<c; i++){
        if(i % 2 == 1){
         P.next=aux.next;
         P=aux;
          aux=aux.next;
          } else 
            aux=aux.next;
        }
        
    }
    public void duplicateIntercalated(){
        Node P= head;
        Node aux = head;
        while(aux.next!= null){
        Node n =new Node (P.data);
        P.next=n;
        aux=aux.next;
        n.next=aux;
        P=aux;
              
    }
    }
    public void removeRecurrents(){
        Node back= head;
        back=head;
        Node P= head; 
        Node aux = head;
        while(aux.next!= null){
            P= head;
           while( P!=aux){
               if(P.data==aux.data){
                   back.next=aux.next;
                   
               }
               P=P.next;
           }
           back=aux;
           aux=aux.next;
        }
    }
    }

            




