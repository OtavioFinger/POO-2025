/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio02;

public class Elevador {
    private int andarAtual; //térreo é 0
    private int totalAndares; // sem térreo
    private int capacidade;
    private int numPessoas;
    
    private final int TERREO = 0;
    
    public Elevador(){
        //Construtor vazio, Inicializa que faz.
    }
    
    public void Inicializa(int capacidade, int totalAndares){
        this.andarAtual = TERREO;
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.numPessoas = 0;
         //Verdadeiro método construtor
    }
    

    public void Entra(){
        if (numPessoas < capacidade)
            numPessoas++;
    }
    
    public void Sai(){
        if (numPessoas != 0)
            numPessoas--;
    }
    
    public void Sobe(){
        if(andarAtual < totalAndares)
            andarAtual++;
    }
    
    public void Desce(){
        if(andarAtual > TERREO)
             andarAtual--;
    }
    
    public void mostrarInfo(){
        System.out.println("Andar Atual:");
        System.out.println(andarAtual);
        System.out.println("Pessoas:");
        System.out.println(numPessoas);
        System.out.println("\n");
    }
}
