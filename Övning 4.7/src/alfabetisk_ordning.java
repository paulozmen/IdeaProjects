import javax.swing.*;
import java.text.*;

/**
 * Created by Paul Özmen on 2015-11-03.
 */
public class alfabetisk_ordning {
    public static void main (String[] arg) {
        String x = JOptionPane.showInputDialog("Skriv in ditt namn(efternamn, fornamn.");
        String s = JOptionPane.showInputDialog("Skriv in ditt namn(efternamn, fornamn.");
        Collator col=Collator.getInstance();
        col.setStrength(Collator.PRIMARY);
        if (col.compare(x,s)<0)
            JOptionPane.showMessageDialog(null, x+" kommer fore "+s );
        else if (col.compare(x,s)>0)
            JOptionPane.showMessageDialog(null, s+" kommer fore "+x );
        else
            JOptionPane.showMessageDialog(null, x+" ar lika med "+s );
    }
}

