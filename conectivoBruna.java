package Bruna;

import java.util.Scanner;

public class TabelaVerdadeBruna {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int conectivo = 0;

        System.out.println("Informe um valor logico de A utilizando: [1] VERDADEIRO ou [0] FALSO");
        boolean a = scanner.nextBoolean();

        System.out.println("Informe o valor logico de B utilizando: [1] VERDADEIRO ou [0] FALSO");
        boolean b = scanner.nextBoolean();

            System.out.println("           ╔════════════════════════════════╗                       ");
            System.out.println("           ║ ʕ•́ᴥ•̀ʔ Menu de Conectivos ʕ•́ᴥ•̀ʔ ║  ");
            System.out.println("╔══════════╩════════════════════════════════╩═══════╗");
            System.out.println("║ 1 - Conjunção                                     ║");
            System.out.println("║ 2 - Disjunção                                     ║");
            System.out.println("║ 3 - Condicional                                   ║");
            System.out.println("╚═══════════════════════════════════════════════════╝");

        System.out.println(" ");
        System.out.println("           Informe a operação desejada!    ");
        conectivo = scanner.nextInt();

        boolean resultado = false;

        switch (conectivo){
            case 1: //conjunção
                resultado = a && b;
                break;
            case 2: //disjunção
                resultado = a || b;
                break;
            case 3: //condicional
                resultado = !a || b;
                break;
            default:
                System.out.println("O conectivo é invalido!!");
                System.exit(0);
        }
        System.out.println("O valor logico do conectivo [" + conectivo + "] é igual a: " + resultado);
    }
}
