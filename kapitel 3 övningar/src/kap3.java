import javax.swing.*;


public class kap3 {
    public static void main (String[] arg) {
        String s =JOptionPane.showInputDialog("Skriv en text?");
        String t = "";
        for (int i= s.length()-1; i >= 1; i--)

                t = t + s.charAt(i);


        JOptionPane.showMessageDialog(null, t);
    }
}