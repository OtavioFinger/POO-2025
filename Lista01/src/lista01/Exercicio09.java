/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista01;
/**
 *
 * @author mysterubuntu
 */
//Faça um programa que leia quantos minutos um atleta gastou na corrida e exiba o
//tempo em horas e minutos.

import java.util.Scanner;

public class Exercicio09 { //sujeria no buffer, é por isso aue ele não lê.

    public static void main(String[] args){
       try (Scanner ler = new Scanner(System.in)) { 
        
        int minutos;
        float horas;

        System.out.println("Digite quantos minutos: ");
        minutos = ler.nextInt();
        
        horas = (float)minutos / 60;
        System.out.printf("Horas: " + horas);

        }

    }   
}
