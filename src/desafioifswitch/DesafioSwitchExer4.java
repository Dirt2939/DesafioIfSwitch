/*
 * Faixa de Nota: Dado uma nota de 0 a 100, classifique-a da seguinte
forma:
 0-49: Insuficiente
 50-69: Regular
 70-89: Bom
 90-100: Excelente
 */
package desafioifswitch;

import java.util.Scanner;

/**
 *
 * @author aluno.saolucas
 */
public class DesafioSwitchExer4 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite sua nota do Enem: ");
        double nota = ler.nextDouble();
        
        if (nota >= 0 && nota <= 49) {
        
            System.out.println("Insuficiente");
            
        }
        
        else if (nota >= 50 && nota <= 69) {
        
            System.out.println("Regular");
            
        }
        
        else if (nota >= 70 && nota <= 89) {
        
            System.out.println("Bom");
            
        }
        
        else if (nota >= 90 && nota <= 100) {
        
            System.out.println("Excelente");
            
        }
        
        else {
        
            System.out.println("Nota inválida");
            
        }
        
    }
}
