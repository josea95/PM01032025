package sistem;
import java.util.ArrayList;
import java.util.List;

public class VendaSimples implements Venda {

    private List<String> produtosVendidos;
    private double totalVendas;
    private Estoque estoque;

    public VendaSimples(Estoque estoque) {
        if (estoque == null) {
            throw new IllegalArgumentException("Erro: O estoque não pode ser nulo!");
        }

        this.estoque = estoque;
        this.produtosVendidos = new ArrayList<>();
        totalVendas = 0.0;
    }

    @Override
    public void realizarVenda(String nomeProduto, int quantidade) {

        if (estoque == null) {
            System.out.println("Erro: Estoque não foi inicializado.");
            return;
        }
        Produto produtoParaVender = null;

        // Buscar o produto no estoque

        for (Produto produto : estoque.produtos) {
            if (produto.getNome().equalsIgnoreCase(nomeProduto)) {
                produtoParaVender = produto;
                break;
            }
        }

        // Se o produto não foi encontrado, mostrar erro
        if (produtoParaVender == null) {
            System.out.println("Erro: Produto não encontrado no estoque.");
            return;
        }

        // Verificar se há quantidade suficiente no estoque
        if (produtoParaVender.getQuantidade() < quantidade) {
            System.out.println("Erro: Estoque insuficiente para a venda.");
            return;
        }

        // Atualizar estoque
        produtoParaVender.setQuantidade(produtoParaVender.getQuantidade() - quantidade);
        double valorVenda = produtoParaVender.getPreco() * quantidade;
        totalVendas += valorVenda;

        // Adicionar venda ao resumo
        produtosVendidos.add(quantidade + "x " + nomeProduto + " - R$" + valorVenda);
        System.out.println("Venda realizada com sucesso!");

        // Remover do estoque se a quantidade chegou a 0
        if (produtoParaVender.getQuantidade() == 0) {
            estoque.removerProduto(produtoParaVender);
        }
    }

    @Override
    public String gerarResumo() {
        if (produtosVendidos.isEmpty()) {
            return "Nenhuma venda realizada.";
        }

        StringBuilder resumo = new StringBuilder("Resumo da Venda:\n");
        for (String produto : produtosVendidos) {
            resumo.append(produto).append("\n");
        }
        resumo.append("Total das vendas: R$").append(totalVendas);
        return resumo.toString();
    }
}
