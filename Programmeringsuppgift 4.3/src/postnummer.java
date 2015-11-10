import javax.swing.*;

/**
 * Created by Paul Özmen on 2015-11-03.
 */
public class postnummer {
    public static void main(String[] arg) {

        String in= JOptionPane.showInputDialog("Postnummer");
        String x = in.substring(0,2);/*Plockar ut dom två första tecknen*/
        int s= Integer.parseInt(x);/*Gör om dom 2 första till Integers*/


        if (s >= 20 && s<= 62|| s>= 65 || s<= 66)
                /*Frågar här om siffrorna är mellan 20-62 & 65-66.*/
            JOptionPane.showMessageDialog(null, "Gotaland");
        else if (s >= 80)
                /*Eller om dom är lika med eller mer än 80*/
            JOptionPane.showMessageDialog(null, "Norrland");
        else
            JOptionPane.showMessageDialog(null, "Svealand");

    }
}

