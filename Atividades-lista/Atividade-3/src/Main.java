public class Main {
    /*Crie uma função que recebe um ARRAY de INTEIROS e SOME o conteúdo de
    TODO array e retorne o valor da soma. Ex: [1,2,3] -> 6.*/
    public static void main(String[] args) {
        int[] inteiros={2,4,7};
        int resultado=sum(inteiros);
        System.out.println(resultado);
    }
    public static int sum(int[] array){
        int soma=0;

        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
            soma = soma + array[i];
        }
        return soma;
    }
}