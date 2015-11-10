/**
 * Created by Paul Özmen on 2015-10-29.
 */
import java.awt.Toolkit;
        import java.util.Calendar;
        import javax.swing.*;

public class programsprak {
    public static void main (String [] arg) {
        String a= "Programsprak";
        String b= a.substring(4, 8);
        String c= b+a.charAt(5);
        JOptionPane.showMessageDialog(null, c);
    }
}
