import javax.swing.*;
/**
 * Created by Paul Özmen on 2015-11-06.
 */
public class plustecken {
    public static void main (String[] arg){
        String s =JOptionPane.showInputDialog(null, "Antal rader?");
        int n = Integer.parseInt(s);
        String txt = "";
        for ( int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++)
                txt = txt + "+";
            txt = txt + "\n";
        }


        JOptionPane.showMessageDialog(null, txt);
    }

}
