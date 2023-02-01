package exercicios;

public class JogoCarta {

	public static void main(String[] args) {
		String[] nipes = {"Ouros", "Copas", "Espadas", "Paus"};
		String[] faces = {"Az", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
		
		// Retornando Aleatoriamente o conteúdo dos Arrays
		String nipe = nipes[(int) (Math.random() * 4)];
		String face = faces[(int) (Math.random() * faces.length)];

		// Exibindo carta sorteada
		System.out.println(face + " de " + nipe);
	}

}
