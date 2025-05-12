/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio03;

/**
 *
 * @author mysterubuntu
 */
public class Televisao {
    private int volume;
    private int canal;
    private final int CANAL_MAXIMO = 400;
    private final int VOLUME_MAXIMO = 100;
    
    // Construtor de Inicialização
    public Televisao(int canal, int volume){
        this.canal = canal;
        this.volume = volume;
    }
   
    // Construtor padrão
    public Televisao(){
        this(1, 10); //1 e 10 são exemplos 
    }
    
    public void diminuirVolume(){
        if(volume > 0){ //n pode ter volume < 0
         volume--;   
        }
    }
        
    public void aumentarVolume(){
        if(volume < VOLUME_MAXIMO){ //n pode ter volume > 100
            volume++;
        }
    }
    
    public void diminuirCanal(){
        if(canal > 1){
           canal--;
        }
    }
    
    public void aumentarCanal(){
        if(canal < CANAL_MAXIMO){
            canal++;
        }
    }
    
    public void trocarCanal(int valor){
        if(valor > 0 && valor < CANAL_MAXIMO) {
            canal = valor;
        }
    }
    
    public void mostrarInfo(){
        System.out.println("Canal:");
        System.out.println(canal);
        System.out.println("Volume:");
        System.out.println(volume);
        System.out.println("\n");
    }
    
    public int devolverVolume(){
        return volume;
    }
    
    public int devolverCanal(){
        return canal;
    }
    
} //Final do código
