import javax.swing.*;

public class temperatur {
    public static void main (String[] arg) {
        String s = JOptionPane.showInputDialog("M�ndag?");
        double temp = Double.parseDouble(s);
        double maxtemp = temp;
        s = JOptionPane.showInputDialog("Tisdag?");
        temp = Double.parseDouble(s);
        maxtemp = Math.max(maxtemp, temp);
        s = JOptionPane.showInputDialog("Onsdag?");
        temp = Double.parseDouble(s);
        maxtemp = Math.max(maxtemp, temp);
        s = JOptionPane.showInputDialog("Torsdag?");
        temp = Double.parseDouble(s);
        maxtemp = Math.max(maxtemp, temp);
        s = JOptionPane.showInputDialog("Fredag?");
        temp = Double.parseDouble(s);
        maxtemp = Math.max(maxtemp, temp);
        s = JOptionPane.showInputDialog("L�rdag?");
        temp = Double.parseDouble(s);
        maxtemp = Math.max(maxtemp, temp);
        s = JOptionPane.showInputDialog("S�ndag?");
        temp = Double.parseDouble(s);
        maxtemp = Math.max(maxtemp, temp);
        JOptionPane.showMessageDialog(null, "H�gsta temperatur: " + maxtemp);
    }
}