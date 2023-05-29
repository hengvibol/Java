
package java_introduction;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Dialong_Box_02 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("InputDialog Example #1");
        int x;
        int y;
        int sum;
        x=Integer.parseInt(JOptionPane.showInputDialog(frame,"Input X = ")); 
        y=Integer.parseInt(JOptionPane.showInputDialog(frame,"Input y = "));
        sum=x+y;
        JOptionPane.showMessageDialog(null,"sum is = "+sum,"sum of two Integers",JOptionPane.PLAIN_MESSAGE);
    }
    
}
