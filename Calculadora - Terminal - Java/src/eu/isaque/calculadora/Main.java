package eu.isaque.calculadora;

import java.util.Scanner;
@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) {
        OperacaoComum comum = new OperacaoComum(0, 0);
        OperacaoPorcento porcento = new OperacaoPorcento(0, 0);
        OperacaoRaiz raiz = new OperacaoRaiz(0, 0);
        OperacaoPotencia pot = new OperacaoPotencia(0, 0);
	Scanner ler = new Scanner(System.in);
        int op = 0;
        int cont = 1;
        
        do{
            System.out.println("-----------------------------Menu-----------------------------");
            System.out.println("1 - Operação de soma!");
            System.out.println("2 - Operação de subtração!");
            System.out.println("3 - Operação de multiplicação!");
            System.out.println("4 - Operação de divisão!");
            System.out.println("5 - Operação(extra) de porcentagem!");
            System.out.println("6 - Operação(extra) de raiz quadrada!");
            System.out.println("7 - Operação(extra) de potenciação!");
            System.out.println("0 - Sair da Operação!");
            System.out.println("Escolha uma opção(0 a 7): ");
            System.out.println("--------------------------------------------------------------");
            op = ler.nextInt();
            switch(op){
                case 1: {
                    comum.ler();
                    comum.setSoma(comum.getPvalor() + comum.getSvalor());
                    System.out.println("-----------------------------Soma-----------------------------");
                    System.out.println("A soma dos valores é: " + comum.getSoma());
                    System.out.println("--------------------------------------------------------------");
                    break;
                }
                case 2: {
                    comum.ler();
                    comum.setSubtracao(comum.getPvalor() - comum.getSvalor());
                    System.out.println("-----------------------------Subtração-----------------------------");
                    System.out.println("A subtração dos valores é: " + comum.getSubtracao());
                    System.out.println("-------------------------------------------------------------------");
                    break;
                }
                case 3: {
                    comum.ler();
                    comum.setMultiplicar(comum.getPvalor() * comum.getSvalor());
                    System.out.println("-----------------------------Multiplicação-----------------------------");
                    System.out.println("A multiplicação dos valores é: " + comum.getMultiplicar());
                    System.out.println("-----------------------------------------------------------------------");
                    break;
                }
                case 4: {
                    comum.ler();
                    comum.setDividir(comum.getPvalor() / comum.getSvalor());
                    if(comum.getSvalor() == 0){
                        System.out.println("-----------------------------!ERRO!-----------------------------");
                        System.out.println("Não é possível dividir por 0(Zero)!");
                        System.out.println("----------------------------------------------------------------");
                    } else {
                        System.out.println("-----------------------------Divisão-----------------------------");
                        System.out.println("A divisão dos valores é: " + comum.getDividir());
                        System.out.println("-----------------------------------------------------------------");
                    }
                    break;
                }
                case 5: {
                    porcento.ler();
                    porcento.setPorceto(porcento.getPvalorPor() * (porcento.getSvalorPor() / 100));
                    System.out.println("------------------------------Porcentagem------------------------------");
                    System.out.println(porcento.getSvalorPor() +" por cento de " + porcento.getPvalorPor() + " é: " + porcento.getPorcento());
                    System.out.println("-----------------------------------------------------------------------");
                    break;
                }
                case 6: {
                    raiz.ler();
                    raiz.setRaiz(Math.sqrt(raiz.getPvalorRaiz()));
                    System.out.println("-----------------------------Raiz Quadrada-----------------------------");
                    System.out.println("A raiz quadradada de " + raiz.getPvalorRaiz() + " é: " + raiz.getRaiz());
                    System.out.println("-----------------------------------------------------------------------");	
                    break;
                }
                case 7: {
                    pot.ler();
                    pot.setPotencia(1);
                    System.out.println("------------------------------Potenciação------------------------------");
                    System.out.println(pot.getPvalorPot() + " elevado a " + pot.getSvalorPot() + " é: " + pot.getPotencia());
                    System.out.println("-----------------------------------------------------------------------");
                    break;
                }
                default: {
                    if(op != 0){
                        System.out.println("-----------------------------Inválido-----------------------------");
                        System.out.println("A opção informada é inválida!");
                        System.out.println("------------------------------------------------------------------");
                    } else {
                        cont = 0;
                    }
                }
            }
        }while(cont != 0);
    }
}
