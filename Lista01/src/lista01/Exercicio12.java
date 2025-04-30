/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista01;
import java.util.Scanner;
/**
 *
 * @author mysterubuntu
 */
public class Exercicio12 {
    public static void main(String[] args) {
            try(Scanner ler = new Scanner(System.in)){
            
                int x,y;

                System.out.println("Diga o número X pra saber se é múltiplo de Y: ");
                x = ler.nextInt();
                System.out.println("Diga o número Y: ");
                y = ler.nextInt();
            
            if(x % y == 0)
                System.out.printf("%d é múltiplo de %d\n", x, y);
            else
                System.out.printf("%d não é múltiplo de %d\n", x, y);
            }
        }
        
    }
