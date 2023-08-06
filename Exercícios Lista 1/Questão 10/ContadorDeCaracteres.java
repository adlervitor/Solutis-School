import java.util.Scanner;

public class ContadorDeCaracteres {
    
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma palavra ou cadeia de caracteres: ");
        String texto = scanner.nextLine();
        
        int vogais = 0;
        int consoantes = 0;
        int espacos = 0;
        
        for(char c : texto.toCharArray()) {
            
            if(Character.isLetter(c)) {
                if("AEIOUaeiou".indexOf(c) >= 0) {
                    vogais++;
                } else {
                    consoantes++;
                }
            } else if (Character.isWhitespace(c)) {
                espacos++;
            }
        }
        
        System.out.println("Vogais: " + vogais);
        System.out.println("Consoantes: " + consoantes);
        System.out.println("Espacos: " + espacos);
        
        scanner.close();
        
    }
    
}
