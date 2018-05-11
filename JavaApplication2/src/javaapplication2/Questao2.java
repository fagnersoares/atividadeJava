/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        String nome;
        double salario_base;
        double valor_hora;
        double total_extra;
        Scanner input = new Scanner(System.in);

        System.out.println("digite o nome do piao");
        nome = input.nextLine();

        System.out.println("digite o Salario base");
        salario_base = input.nextDouble();

        System.out.println("digite o valor da hora extra");
        valor_hora = input.nextDouble();

        System.out.println("digite o total de horas");
        total_extra = input.nextDouble();

        Empregado funcionario = new Empregado(nome, salario_base, valor_hora, total_extra);
        
        
        double empregado_salario_base = funcionario.getSalario_base();
        double empregado_valor_hora = funcionario.getValor_hora();
        double empregado_quantidade_extra = funcionario.getQuantidade_extra();

        funcionario.calcularSalarioMensal(empregado_salario_base, empregado_valor_hora, empregado_quantidade_extra);
        funcionario.exibirSalario();
    }
}
