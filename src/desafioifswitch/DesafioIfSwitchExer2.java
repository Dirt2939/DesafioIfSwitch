/*
 * Desconto em Produto: Se um produto custa mais de 100 reais, dê um
 * desconto de 15%. Se custar menos, dê um desconto de 5%. Informe o
 * valor final do produto.
 */
package desafioifswitch;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class DesafioIfSwitchExer2 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o valor do produto: ");
        double produtoValor = ler.nextDouble();
        
        if (produtoValor >= 100) {
        
            double produtoDescontoValor = produtoValor - (produtoValor * 0.15);
            
            System.out.println("Seu produto custava: "+produtoValor);
            System.out.println("Agora custa: "+produtoDescontoValor);
            
        }
        
        else if (produtoValor < 100) {
        
            double produtoDescontoValor = produtoValor - (produtoValor * 0.05);
            
            System.out.println("Seu produto custava: "+produtoValor);
            System.out.println("Agora custa: "+produtoDescontoValor);
            
        }
        
    }
}
