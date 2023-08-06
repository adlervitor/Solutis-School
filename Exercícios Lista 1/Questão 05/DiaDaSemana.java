import java.util.Scanner;

public class DiaDaSemana {
    
    public static void main (String[] args) {
        
        String[] diasSemana = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero de 1 a 7: ");
        int num = scanner.nextInt();
        
        if(num >= 1 && num <= 7) {
            System.out.println(diasSemana[num - 1]);
        } else {
            System.out.println("Dia não encontrado.");
        }
        
        scanner.close();
        
    }
    
}
