/*
 * Saudação conforme o horário: Dado a hora do dia (um número de 0 a
 * 23), cumprimente o usuário com &quot;Bom dia!&quot;, ;Boa tarde; 
 * ou ;Boa noite; conforme o horário.
 */
package desafioifswitch;

import java.util.Scanner;

/**
 * @author Rafael
 */
public class DesafioIfSwitchExer3 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
    
        System.out.println("Dê um horário:");
        System.out.println("De 0 a 23");
        int horario = ler.nextInt();
        
        if (horario >= 6 && horario <= 12) {
        
            System.out.println("Bom dia.");
            
        }
        
        else if (horario >= 13 && horario <= 18) {
        
            System.out.println("Boa tarde.");
            
        }
        
        else if (horario >= 19 && horario <= 23 || horario >=0 && horario <= 5) {
        
            System.out.println("Boa noite.");
            
        }
        
        else {
        
            System.out.println("Deu erro");
            
        }
        
    }
}
