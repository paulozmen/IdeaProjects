import javax.swing.*;

/**
 * Created by Paul �zmen on 2015-11-03.
 */
public class mobilabb {
    public static void main(String[] arg) {
        String s = JOptionPane.showInputDialog("Antal minuter per manad?");
        int min=Integer.parseInt(s);
        if (min<=33)/*Fr�gar om det �r mindre �n 33 min*/
            JOptionPane.showMessageDialog(null, "Kop ett Kontantkort");
        else if (min<=66)
            JOptionPane.showMessageDialog(null, "Kop ett Normalkort");
        else
            JOptionPane.showMessageDialog(null, "Kop ett Pluskort");
    }

}
