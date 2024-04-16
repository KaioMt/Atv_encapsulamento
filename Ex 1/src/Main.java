import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Alunos> alunos = new ArrayList<Alunos>();


        int matriculados = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos você tem matriculados? "));

        for (int i = 0; i < matriculados; i++) {
            String nome_aluno = JOptionPane.showInputDialog("Digite o nome do aluno:");

            String matricula = JOptionPane.showInputDialog("Digite a matricula do aluno:");

            Float notasT_aluno;
            do {
                notasT_aluno = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do trabalho do aluno"));
            }while (notasT_aluno > 4);

            Float notasP_aluno1;
            do{
                notasP_aluno1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da 1 prova do aluno: "));
            }while (notasP_aluno1 > 3);

            Float notasP_aluno2;
            do {
                notasP_aluno2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da 2 prova do aluno: "));
            }while (notasP_aluno2 > 3);

           alunos.add(new Alunos(nome_aluno, notasP_aluno1, notasP_aluno2, notasT_aluno, matricula ));

        }

        for (int i = 0; i < matriculados; i++) {
            String situacao;
            if(alunos.get(i).getSituacao()){
                situacao = "Aprovado";
            }else{
                situacao = "Reprovado";
            }
            JOptionPane.showMessageDialog(null,"O nome do aluno é: " + alunos.get(i).getNome() +
                        "\nO aluno tirou a nota: " + alunos.get(i).getNota_total() +
                        "\nO aluno foi "+situacao);
        }

    }

}