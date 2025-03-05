package main.java;

public class Main {
    public static void main(String[] args) {

        Estoque estoque = new Estoque();

        ProdutoPao paoFrances = new ProdutoPao("Pão Francês", 2.50, 35, "Pão", 60);
        ProdutoBolo boloChocolate = new ProdutoBolo("Bolo de Chocolate", 10, 30, "Chocolate", true);
        ProdutoBolo boloCenoura = new ProdutoBolo("Bolo de Cenoura", 11, 40, "Cenoura", false);

        VendaSimples vendas = new VendaSimples();

        estoque.adicionarProduto(paoFrances);
        estoque.adicionarProduto(boloChocolate);
        estoque.adicionarProduto(boloCenoura);
        //so ira remover depois que nao houver mais estoque nele
        estoque.removerProduto( boloCenoura );

        vendas.realizarVenda(paoFrances, 25);
        vendas.realizarVenda(boloChocolate, 15);
        vendas.realizarVenda( boloCenoura, 40 );

        System.out.println(vendas.gerarResumo());
        estoque.exibirEstoque();
        //remocao valida pq agora nao existe mais estoque do bolo de cenoura
        estoque.removerProduto( boloCenoura );

    }
}
