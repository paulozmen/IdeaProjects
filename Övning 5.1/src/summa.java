import javax.swing.*;
import java.text.*;


public class summa {
    public static void main(String[] arg){
        String s = JOptionPane.showInputDialog(null, "n?");
        int n =Integer.parseInt(s);
        int summa = 0;
        int k = 1;
        while (k <= n){
            summa = summa + k*k;
            k = k + 1;
        }
        JOptionPane.showMessageDialog(null, "Summan blir: "+ summa );
    }
}