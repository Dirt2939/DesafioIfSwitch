/*
 * Estação do Ano: Dado um mês representado por um número (1 para
 * Janeiro, 12 para Dezembro), informe a estação do ano correspondente
 * no hemisfério sul.
 */
package desafioifswitch;

import java.util.Scanner;

/**
 *
 * @author aluno.saolucas
 */
public class DesafioIfSwitchExer10 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o número de um mês no ano: ");
        int mes = ler.nextInt();
        
        switch (mes) {
        
            case 1:
                System.out.println("Verão");
                break;

            case 2:
                System.out.println("Verão");
                break;

            case 3:
                System.out.println("Verão");
                break;

            case 4:
                System.out.println("Outono");
                break;

            case 5:
                System.out.println("Outono");
                break;

            case 6:
                System.out.println("Outono");
                break;

            case 7:
                System.out.println("Inverno");
                break;

            case 8:
                System.out.println("Inverno");
                break;

            case 9:
                System.out.println("Inverno");
                break;

            case 10:
                System.out.println("Primavera");
                break;

            case 11:
                System.out.println("Primavera");
                break;

            case 12:
                System.out.println("Primavera");
                break;

            default:
                System.out.println("Deu erro");
                break;
            
        }
        
    }
}
