import java.time.LocalTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.Duration;

public class Horas {
    private String horas1;

    private LocalTime hora1;

    private int hr1;
    private int min1;
    private int seg1;

    public Horas(String horas1) {
        this.horas1 = horas1;
        getValidHoras();
        hora1 = LocalTime.parse(this.horas1);
        desmembrar(hora1);

    }

    public String getHoras() {
        return this.horas1;
    }

    public LocalTime displayHora(){
        return hora1;
    }

    public int getHr1() {
        return hr1;
    }

    public int getMin1() {
        return min1;
    }

    public int getSeg1() {
        return seg1;
    }


    public void getValidHoras() {
        if (!validarHora(this.horas1))
            this.horas1 = "00:00:00";

    }

    public void getCompHoras(Horas horas2) {
        comparar(horas2);
    }


    private static boolean validarHora(String hora) {
            String regex = "^([01]?[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]$";

            Pattern pattern = Pattern.compile(regex);

            Matcher matcher = pattern.matcher(hora);

            return matcher.matches();
    }

    private Long diferenca(LocalTime hora1, LocalTime hora2){
        Duration diferenca = Duration.between(hora1, hora2);
        return diferenca.getSeconds();
    }

    private Long comparar(Horas horas2){

            if (hora1.equals(horas2.hora1)){
                return 0L;
            }else{
                return diferenca(hora1, horas2.hora1);
            }
    }

    private void desmembrar(LocalTime hora1){
        this.hr1 = hora1.getHour();
        this.min1 = hora1.getMinute();
        this.seg1 = hora1.getSecond();
    }

}
