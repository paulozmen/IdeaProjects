import javax.swing.*;


public class betyg {
        public static void main (String[] arg){
        String x = JOptionPane.showInputDialog("Skriv in poang?");
        int poang= Integer.parseInt(x);/*Sätt ett värde så att man kan mata in siffror utan decimaler(int)*/
        String betyg= "A"+"B"+"C"+"D"+"E"+"F";/*Sätt ett värde*/
        if (poang <= 25)/*Börja if-satsen*/
            betyg="F";
        else if (poang <= 30)
            betyg="E";
        else if (poang <= 35)
            betyg="D";
        else if (poang <= 40)
            betyg="C";
        else if (poang <=45)
            betyg="B";
        else
            betyg="A";

            JOptionPane.showMessageDialog(null, "Ditt betyg ar: "+betyg);
    }
}

