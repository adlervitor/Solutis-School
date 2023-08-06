import java.util.Scanner;

public class ConsumoGasolina {

    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int quilometrosTotais = 0;
        int litrosTotais = 0;
        int tanque = 1;
        
        while (true) {
            
            System.out.print("Digite os quilômetros dirigidos no tanque " + tanque + " (ou -1 para finalizar): ");
            int quilometros = scanner.nextInt();
            
            if (quilometros == -1) {
                break;
            }
        
            System.out.print("Digite a quantidade de litros de gasolina consumidos: ");
            int litros = scanner.nextInt();
            
            double consumo = (double) quilometros / litros;
            System.out.println("Consumo no tanque " + tanque + ": " + consumo + " km/l");
                
            quilometrosTotais += quilometros;
            litrosTotais += litros;
            tanque++;
  
        }
        
        double consumoTotal = (double) quilometrosTotais / litrosTotais;
        System.out.println("Total de quilometros: " + quilometrosTotais + " km");
        System.out.println("Consumo total: " + consumoTotal + " km/l");
        System.out.println("Total de litros consumidos: " + litrosTotais);
        
        scanner.close();
        
    }
    
}
