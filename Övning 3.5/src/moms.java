import javax.swing.*;

public class moms {
    public static void main(String[] arg) {
        String x = JOptionPane.showInputDialog(("Pris?( Inklusive moms"));/*Mata in varans pris*/
        double pris=Double.parseDouble(x);/*R�knar ut priset som skrivs in*/
        String s = JOptionPane.showInputDialog("Momssats");/*Skriv in momssatsen*/
        int procent= Integer.parseInt(s);/*R�knar ut momssatsen som skrivs in*/
        double exkl= pris/ (1+0.01* procent);/*R�knar ut vad priset blir ex moms*/
        double moms= pris-exkl;/*Tar bort momsen fr�n priset*/

        JOptionPane.showMessageDialog(null, "Pris (exkl. moms): " + exkl +
                "\nMoms: " + moms);
    }
}
