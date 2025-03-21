/*
 * Verificando um Triangulo: Dados três valores, A, B, C, verificar se eles
podem ser valores dos lados de um triângulo e, se forem, se é um
triângulo escaleno, equilátero ou isóscele, considerando os seguintes
conceitos: O comprimento de cada lado de um triângulo é menor do que
a soma dos outros dois lados.
 Chama-se equilátero o triângulo que tem três lados iguais.
 Denominam-se isósceles o triângulo que tem o comprimento de dois
lados iguais.
 Recebe o nome de escaleno o triângulo que tem os três lados
diferentes
 */
package desafioifswitch;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class DesafioSwitchExer5 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o comprimento dos 3 lados de um triangulo");
        int lado1 = ler.nextInt();
        int lado2 = ler.nextInt();
        int lado3 = ler.nextInt();
        
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado3 + lado2 > lado1) {
        
            if (lado1 == lado2 && lado2 == lado3) {
            
                System.out.println("É um triângulo equilátero.");
                
            }
            
            else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            
                System.out.println("É um triângulo isóceles.");
                
            }
            
            else {
            
                System.out.println("É um triângulo escaleno.");
                
            }
            
        }
        
        else {
        
            System.out.println("Não é um triângulo válido.");
            
        }
        
    }
}
