package main.java;

public abstract class Produto {

    //Atributos da classe produto//

    protected String nome;
    protected double preço;
    protected int quantidade;

    public Produto(String nome, double preço, int quantidade) {
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;
    }
    //Metodos da classe Produto//

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preço;
    }

    public void setPreco(double preco) {
        this.preço = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Método abstrato implementado nas classes filhas//

    public abstract String getDescricao();
}

