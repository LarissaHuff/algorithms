package calculosmatematicos;

public class NumeroPrimo {
    public Boolean verificaPrimo(int n) {

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void listarNumerosPrimos(int x){

        for (int i=2; i<x; i++){
            if (verificaPrimo(i)){
                System.out.println(i);
            }
        }
    }


    public Integer acharNumeroPrimo(int posicaoPrimo){

        int numeroPrimoDaPosicao = 0;
        int numerosPrimos=0;
        for (int i=2; numerosPrimos!=posicaoPrimo; i++){
            if (verificaPrimo(i)){
                numerosPrimos ++;
            }
            if (numerosPrimos == posicaoPrimo) {
                numeroPrimoDaPosicao = i;
            }
        }
        return numeroPrimoDaPosicao;
    }



}

