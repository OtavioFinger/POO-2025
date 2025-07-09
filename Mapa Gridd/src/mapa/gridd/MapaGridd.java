/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mapa.gridd;
import javax.swing.*;
import java.awt.GridLayout;
import java.io.*;

public class MapaGridd {

    private static int heroiX = 0; // Posição inicial X (linha)
    private static int heroiY = 0;
    private static JButton[][] grid = new JButton[5][5];
    
    private static void moverHeroi(int deltaX, int deltaY) {
    int novoX = heroiX + deltaX;
    int novoY = heroiY + deltaY;
    // Verifica se a nova posição está dentro dos limites do

    if (novoX >= 0 && novoX < 5 && novoY >= 0 && novoY < 5) {
    // Limpa a posição atual do herói
    grid[heroiX][heroiY].setIcon(null);
    // Atualiza a posição do herói
    heroiX = novoX;
    heroiY = novoY;
    // Define o ícone do herói na nova posição
    grid[heroiX][heroiY].setIcon(new ImageIcon("/home/mysterubuntu/Desktop/Disciplinas.png"));
    }
    }
    
    public static void main(String[] args) {
       JFrame frame = new JFrame("Janela");
      
        
    frame.setSize(1280, 720);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new GridLayout(5, 5));


        // Preenche o grid com botões
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                grid[i][j] = new JButton();
                grid[i][j].setEnabled(false);
                frame.add(grid[i][j]);
            }
        }
    frame.setVisible(true);
    
    grid[0][0].setIcon(new ImageIcon("/home/mysterubuntu/Desktop/Disciplinas.png"));
    grid[0][0].setEnabled(true);
    
    
    moverHeroi(2,1);
    }
            
    
}
