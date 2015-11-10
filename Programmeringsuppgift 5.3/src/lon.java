import javax.swing.*;
/**
 * Created by Paul Özmen on 2015-11-06.
 */
public class lon {
    public static void main(String[] arg){
        int dagar = 1;
        double lon = 0.01;
        double total = 10000000;

        while (total < 10000000) {
            dagar++;
            lon = lon * 2;
            total = total + lon;
        }
        JOptionPane.showMessageDialog(null, "Du ska arbeta i " + total + dagar + " dagar.");
    }
}