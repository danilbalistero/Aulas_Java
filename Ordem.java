import java.util.Scanner;


public class Ordenacao {
   public static void main(String[] args) {


       Scanner scanner = new Scanner(System.in);
       int num_1, num_2, num_3, num_4, num_5 = 0;


       System.out.printf("Informe o primeiro numero");
       num_1 = scanner.nextInt();


       System.out.println("Informe o segundo numero");
       num_2 = scanner.nextInt();


       System.out.println("Informe o terceiro numero");
       num_3 = scanner.nextInt();


       System.out.println("Informe o quarto numero");
       num_3 = scanner.nextInt();


       System.out.println("Informe o quinto numero");
       num_4 = scanner.nextInt();


       int temp;
       while (num_1 > num_2 || num_2 > num_3 || num_3 > num_4 || num_4 > num_5) {
           if (num_1 > num_2) {
               temp = num_1;
               num_1 = num_2;
               num_2 = temp;
           }
           if (num_2 > num_3) {
               temp = num_2;
               num_2 = num_3;
               num_3 = temp;
           }
           if (num_3 > num_4) {
               temp = num_3;
               num_3 = num_4;
               num_4 = temp;
           }
           if (num_4 > num_5) {
               temp = num_4;
               num_4 = num_5;
               num_5 = temp;
           }
       }


      
       System.out.printf("Os numeros em ordem crescente sao: %d %d %d %d %d",
               num_1, num_2, num_3, num_4, num_5);
   }
}
