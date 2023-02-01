import java.util.Scanner;
/*Crie uma função que exibe os números de 1 a N, sendo que N é um número que será recebido via teclado. Ex: Usuário digitou 5 ->
1,2,3,4,5*/
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero Inteiro");
        int number = teclado.nextInt();

        counter(number);
    }
    public static void counter (int numero){
        for (int i=1;i<=numero;i++){
            System.out.println(i);
        }
    }
}