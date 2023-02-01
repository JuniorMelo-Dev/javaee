package exercicios;

/** 
 * @author Administrador
 * Exercício 2 -  Desenvolva uma aplicação no console (terminal) para calcular o valor da porcentagem usando Regra de 3, conforme abaixo: 
 * modelo: x% de y = valor
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Regra3 {

	public static void main(String[] args) {
		// variáveis
		double x, y, valor;

		// objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");

		// entrada de dados
		System.out.println("Regra de 3");
		System.out.println("");
		System.out.println("x% de y = valor");

		System.out.print("Digite o valor de x: ");
		x = teclado.nextDouble();
		System.out.print("Digite o valor de y: ");
		y = teclado.nextDouble();

		// processamento
		valor = (x * y) / 100;

		// saída de dados
		System.out.println(x + "% de " + y + " = " + formatador.format(valor));

		teclado.close();
	}

}
