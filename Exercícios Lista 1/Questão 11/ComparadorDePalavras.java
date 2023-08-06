import java.util.Scanner;

public class ComparadorDePalavras {

    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();
        
        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();
        
        if (palavra1.compareTo(palavra2) < 0) {
            System.out.println(palavra1 + ", " + palavra2);
        } else {
            System.out.println(palavra2 + ", " + palavra1);
        }
        
        if (palavra1.length() > palavra2.length()) {
            System.out.println("A primeira tem mais caracteres.");
        } else if (palavra1.length() < palavra2.length()) {
            System.out.println("A segunda tem mais caracteres.");
        } else {
            System.out.println("Mesmo numero de caracteres.");
        }
        
        scanner.close();
        
    }
    
}
