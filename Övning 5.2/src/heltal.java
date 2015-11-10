import javax.swing.*;
import java.text.*;


public class heltal {
    public static void main(String[] arg){
        String s = JOptionPane.showInputDialog(null, "n?");
        int n =Integer.parseInt(s);
        double summa = 0;
        int k = 1;
        while (k <= n){
            summa = summa + 1.0/k;
            k = k + 1;
        }
        JOptionPane.showMessageDialog(null, "Summan blir: "+ summa );
    }
}