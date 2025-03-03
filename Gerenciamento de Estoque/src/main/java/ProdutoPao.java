package main.java;

import main.java.Produto;

// classe produtoPao herda de Produto//
public class ProdutoPao extends Produto {

    public String tipo;
    private double peso;

//Metodo Construtor Produto pao //

    public ProdutoPao(String nome, double preço, int quantidade, String tipo, double peso) {
        super(nome, preço, quantidade);
        this.tipo = tipo;
        this.peso = peso;
    }

    // Métodos Getters e Setters

    public String getTipoFarinha() {
        return tipo;
    }

    public void setTipoFarinha(String tipoFarinha) {
        this.tipo = tipoFarinha;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Sobrescrita do método //

    @Override
    public String getDescricao() {
        return "Pão: " + nome + " - Tipo: " + tipo + " - Peso: " + peso + "g - Preço: R$ " + preço;
    }
}