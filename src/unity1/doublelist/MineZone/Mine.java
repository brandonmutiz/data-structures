/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity1.doublelist.MineZone;

import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author Vane
 */
public class Mine {
    protected int x;
    protected int y;
    protected boolean state;
    protected Mine next, back ;
    protected Zone z;   
    
    public Mine (int posx,int posy,Zone zone){
        x=posx;
        y=posy;
        state=false;
        next=null;
        back= null;
        z= zone ;
        
    }
    public void paint(Graphics g, boolean current){
        Image image;
        
    }
    
}
