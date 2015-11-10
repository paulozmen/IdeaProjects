import javax.swing.*;

public class arskort {
    public static void main (String[] arg) {
            String x = JOptionPane.showInputDialog("Pris arskort?");
            double ar= Double.parseDouble(x);
            String a = JOptionPane.showInputDialog("Pris per dag?");
            double dag= Double.parseDouble(a);
            String b = JOptionPane.showInputDialog("Hur manga besok?");
            int ggr= Integer.parseInt(b);
            if (ar<dag*ggr)
                JOptionPane.showMessageDialog(null, "Kop ett arskort! ");
            else
                JOptionPane.showMessageDialog(null, "Kop inte arkort! ");
        }
    }