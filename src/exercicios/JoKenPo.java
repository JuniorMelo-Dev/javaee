package exercicios;

/**
 * @author Administrador;
 * Exercicio 7 - Desenvolver um jogo "Pedra - Papel - Tesoura", modelo:
 * 
 * JoKenPô
 * 
 * 1. Pedra
 * 2. Papel
 * 3. Tesoura
 * 
 * Digite a opção desejada:
 * Jogador escolheu:
 * Computador escolheu:
 * VENCEDOR:
 * */

import java.util.Scanner;

public class JoKenPo {

	public static void main(String[] args) {
		// variáveis
		int jogador, computador;

		// objetos
		Scanner teclado = new Scanner(System.in);

		// entrada
		System.out.println("____JokenPô____");
		System.out.println("");
		System.out.println("1. Pedra");
		System.out.println("2. Papel");
		System.out.println("3. Tesoura");
		System.out.println("");
		System.out.print("Digite a opção desejada: ");

		// lógica do Jogador
		jogador = teclado.nextInt();
		switch (jogador) {
		case 1:
			System.out.println("Jogador escolheu PEDRA");
			break;
		case 2:
			System.out.println("Jogador escolheu PAPEL");
			break;
		case 3:
			System.out.println("Jogador escolheu TESOURA");
			break;
		default:
			System.out.println("ERRO!! Opção Inválida, tente novamente!");
			break;
		}

		// lógica do Computador
		computador = (int) (Math.random() * 3 + 1);
		switch (computador) {
		case 1:
			System.out.println("Computador escolheu PEDRA");
			break;
		case 2:
			System.out.println("Computador escolheu PAPEL");
			break;
		case 3:
			System.out.println("Computador escolheu TESOURA");
			break;
		}

		// lógica para Vencedor
		System.out.println("");
		if (jogador == computador) {
			System.out.println("EMPATE");
		} else {
			if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1)
					|| (jogador == 3 && computador == 2)) {
				System.out.println("JOGADOR VENCEU!!");
			} else {
				System.out.println("COMPUTADOR VENCEU!!");
			}
		}

		teclado.close();

	}

}
