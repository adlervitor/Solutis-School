//Questão 07

//import java.util.Scanner; // Importa o scanner
//
//public class TrocaValores {
//
//	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner(System.in); // Inicializa o scanner
//		
//		// Lê os valores
//        System.out.print("Valor de A: ");
//        double A = scanner.nextDouble();
//
//        System.out.print("Valor de B: ");
//        double B = scanner.nextDouble();
//
//        // Troca dos valores
//        double temp = A;
//        A = B;
//        B = temp;
//
//        // Valores trocados
//        System.out.println("Valores trocados:");
//        System.out.println("A = " + A);
//        System.out.println("B = " + B);
//
//        scanner.close(); // Fecha o scanner
//    }
//	
//}


//Questão 08

//import java.util.Scanner;
//
//public class ParImpar {
//	
//	public static void main(String[] args) {
//		
//	  Scanner scanner = new Scanner(System.in);
//	  
//      System.out.print("Digite um numero: ");
//      double num = scanner.nextDouble();
//      
//      if(num % 2 == 0) {
//    	  System.out.println("O número digitado eh par");
//      } else {
//    	  System.out.println("O número digitado eh impar");
//      }
//      
//      scanner.close();
//      
//  }
//	
//}


//Questão 09

//public class NumerosQuadrado {
//	
//	public static void main(String[] args) {
//		for(int i = 0; i <= 10; i++) {
//			int sqrt = i * i;
//			System.out.println("O quadrado de " + i + " é: " + sqrt);
//		}
//      
//  }
//	
//}


//Questão 10
//
//public class Divisao {
//	
//	public static void main(String[] args) {
//		int a = 6;
//		int b = 4;
//		int c = a / b;
//		
//		System.out.println("O valor de c é: " + c);
//  }
//	
//}


//Questão 11
//
//import java.util.Scanner;
//
//public class PesquisaProduto {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Digite o código do produto: ");
//        int codigo = scanner.nextInt();
//
//        String produto;
//
//        if (codigo == 001) {
//            produto = "Parafuso";
//        } else if (codigo == 002) {
//            produto = "Porca";
//        } else if (codigo == 003) {
//            produto = "Prego";
//        } else {
//            produto = "Diversos";
//        }
//
//        System.out.println("O produto selecionado é: " + produto);
//
//        scanner.close();
//  }
//	
//}


//Questão 12
//
//public class MultiplosDivisao {
//	public static void main(String[] args) {
//		for(int i = 0; i <= 100; i++) {
//			if(i % 3 == 0) {
//				double resultado = (double) i / 2;
//				System.out.println(resultado);
//			}
//		}
//	}
//	
//}


//Questão 13
//
//public class DadosResultado {
//    public static void main(String[] args) {
//        for (int dado1 = 1; dado1 <= 6; dado1++) {
//            for (int dado2 = 1; dado2 <= 6; dado2++) {
//                if (dado1 + dado2 == 7) {
//                    System.out.println("Possibilidades de soma: " + dado1 + ", " + dado2);
//                }
//            }
//        }
//    }
//}


//Questão 14
//
//import java.util.Scanner;
//
//public class MediaAritmetica {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int i = 0;
//        int soma = 0;
//
//        while (i < 50) {
//            System.out.print("Digite o número " + (i + 1) + ": ");
//            int numero = scanner.nextInt();
//            soma += numero;
//            i++;
//        }
//
//        double media = (double) soma / 50;
//        System.out.println("A média aritmética dos números digitados é: " + media);
//
//        scanner.close();
//    }
//}


//Questão 15
//
//import java.util.Scanner;
//
//public class MediaAritmeticaDo {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int i = 0;
//        int soma = 0;
//
//        do {
//            System.out.print("Digite o número " + (i + 1) + ": ");
//            int numero = scanner.nextInt();
//            soma += numero;
//            i++;
//        } while (i < 50);
//
//        double media = (double) soma / 50;
//        System.out.println("A média aritmética dos números é: " + media);
//
//        scanner.close();
//    }
//}