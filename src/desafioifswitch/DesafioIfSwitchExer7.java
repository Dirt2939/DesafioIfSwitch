/*
 * Resolvendo a Fórmula de Bhaskara: Faça um programa que calcule
as raízes da equação quadrática ax2+bx+c=0ax^2 + bx + c =
0ax2+bx+c=0. Sabe-se que:
Lembre-se de que o valor de A deve ser diferente de zero e verifique o valor de
Delta Δ é maior que zero, para determinar se a equação tem duas raízes reais,
uma raiz real ou nenhuma raiz real.
 */
package desafioifswitch;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class DesafioIfSwitchExer7 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        double a = ler.nextDouble();
        
        System.out.println("Digite o valor de B: ");
        double b = ler.nextDouble();
        
        System.out.println("Digite o valor de C: ");
        double c = ler.nextDouble();
        
        if (a == 0) {
        
            System.out.println("Com 'A' valendo zero a equação não é"
                    + "quadrática");
            
        }
        
        else {
        
            double delta = Math.pow(b, 2) - 4 * a * c;
            
            if (delta > 0) {
            
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                
                System.out.println("Contém duas raízes reais");
                System.out.println("A primeira é: "+x1);
                System.out.println("A segunda é: "+x2);
            }
            
            else if (delta == 0) {
            
                double x1 = -b  / (2 * a);
                
                System.out.println("Contém uma única raiz: "+x1);

            }
            
            else {
            
                System.out.println("Não contém raízes reais");
                
            }
            
        }
        
    }
}
