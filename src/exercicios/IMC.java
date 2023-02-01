package exercicios;

/**
 * @author Administrador;
 * Exercicio 6 -  Desenvolver um aplicativo no console para calculo de IMC. 
 * O aplicativo deverá exibir além do valor do IMC a classificação conforme expressão "if - else if - else";
 * */

import java.text.DecimalFormat;
import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		// váriaveis
		double peso, altura, imc;

		// objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		System.out.println("Cálculo do IMC");

		// entrada
		System.out.print("Digite seu peso: ");
		peso = teclado.nextDouble();
		System.out.print("Digite sua altura: ");
		altura = teclado.nextDouble();

		// processamento
		imc = peso / (altura * altura);

		// saída
		System.out.println("IMC: " + formatador.format(imc));

		// classificação de IMC
		if (imc < 18.5) {
			System.out.println("Abaixo do peso");
		} else if (imc < 25) {
			System.out.println("Peso ideal");
		} else if (imc < 30) {
			System.out.println("Levemente acima do peso");
		} else if (imc < 35) {
			System.out.println("Obesidade grau I");
		} else if (imc < 40) {
			System.out.println("Obesidade grau II (severa)");
		} else {
			System.out.println("Obesidade grau III (mórbida)");
		}

		teclado.close();
	}

}
