//Questão 07

import java.util.Scanner; // Importa o scanner

public class TrocaValores {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // Inicializa o scanner
			
			// Lê os valores
	    System.out.print("Valor de A: ");
	    double A = scanner.nextDouble();
	
		System.out.print("Valor de B: ");
		double B = scanner.nextDouble();
	
		// Troca dos valores
		double temp = A;
		A = B;
		B = temp;
	
		// Valores trocados
		System.out.println("Valores trocados:");
		System.out.println("A = " + A);
		System.out.println("B = " + B);
	
		scanner.close(); // Fecha o scanner
		
	}
	
}
