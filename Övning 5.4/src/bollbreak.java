import javax.swing.*;
import java.text.*;


public class bollbreak {
    public static void main(String[] arg) {
        while (true) {
            String s = JOptionPane.showInputDialog(null, "Hur manga meter?");
            if (s == null)
                break;
            double k = Double.parseDouble(s);/*Anger v�rdet i siffror*/
            int x = 0;/*Initieras till 0. Betyder att den b�rjar p� 0*/

            while (k > 0.01) {/*F�r inte vara h�gre �n 1 cm efter alla loopar*/
                k = k * 0.7;/*Tar bort 30% efter varje varv*/
                x = x + 1;/*Plussar varje studs med 1*/
            }
            JOptionPane.showMessageDialog(null, "Bollen studsade " + k + " ganger");
        }
    }
}
