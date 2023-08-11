package testes;

public class AlteracaoDeProduto {
    public static void main(String[] args) {
        ProdutoManager produtoManager = new ProdutoManager("controleestoque");

        produtoManager.alterarPreco(2L, 345.00);

        produtoManager.fechar();
    }
}
