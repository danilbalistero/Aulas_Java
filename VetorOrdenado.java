import java.util.Scanner;

public class Ordenacao {
    public static void main(String[] args) {
        int tamanho;
        int tamanho, aux;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um valor inteiro e positivo");
@@ -15,20 +14,35 @@ public static void main(String[] args) {
            tamanho = scanner.nextInt();
        }

        //parte do trabalho
        int [] vetor = new int[tamanho];

        /*laço para preencher os vetores
        enquanto i for menor q o tamanho declarado ele vai ficar repetindo*/
        for (int i = 0; i < tamanho ; i++) {
            System.out.println("Informe um valor para ser inserido na posição" + i + " do meu vetor:");
            int valor = scanner.nextInt();
            vetor[i] = valor;
            

        }

        for (int i = 0; i < tamanho; i++){


        //Ordenação
        for (int i = 0; i < tamanho - 1; i++){
            for (int j = 0; j < tamanho - 1; j++) {
                if (vetor[j] > vetor[j+1]) {
                aux = vetor[j];
                vetor[j] = vetor[j + 1];
                vetor[j + 1] = aux;
                 }
            }
        }


        //Exibindo o vetor
        for (int i = 0; i < tamanho; i++){
            System.out.println("vetor[" + i + "] = " + vetor[i]);

        }

    }
}    

}
