import java.util.Calendar;
import javax.swing.*;

public class literaler2 {
    public static void main (String [] arg) {
        String x = JOptionPane.showInputDialog("Tid (i sekunder)?");
        int tid = Integer.parseInt(x);
        int tim = tid / 3600;
        tid = tid % 3600;
        int min = tid / 60;
        tid = tid % 60;
        int sek = tid;

        JOptionPane.showMessageDialog(null, tim + ":" + min + ":" + sek);
    }
}