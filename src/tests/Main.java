package tests;

import array.ExerciciosComArray;
import lists.ExerciciosComList;
import calculosmatematicos.NumeroPrimo;
import calculosmatematicos.Potencia;
import calculosmatematicos.RaizQuadrada;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ExerciciosComList listsAlgorithms = new ExerciciosComList();

        java.util.List<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(9);
        numbers.add(7);
        numbers.add(10);
        numbers.add(4);



        //Integer result = listsAlgorithms.findMin(numbers);
        //System.out.println(result);

        //List<Integer> sortedList = listsAlgorithms.sortAList(numbers);
        // System.out.println("sorted list: " + sortedList);

        //listsAlgorithms.print(numbers);

        //List<Integer> media = listsAlgorithms.inverte(numbers);
        //System.out.println("media " + media);

        //listsAlgorithms.decreasingNumber(10);

        // listsAlgorithms.oddAndEvenSumMultiplication();
        //listsAlgorithms.comparaNumeros(7, 5);
        /*MediaAluno mediaAluno = new MediaAluno();
        mediaAluno.adicionaNotas(10);
        mediaAluno.adicionaNotas(18);
        mediaAluno.adicionaNotas(26);
        mediaAluno.calculaMedia();*/


        //Fibonacci fibonacci = new Fibonacci();


        //Fibonacci fibonacci = new Fibonacci();
        // fibonacci.fibonacci();

        //Fatorial fatorial = new Fatorial();
        //fatorial.fatorialSoma(6);

        Potencia potencia = new Potencia();
        //potencia.potencia(3, 2);

        NumeroPrimo numeroPrimo = new NumeroPrimo();
        //numeroPrimo.numeroPrimo(4);
        //numeroPrimo.listarNumerosPrimos(8);

       RaizQuadrada raizQuadrada = new RaizQuadrada();
        Integer raizQuadrada1 = raizQuadrada.raizQuadrada(8);
        //System.out.println(raizQuadrada1);

     //raizQuadrada.raiz(8,3);

     //listsAlgorithms.sortAListBubble(numbers);

     // A (0,0) B (0,1) C (0,2)
     // D (1,0) E (1,1) F
     // G (2,0) H (2,1) I
     //for(int i = 0; i<3; i++){
         //0
         //1
         //2
         //for(int j = 0; j<3;j++){
           //123
           //123
             //123

        ExerciciosComArray array1 = new ExerciciosComArray();

        String[] a = {"lua", "larissa", "pablo", "estrela"};

        Integer[] b = {20, 3, 5, 2};

        //array1.printAll(a);
        //array1.sumAllElements(b);
        //array1.printSumEvensAndMultiplyOdds(b);

        array1.concatAllElements(a);

        //Integer arithmeticMean = array1.arithmeticMean(b);
        //System.out.println(arithmeticMean);

        //Integer median = array1.otherMethodMedian(b);
        //System.out.println(median);

        //array1.findMax(b);
        //array1.findMin(b);
        /*String[] invert = array1.invert(a);
        for (int i=0; i<invert.length; i++ ){
            System.out.println(invert[i]);*/

        /*Integer[] sortAsc = array1.bubbleSortDesc(b);
        for (int i=0; i<sortAsc.length; i++ ) {
            System.out.println(sortAsc[i]);*/

        String word = "ssss";
        String word2 = "caas";

        //Boolean palindromo = array1.isPalindromo(word);
        //System.out.println(palindromo);

        //boolean anagrama = array1.isAnagrama(word, word2);
        //System.out.println(anagrama);
    }
    }