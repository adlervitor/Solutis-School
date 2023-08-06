import java.util.Scanner;

public class MaiorValor {
    
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Digite outro numero: ");
        int num2 = scanner.nextInt();
        
        int maior = num1 > num2 ? num1 : num2;
        
        System.out.println("O maior eh: " + maior);
        
        scanner.close();
        
    }
}
