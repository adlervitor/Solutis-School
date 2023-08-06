//Questão 15

import java.util.Scanner;

public class MediaAritmeticaDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int soma = 0;

        do {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            soma += numero;
            i++;
        } while (i < 50);

        double media = (double) soma / 50;
        System.out.println("A media aritmética dos numeros eh: " + media);

        scanner.close();
    }
}