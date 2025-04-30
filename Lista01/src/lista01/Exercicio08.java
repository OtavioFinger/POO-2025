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
public class Exercicio08 {
      public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int a, b, c, d, e;
        float media;
        int soma;
        int min;
        int max;

        System.out.print("Digite o primeiro número: ");
        a = ler.nextInt(); ler.nextLine(); // garante que o buffer seja limpo
        System.out.print("Digite o segundo número: ");
        b = ler.nextInt(); ler.nextLine();
        System.out.print("Digite o terceiro número: ");
        c = ler.nextInt(); ler.nextLine();
        System.out.print("Digite o quarto número: ");
        d = ler.nextInt(); ler.nextLine();
        System.out.print("Digite o quinto número: ");
        e = ler.nextInt(); ler.nextLine();

        media = (float)(a + b + c + d + e) / 5;
        soma = a + b + c + d + e;

        min = a;
        max = a;

        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;
        if (e < min) min = e;

        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;
        if (e > max) max = e;

        System.out.printf("A média é: %.2f\n", media);
        System.out.println("A soma é: " + soma);
        System.out.println("O maior é: " + max);
        System.out.println("O menor é: " + min);
        ler.close();
    }
}

