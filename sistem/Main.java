package sistem;

import sistem.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque();
        VendaSimples vendas = new VendaSimples(estoque);


        int opcao;

        do {
            System.out.println("\n===== Sistema de Gestão da Panificadora =====");
            System.out.println("1 - Cadastrar Pão");
            System.out.println("2 - Cadastrar Bolo");
            System.out.println("3 - Exibir Estoque");
            System.out.println("4 - Realizar Venda");
            System.out.println("5 - Exibir Resumo das Vendas");
            System.out.println("6 - Remover Produto (se estoque zerado)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Pão: ");
                    String nomePao = scanner.nextLine();
                    System.out.print("Preço do Pão: ");
                    double precoPao = scanner.nextDouble();
                    System.out.print("Quantidade disponível: ");
                    int qtdPao = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Tipo de farinha: ");
                    String tipoFarinha = scanner.nextLine();
                    System.out.print("Peso (g): ");
                    double pesoPao = scanner.nextDouble();

                    ProdutoPao novoPao = new ProdutoPao(nomePao, precoPao, qtdPao, tipoFarinha, pesoPao);
                    estoque.adicionarProduto(novoPao);
                    System.out.println("Pão cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Nome do Bolo: ");
                    String nomeBolo = scanner.nextLine();
                    System.out.print("Preço do Bolo: ");
                    double precoBolo = scanner.nextDouble();
                    System.out.print("Quantidade disponível: ");
                    int qtdBolo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Sabor: ");
                    String sabor = scanner.nextLine();
                    System.out.print("Tem recheio? (true/false): ");
                    boolean temRecheio = scanner.nextBoolean();
                    scanner.nextLine();
                    System.out.print("Cobertura: ");
                    String cobertura = scanner.nextLine();

                    ProdutoBolo novoBolo = new ProdutoBolo(nomeBolo, precoBolo, qtdBolo, sabor, temRecheio, cobertura);
                    estoque.adicionarProduto(novoBolo);
                    System.out.println("Bolo cadastrado com sucesso!");
                    break;

                case 3:
                    estoque.exibirEstoque();
                    break;

                case 4:
                    System.out.print("Nome do produto a vender: ");
                    String nomeProdutoVenda = scanner.nextLine();
                    System.out.print("Quantidade: ");
                    int qtdVenda = scanner.nextInt();

                    vendas.realizarVenda(nomeProdutoVenda, qtdVenda);
                    break;

                case 5:
                    System.out.println(vendas.gerarResumo());
                    break;

                case 6:
                    System.out.print("Nome do produto para remoção: ");
                    String nomeProdutoRemover = scanner.nextLine();

                    for (Produto produto : estoque.produtos) {
                        if (produto.getNome().equalsIgnoreCase(nomeProdutoRemover)) {
                            estoque.removerProduto(produto);
                            break;
                        }
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}

