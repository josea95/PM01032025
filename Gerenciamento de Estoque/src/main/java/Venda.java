package main.java;

public interface Venda {
    void realizarVenda(Produto produto, int quantidade);
    String gerarResumo();
}
