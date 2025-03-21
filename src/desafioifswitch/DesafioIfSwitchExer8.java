/*
 * Dia da Semana: Dado um número de 1 a 7, imprima o dia da semana
 * correspondente, sendo 1 para segunda-feira e 7 para domingo.
 */
package desafioifswitch;

import java.util.Scanner;

/**
 *
 * @author aluno.saolucas
 */
public class DesafioIfSwitchExer8 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o número do dia da semana: ");
        int dia = ler.nextInt();

        switch (dia) {

            case 1:
                System.out.println("Hoje é Segunda-feira");
                break;

            case 2:
                System.out.println("Hoje é Terça-feira");
                break;

            case 3:
                System.out.println("Hoje é Quarta-feira");
                break;

            case 4:
                System.out.println("Hoje é Quinta-feira");
                break;

            case 5:
                System.out.println("Hoje é Sexta-feira");
                break;

            case 6:
                System.out.println("Hoje é Sábado");
                break;

            case 7:
                System.out.println("Hoje é Domingo");
                break;
                
            default: System.out.println("Deu erro");

        }

    }
}
