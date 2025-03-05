package main.java;

public class Main {
        public static void main(String[] args) {
            Estoque estoque = new Estoque();
            ProdutoPao paoFrances = new ProdutoPao( "Pao Frances", 2.50, 35,"Pao",60 );
            ProdutoBolo boloChocolate = new ProdutoBolo("Bolo de Chocolate", 10,30,"Chocolate", true, "Chocolate" );


            VendaSimples vendas= new VendaSimples();

            estoque.adicionarProduto(paoFrances);
            estoque.adicionarProduto(boloChocolate);
            estoque.exibirEstoque();

            // Testando atualização de estoque

            estoque.atualizarEstoque("Pao Frances", 25);
            estoque.atualizarEstoque("Bolo de Chocolate", 5);

            estoque.exibirEstoque();

            vendas.realizarVenda(  "Pao Frances", 10);
            vendas.realizarVenda(  "Bolo de Chocolate", 5);

            vendas.gerarResumo();

        }
    }

