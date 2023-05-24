import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {

        /* x é o numero q a pessoa q descobrir se é primo
        y é para fazer as divisoes e div para contar as divisoes*/

        int x;
        int y = 2;
        int div = 0;

        Scanner valor = new Scanner(System.in);

        System.out.printf("Informe um número para saber se ele é primo ou não:");
        x = valor.nextInt();

        // Enquanto o valor digitado for negativo  ele fica repetindo
        while (x <= 0) {
            System.out.println("Digite apenas números positivos ou superior a zero:");
            x = valor.nextInt();
        }

        while (y <= Math.sqrt(x)) {
            if (x % y == 0) {
                div++;
                break;
            }
            y++;
        }
            if (div == 0) {
                System.out.println("O número " + x + " é primo!");

            } else {
                System.out.println("O número " + x + " não é primo!");

            }

    }

}
