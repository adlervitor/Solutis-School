//Questão 14

import java.util.Scanner;

public class MediaAritmetica {
	
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int i = 0;
        int soma = 0;
        
        while (i < 50) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            soma += numero;
            i++;
        }
        
        double media = (double) soma / 50;
        System.out.println("A media aritmetica dos numeros eh: " + media);
        
        scanner.close();
            
    }
        
}