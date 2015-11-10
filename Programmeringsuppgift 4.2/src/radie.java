import javax.swing.*;

/**
 * Created by Paul Özmen on 2015-11-03.
 */
public class radie {
    public static void main(String[] arg) {
        String in= JOptionPane.showInputDialog("Radie?");
        double s = Double.parseDouble(in);
        double omkr = 2 * Math.PI * s;
        double area = Math.PI * s * s;
        if (s>0)
            JOptionPane.showMessageDialog(null, "Omkrets:" + omkr + "\nArea:" + area);
        else {

            JOptionPane.showMessageDialog(null, "ERROR");
            System.exit(0);
        }
    }
}


