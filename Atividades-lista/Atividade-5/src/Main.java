import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        int[] numeros = {2,4,6};

        int resultado = maiorValor(numeros);
        System.out.println(resultado);
    }
    public static int maiorValor(int[]array){
        int maior= 0;
        for (int i=0;i<array.length;i++){
            //faz a verificação.
            //coloque esse valor na variavel maior
            if (array[i]>maior){
                maior=array[i];
            }
        }
        return maior;
    }

}