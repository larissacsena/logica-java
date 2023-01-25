import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int a = teclado.nextInt();

        System.out.println("Digite o segundo número:");
        int b = teclado.nextInt();

        System.out.println("Digite o terceiro número:");
        int c = teclado.nextInt();

        pegaMaiorMenor(a,b,c);
    }

    public static void pegaMaiorMenor(int numero1, int numero2, int numero3) {
        int maior=0;
        int menor=numero2;

        if(numero1>numero2 && numero1>numero3){
            maior = numero1;
            if (numero2>=numero3){
                menor = numero3;
            }
        }
        if(numero2>numero1 && numero2>numero3){
            maior = numero2;
            if (numero1>=numero3){
                menor = numero3;
            }
        }
        if(numero3>numero2 && numero3>numero1){
            maior = numero3;
            if (numero2>=numero1){
                menor = numero1;
            }

        }
        System.out.println("Esse é o maior numero "+maior);
        System.out.println("Esse é o menor numero " + menor);
    }
}