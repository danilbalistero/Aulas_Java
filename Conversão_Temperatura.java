import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        double c = 0, k, f, re, ra;
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite a temperatura Celsius e informaremos em K, F, Re e Ra:");
        double celsius = scanner.nextDouble();

        f = celsius * 9/5 + 32;
        k = celsius + 273.15;
        re = celsius * 0.8;
        ra = (celsius + 273.15) * 9/5;

        System.out.println("A temperatura em Fahrenheit é: " + f);
        System.out.println("A temperatura em Kelvin é: " + k);
        System.out.println("A temperatura em Reaumur é: " + ra);
        System.out.println("A temperatura em Rankine é: " + re);

    }

}
