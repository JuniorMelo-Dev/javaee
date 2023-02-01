package exercicios;

/** 
 * @author Administrador
 * Exercício 3 - Desenvolva uma aplicação no console (terminal) de um ponto de vendas (PDV), conforme abaixo:
 * modelo:
 * - Valor total: 200,00
 * - Desconto:(%) 5
 * - Total com desconto: 190,00 (valor calculado)
 * - Valor pago: 200,00
 * - Troco: 10,00 (valor calculado) 
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class PDV {

	public static void main(String[] args) {
		// variáveis
		double total, desconto, totalDesconto, valorPago, troco;
		
		// objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		
		// entrada 1
		System.out.println("PDV");
		System.out.println("");
		System.out.print("Valor Total: ");
		total = teclado.nextDouble();
		System.out.print("Desconto(%): ");
		desconto = teclado.nextDouble();
		
		// processamento 1
		totalDesconto = total - (desconto * total) / 100;
		
		// saída 1
		System.out.println("Total com Desconto: R$ " + formatador.format(totalDesconto));
		
		// entrada 2
		System.out.println("__________________________________________");
		System.out.println("");
		System.out.print("Valor pago em dinheiro: ");
		valorPago = teclado.nextDouble();
		
		// processamento 2
		troco = valorPago - totalDesconto;
		
		// saída 2 
		System.out.println("Troco: R$ " + formatador.format(troco));
		teclado.close();

	}

}
