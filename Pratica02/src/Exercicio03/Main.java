
package Exercicio03;


public class Main {
      public static void main(String[] args) {
            Televisao TV;
            TV = new Televisao();
            
            TV.mostrarInfo();
            
            ControleRemoto CONTROLE = new ControleRemoto(TV);
            
            CONTROLE.mostrarInfo();
            CONTROLE.aumentarCanal();
            CONTROLE.mostrarInfo();
            
            TV.aumentarCanal();
            TV.aumentarVolume();
            
            CONTROLE.mostrarInfo();
            
            TV.trocarCanal(250);
            CONTROLE.mostrarInfo();
        }
}
