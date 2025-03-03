
    public class Main {
        public static void main(String[] args) {
            Estoque estoque = new Estoque();

            ProdutoPao paoFrances = new ProdutoPao("Pão Francês", 4,50,"pao", 3);

            estoque.adicionarProduto(paoFrances);

            estoque.exibirEstoque();
            // Testando atualização de estoque

            estoque.atualizarEstoque("Pão Francês", 25);
            estoque.atualizarEstoque("Bolo de Chocolate", 5);
        }
    }

