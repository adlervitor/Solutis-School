import java.util.Scanner;

public class AreaCirculo {
    
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o raio do circulo: ");
        double raio = scanner.nextDouble();
        
        double area = Math.PI * Math.pow(raio, 2);
        
        System.out.println("A area eh: " + Math.round(area));
        
        scanner.close();
        
    }
    
}
