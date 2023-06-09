package com.company;

import java.util.Scanner;

public class Trabalho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho, operacao;

        System.out.println("⟶⟳⇄ Desenvolvendo Aplicações com Vetores em Java ⟶⟳⇄");

        System.out.println("Informe o tamanho do Vetor");
        tamanho = scanner.nextInt();
        // Garantindo q o tamanho seja positivo
        while (tamanho < 0) {
            System.out.println("o Valor informado não é positivo");
            System.out.println("Informe um valor inteiro e positivo");
            tamanho = scanner.nextInt();
        }

        //int [] vetor;

        String[] vetor = new String[tamanho];


        do {
            System.out.println("           ╔═════════════════════════════╗                                      ");
            System.out.println("           ║ ʕ•́ᴥ•̀ʔ Menu de Vetores ʕ•́ᴥ•̀ʔ ║  ");
            System.out.println("╔══════════╩═════════════════════════════╩══════════╗");
            System.out.println("║ 1 - Inserir todos elementos do vetor.             ║");
            System.out.println("║ 2 - Mostrar todos elementos do vetor.             ║");
            System.out.println("║ 3 - Buscar um elemento do vetor pelo seu índice.  ║");
            System.out.println("║ 4 - Remover um elemento do vetor pelo seu índice. ║");
            System.out.println("║ 5 - Finalizar o programa.                         ║");
            System.out.println("╚═══════════════════════════════════════════════════╝");

            //to do (Garantir q o usuario informe apenas operaçoes validas)
            System.out.println(" ");
            System.out.println("           Informe a operação desejada!    ");
            operacao = scanner.nextInt();

            //
            while (operacao < 1 || operacao > 5) {
                System.out.println("Operação invalida. Digite um numero entre 1 e 5");
                operacao = scanner.nextInt();
            }

            if (operacao == 1) {
                //operacao é 1, ta pronto
                for (int i = 0; i < tamanho; i++) {
                    System.out.println("Insira um valor no vetor na posição " + i + ".");
                    vetor[i] = scanner.next(); //de int é nextint, e string nexline
                }

            } else if (operacao == 2) {
                // operacao é 2, ta pronto
                for (int i = 0; i < tamanho; i++) {
                    System.out.println("vetor[" + i + "] = " + vetor[i]);
                }

            } else if (operacao == 3) {
                //operação 3, ta pronto
                System.out.println("Informe o indice que deseja buscar");
                // criei um scanner para buscar o indice
                int buscar = scanner.nextInt();
                //vai ver se o numero informado esta no vetor
                if (buscar >= tamanho - 1 && buscar < tamanho) {
                    //peguei o valor do vetor e atribui a variavel elemento
                    String elemento = vetor[buscar];
                    System.out.println("O indice informado é o [" + elemento + "]");
                } else {
                    System.out.println("O indice informado é invalido, digite apenas entre 0 e " + tamanho);
                }

            } else if (operacao == 4) {
                //operação 4 - Remover um elemento do vetor pelo índice
                System.out.println("Informe o índice que deseja remover");
                int del = scanner.nextInt();

                if (del >= 0 && del < tamanho) {
                    for (int i = del; i < tamanho - 1; i++) {
                        vetor[i] = vetor[i + 1];
                    }
                    // Atualizar o tamanho do vetor
                    tamanho--;
                    System.out.println("Índice removido com sucesso");
                    System.out.println("O índice removido foi [" + del + "]");

                    // Exibir os elementos atualizados do vetor
                    for (int i = 0; i < tamanho; i++) {
                        System.out.println("vetor[" + i + "] = " + vetor[i]);
                    }
                } else {
                    System.out.println("Índice inválido. Digite um valor entre 0 e " + (tamanho - 1));
                }
            }

        } while (operacao != 5);
        System.out.println("Operação finalizada");

    }
}
