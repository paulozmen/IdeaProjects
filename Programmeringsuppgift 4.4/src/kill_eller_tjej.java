import javax.swing.*;

/**
 * Created by Paul Özmen on 2015-11-03.
 */
public class kill_eller_tjej {
    public static void main(String[] arg) {

        String s= JOptionPane.showInputDialog("Kille eller tjej?");
        String a= "Tjej";
        String b= "Kille";
        String x= JOptionPane.showInputDialog("Skriv in ditt personnummer(yymmdd-nnnn");
        //int nr = Integer.parseInt(x.charAt(9));
        System.out.println(x.charAt(9));
        switch(x.charAt(9)) {

            case '0':
            case '2':
            case '4':
            case '6':
            case '8':
                JOptionPane.showMessageDialog(null, a);
                break;
            case '1':
            case '3':
            case '5':
            case '7':
            case '9':
                JOptionPane.showMessageDialog(null, b);
                break;

        }

    }
}
