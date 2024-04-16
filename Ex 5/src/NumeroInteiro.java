public class NumeroInteiro {
    private int num;

    public NumeroInteiro() {
        this.num = 0;
    }

    public NumeroInteiro(int num) {
        this.num = num;
    }

    public int getNextPrimo(int numero){
        return this.NextPrimo(numero);
    }

    private int soma(int numero){
        return this.num + numero;
    }

    private int subtrai(int numero){
        return this.num - numero;
    }

    private boolean isPrimo(int numero){
        if(numero % 2 != 0){
            return true;
        }else {
            return false;
        }
    }

    private int NextPrimo (int numero){
        if (isPrimo(numero)){
            return numero + 2;
        }else{
            return numero + 1;
        }
    }
}

