import java.util.Scanner;

public class Main {
    /*Construa uma função, que receba três coeficientes relativos à uma equação de segundo
    grau (𝑎𝑥
    2 + bx + c = 0) e calcule suas raízes através da fórmula de báscara*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Uma função do segundo grau consiste em ax²+bx=c.");

        System.out.println("Digite o valor de a");
        int a = teclado.nextInt();

        System.out.println("Digite o valor de b");
        int b = teclado.nextInt();

        System.out.println("Digite o valor de c");
        int c = teclado.nextInt();

        calculaRaiz(a,b,c);
    }

    public static void calculaRaiz(int numero1,int numero2,int numero3){

        double delta = (numero2*numero2)-4*numero1*numero3;

        double resultadopositivo=(-numero2+Math.sqrt(delta))/2*numero1;
        System.out.println("A raiz positiva é: " + resultadopositivo);

        double resultadonegativo=(-numero2-Math.sqrt(delta))/2*numero1;
        System.out.println("A raiz negativa é: " + resultadonegativo);

    }
}