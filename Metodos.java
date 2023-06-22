package com.company;


public class PrimeiroMetodo {

    public static void printar(String t1, String t2) {
        System.out.println(t1);
        System.out.println(t2);
    }

    public static void somar(int ele1, int ele2) {
        int resultado;
        resultado = ele1 + ele2;
        System.out.println("A soma dos elementos é igual a: " + resultado);
    }

    public static void main(String[] args) {
        String texto1 = "TESTANDO";
        String texto2 = "Testando novamente";

        printar(texto1, texto2);

        somar(101, 23);
        somar(12, 43);

    }
}    
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
package com.company;


public class Matriz {

    public static void mostrarMatriz(String[][] sala) {
        //For mais externo é referente a variação das linhas
        for (int i = 0; i < 6; i++) {
            //For mais interno é referente a variação das colunas
            for (int j = 0; j < 4; j++) {
                System.out.print(sala[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int somar(int ele1, int ele2) {
        int resultado;
        resultado = ele1 + ele2;
       // System.out.println("A soma dos elementos é igual a: " + resultado);
        return resultado;
    }

    public static void main(String[] args) {
        String[][] sala = new String[6][4];

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

        mostrarMatriz(sala);

        System.out.println(somar(3,3));
    }
}
