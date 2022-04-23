package eu.isaque.calculadora;

import java.util.Scanner;
@SuppressWarnings("all")
public class OperacaoPorcento extends OperacaoComum {
	private double porcentagem;
	
	public OperacaoPorcento(double primeirovalor, double segundovalor) {
		super(primeirovalor, segundovalor);
	}
	
	@Override
    public void ler() {
    	Scanner lerp = new Scanner(System.in);
    	System.out.println("Informe o valor que desejar: ");
        primeirovalor = lerp.nextDouble();
        
        System.out.println("Informe a porcentagem desejada: ");
        segundovalor = lerp.nextDouble();
    }
	public double getPvalorPor(){
        return primeirovalor;
    }
    public void setPvalorPor(double primeirovalor){
        this.primeirovalor = primeirovalor;
    }
    public double getSvalorPor(){
        return segundovalor;
    }
    public void setSvalorPor(double segundovalor){
        this.segundovalor = segundovalor;
    }
    public double getPorcento() {
    	return porcentagem;
    }
    public void setPorceto(double porcentagem) {
    	this.porcentagem = porcentagem;
    }
}
