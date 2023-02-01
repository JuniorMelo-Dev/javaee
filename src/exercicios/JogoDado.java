package exercicios;

import java.util.Scanner;

public class JogoDado {

	public static void main(String[] args) {
		// variáveis
		char opcao = 's';
		
		// objetos
		Scanner teclado = new Scanner(System.in);
		
		// processamento 1 - 'do - while', primeiro executa o código e depois faz o teste.
		/* do {
			System.out.println("Lançando o Dado........");
		} while (opcao == 's');
		*/
		
		// processamento 2 - 'while', somente executa o código se a condição for 'true'.
		while (opcao == 's') {
			System.out.println("Lançamento do DADO.............");
			int dado = (int) (Math.random() * 6 + 1);
			System.out.println("Face sorteada: " + dado);
			System.out.println("Deseja Continuar (s/n) ? ");
			opcao = teclado.next().charAt(0);
		}
		teclado.close();
	}

}
