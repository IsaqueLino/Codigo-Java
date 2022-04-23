package eu.isaque.calculadora;

import java.util.Scanner;
@SuppressWarnings("all")

public class OperacaoRaiz extends OperacaoComum {
	private double raiz;

	public OperacaoRaiz(double primeirovalor, double segundovalor) {
		super(primeirovalor, segundovalor);
		
	}
	@Override
	public void ler() {
		Scanner lerr = new Scanner(System.in);
    	System.out.println("Informe o valor que deseja colocar na raiz quadrada: ");
        primeirovalor = lerr.nextDouble();
        
	}
	public double getPvalorRaiz(){
        return primeirovalor;
    }
    public void setPvalorRaiz(double primeirovalor){
        this.primeirovalor = primeirovalor;
    }
    public double getRaiz() {
    	return raiz;
    }
    public void setRaiz(double raiz) {
    	this.raiz = raiz;
    }
}
