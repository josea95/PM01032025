package main.java;

class ProdutoBolo extends Produto {
    private String sabor;
    private boolean recheado;

    public ProdutoBolo(String nome, double preco, int quantidade, String sabor, boolean recheado) {
        super(nome, preco, quantidade);
        this.sabor = sabor;
        this.recheado = recheado;
    }

    @Override
    public String getDescricao() {
        return nome + " - Sabor: " + sabor + ", Recheado: " + (recheado ? "Sim" : "Não");
    }

    @Override
    public void atualizarEstoque(int quantidadeVendida) {
        super.atualizarEstoque( quantidadeVendida );
    }
}
