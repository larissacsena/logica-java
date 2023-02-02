public class Main {
    /*Crie uma função que recebe um ARRAY de INTEIROS e exibe a média aritmética dos elementos do ARRAY.
Ex: [1, 2, 3, 4, 5] -> 3.0
*/
    public static void main(String[] args) {

        int [] numeros={7,5,10};
        calculaMedia(numeros);
        double resultado = calculaMedia(numeros);
        System.out.println(resultado);
    }
    public static double calculaMedia(int[]array){
        int soma =0;
        for (int i=0;i<array.length;i++){
            soma=soma+array[i];
        }
        double resultado=soma/array.length;
        return resultado;
    }
}