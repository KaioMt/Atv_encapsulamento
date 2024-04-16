import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
    String data;
    private int dias;
    private int mes;
    private int ano;
    private String[] meses = {"Não existe esse mes", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

    private Date date;
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

    public Data(String data1) {
        this.data = data1;
        this.isValid();
        this.desmembrar();

        }

    public int getDias() {
        return this.dias;
    }

    public int getMes() {
        return this.mes;
    }

    public String getMesextenso(){
        return this.mesExtenso(this.mes);
    }

    public int getAno() {
        return this.ano;
    }

    public void isValid() {
        try {
            this.date = this.formato.parse(this.data);
        } catch (ParseException e) {
            this.date = new Date("01/01/0001");
        }
    }

    private void desmembrar(){
        String dataFormatada = this.formato.format(this.date);

        String[] partesData = dataFormatada.split("/");

        this.dias = Integer.parseInt(partesData[0]);
        this.mes = Integer.parseInt(partesData[1]);
        this.mesExtenso(this.mes);
        this.ano = Integer.parseInt(partesData[2]);
    }

    private String mesExtenso(int Nummes){
        if (Nummes >= 1 && Nummes <= 12) {
            return  this.meses[Nummes];
        } else {
            return this.meses[0];
        }
    }

    public Date getDate(){
        return this.date;
    }

    public Integer compara(Data data2){
        if (this.date.after(data2.getDate())){
            return 1;
        } else if (this.date.before(data2.getDate())){
            return -1;
        } else
            return 0;
    }

}
