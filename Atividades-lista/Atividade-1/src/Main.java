public class Main {
    /*Crie uma função que recebe um ARRAY de STRINGS e exibe o conteúdo da primeira posição do ARRAY.
Ex: ['Chocolate', 'Pudim'] -> Chocolate.
*/
    /*Crie uma função que recebe um ARRAY de STRINGS e exibe o conteúdo da última posição do ARRAY.
Ex: ['Chocolate', 'Pudim', 'Bolu de Murango'] -> Bolu de Murango.
*/
    public static void main(String[] args) {
        String[] food={"Chocolate","Pudim","Bolo","Pizza","Camarão","Empada"};
        getFirstItem(food);
        getlastItem(food);

    }
    public static void getFirstItem(String[] array){
        System.out.println(array[0]);
    }
    public static void getlastItem(String[] array){
        int tamanho = array.length - 1;
        System.out.println(array[tamanho]);

    }
}