/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadepratica;


public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int quantidade;

    //Método construtor
    public Produto(int id, String nome, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public boolean temEstoque() {
        return quantidade > 0;
    }
    
    public int retornaQuantidade() {
        return quantidade;
    }
    
    public int retornaId() {
        return id;
    }
    
    public String retornaNome() {
            return nome;
    }

    public double retornaPreco() {
            return preco;
    }
    
    public String getDescricao() {
        return "Produto ID: " + id + ", Nome: " + nome + ", Preço: R$" + preco + 
                ", + Quantidade: " + quantidade;
    }
    
    public void adicionarQuantidade(int add) {
        if ( add > 0 ) {
            quantidade = quantidade + add;
        }
    }

    public void retirarQuantidade(int sub) {
        if ( sub > 0 && quantidade >= sub ) {
            quantidade = quantidade - sub;
        } else {
            System.out.println("Quantidade insuficiente para retirar.");
        }
    }
    
    @Override //gpt disse que deveria fazer isso pra tirar os hexadecimais
    public String toString() {
    return "ID: " + id + " | Nome: " + nome + " | Preço: R$" + preco + " | Quantidade: " + quantidade;
    }
}