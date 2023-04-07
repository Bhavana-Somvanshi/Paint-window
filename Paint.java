import java.awt.*;  
import java.awt.event.*;  
public class Paint extends MouseMotionAdapter{  
Frame f;
    Paint(){  
        f=new Frame();
        f.addMouseMotionListener(this);  
f.setBackground(Color.GREEN);    
        f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true);  
    }  
public void mouseDragged(MouseEvent e) {  

    Graphics g = f.getGraphics();  
    g.setColor(Color.BLUE);  
    g.fillOval(e.getX(),e.getY(),15,15);  
}  
public void mouseMoved(MouseEvent e) {}  
 
public static void main(String[] args) {  

    new Paint();  
}  
}  
