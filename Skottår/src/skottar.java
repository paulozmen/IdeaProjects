import javax.swing.*;

public class skottar {
    public static void main (String[] arg) {
        String x = JOptionPane.showInputDialog("Skriv in ar?");
        int year= Integer.parseInt(x);
        if ((year % 4 == 0 && year % 100 != 0)|| year % 400 == 0)/*If satsen fr�gar om 4 �r j�mt delbart(%)
        med �rtalet och resten �r lika med 0. Om 100 inte �r lika med 0 s� �r �rtalet inte j�mnt delbart 100.
        Deluttrycket (ar % 4 == 0 && ar % 100 != 0) �r f�r �rtal som �r j�mnt delbara med 4 men inte 100.
        F�r att ett �r ska vara ett skott�r m�ste deluttrycket vara sant eller s� m�ste �ret vara
        delbart med 400.(|| ar % 400 = 0)*/

            JOptionPane.showMessageDialog(null, "Skottar" );
        else
            JOptionPane.showMessageDialog(null, "Inte skottar");
    }
}