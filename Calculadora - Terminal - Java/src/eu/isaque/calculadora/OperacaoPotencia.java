package eu.isaque.calculadora;

import java.util.Scanner;

@SuppressWarnings("all")

public class OperacaoPotencia extends OperacaoComum {
	private double potencia;

	public OperacaoPotencia(double primeirovalor, double segundovalor) {
		super(primeirovalor, segundovalor);
	}
	@Override
	public void ler() {
		Scanner lere = new Scanner(System.in);
		System.out.println("Informe o valor que desejar: ");
        primeirovalor = lere.nextDouble();
        
        System.out.println("Informe a potência desejada: ");
        segundovalor = lere.nextDouble();
	}
	public double getPvalorPot(){
        return primeirovalor;
    }
    public void setPvalorPot(double primeirovalor){
        this.primeirovalor = primeirovalor;
    }
    public double getSvalorPot(){
        return segundovalor;
    }
    public void setSvalorPot(double segundovalor){
        this.segundovalor = segundovalor;
    }
    public double getPotencia() {
    	return potencia;
    }
    public double setPotencia(double potencia) {
    	int cont = 0;
    	for(cont = 0; cont < segundovalor; cont++) {
    		potencia = potencia * primeirovalor;
    	}
		return this.potencia = potencia;
    }
}
