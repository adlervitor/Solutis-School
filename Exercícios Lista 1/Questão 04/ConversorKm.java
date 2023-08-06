import java.util.Scanner;

public class ConversorKm {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a distancia em milhas: ");
        double milhas = scanner.nextDouble();
        double quilometros = milhas * 1.609;
        
        System.out.println(milhas + " milhas eh igual a " + quilometros + " quilometros.");
        
        scanner.close();
        
    }
    
}