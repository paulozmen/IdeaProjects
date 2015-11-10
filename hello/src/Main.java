import java.awt.Toolkit;
import java.util.Calendar;
import javax.swing.*;

public class Main {
    public static void main (String [] arg) {
        String a= "Erik Andersson 860314-2714";
        a=a.trim();
        int i= a.lastIndexOf(' ')+1;
        int j= a.indexOf('-');
        String b=a.substring(i, j);
        String c;
        c = b.substring(2,4);
        String d;
        d = b.substring(4, 6);

        JOptionPane.showMessageDialog(null, d+"/"+c);
    }
}