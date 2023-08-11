package testes;

public class RemocaoDeProduto {
    public static void main(String[] args) {
        ProdutoManager produtoManager = new ProdutoManager("controleestoque");

        produtoManager.removerProduto(3L);
    }
}
