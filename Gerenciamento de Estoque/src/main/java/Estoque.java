package main.java;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> estoquesLista;

    public Estoque() {
        this.estoquesLista = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        estoquesLista.add(produto);
    }

    public void removerProduto(String nomeProduto) {
        estoquesLista.removeIf(produto -> produto.nome.equalsIgnoreCase(nomeProduto));
    }

    public void exibirEstoque() {
        if (estoquesLista.isEmpty()) {
            System.out.println("Não existe nada cadastrado no estoque!");
        } else {
            System.out.println("Estoque atual:");
            for (Produto produto : estoquesLista) {
                System.out.println(produto.nome + " - Quantidade: " + produto.quantidade);
            }
        }
    }

    public void atualizarEstoque(String nomeProduto, int quantidadeVendida) {
        for (Produto produto : estoquesLista) {
            if (produto.nome.equalsIgnoreCase(nomeProduto)) {
                if (quantidadeVendida > produto.quantidade) {
                    System.out.println("Erro: Estoque insuficiente! Você quer comprar " + quantidadeVendida +
                            " unidades, mas há apenas " + produto.quantidade + " disponíveis.");
                } else {
                    produto.quantidade -= quantidadeVendida;
                    System.out.println("Venda concluída de " + quantidadeVendida + " " + produto.nome + "(s)!");
                    System.out.println("Restam " + produto.quantidade + " no estoque.");
                }
                return;
            }
        }
        System.out.println("Erro: Produto não encontrado no estoque!");
    }
}
