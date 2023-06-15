package com.company;


public class Matriz {
    public static void main(String[] args) {
        String [][] sala = new String [6][4];

        sala[0][2] = "Paulo";
        sala[0][0] = "Ana";
        sala[1][0] = "Rosa";
        sala[1][1] = "Cleo";
        sala[1][3] = "Rui";
        sala[2][2] = "João";
        sala[2][3] = "Sonia";
        sala[3][1] = "Mari";
        sala[4][0] = "Rony";
        sala[4][3] = "José";
        sala[5][1] = "Jonas";
        sala[5][2] = "Lucy";


        //int i = 1;
        //int j = 3;
        //sala[i][j]

        //For mais externo é referente a variação das linhas
        for (int i = 0; i < 6; i++) {
            //For mais interno é referente a variação das colunas
            for (int j = 0; j < 4; j++) {
                System.out.print(sala[i][j] + " ");
            }
            System.out.println("");
        }

    }
}    
    
