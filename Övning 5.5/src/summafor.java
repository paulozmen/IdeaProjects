import javax.swing.*;
import java.text.*;


public class summafor {
    public static void main(String[] arg){
        String s = JOptionPane.showInputDialog(null, "n?");
        int n = Integer.parseInt(s);
        int summa;
        int k = 1;/*Denna initiering kan även läggars in i for-satsen
        innan eller efter summa med ett kommatecken mellan*/
        for (summa = 0; k <= n ; k = k + 1) /*Här lägger du in (initiering; villkor; ändring)*/
            summa = summa + k;

        JOptionPane.showMessageDialog(null, "Summan blir "+ summa);
    }
}
