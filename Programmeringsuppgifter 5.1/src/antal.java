import javax.swing.*;
/**
 * Created by Paul Özmen on 2015-11-06.
 */
public class antal {
    public static void main (String[] arg) {
        double storsta = -1.7e308;   // eller Double.MIN_VALUE
        double minsta  =  1.7e308;   // eller Double.MAX_VALUE

        while (true) {
            String s = JOptionPane.showInputDialog("Skriv ett tal");
            if (s == null)
                break;
            double tal = Double.parseDouble(s);
            storsta = Math.max(storsta, tal);
            minsta  = Math.min(minsta, tal);
        }
        JOptionPane.showMessageDialog(null, "Minsta: " + minsta +
                "\nStorsta: " + storsta);
    }
}
