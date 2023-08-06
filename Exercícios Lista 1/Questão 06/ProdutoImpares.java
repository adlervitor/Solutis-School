
public class ProdutoImpares {
    
    public static void main(String[] args) {
        
        int produto = 1;
        float produtoFloat = 1;
        
        for (int i = 15; i <= 30; i++) {
            if (i % 2 != 0) {
                produto *= i;
                produtoFloat *= i;
            }
        }
        
        System.out.println("Produto dos números ímpares: " + produto);
        System.out.println("Produto flutuante dos números ímpares: " + produtoFloat);
        
    }
    
}