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
public class Empregado {

    private double desconto = 0.02;

    private String nome;
    private double salario_base;
    private double valor_hora;
    private double quantidade_extra;
    private double salario_liquido;

    public Empregado(String nome, double salario_base, double valor_hora, double quantidade_extra) {
        this.nome = nome;
        this.salario_base = salario_base;
        this.valor_hora = valor_hora;
        this.quantidade_extra = quantidade_extra;
    }

    /**
     * @return the desconto
     */
    public double getDesconto() {
        return desconto;
    }

    /**
     * @param desconto the desconto to set
     */
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the salario_base
     */
    public double getSalario_base() {
        return salario_base;
    }

    /**
     * @param salario_base the salario_base to set
     */
    public void setSalario_base(double salario_base) {
        this.salario_base = salario_base;
    }

    /**
     * @return the valor_hora
     */
    public double getValor_hora() {
        return valor_hora;
    }

    /**
     * @param valor_hora the valor_hora to set
     */
    public void setValor_hora(double valor_hora) {
        this.valor_hora = valor_hora;
    }

    /**
     * @return the total_extra
     */
    public double getQuantidade_extra() {
        return quantidade_extra;
    }

    /**
     * @param total_extra the total_extra to set
     */
    public void setQuantidade_extra(double total_extra) {
        this.quantidade_extra = quantidade_extra;
    }

    /**
     * @return the salario_liquido
     */
    public double getSalario_liquido() {
        return salario_liquido;
    }

    /**
     * @param salario_liquido the salario_liquido to set
     */
    public void setSalario_liquido(double salario_liquido) {
        this.salario_liquido = salario_liquido;
    }

    public void calcularSalarioMensal(double salario_base, double valor_hora, double quantidade_extra) {

        double salarioMensal;
        salarioMensal = (salario_base + (valor_hora * quantidade_extra)) - (salario_base * this.desconto);
        this.setSalario_liquido(salarioMensal);
    }

    public void calcularAumentoSalario(double aumento) {
        double salarioAumento;
        salarioAumento = this.salario_base * (this.salario_base * aumento);
        this.salario_base = salarioAumento;
    }

    public void exibirSalario() {
        System.out.println("Salario base " + this.salario_base + "\nHoras extras "+ this.quantidade_extra + "\nSalario liquido " + this.salario_liquido);
    }

}
