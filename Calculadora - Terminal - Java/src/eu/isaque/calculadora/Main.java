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
            System.out.println("1 - Opera��o de soma!");
            System.out.println("2 - Opera��o de subtra��o!");
            System.out.println("3 - Opera��o de multiplica��o!");
            System.out.println("4 - Opera��o de divis�o!");
            System.out.println("5 - Opera��o(extra) de porcentagem!");
            System.out.println("6 - Opera��o(extra) de raiz quadrada!");
            System.out.println("7 - Opera��o(extra) de potencia��o!");
            System.out.println("0 - Sair da Opera��o!");
            System.out.println("Escolha uma op��o(0 a 7): ");
            System.out.println("--------------------------------------------------------------");
            op = ler.nextInt();
            switch(op){
                case 1: {
                    comum.ler();
                    comum.setSoma(comum.getPvalor() + comum.getSvalor());
                    System.out.println("-----------------------------Soma-----------------------------");
                    System.out.println("A soma dos valores �: " + comum.getSoma());
                    System.out.println("--------------------------------------------------------------");
                    break;
                }
                case 2: {
                	comum.ler();
                	comum.setSubtracao(comum.getPvalor() - comum.getSvalor());
                    System.out.println("-----------------------------Subtra��o-----------------------------");
                    System.out.println("A subtra��o dos valores �: " + comum.getSubtracao());
                    System.out.println("-------------------------------------------------------------------");
                    break;
                }
                case 3: {
                	comum.ler();
                	comum.setMultiplicar(comum.getPvalor() * comum.getSvalor());
                    System.out.println("-----------------------------Multiplica��o-----------------------------");
                    System.out.println("A multiplica��o dos valores �: " + comum.getMultiplicar());
                    System.out.println("-----------------------------------------------------------------------");
                    break;
                }
                case 4: {
                	comum.ler();
                	comum.setDividir(comum.getPvalor() / comum.getSvalor());
                    if(comum.getSvalor() == 0){
                        System.out.println("-----------------------------!ERRO!-----------------------------");
                        System.out.println("N�o � poss�vel dividir por 0(Zero)!");
                        System.out.println("----------------------------------------------------------------");
                    } else {
                        System.out.println("-----------------------------Divis�o-----------------------------");
                        System.out.println("A divis�o dos valores �: " + comum.getDividir());
                        System.out.println("-----------------------------------------------------------------");
                    }
                    break;
                }
                case 5: {
                	porcento.ler();
                	porcento.setPorceto(porcento.getPvalorPor() * (porcento.getSvalorPor() / 100));
                	System.out.println("------------------------------Porcentagem------------------------------");
                    System.out.println(porcento.getSvalorPor() +" por cento de " + porcento.getPvalorPor() + " �: " + porcento.getPorcento());
                    System.out.println("-----------------------------------------------------------------------");
                	break;
                }
                case 6: {
                	raiz.ler();
                	raiz.setRaiz(Math.sqrt(raiz.getPvalorRaiz()));
                	System.out.println("-----------------------------Raiz Quadrada-----------------------------");
                    System.out.println("A raiz quadradada de " + raiz.getPvalorRaiz() + " �: " + raiz.getRaiz());
                    System.out.println("-----------------------------------------------------------------------");	
                    break;
                }
                case 7: {
                	pot.ler();
                	pot.setPotencia(1);
                	System.out.println("------------------------------Potencia��o------------------------------");
                    System.out.println(pot.getPvalorPot() + " elevado a " + pot.getSvalorPot() + " �: " + pot.getPotencia());
                    System.out.println("-----------------------------------------------------------------------");
                	break;
                }
                default: {
                    if(op != 0){
                        System.out.println("-----------------------------Inv�lido-----------------------------");
                        System.out.println("A op��o informada � inv�lida!");
                        System.out.println("------------------------------------------------------------------");
                    } else {
                        cont = 0;
                    }
                }
            }
        }while(cont != 0);
    }
}
