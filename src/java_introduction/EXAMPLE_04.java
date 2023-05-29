package java_introduction;

import javax.swing.JOptionPane;

public class EXAMPLE_04 {
    public static void main(String[] args) {
        String start, middle,end,result;
        
            start = "Talk  is cheap.";
            middle ="Show me the code.";
            end = "Linus Toevalds";
            result=start+middle+end;
            JOptionPane.showMessageDialog(null, result);
    }
}
