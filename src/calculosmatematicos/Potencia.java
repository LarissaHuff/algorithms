package calculosmatematicos;

public class Potencia {

    public Integer potencia(int base, int expoente){
        int res= base;

        for (int i=1; i<expoente; i++){
            res = res * base;

        }
        return res;
    }
}
