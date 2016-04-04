/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity1.doublelist.MineZone;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author Vane
 */
public class Zone extends JFrame{
    protected Mine head;
    protected Mine current;
    public Zone (){
         setTitle("Zona Minada!!");
         setSize(450,350);
         LaunchEvents();
         head=current=null;
         
         
      }
    public void addMine(int x, int y){
        Mine n= new Mine (x,y,this);
        if(head==null){
            head= n;
            
        }else {
            Mine aux=head;
            while(aux.next !=null)
                aux=aux.next;
            aux.next=n;
            n.back=aux;            
            
        }
        current= n;
    }
    public void goForwad(){
        if(current.next!=null){
            current=current.next;
        }
    }
    public void goBack(){
        if(current.back!=null){
            current=current.back;
        }
    }
    public void explode(){
        if(current!=null){
            current.state=true;
        }
    }
    public void paint(Graphics g){
        if(head!=null)return;
        Mine aux=head;
        while(aux!=null){
            aux.paint(g,aux==current);
            aux=aux.next;
        }         
        
    }
     public void LaunchEvents(){
        addWidowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);  
                
            }
            
        });
        addMouseListener(new MouseListener() {

            
            public void mouseClicked(MouseEvent me) {
                addMine(me.getX(),me.getY());
                        repaint();
            }

            
            public void mousePressed(MouseEvent me) {
                
            }

            
            public void mouseReleased(MouseEvent me) {
                
            }

           
            public void mouseEntered(MouseEvent me) {
                
            }

            
            public void mouseExited(MouseEvent me) {
                
            }
        });
            addKeyListener(new KeyListener() {

            
            public void keyTyped(KeyEvent ke) {
                
            }

            
            public void keyPressed(KeyEvent ke) {
               switch(ke.getKeyCode()){
                   case KeyEvent.VK_RIGHT: goForwad(); break;
                    case KeyEvent.VK_LEFT: goForwad(); break;
                       case KeyEvent.VK_ENTER: goForwad(); break;
                          
            }
               repaint();
            }

            
            public void keyReleased(KeyEvent ke) {
                
            }
        });
    }
    public static void main (String args []){
        new Zone();
    }

    private void addWidowListener(WindowAdapter windowAdapter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    

}
