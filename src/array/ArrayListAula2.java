package array;

import java.util.ArrayList;

public class ArrayListAula2 {

	public static void main(String[] args) {
		ArrayList<String> contatos = new ArrayList<>();
		contatos.add("Junior Melo");
		contatos.add("99999-9999");
		contatos.add("melo@gmail.com");
		
		contatos.add("Bernardo Paiva");
		contatos.add("98888-8888");
		contatos.add("paiva@gmail.com");

		System.out.println("Array com Tamanho: " + contatos.size());
		System.out.println(contatos);
		
		// Retornando índice especifico do array
		System.out.println("Ex: Email (índice[2]): " + contatos.get(2));
		
		System.out.println("__________________________________________________");
		System.out.println("");
		
		// retornando todos valores do array usando 'for'
		for (int i = 0; i < contatos.size(); i++ ) {
			System.out.println(contatos.get(i));
		}
	}

}
