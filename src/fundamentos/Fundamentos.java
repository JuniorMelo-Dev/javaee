package fundamentos;

public class Fundamentos {

	public static void main(String[] args) {
		String author = "Junior Melo Dev";		
		int idade = 32;
		char sexo = 'M';
		double altura = 1.74;
		boolean arCondicionado = false;
		
		System.out.println("Usando variáveis na linguagem Java");
		System.out.println("");
		System.out.println("Exemplos");
		System.out.println("Author: " + author);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Altura: " + altura);
		System.out.println("Possuo ar condicionado? " + arCondicionado);
		System.out.println("_________________________________________");
		System.out.println("");
		
		double i = 10;
		System.out.println("Operadores Aritméticos");
		System.out.println("");
		System.out.println("Exemplos");
		System.out.println("i = " + i);
		System.out.println("i = " + i + " + 5 | i = " + (i + 5));
		System.out.println("i = " + i + " - 5 | i = " + (i - 5));
		System.out.println("i = " + i + " * 5 | i = " + (i * 5));
		System.out.println("i = " + i + " / 5 | i = " + (i / 5));
		System.out.println("i = " + i + " % 5 | i = " + (i % 5));
		
		System.out.println("");
		System.out.println("Operadores de Atribuições");
		System.out.println("");
		System.out.println("Exemplos");
		System.out.println("i += 5       | i = " + (i += 5));
		System.out.println("i -= 5       | i = " + (i -= 5));
		System.out.println("i *= 5       | i = " + (i *= 5));
		System.out.println("i /= 5       | i = " + (i /= 5));
		i++;
		System.out.println("i++          | i = " + i);
		i--;
		System.out.println("i--          | i = " + i);
		System.out.println("");
				
		System.out.println("_________________________________________");
		System.out.println("");
		System.out.println("Estrutura de Controle Condicional");
		System.out.println("");
		System.out.println("Exemplo 1 - Usando 'if'");
		sexo = 'F'; /*reatribuição da variável*/
		if (sexo == 'M') {
			System.out.println("Programador masculino codando...");
		}
		
		System.out.println("");
		System.out.println("Exemplo 2 - Usando 'if - else'");
		sexo = 'M';
		if (sexo == 'M') {
			System.out.println("Programador masculino codando...");
		} else {
			System.out.println("Alguém está codando...   identifique-se!!");
		}
		
		System.out.println("");
		System.out.println("Exemplo 3 - Usando 'else - if'");
		idade = 21;
		if (idade < 16) {
			System.out.println("NÃO PODE VOTAR");
		} else if (idade >= 18 && idade <= 70) {
			System.out.println("SEU VOTO É OBRIGATÓRIO");
		} else {
			System.out.println("SEU VOTO É FACULTATIVO");
		}
		
		System.out.println("");
		System.out.println("Exemplo 4 - Usando 'switch case'");
		System.out.println("1. Cadastro de Clientes");
		System.out.println("2. Cadastro de Usuários");
		System.out.println("3. Relatórios");
		int opcao = 5;
		switch (opcao) {
		case 1:
			System.out.println("CLIENTES");
			break;
		case 2:
			System.out.println("USUÁRIOS");
			break;
		case 3:
			System.out.println("RELATÓRIOS");
			break;
		default:
			System.out.println("Opção Inválida");
			break;
		}
		
		System.out.println("");
		System.out.println("Estrutura de Repetição");
		System.out.println("");
		System.out.println("Exemplo 5 - Usando 'for'");
		for (int j = 10; j > 0; j--) {
			System.out.println("Diminuindo.. " + j);
		}
		
		System.out.println("");
		System.out.println("Exemplo 6 - Tabuada");
		for (int tabuada = 1; tabuada <= 10; tabuada++) {
			System.out.println("");
			for (int valor = 1; valor <= 10; valor++) {
				System.out.println(tabuada + " x " + valor + " = " + (tabuada * valor));
			}
		}
		
		System.out.println("");
		System.out.println("Exemplo 7 - Usando 'while'");
		int contador = 1;
		while (contador <= 10) {
			System.out.println(contador);
			contador++;
		}
		
		System.out.println("");
		System.out.println("Exemplo 8 - Usando 'do - while'");
		char novoJogo;
		do {
			System.out.println("Deseja joga novamente(s/n)?");
			novoJogo = 's';
		} while (novoJogo == 'n');
		System.out.println("Game Over");
	}
}



















