package algorithms;

public class Fila {

    int inicio, tam, total, fim;
    int vetor[];

    public Fila(int tamanho) {
        inicio = 0;
        fim = 0;
        total = 0;
        tam = tamanho;

        vetor = new int[tamanho];

    }

    public Boolean filaCheia() {
        if (total >= tam) {
            return true;

        }
        return false;
    }

    public Boolean filaVazia() {
        if (total == 0) {
            return true;
        }
        return false;
    }

    public void enfileirar(int numero) {
        if (!filaCheia()) {
            vetor[fim] = numero;
            fim = fim + 1;
            total = total + 1;

            if (fim >= tam) {
                fim = 0;
            }
        } else {
            System.out.println("fila cheia");
        }

    }

    public int desemfileirar() {
        int desemfileirado = 0;
        if (filaVazia()) {
            System.out.println("fila vazia");
        } else {
            desemfileirado = vetor[inicio];
            inicio = inicio + 1;
            total = total - 1;
            if (inicio >= tam) {
                inicio = 0;
            }
        }
        return desemfileirado;
    }

    public void elementoInicio() {
        if (!filaVazia()) {
            System.out.println(vetor[inicio]);
        } else {
            System.out.println("fila vazia");
        }

    }

    public void mostrarFila() {
        int aux = inicio;
        for (int i = 1; i <= total; i++) {
            System.out.println("elemento " + vetor[aux] + " na posição: " + i);
            aux = aux + 1;
            if (aux >= tam) {
                aux = 0;
            }
        }
    }

}
