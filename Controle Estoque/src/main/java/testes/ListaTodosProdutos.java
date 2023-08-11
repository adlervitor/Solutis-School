package testes;

import br.com.cursopcv.modelo.Produto;
import java.util.List;

public class ListaTodosProdutos {
    public static void main(String[] args) {
        ProdutoManager produtoManager = new ProdutoManager("controleestoque");

        List<Produto> produtos = produtoManager.listarProdutos();

        for (Produto produto : produtos) {
            System.out.println("Produto: " + produto.getNome() + ", Descrição: " + produto.getDescricao() + ", Preço: " + produto.getPreco());
        }

        produtoManager.fechar();
    }
}
