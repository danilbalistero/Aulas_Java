import java.util.Scanner;

public class Codigo {
    public static void main(String[] args) {
        int codigo, senha;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o código de acesso:");
        codigo = scanner.nextInt();

        if (codigo == 1234) {
            System.out.println("Digite a senha");
            senha = scanner.nextInt();
            if (senha == 9999) {
                System.out.println("Acesso permitido");
            } else {
                System.out.println("Senha incorreta");
            }
        }
    }
}
