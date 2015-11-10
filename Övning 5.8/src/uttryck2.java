import javax.swing.*;

public class uttryck2 {
    public static void main (String[] arg) {
        String tabell = "";
        for (double x=-1; x<=1; x=+0.1) {/* Villkoret sätts upp;
        här ska villkoret sluta; varje varv ska plussas med 1*/
            double f = 2*x*x - 5*x + 1;
            tabell = tabell + x + "   " + f + "\n";
        }
        JOptionPane.showMessageDialog(null, tabell);
    }
}