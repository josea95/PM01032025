package main.java;

class ProdutoPao extends Produto {
    private String tipo;
    private int peso;

    public ProdutoPao(String nome, double preco, int quantidade, String tipo, int peso) {
        super(nome, preco, quantidade);
        this.tipo = tipo;
        this.peso = peso;
    }

    @Override
    public String getDescricao() {
        return nome + " - Tipo: " + tipo + ", Peso: " + peso + "g";
    }

    @Override
    public void atualizarEstoque(int quantidadeVendida) {
        super.atualizarEstoque( quantidadeVendida );
    }
}