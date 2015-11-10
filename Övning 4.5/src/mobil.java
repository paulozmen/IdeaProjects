import javax.swing.*;

/**
 * Created by Paul Özmen on 2015-11-03.
 */
public class mobil {
    public static void main (String[] arg) {
        String x = JOptionPane.showInputDialog("Antal minuter?");
        int min= Integer.parseInt(x);
        int svar = JOptionPane.showConfirmDialog(null, "Dagtid?");
        if (svar==0)

            JOptionPane.showMessageDialog(null, "Total kostnad ink oppningsavgift: "+(2.50*min+0.60) );
        else if (svar == 1)
            JOptionPane.showMessageDialog(null, "Total kostnad kvall: "+(0.55*min+0.60) );

        else {
            JOptionPane.showMessageDialog(null, "Avbruten!");
            System.exit(0);
        }
    }
}

