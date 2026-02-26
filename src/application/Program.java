package application;

import java.util.Scanner;

import entities.ProdutoService;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProdutoService service = new ProdutoService();
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Buscar produto por ID");
            System.out.println("4 - Atualizar produto");
            System.out.println("5 - Remover produto");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Preço: ");
                    Double preco = sc.nextDouble();
                    service.cadastrar(nome, null, preco);
                }
                case 2 -> service.listar();
                case 3 -> {
                    System.out.print("ID: ");
                    Long id = sc.nextLong();
                    var p = service.buscarPorId(id);
                    System.out.println(p != null ? p : "Produto não encontrado.");
                }
                case 4 -> {
                    System.out.print("ID: ");
                    Long id = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Novo nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Novo preço: ");
                    Double preco = sc.nextDouble();
                    service.atualizar(nome, id, preco);
                }
                case 5 -> {
                    System.out.print("ID: ");
                    Long id = sc.nextLong();
                    service.remover(id);
                }
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}