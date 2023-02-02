public class Main {
    /*Crie uma função que recebe um ARRAY de INTEIROS e MULTIPLIQUE o conteúdo de TODO array e retorna o valor da multiplicação. Ex: [1,2,3,4] -> 24.*/
    public static void main(String[] args) {

        System.out.println("Hello world!");

        int[] inteiros={3,6,9};
        int resultado = multiplica(inteiros);
        System.out.println(resultado);
    }
    public static int multiplica(int[] array){
        int mult = 1;
        for (int i=0;i< array.length;i++){
            mult = mult * array[i];
        }
        return mult;

    }
}