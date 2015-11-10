import javax.swing.*;

/**
 * Created by Paul Özmen on 2015-11-03.
 */
public class brev {
    public static void main (String[] arg) {
        String s = JOptionPane.showInputDialog("Langd (mm)?");
        int l = Integer.parseInt(s);
        s = JOptionPane.showInputDialog("Bredd (mm)?");
        int b = Integer.parseInt(s);
        s = JOptionPane.showInputDialog("Tjocklek (mm)?");
        int t = Integer.parseInt(s);
        if (l >= 140 && l <= 600 && b >= 90 && t <= 100 && b+l+t <= 900)
            JOptionPane.showMessageDialog(null, "Matten OK!" );
        else
            JOptionPane.showMessageDialog(null, "Felaktiga matt!");
    }
}