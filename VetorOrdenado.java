
import java.util.Scanner;

public class Ordenacao {
    public static void main(String[] args) {
        int tamanho;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um valor inteiro e positivo");
        tamanho = scanner.nextInt();

        while (tamanho < 0) {
            System.out.println("o Valor informado não é positivo");
            System.out.println("Informe um valor inteiro e positivo");
            tamanho = scanner.nextInt();
        }

        int [] vetor = new int[tamanho];

        for (int i = 0; i < tamanho ; i++) {
            System.out.println("Informe um valor para ser inserido na posição" + i + " do meu vetor:");
            int valor = scanner.nextInt();
            vetor[i] = valor;
            
        }
        
        for (int i = 0; i < tamanho; i++){
            
        }


    }
}    
    
