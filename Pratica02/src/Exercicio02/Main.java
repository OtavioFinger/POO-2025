/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio02;

public class Main {
    public static void main(String[] args) {
        Elevador ObjElevador;
        ObjElevador = new Elevador();
        
        ObjElevador.Inicializa(5,10); //capacidade, totalAndares

      
        ObjElevador.mostrarInfo();
        
        ObjElevador.Entra();
        ObjElevador.mostrarInfo();
    
        ObjElevador.Entra();
        ObjElevador.mostrarInfo();
        
        ObjElevador.Sobe();
        ObjElevador.mostrarInfo();
        
        ObjElevador.Sobe();
        ObjElevador.mostrarInfo();
        
    }
}
