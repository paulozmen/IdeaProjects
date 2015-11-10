import javax.swing.*;

public class skottar {
    public static void main (String[] arg) {
        String x = JOptionPane.showInputDialog("Skriv in ar?");
        int year= Integer.parseInt(x);
        if ((year % 4 == 0 && year % 100 != 0)|| year % 400 == 0)/*If satsen frågar om 4 är jämt delbart(%)
        med årtalet och resten är lika med 0. Om 100 inte är lika med 0 så är årtalet inte jämnt delbart 100.
        Deluttrycket (ar % 4 == 0 && ar % 100 != 0) är för årtal som är jämnt delbara med 4 men inte 100.
        För att ett år ska vara ett skottår måste deluttrycket vara sant eller så måste året vara
        delbart med 400.(|| ar % 400 = 0)*/

            JOptionPane.showMessageDialog(null, "Skottar" );
        else
            JOptionPane.showMessageDialog(null, "Inte skottar");
    }
}