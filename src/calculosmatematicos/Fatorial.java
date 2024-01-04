package calculosmatematicos;

public class Fatorial {

    public void fatorial(int n) {

        int b = n;
        for (int i = n- 1; i > 1; i--) {
            b = b * i;
        }

        System.out.println(b);

    }
    public void fatorialSoma(int n) {
        int soma = n;

        for (int i = n-1; i>0; i--) {

            soma = soma + i;
        }
        System.out.println(soma);
    }
}
