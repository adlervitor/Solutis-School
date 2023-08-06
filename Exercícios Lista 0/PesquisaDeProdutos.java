//Questão 11

import java.util.Scanner;

public class PesquisaDeProdutos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();

        String produto;

        if (codigo == 001) {
            produto = "Parafuso";
        } else if (codigo == 002) {
            produto = "Porca";
        } else if (codigo == 003) {
            produto = "Prego";
        } else {
            produto = "Diversos";
        }

        System.out.println("O produto selecionado é: " + produto);

        scanner.close();
        
  }
	
}