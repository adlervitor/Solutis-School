//Questão 08

import java.util.Scanner;

public class ParOuImpar {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
          
        System.out.print("Digite um numero: ");
        double num = scanner.nextDouble();
          
        //Verifica se é par
        if(num % 2 == 0) {
            System.out.println("O numero digitado eh par");
        } else {
            System.out.println("O numero digitado eh impar");
        }
          
        scanner.close();
          
    }
	
}