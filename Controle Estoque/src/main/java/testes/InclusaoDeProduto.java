package testes;

public class InclusaoDeProduto {
    public static void main(String[] args) {
        ProdutoManager produtoManager = new ProdutoManager("controleestoque");

        produtoManager.adicionarProduto("Panela", "Panela de Pressão 10 Litros", 56.80);
        produtoManager.adicionarProduto("Cama", "Cama de casal Big", 450.68);
        produtoManager.adicionarProduto("Caixa Som", "Caixa de Som JBL", 160.00);

        produtoManager.fechar();
    }
}
