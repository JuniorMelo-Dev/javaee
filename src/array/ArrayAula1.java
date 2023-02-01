package array;

public class ArrayAula1 {

	public static void main(String[] args) {
		String[] carros = { "Ferrari", "Fusca", "Camaro", "Uno" };
		// índece do array     [0]       [1]      [2]      [3]
		
		System.out.println("Tamanho do Array: " + carros.length + " posições.");
		System.out.println("Retorno específico do Array: carro selecionado => " + carros[3]);
		carros[2] = "Porsche"; // Reatribuindo valor ao índice desejado.
		System.out.println("Retorno do índice modificado: " + carros[2]);
		
		System.out.println("_________________________________________________");
		System.out.println("Carros na Lista");
		System.out.println("");
		for (int i = 0; i < carros.length; i++) {
			System.out.println(carros[i]);
		}
	}

}
