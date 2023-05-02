import java.awt.*;  
import javax.swing.JFrame;  
  
public class App extends Canvas{  
      
    public void paint(Graphics g) {  
        setBackground(Color.BLACK);  
        g.fillRect(130, 30,100, 80);  
        g.drawOval(30,130,50, 60);  
        setForeground(Color.BLUE);  
        g.fillOval(130,130,50, 60);  
        g.drawArc(30, 200, 40,50,90,60);  
        g.fillArc(30, 130, 40,50,180,40);
        g.draw3DRect(30, 300, 90, 50, getFocusTraversalKeysEnabled());
        g.fill3DRect(30, 300, 90, 50, getFocusTraversalKeysEnabled());   
    }  
        public static void main(String[] args) {  
        App m=new App();  
        JFrame f=new JFrame(); 
        f.setTitle("JGraphics Renderer"); 
        f.add(m);  
        f.setSize(400,400);  
        //f.setLayout(null);  
        f.setVisible(true);  
    }  
  
}  
