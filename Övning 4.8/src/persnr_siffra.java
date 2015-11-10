import javax.swing.*;

/**
 * Created by Paul Özmen on 2015-11-03.
 */
public class persnr_siffra {
    public static void main(String[] arg) {
        String s = JOptionPane.showInputDialog("Personnummer(yymmddnnnn)?");
        switch(s.charAt(8)){/*Hittar tecknet i position 9 i den inmatade texten*/
            case '0':case '2':case '4':case '6':case '8':/*Letar efter jämna tal*/
                JOptionPane.showMessageDialog(null,"Du ar en kvinna!");
                break;
            case '1':case '3':case '5':case '7':case '9':/*Letar efter ojämna tal*/
                JOptionPane.showMessageDialog(null, "Du ar en man!");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Fel personnr");
        }
    }
}
