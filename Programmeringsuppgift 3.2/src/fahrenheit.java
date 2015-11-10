
import javax.swing.*;

public class fahrenheit {
    public static void main(String[] arg) {
        String indata = JOptionPane.showInputDialog("Temperatur i Fahrenheit?");
        double f = Double.parseDouble(indata);
        double celsius = (f-32)*5/9;
        JOptionPane.showMessageDialog(null, "Grader i celsius " + celsius );
    }
}