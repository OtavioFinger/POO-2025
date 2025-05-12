/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio03;

/**
 *
 * @author mysterubuntu
 */
public class ControleRemoto {
    private Televisao TV; //aqui é feita a conexão de associação
    
    public ControleRemoto(Televisao TV){ 
        this.TV = TV;
    }
    
    public void diminuirCanal(){
        TV.diminuirCanal();
    }
    
    public void aumentarCanal(){
        TV.aumentarCanal();
    }
    
    public void diminuirVolume(){
        TV.diminuirVolume();
    }
    
    public void aumentarVolume(){
        TV.aumentarVolume();
    }
    
    public void mostrarInfo(){
        TV.mostrarInfo();
    }
    
    public void trocarCanal(){
        TV.trocarCanal(5);
    }
}

