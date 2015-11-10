import javax.swing.*;

public class miles {
    public static void main(String[] arg){
    String s=JOptionPane.showInputDialog("Skriv in miles:");
        double mile= Double.parseDouble(s);
        double gallon=3.785/mile/1.609*10 ;


        JOptionPane.showMessageDialog(null, "Bilen drar: "+gallon+ " l/mil");
    }
}
