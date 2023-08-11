package testes;

import br.com.cursopcv.modelo.Produto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;


public class ProdutoManager {

    private final EntityManagerFactory emf;

    public ProdutoManager(String persistenceUnitNome) {
        emf = Persistence.createEntityManagerFactory(persistenceUnitNome);
    }

    public void adicionarProduto(String nome, String descricao, Double preco) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();

            Produto novoProduto = new Produto(nome, descricao, preco);
            em.persist(novoProduto);

            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void alterarPreco(Long codigo, Double novoPreco) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();

            Produto produto = em.find(Produto.class, codigo);
            if (produto != null) {
                produto.setPreco(novoPreco);
            }

            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void removerProduto(Long codigo) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();

            Produto produto = em.find(Produto.class, codigo);
            if (produto != null) {
                em.remove(produto);
            }

            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public List<Produto> listarProdutos() {
        EntityManager em = emf.createEntityManager();
        try {
            TypedQuery<Produto> query = em.createQuery("SELECT p FROM Produto p", Produto.class);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    public void fechar() {
        emf.close();
    }
}
