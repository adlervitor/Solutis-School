import java.util.Scanner;
public class VerificaPalindromo {
    
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        
        boolean ehPalindromo = true;
        int tamanho = palavra.length();
        
        for(int i = 0; i < tamanho / 2; i++) {
            if(palavra.charAt(i) != palavra.charAt(tamanho - i - 1)) {
                ehPalindromo = false;
                break;
            }
        }
        
        if(ehPalindromo) {
            System.out.println("A palavra eh um palindromo");
        } else {
            System.out.println("A palavra nao eh um palindromo");
        }
        
        scanner.close();
        
    }
    
}
