import javax.swing.*;
import java.time.LocalTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Horas horas;

        String hora1 = JOptionPane.showInputDialog("Digite uma hora: ");

        horas = new Horas(hora1);

        String hora2 = JOptionPane.showInputDialog("Digite uma hora: ");

        horas.getCompHoras(new Horas(hora2));

        JOptionPane.showMessageDialog(null,"A hora é: " + horas.displayHora() +
                "\n São " + horas.getHr1() +" hrs " + horas.getMin1() +" minutos "+ horas.getSeg1() + " segundos" +
                "\n Horas em string: " + horas.getHoras() );
    }
}