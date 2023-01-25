import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
        mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
        (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
        */

        //Scanner de scanear (ler um dado) no caso o dado do teclado("System.in")este sistema
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite sua idade em anos");
        int years = teclado.nextInt();
        System.out.println("Digite sua idade em meses");
        int months = teclado.nextInt();
        System.out.println("Digite sua idade em dias");
        int days = teclado.nextInt();

        ageInDays(years, months, days);
    }

    public static void ageInDays(int years, int months, int days) {
        int resultado = (years * 365) + (months * 30) + (days);
        System.out.println(resultado + " essa é sua idade em dias");
    }

}