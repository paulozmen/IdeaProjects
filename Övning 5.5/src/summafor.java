import javax.swing.*;
import java.text.*;


public class summafor {
    public static void main(String[] arg){
        String s = JOptionPane.showInputDialog(null, "n?");
        int n = Integer.parseInt(s);
        int summa;
        int k = 1;/*Denna initiering kan �ven l�ggars in i for-satsen
        innan eller efter summa med ett kommatecken mellan*/
        for (summa = 0; k <= n ; k = k + 1) /*H�r l�gger du in (initiering; villkor; �ndring)*/
            summa = summa + k;

        JOptionPane.showMessageDialog(null, "Summan blir "+ summa);
    }
}
