/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadepratica;


public class AtividadePratica {

    public static void main(String[] args) {
     Estoque estoque = new Estoque(5); // Capacidade máxima de 5 produtos

        Produto p1 = new Produto(1, "Lápis", 3.0, 10);
        Produto p2 = new Produto(2, "Caneta", 5.0, 10);
        Produto p3 = new Produto(3, "Caderno", 20.0, 5);

        estoque.adicionarProduto(p1);
        estoque.adicionarProduto(p2);
        estoque.adicionarProduto(p3);

        System.out.println("\nLista de produtos:");
        estoque.listarProdutos();

        System.out.println("\nVerificação de disponibilidade:");
        System.out.println("Produto 1 disponível? ");
            estoque.verificarDisponibilidade(1);
        System.out.println("Produto 2 disponível? ");
            estoque.verificarDisponibilidade(2);

        System.out.println("\nRemovendo produto com ID 2...");
        estoque.removerProduto(2);

        System.out.println("\nLista de produtos:");
        estoque.listarProdutos();
        
        System.out.println("\nCompra aprovada de 7 unidades do produto ID 1. ");
        estoque.retirarUnidades(1, 7);
        
        System.out.println("\nReposição de 7 unidades do produto ID 3. ");
        estoque.adicionarUnidades(3, 7);
        
        System.out.println("\nLista de produtos:");
        estoque.listarProdutos();
    }
}
