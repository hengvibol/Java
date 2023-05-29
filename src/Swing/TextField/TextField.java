package Swing.TextField;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TextField extends JTextField{
    
    private final Animator animator;
    private boolean animateHinText = true;
    private float location;
    private boolean show;
    private boolean mouseOver = false;
    private String labelText = "Label";
    private Color linaColor = new Color(2, 255, 216);
    
    public TextField() {
        
        setBorder(new EmptyBorder(20, 3, 10, 3));
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                mouseOver=true; 
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                mouseOver=false; 
                repaint();
            }
            
        });
        addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                
            }

            @Override
            public void focusLost(FocusEvent e) {
                
            }
            
            
        });
//        TimingTarget target = new TimingTargetAdapter(){
//            
//        }
//        animator = new Animator(300,target);
//        animator.setResolution(0);
//        animator.setAcceleration(0.5f);
//        animator.setDeceleration(0.5f);
        animator= null;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 =(Graphics2D)g;
       g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
       g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
       int height = getHeight();
       int width = getWidth();
       if(mouseOver){
           g2.setColor(linaColor);
       }else{
           g2.setColor(new Color(150,150, 150));
       }
       g2.fillOval(2, height-1, width-4, 1);
       g2.dispose();
        
    }
    class Animator {
    
}
    
}
