/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author fagner.soares
 */
public class CalculadoraIMC {

    double peso;
    double altura;

    public double calcular(double al, double pe) {
        this.peso = pe;
        this.altura = al;
        double total = pe / (al * al);
        return total;
    }

    public void mostraIMC(double total) {
        
        if(total > 16 && total < 18.4){
            System.out.println("Abaixo do peso " + total);
        }
        if(total > 18.5 && total < 24.9){
            System.out.println("Peso normal " + peso);
        }
        if(total > 25 && total < 29.9){
            System.out.println("Acima do peso " + peso);
        }
        if(total > 30){
            System.out.println("Obesidade " + peso);
        }
    }
}
