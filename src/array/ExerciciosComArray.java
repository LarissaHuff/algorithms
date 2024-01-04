package array;

public class ExerciciosComArray {
    public void printAll(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public Integer sumAllElements(Integer[] array) {
        Integer soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }
        System.out.println(soma);
        return soma;

    }

    public void printSumEvensAndMultiplyOdds(Integer[] array) {
        //print both results in the end
        Integer soma = 0;
        Integer multi = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                soma += array[i];
            } else {
                multi *= array[i];
            }
        }
        System.out.println("Sum of Even:" + soma);
        System.out.println("Multiplication of odds:" + multi);
    }

    public String concatAllElements(String[] array) {
        String nomes = " ";
        for (int i = 0; i < array.length; i++) {
            nomes += array[i] + ", ";
        }

        String s = nomes.substring(0, nomes.length() - 2) + ".";
        System.out.println(s);
        return s;
    }

    public Integer arithmeticMean(Integer[] array) {
        Integer soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma += array[i];

        }
        return soma / array.length;
    }

    public Integer otherMethodMedian(Integer[] array) {
        Integer menor = array[0];
        Integer maior = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
            if (array[i] > maior) {
                maior = array[i];
            }
        }

        return (maior + menor) / 2;
    }

    public Integer findMax(Integer[] array) {
        Integer maior = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }

        }
        System.out.println(maior);
        return maior;
    }

    public Integer findMin(Integer[] array) {
        Integer menor = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        System.out.println(menor);
        return menor;
    }

    public String[] invert(String[] array) {
        int i = 0;
        int j = array.length - 1;
        while (i < array.length / 2) {
            String primeira = array[i];

            array[i] = array[j];

            array[j] = primeira;

            i++;
            j--;
        }
        return array;
    }

    public Integer[] bubbleSortAsc(Integer[] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = j + 1; i < array.length; i++) {
                if (array[j] > array[i]) {
                    Integer troca = array[i];
                    array[i] = array[j];
                    array[j] = troca;
                }
            }
        }

        return array;
    }

    public Integer[] bubbleSortDesc(Integer[] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = j + 1; i < array.length; i++) {
                if (array[j] < array[i]) {
                    Integer troca = array[i];
                    array[i] = array[j];
                    array[j] = troca;
                }
            }
        }
        return array;
    }

    public boolean temLetra(char letra, String palavra) {
        char[] letras = palavra.toCharArray();
        for (int i = 0; i < letras.length; i++) {
            System.out.println("x");
            if (letras[i] == letra) {
                return true;
            }
        }
        return false;
    }

    public boolean isPalindromo(String word) {
        char[] letters = word.toCharArray();
        int i = 0;
        int j = letters.length - 1;
        while (i < letters.length / 2) {
            if (letters[i] == letters[j]) {
                System.out.println("igual");
            } else {
                System.out.println("diferente");
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean isAnagrama(String word1, String word2) {
        //"Pablo" - "olbap", "olpab", "blopa", "blapo" true
        // conferir tamanho da palavra antes do loop


        char[] palavra1 = word1.toCharArray();


        if (word1.length() != word2.length()) {
            return false;
        }

        for (int i = 0; i < palavra1.length; i++) {
            if (!temLetra(palavra1[i], word2)) {
                return false;
            }
        }
        return true;
    }
}

