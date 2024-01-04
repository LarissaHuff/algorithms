package lists;

public class ExerciciosComList {

    public Integer findMax(java.util.List<Integer> numbers) {
        Integer biggerNumber = numbers.get(0);

        for (int i = 0; i < numbers.size(); i++) {

            Integer numberOfTurn = numbers.get(i);
            if (biggerNumber < numberOfTurn) {
                biggerNumber = numberOfTurn;
            }
        }

        return biggerNumber;
    }

    public Integer findMin(java.util.List<Integer> numbers) {
        Integer minorNumber = numbers.get(0);

        for (int i = 0; i < numbers.size(); i++) {

            Integer numberOfTurn = numbers.get(i);
            if (numberOfTurn < minorNumber) {
                minorNumber = numberOfTurn;
            }
        }

        return minorNumber;
    }

    public java.util.List<Integer> sortAListBubble(java.util.List<Integer> list) {
        System.out.println(list);
        for (int j = 0; j < list.size(); j++) {
            for (int i = j + 1; i < list.size(); i++) {
                System.out.println("posicao " + j + " numero da vez " + list.get(j));
                System.out.println("compara com a posicao " + i + " elemento " + list.get(i));
                if (list.get(j) > list.get(i)) {
                    System.out.println("troca");

                    int elemento = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, elemento);
                } else {
                    System.out.println("nao troca");
                }

                System.out.println(list);

            }
        }

        return list;
    }

    public java.util.List<Integer> sortAListSelection(java.util.List<Integer> list) {
        for (int j = 0; j < list.size(); j++) {
            int menorElemento = list.get(j);
            int posicao = j;
            for (int i = j + 1; i < list.size(); i++) {
                if (menorElemento > list.get(i)) {
                    menorElemento = list.get(i);
                    posicao = i;
                }
            }
            list.set(posicao, list.get(j));
            list.set(j, menorElemento);
        }

        return list;
    }

    public void print(java.util.List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                System.out.print(list.get(j) + " ");
            }
            System.out.print("\n");
        }
    }

    public Integer average(java.util.List<Integer> list) {
        Integer soma = 0;
        for (int i = 0; i < list.size(); i++) {

            soma += list.get(i);
        }
        return soma / list.size();

    }

    public java.util.List<Integer> reverse(java.util.List<Integer> list) {
        int ultimoIndice = list.size() - 1;
        for (int i = 0; i < list.size() / 2; i++) {

            Integer primeiroElemento = list.get(i);
            Integer ultimoElemento = list.get(ultimoIndice);

            list.set(i, ultimoElemento);
            list.set(ultimoIndice, primeiroElemento);

            ultimoIndice--;

        }
        return list;
    }

    public Integer returnBiggerNumber(Integer number1, Integer number2) {
        if (number1 > number2) {
            return number1;
        }
        return number2;
    }

    public void decreasingNumber(Integer number) {
        for (int i = 0; i <= number; i++) {
            System.out.println(number - i);
        }
    }

    public void oddAndEvenSumMultiplication() {
        int soma = 0;
        Long multi = 1L;
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                multi = multi * i;
            } else {
                soma = soma + i;
            }
        }
        System.out.println(multi);
        System.out.println(soma);
    }

    public void compareNumbers(int num1, int num2) {
        if (num1 == num2) {
            System.out.println("numeros iguais");
        } else {
            System.out.println("numeros diferentes");
        }
        if (num1 > num2) {
            System.out.println("numero 1 é maior = " + num1);
            System.out.println("e o numero 2 menor = " + num2);
        } else if (num2 > num1) {
            System.out.println("numero 2 é maior = " + num2);
            System.out.println("e o numero 1 menor = " + num1);
        } else {
            System.out.println("numeros iguais, não tem maior ou menor");
        }
    }
}