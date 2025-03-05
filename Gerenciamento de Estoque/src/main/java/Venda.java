package main.java;

public interface Venda {
    void realizarVenda(String nomeProduto, int quantidade);
    String gerarResumo();
}
