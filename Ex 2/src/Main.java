import javax.swing.*;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
          ArrayList<Data> datas = new ArrayList<Data>();

          for (int i = 0; i < 2; i++) {
                String data = JOptionPane.showInputDialog("Digite uma data: ");

                datas.add(new Data(data));
          }

                JOptionPane.showMessageDialog(null,"O dia " + datas.get(0).getDias() +
                               "\nO mes é : " + datas.get(0).getMes() +
                                "\nO mes por extenso: " + datas.get(0).getMesextenso() +
                                "\nO ano " + datas.get(0).getAno()+
                                "\n  MEU PAU: " + datas.get(0).compara(datas.get(1)));


    }
}