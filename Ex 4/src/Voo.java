import java.util.Date;

public class Voo {
    private String numVoo;
    private Data dataVoo;

    private Boolean[] cadeiras = new Boolean[100];

    public Voo(String numVoo, Data dataVoo) {
        this.numVoo = numVoo;
        this.dataVoo = dataVoo;

    }

    public String getNumVoo() {
        return this.numVoo;
    }

    public Data getDataVoo() {
        return this.dataVoo;
    }

    private int proximoLivre() {
        for (int i = 0; i < cadeiras.length; i++) {
            if (!cadeiras[i]) {
                return i + 1;
            }
        }
        return -1;
    }

    private boolean verifica(int numeroCadeira) {
        if (numeroCadeira < 1 || numeroCadeira > cadeiras.length) {
            return false;
        }
        return cadeiras[numeroCadeira - 1];
    }

    private boolean ocupa(int numeroCadeira) {
        if (numeroCadeira < 1 || numeroCadeira > cadeiras.length) {
            return false;
        }
        if (!cadeiras[numeroCadeira - 1]) {
            cadeiras[numeroCadeira - 1] = true;
            return true;
        } else {
            return false;
        }
    }
}
