
public class DivisaoMultiplos {
    
    public static void main (String[] args) {
            
        for (int i = 1; i <= 100; i++) {
            
            if (i % 3 == 0) {
                int resultInt = i / 2;
                double resultDouble = (double) i / 2;
                System.out.println(i + ": Dividido por 2 (int): " + resultInt + " | Dividido por 2 (double): " + resultDouble);
            }
            
        }
        
    }
           
}


