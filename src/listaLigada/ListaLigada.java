package listaLigada;

public class ListaLigada {
    private No primeiro;
    private No ultimo;

    public ListaLigada() {
        this.primeiro = null;
        this.ultimo = null;
    }

    public boolean listaVazia() {
        return primeiro == null && ultimo == null;
    }

    public void destruir() {
        this.primeiro = null;
        this.ultimo = null;
    }

    public int contarNos() {
        int quantidade = 0;
        No noAtual = primeiro;
        while (noAtual != null) {
            quantidade = quantidade + 1;
            noAtual = noAtual.getProximo();
        }
        return quantidade;
    }

    public void mostrarLista() {
        int i = 1;
        No noAtual = primeiro;

        while (noAtual != null) {
            System.out.println("Elemento " + noAtual.getElemento() + " posição " + i);
            noAtual = noAtual.getProximo();
            i++;
        }
    }

    public void primeiroElemento() {
        if (!listaVazia()) {
            System.out.println(primeiro.getElemento());
        } else {
            System.out.println("lista vazia");
        }
    }

    public void elementoFinal() {
        if (!listaVazia()) {
            System.out.println(ultimo.getElemento());
        } else {
            System.out.println("lista vazia");
        }
    }

    public void inserirInicio(No novoNo) {
        if (listaVazia()) {
            ultimo = novoNo;
        } else {
            novoNo.setProximo(primeiro);
        }
        primeiro = novoNo;
    }

    public void inserirFinal(No novoNo) {
        if (listaVazia()) {
            primeiro = novoNo;
        } else {
            ultimo.setProximo(novoNo);
        }
        ultimo = novoNo;
    }

    public void inserirNoMeio(No novoNo, int posicao) {
        int posicaoAux = 0;
        No noAux = primeiro;
        if (posicao <= 1) {
            inserirInicio(novoNo);

        }
        if (posicao > contarNos()) {
            inserirFinal(novoNo);
        } else {
            while (posicaoAux <= posicao-1){
                noAux = noAux.getProximo();
                posicaoAux++;
            }
            novoNo.setProximo(noAux.getProximo());
            noAux.setProximo(novoNo);
        }
    }

    public void remover(int elemento){
        No noAux = primeiro;
        No noAnteior = null;

        if (primeiro.getElemento() == elemento){
            primeiro = primeiro.getProximo();
        }
        else {
            while (noAux != null && noAux.getElemento() != elemento){
                noAnteior = noAux;
                noAux = noAux.getProximo();
            }
            if (noAnteior != null){
                noAnteior.setProximo(noAux.getProximo());
            }
            if (noAux == ultimo){
                ultimo = noAnteior;
            }
        }
    }

    public No buscar(int elemento){
        int i = 1;
        No noAux = primeiro;
        while (noAux.getElemento() != elemento){
            if (noAux.getElemento() == elemento){
                System.out.println("No " + noAux.getElemento() + " na posição " + i);
                return noAux;
            }
            noAux = noAux.getProximo();
            i++;
        }
        return null;
    }
}
