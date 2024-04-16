import java.util.ArrayList;

public class Alunos {
    private String nome;
    private String matricula;
    private Float notas_prova1;
    private Float notas_prova2;
    private Float notas_trabalho;
    private Float nota_total;
    private Boolean situacao ;


    public Alunos(String nome, Float notas_prova1, Float notas_prova2, Float notas_trabalho, String matricula) {

        this.nome = nome;
        this.notas_prova1 = notas_prova1;
        this.notas_prova2 = notas_prova2;
        this.notas_trabalho = notas_trabalho;
        this.matricula = matricula;
        this.setNota_total();
        this.setSituacao();
    }

    public Float getNota_total() {
        return this.nota_total;
    }

    public String getNome() {
        return this.nome;
    }

    private void setNota_total() {
        this.nota_total = this.notaTotal();
    }

    public Boolean getSituacao() {
        return this.situacao;
    }

    private void setSituacao() {
        this.situacao = this.isAprovado();
    }

    private Float notaTotal() {
        return this.notas_prova1 + this.notas_prova2 + this.notas_trabalho;
    }

    private  Boolean isAprovado(){
        if (this.nota_total >= 6){
            return true;
        }else{
            return false;
        }
    }


}


