/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity1.grapher;

import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author AULA1
 */
public class Graph extends JComponent{
   private Coordinate head;
   
   public void addCoordinate(int x, int y){
       Coordinate n=new Coordinate (x,y);
       n.next=head;
       if(head!= null)
           head.back=n;
       head=n;
   }
   public void removeLast(){
       if(head==null)return;
       head=head.next;
       if (head!=null)
           head.back=null;
       
   }
           
   public void paint(Graphics g){
      Coordinate aux=head, p=head;
      
      while(aux!=null){
          g.drawLine(p.x, p.y, aux.x, aux.y);
          p=aux;
          aux=aux.next;
      }
   }
}
