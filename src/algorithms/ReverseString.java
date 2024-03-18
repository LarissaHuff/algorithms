package algorithms;

public class ReverseString {

    public char[] reverseString(String word) {
        char[] reversedWordArray = new char[0];
        for (int i = 0; i < word.length(); i++) {
            reversedWordArray = word.toCharArray();
        }
        return reversedWordArray;
    }

    public String reverse2(String word) {
        String reversedWord = "";

        char[] chars = reverseString(word);
        for (int i = chars.length - 1; i >= 0; i--) {
            reversedWord += chars[i];

        }
        return reversedWord;
    }

    //numeros primos só são divididos por 1 ou por ele mesmo;
    public int[] primeOrNot(int[] numbers) {
        int[] primes = new int[numbers.length];
        int posicao = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i])) {
                primes[posicao] = numbers[i];
                posicao++;
            }
        }
        return primes;
    }

    private boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (isDivisivel(number, i)) {
                return false;
            }
        }
        return true;
    }

    public boolean exist(int[] numeros, int numero) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numero) {
                return true;
            }
        }
        return false;
    }

    public boolean isDivisivel(int numero, int divisor) {
        return numero % divisor == 0;
    }

    //1 3
    //2

}
