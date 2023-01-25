import java.util.Scanner;

public class Main {

    /*Construa uma função que efetue a TROCA dos valores de a por b, recebidos como
    parâmetro. Ou seja, essa função deve substituir o valor de a pelo de b, e reciprocamente.
    Crie também um algoritmo que leia dois valores quaisquer, e imprima os valores após a
    chamada da função TROCA.*/
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor A");
        int a = teclado.nextInt();

        System.out.println("Digite o valor B");
        int b = teclado.nextInt();

        troca(a, b);
    }

    public static void troca(int a, int b) {
        int c = a;
        a = b;
        b = c;

        System.out.println("O valor de A agora é: " + a + " E o valor de B é: " + b);
    }
}