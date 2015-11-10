import javax.swing.*;
import java.text.*;


public class blank {
    public static void main(String[] arg){
        String s = JOptionPane.showInputDialog(null, "Skriv in en text?");
        int i;
        for ( i = s.length()-1 ; i >= 0 ; i = i - 1)
            if (s.charAt(i) == ' ' || s.charAt(i) == '\t')
                break;
        if ( i >= 0)
        JOptionPane.showMessageDialog(null, "Sista vita tecknet "+ i);
        else
            JOptionPane.showMessageDialog(null, "Inga vita tecken");

    }
}