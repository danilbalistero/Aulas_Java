package AtvBruna;

import java.util.Scanner;

public class TabelaVerdade {
        public static int avaliarProposicao(int proposicao1, int proposicao2, String conectivo) {
            //Metodo para os valores logicos

            //equals para comparar os valores
            if (conectivo.equals("conjunção")) {
                return (proposicao1 == 1 && proposicao2 == 1) ? 1 : 0; //
            } else if (conectivo.equals("disjunção")) {
                return (proposicao1 == 1 || proposicao2 == 1) ? 1 : 0;
            } else if (conectivo.equals("condicional")) {
                return (!(proposicao1 == 1) || proposicao2 == 1) ? 1 : 0;
            } else {
                return -1; // valor inválido
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o valor lógico da proposição 1 ([1] para VERDADEIRO ou [0] para FALSO): ");
            int proposicao1 = scanner.nextInt();

            System.out.print("Digite o valor lógico da proposição 2 ([1] para VERDADEIRO ou [0] para FALSO): ");
            int proposicao2 = scanner.nextInt();

            System.out.println("           ╔════════════════════════════════╗                       ");
            System.out.println("           ║ ʕ•́ᴥ•̀ʔ Menu de Conectivos ʕ•́ᴥ•̀ʔ ║  ");
            System.out.println("╔══════════╩════════════════════════════════╩═══════╗");
            System.out.println("║                     Conjunção                     ║");
            System.out.println("║                     Disjunção                     ║");
            System.out.println("║                    Condicional                    ║");
            System.out.println("╚═══════════════════════════════════════════════════╝");
            System.out.println("Digite qual conectivo que deseja utilizar");
            String conectivo = scanner.next();

            int resultado = avaliarProposicao(proposicao1, proposicao2, conectivo);
            if (resultado == 1) {
                System.out.println("O resultado lógico da composição é: verdadeiro");
            } else if (resultado == 0) {
                System.out.println("O resultado lógico da composição é: falso");
            } else {
                System.out.println("Conectivo inválido!");
            }
        }
    }


