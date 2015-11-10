import javax.swing.*;

public class pi {
    public static void main(String[] arg) {
        String in;
        in = JOptionPane.showInputDialog("Radie");
        double s = Double.parseDouble(in);
        double omkr = 2 * Math.PI * s;
        double area = Math.PI * s * s;

        JOptionPane.showMessageDialog(null, "Omkrets:" + omkr + "\nArea:" + area);
    }
}
