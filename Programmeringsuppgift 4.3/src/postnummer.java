import javax.swing.*;

/**
 * Created by Paul �zmen on 2015-11-03.
 */
public class postnummer {
    public static void main(String[] arg) {

        String in= JOptionPane.showInputDialog("Postnummer");
        String x = in.substring(0,2);/*Plockar ut dom tv� f�rsta tecknen*/
        int s= Integer.parseInt(x);/*G�r om dom 2 f�rsta till Integers*/


        if (s >= 20 && s<= 62|| s>= 65 || s<= 66)
                /*Fr�gar h�r om siffrorna �r mellan 20-62 & 65-66.*/
            JOptionPane.showMessageDialog(null, "Gotaland");
        else if (s >= 80)
                /*Eller om dom �r lika med eller mer �n 80*/
            JOptionPane.showMessageDialog(null, "Norrland");
        else
            JOptionPane.showMessageDialog(null, "Svealand");

    }
}

