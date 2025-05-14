/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio04;

/**
 *
 * @author mysterubuntu
 */
public class Main {
    public static void main(String[] args){
        
        RelogioDigital objRelogio;
        objRelogio = new RelogioDigital(16,37);
        
        objRelogio.alterarHora(17);
        objRelogio.alterarMinuto(80);
        
        for(int i = 0; i < 24; i++){
        objRelogio.atualizaVisor();
        
        objRelogio.eventoDoVisor();
        
        }
    }
}
