package calculosmatematicos;

public class RaizQuadrada {
    public Integer raizQuadrada(int numero) {
        Integer raiz = 0;
        for (int i = 1; i < numero; i++) {
            if (i * i == numero) {
                raiz = i;
                break;
            }
        }
        return raiz;
    }

    public int raiz(int numero, int raiz) {

        Potencia potencia = new Potencia();
        for (int i = 1; i <= numero; i++) {
            int res = potencia.potencia(i, raiz);
            if (res == numero) {
                return i;
            }
        }
        return 0;
    }
}







