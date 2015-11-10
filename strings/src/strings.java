import java.awt.Toolkit;
import java.util.Calendar;
import javax.swing.*;

public class strings {
    public static void main (String [] arg) {
        String a= "Paul Özmen";
        String b= "Snickaregatan 3A";
        String c= "0707-179504";
        String d= a+"\n"+b+"\n"+c;


        JOptionPane.showMessageDialog(null, d);
    }
}