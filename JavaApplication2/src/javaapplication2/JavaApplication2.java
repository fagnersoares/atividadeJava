/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double peso, altura;
        Scanner ler = new Scanner(System.in);
        CalculadoraIMC calculadora = new CalculadoraIMC();
        
        System.out.println("Digite seu peso");
        peso = ler.nextDouble();
        System.out.println("Digite sua altura");
        altura = ler.nextDouble();
        
        double total = calculadora.calcular(altura, peso);
        
        
        calculadora.mostraIMC(total);
        
    }
    
}
