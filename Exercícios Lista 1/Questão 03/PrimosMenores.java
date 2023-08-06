import java.util.Scanner;

public class PrimosMenores {
    
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro: ");
        int num = scanner.nextInt();
        
        for(int i = 2; i < num; i++) {
            boolean ehPrimo = true;
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    ehPrimo = false;
                    break;
                }
                
            }
            
            if(ehPrimo) {
                System.out.println(i + " ");
            }
            
        }
        
        scanner.close();
        
    }
    
}
