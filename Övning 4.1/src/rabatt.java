import javax.swing.*;

public class rabatt {
    public static void main(String[] arg) {
        String in = JOptionPane.showInputDialog("Antal minuter per manad?");
        String inkr=JOptionPane.showInputDialog("Kostnad per minut?");
        int min= Integer.parseInt(in);
        double minutpris= Double.parseDouble(inkr);
        double total= min*minutpris;
        if(total>=1000)
            total= total-total*0.10;



        JOptionPane.showMessageDialog(null, "Kostnad per manad:"+total);
    }
}