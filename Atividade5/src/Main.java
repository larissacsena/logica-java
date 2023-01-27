import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int fibonacci[] = new int[10];

        //1,2,3,5,8,13
        fibonacci[0]=1;
        fibonacci[1]=2;

        for (int i = 2 ; i <fibonacci.length ; i++){

            //tenho os index da minha array

            fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
            System.out.println(fibonacci[i]);
            //tenho os index da minha array
        };
    }
}