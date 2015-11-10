import javax.swing.*;

/**
 * Created by Paul Özmen on 2015-11-03.
 */
public class personnr {
    public static void main(String[] arg) {
        String x = JOptionPane.showInputDialog("Personnummer(yy/mm/dd)!");
        String s = JOptionPane.showInputDialog("Personnummer andra personen(yy/mm/day!");
        String s1= x.substring(2,6);
        String s2= s.substring(2,6);
        if (s1.equals(s2))
            JOptionPane.showMessageDialog(null, "Ni fyller ar samma dag");
        else
            JOptionPane.showMessageDialog(null, "Ni fyller inte ar samma dag");
    }
}
