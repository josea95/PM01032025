import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void exibirEstoque() {
        System.out.println("Estoque atual:");
        for (Produto produto : produtos) {
            System.out.println(produto.getDescricao() + " - Quantidade: " + produto.getQuantidade());
        }
    }

    public void removerProduto(Produto produto) {
        // Remocao do produto somente quando ele chegar/for 0
        if (produto.getQuantidade() == 0) {
            produtos.removeIf(produtoParaRemover -> produtoParaRemover.getNome().equals(produto.getNome()));
            System.out.println(produto.getNome() + " removido com sucesso");
        } else {
            System.out.println("Não é possível remover " + produto.getNome() + " enquanto houver estoque.");
        }
    }

}
