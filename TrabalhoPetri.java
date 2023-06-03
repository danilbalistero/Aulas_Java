package com.company;

import java.util.Scanner;

public class Trabalho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho, operacao;

        //Garantir q o tamanho seja positivo e inteiro
        System.out.println("Informe o tamanho do Vetor");
        tamanho = scanner.nextInt();

        //int [] vetor;

        String[] vetor = new String[tamanho];

        do {
            System.out.println("             ʕ•́ᴥ•̀ʔ Menu de Vetores ʕ•́ᴥ•̀ʔ");
            System.out.println(" __________________________________________________ ");
            System.out.println("| 1 - Inserir todos elementos do vetor.            |");
            System.out.println("| 2 - Mostrar todos elementos do vetor.            |");
            System.out.println("| 3 - Buscar um elemento do vetor pelo seu índice. |");
            System.out.println("| 4 - Remover um elemento do vetor pelo seu índice.|");
            System.out.println("| 5 - Finalizar o programa.                        |");
            System.out.println(" __________________________________________________ ");

            //to do (Garantir q o usuario informe apenas operaçoes validas)
            System.out.println("");
            System.out.println("Informe a operação desejada!");
            operacao = scanner.nextInt();

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

            } else if (operacao == 3){
                //operação 3

            } else if (operacao == 4){
                //operação 4

            }

        }   while (operacao != 5);
        System.out.println("operação finalizada");
    }

}
