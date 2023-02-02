import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = teclado.nextInt();
        retornaPares(numero);
    }
    public static void retornaPares(int x){
        int pares=0;
        for (int i=0;i<=x;i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}