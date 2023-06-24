package com.company;

import java.util.Scanner;

public class Lista {

    public static void mostrarMatriz(String[][] matriz, int linhas, int colunas) {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void preencherMatriz(String[][] matriz, int linhas, int colunas){
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < linhas; i++) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("Insira uma informação textual na matriz linhas " + i + ".");
            System.out.println("--------------------------------------------------------------");

            for (int j = 0; j < colunas; j++) {
                System.out.println("Insira uma informação textual na matriz colunas " + j + ".");
                matriz[i][j] = scanner.next();
                System.out.println();
            }
        }
    }


    public static void main(String[] args) {
        int qtdLinhas = 5;
        int qtdColunas = 3;

        String [][] mercado = new String[qtdLinhas][qtdColunas];
        System.out.println("Matriz apos criação");
        mostrarMatriz(mercado, qtdLinhas, qtdColunas);

        preencherMatriz(mercado, qtdLinhas, qtdColunas);
        System.out.println("matriz apos criação");
        mostrarMatriz(mercado, qtdLinhas, qtdColunas);


    }
}
