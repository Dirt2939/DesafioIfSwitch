/*
 * Verificando um trapézio: Faça um programa que calcule e mostre a
área de um trapézio. Sabe-se que:
 A = ((basemaior + basemenor) * altura) / 2
Lembre-se a base maior e a base menor devem ser números
maiores que zero.
 */
package desafioifswitch;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class DesafioSwitchExer6 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a base menor, a base maior e "
                + "a altura de um trápezio");
        double baseMenor = ler.nextDouble();
        double baseMaior = ler.nextDouble();
        double altura = ler.nextDouble();
        
        if (baseMenor > 0 && baseMaior > 0) {
        
            double area = ((baseMaior + baseMenor) * altura) / 2;
            
            System.out.println("A área do trápezio é: "+area);
            
        }
        
        else {
        
            System.out.println("A base menor e maior precisa ser maior que zero");
            
        }
        
        
    }
}
