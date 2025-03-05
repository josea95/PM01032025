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
    public void realizarVenda(String nomeProduto, int quantidade) {
        // Simulação
        double precoProduto = 50.0;  // Simulando o preço fixo do produto
        double valorVenda = precoProduto * quantidade;
        totalVendas += valorVenda;

        // Adicionando o produto vendido ao resumo
        produtosVendidos.add(quantidade + "x " + nomeProduto + " - R$" + valorVenda);

        System.out.println("Venda de " + quantidade + "x " + nomeProduto + " realizada com sucesso!");
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
