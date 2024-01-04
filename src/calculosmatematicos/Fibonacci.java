package calculosmatematicos;

public class Fibonacci {

    public void fibonacci() {
        int numeroAnterior = 1;
        int numeroAnteriorAnterior = 0;
        int atual = 0;
        //0,1,1,2,3,5,8,13,21,34
        System.out.println(numeroAnteriorAnterior);
        System.out.println(numeroAnterior);

        for (int i = 0; i < 10; i++) {
            atual = numeroAnterior + numeroAnteriorAnterior;
            numeroAnteriorAnterior = numeroAnterior;
            numeroAnterior = atual;

            System.out.println(atual);
        }
    }
}

