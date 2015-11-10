import javax.swing.*;
/**
 * Created by Paul Özmen on 2015-11-06.
 */
public class multitabell {
    public static void main (String[] arg){
        String s =JOptionPane.showInputDialog(null, "Tabell!");
        int n = Integer.parseInt(s);
        String txt = "";
        for ( int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++)
                txt = txt + i*j + " ";
            txt = txt + "\n";
        }


        JOptionPane.showMessageDialog(null, txt);
    }

}