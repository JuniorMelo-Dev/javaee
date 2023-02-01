package exercicios;

/** 
 * @author Administrador
 * Exercício 1 - Desenvolva uma aplicação no console (terminal) que faça a conversão de temperatura em Fahrenheit para Celcius. 
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversaoTemperatura {

	public static void main(String[] args) {
		
		// variáveis
		double c, f;
		
		// objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0");
		
		// entrada de dados
		System.out.println("Conversão de Temperatura");
		System.out.println("");
		System.out.print("Digite a temperatura em Fahrenheit: ");
		f = teclado.nextDouble();
		
		// processamento
		c = (5 * (f - 32)) / 9;
		
		// saída de dados
		System.out.println("Temperatura em Celsius: " + formatador.format(c) + "°C");
		teclado.close();
	}

}
