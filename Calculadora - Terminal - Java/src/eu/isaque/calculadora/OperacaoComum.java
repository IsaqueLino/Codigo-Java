package eu.isaque.calculadora;

import java.util.Scanner;
@SuppressWarnings("all")
public class OperacaoComum {
    protected double primeirovalor;
    protected double segundovalor;
    private double soma;
    private double subtracao;
    private double dividir;
    private double multiplicar;
    
    public OperacaoComum(double primeirovalor, double segundovalor) {
    	this.primeirovalor = primeirovalor;
    	this.segundovalor = segundovalor;
    }
    
    public void ler(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: ");
        primeirovalor = ler.nextDouble();
        
        System.out.println("Informe o segundo valor: ");
        segundovalor = ler.nextDouble();
    }
    public double getPvalor(){
        return primeirovalor;
    }
    public void setPvalor(double primeirovalor){
        this.primeirovalor = primeirovalor;
    }
    public double getSvalor(){
        return segundovalor;
    }
    public void setSvalor(double segundovalor){
        this.segundovalor = segundovalor;
    }
    public double getSoma(){
        return soma;
    }
    public void setSoma(double soma){
        this.soma = soma;
    }
    public double getSubtracao(){
        return subtracao;
    }
    public void setSubtracao(double subtracao){
        this.subtracao = subtracao;
    }
    public double getDividir(){
        return dividir;
    }
    public void setDividir(double dividir){
        this.dividir = dividir;
    }
    public double getMultiplicar(){
        return multiplicar;
    }
    public void setMultiplicar(double multiplicar){
        this.multiplicar = multiplicar;
    }
}
