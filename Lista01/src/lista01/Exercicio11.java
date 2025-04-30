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
public class Exercicio11 {
  public static void main(String[] args) {
        try(Scanner ler = new Scanner(System.in)){

            int a,b;
            float diff = 0;

            System.out.println("Digite o primeiro número: ");
            a = ler.nextInt();
            System.out.println("Digite o segundo número: ");
            b = ler.nextInt();

            if(a > b)
                diff = (float)(a - b);
            if(b > a)
                diff = (float)(b - a);

            System.out.printf("A diferença do maior pro menor: %.2f", diff);

        }
    }
}
