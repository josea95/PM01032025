package main.java;

import java.util.ArrayList;
import java.util.List;

public class VendaSimples implements Venda {
    private List<String> produtosVendidos;
    private double totalVendas;

    public VendaSimples() {
        produtosVendidos = new ArrayList<>();
        totalVendas = 0.0;
    }

    @Override
    public void realizarVenda(Produto produto, int quantidade) {
        if (produto.getQuantidade() >= quantidade) {
            produto.atualizarEstoque(quantidade);
            double valorVenda = produto.getPreco() * quantidade;
            totalVendas += valorVenda;
            produtosVendidos.add(quantidade + "x " + produto.getNome() + " - R$" + valorVenda);
            System.out.println("Venda realizada: " + quantidade + "x " + produto.getNome());
        } else {
            System.out.println("Erro: Estoque insuficiente para " + produto.getNome());
        }
    }

    @Override
    public String gerarResumo() {
        StringBuilder resumo = new StringBuilder("Resumo das Vendas:\n");
        for (String venda : produtosVendidos) {
            resumo.append(venda).append("\n");
        }
        resumo.append("Total: R$").append(totalVendas);
        return resumo.toString();
    }
}
