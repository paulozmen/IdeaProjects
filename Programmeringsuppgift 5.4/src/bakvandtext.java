import javax.swing.*;

/**
 * Created by Paul Özmen on 2015-11-06.
 */
public class bakvandtext {
    public static void main (String[] arg) {
        String s = JOptionPane.showInputDialog("Skriv en text?");
        String t = "";
        for (int i= s.length()-1; i >= 0; i--)

            t = t + s.charAt(i);


        JOptionPane.showMessageDialog(null, t);
    }
}