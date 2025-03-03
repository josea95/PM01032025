package main.java;// Classe ProdutoBolo herda de Produto

public class ProdutoBolo extends Produto {
    private String sabor;
    private boolean temRecheio;
    private String cobertura;

    // Construtor
    public ProdutoBolo(String nome, double preço, int quantidade, String sabor, boolean temRecheio, String cobertura) {
        super(nome, preço, quantidade);
        this.sabor = sabor;
        this.temRecheio = temRecheio;
        this.cobertura = cobertura;
    }

    // Métodos Getters e Setters

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public boolean isTemRecheio() {
        return temRecheio;
    }

    public void setTemRecheio(boolean temRecheio) {
        this.temRecheio = temRecheio;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    // Sobrescrita do método//

    @Override
    public String getDescricao() {
        return "Bolo: " + nome + " - Sabor: " + sabor +
                (temRecheio ? " com recheio" : " sem recheio") +
                " - Cobertura: " + cobertura + " - Preço: R$ " + preço;
    }
}
