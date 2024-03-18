package algorithms;

public class ReExercitandoAlgoritimos {

    public Boolean isPrime(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public String reverse(String palavra) {
        String palavraReversa = "";
        for (int j = palavra.length() - 1; j >= 0; j--) {
            char c = palavra.charAt(j);
            palavraReversa += c;
        }
        return palavraReversa;
    }

    public int[] bubbleSort(int[] numeros) {
        int tamanhoArray = numeros.length;
        int ultimoIndice = tamanhoArray - 1;
        for (int i = 0; i < ultimoIndice; i++) {
            for (int j = 0; j < ultimoIndice - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }
        return numeros;
    }

    public Integer achaPosicaoElemento(int[] numeros, int numeroBuscado) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscado) {
                return i;
            }
        }
        return null;
    }

    public Boolean contains(int[] numeros, int numeroBuscado) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscado) {
                return true;
            }
        }
        return false;
    }

    public int[] bubbleSort2(int[]numbers){
        int aux;
        for (int i=0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++ ){
                if (numbers[j]>numbers[j+1]){
                    aux = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = aux;
                }
            }
        }
        return numbers;
    }


}
