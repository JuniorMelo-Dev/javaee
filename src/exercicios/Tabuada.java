package exercicios;

/** 
 * @author Administrador;
 * Exercício 8: Desenvolva um aplicativo no console (terminal) para calcular o valor da tabuada.
 * O aplicativo deverá perguntar qual é o valor da tabuada a ser calculada.
 */


import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// variáveis
		int valor;
		
		// objetos
		Scanner teclado = new Scanner(System.in);
		
		// entrada
		System.out.println("Digite o valor e veja a sua tabuada ");
		valor = teclado.nextInt();
		
		// processamento
		for (int i = 1; i <= 10; i++) {
			System.out.println(valor + " x " + i + " = " + (valor * i));
		}
		
		teclado.close();
	}

}
