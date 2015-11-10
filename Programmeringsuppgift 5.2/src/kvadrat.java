import javax.swing.*;
/**
 * Created by Paul Özmen on 2015-11-06.
 */
public class kvadrat {
    public static void main (String[] arg) {
        String tabell = "";
        for (int i=1; i<=12; i++)
            tabell = tabell + i + "   " + i*i + "   " + i*i*i + "\n";
        JOptionPane.showMessageDialog(null, tabell);
    }
}