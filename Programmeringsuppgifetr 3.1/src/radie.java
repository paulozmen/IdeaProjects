import javax.swing.*;

public class radie {
    public static void main(String[] arg){
        String s = JOptionPane.showInputDialog("Radie?");
        double r = Double.parseDouble(s);
        double volym = 4 * Math.PI*Math.pow(r, 3)/3;
        double area = 4*Math.PI*r*r;

        JOptionPane.showMessageDialog(null, "Volym: "+volym+"\nArea: "+area);
    }
}
